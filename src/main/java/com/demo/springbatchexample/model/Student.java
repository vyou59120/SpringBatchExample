package com.demo.springbatchexample.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "Student")
public class Student {
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "rank")
    private String rank;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "center")
    private String center;

    @Column(name = "pv")
    private String pv;

    @Column(name = "origin")
    private String origin;

    @Column(name = "mention")
    private String mention;

//    @CreationTimestamp
//    @Temporal(TemporalType.TIMESTAMP)
//    @Column(name = "createdAt")
//    private Date createdAt;
    
    
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String rank, String lastName, String firstName, String center, String pv, String origin,
			String mention) {
		super();
		this.rank = rank;
		this.lastName = lastName;
		this.firstName = firstName;
		this.center = center;
		this.pv = pv;
		this.origin = origin;
		this.mention = mention;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCenter() {
		return center;
	}

	public void setCenter(String center) {
		this.center = center;
	}

	public String getPv() {
		return pv;
	}

	public void setPv(String pv) {
		this.pv = pv;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", rank=" + rank + ", lastName=" + lastName + ", firstName=" + firstName
				+ ", center=" + center + ", pv=" + pv + ", origin=" + origin + ", mention=" + mention + "]";
	}
	
	
//	public Date getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(Date createdAt) {
//		this.createdAt = createdAt;
//	}
    
    

}
