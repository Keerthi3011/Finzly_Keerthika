package com.backendAssignment.DemoProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "country")
public class Country 
{
	@Id
	@Column(name = "cid")
	private int cid;
	@Column(name = "cname")
	private String cname;
	
	
	public Country(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}

	
	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public Country() {
		super();
		//TODO Auto-generated constructor stub
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	@Override
	public String toString() {
		return "Country [cid=" + cid + ", cname=" + cname + ", employee="  + "]";
	}
	
	
}
