package com.concretepage;

import java.beans.Transient;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SET1")
public class SETS {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="title")
	private String title;
	
	@Column(name="year")
	private String year;
	
	@javax.persistence.Transient
	private String temp;
	
//	@javax.persistence.Transient
	public String getTemp(){
		return temp;
	}
	
	public void setTemp(String temp){
		this.temp = temp;
	}
	
	public Integer getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setTitle(String title){
		this.title = title;
	}
	
	public String getYear(){
		return year;
	}
	
	public void setYear(String year){
		this.year = year;
	}
	
}
