package com.revature.spms.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Entity
@Table(value="author")
public class Author {

	@Column(value="author_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(value = "author_name")
	private String name;
	
	@Column(value="points_used")
	private int points;
	
	protected Author() {
		System.out.println("Author Created: " + toString());
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", points=" + points + "]";
	}
	
	
	
}
