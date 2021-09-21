package com.dbs.Jdbctemplate.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.dbs.Jdbctemplate.beans.Employee;


public class EmployeeDao {
    JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public List<Employee> findAll(){
		MyResultSetExtractor rse=new MyResultSetExtractor();
		return jdbcTemplate.query("select * from employee", rse);
	}
	
	public Employee find(int id) {
		return jdbcTemplate.query("select * from employee where id = "+id, 
			new ResultSetExtractor<Employee>() {
			@Override
			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("name"));
				return null;
			}
			
		} 
		
				);
	}
    
	
	public boolean insert(  final Employee employee) {
		String sql = "insert into employee values (?,?)";
		System.out.println("JdbcTemplate object : "+jdbcTemplate);
		return jdbcTemplate.execute(sql, new PreparedStatementCallback<Boolean>() {

			@Override
			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				ps.setInt(1, employee.getId());
				ps.setString(2, employee.getName());
				return ps.executeUpdate()==1;
			}
		});
	}
	
    class MyResultSetExtractor implements ResultSetExtractor<List<Employee>>{

		@Override
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			// TODO Auto-generated method stub
			
			List<Employee> employees=new ArrayList<>();
			while(rs.next()) {
				Employee employee=new Employee(rs.getInt("id"),rs.getString("name"));
				employees.add(employee);
			}
			return employees;
		}
    	
    }
}
