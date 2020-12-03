package com.revature.spms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STORY")
public class Story {
	
	// fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long id; // points to story pitch
	@Column
	String text; // use this for actual text?
	@Column
	char is_completed; // Y or N
	@Column
	char is_approved; // Y or N
	
	
}
