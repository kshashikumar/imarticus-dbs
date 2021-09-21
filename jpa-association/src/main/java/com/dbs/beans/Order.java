package com.dbs.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Order {
      
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int oId;
	String name;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int oId, String name) {
		super();
		this.oId = oId;
		this.name = name;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", name=" + name + "]";
	}
	
	
}
