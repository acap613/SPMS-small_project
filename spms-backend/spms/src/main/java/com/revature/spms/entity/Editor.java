package com.revature.spms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EDITOR")
public class Editor {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="points_allowed")
	private int points_allowed;
	
	@Column(name="is_assistant")
	private char is_assistant;
	
	@Column(name="is_senior")
	private char is_senior;
	
	@Column(name="is_general")
	private char is_general;
	
	
	
	public Editor() {
		
	}	

	public Editor(Long id, String first_name, String last_name, int points_allowed, char is_assistant, char is_senior,
			char is_general) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.points_allowed = points_allowed;
		this.is_assistant = is_assistant;
		this.is_senior = is_senior;
		this.is_general = is_general;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getPoints_allowed() {
		return points_allowed;
	}

	public void setPoints_allowed(int points_allowed) {
		this.points_allowed = points_allowed;
	}

	public char getIs_assistant() {
		return is_assistant;
	}

	public void setIs_assistant(char is_assistant) {
		this.is_assistant = is_assistant;
	}

	public char getIs_senior() {
		return is_senior;
	}

	public void setIs_senior(char is_senior) {
		this.is_senior = is_senior;
	}

	public char getIs_general() {
		return is_general;
	}

	public void setIs_general(char is_general) {
		this.is_general = is_general;
	}

	@Override
	public String toString() {
		return "Editor [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", points_allowed="
				+ points_allowed + ", is_assistant=" + is_assistant + ", is_senior=" + is_senior + ", is_general="
				+ is_general + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + is_assistant;
		result = prime * result + is_general;
		result = prime * result + is_senior;
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + points_allowed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editor other = (Editor) obj;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (is_assistant != other.is_assistant)
			return false;
		if (is_general != other.is_general)
			return false;
		if (is_senior != other.is_senior)
			return false;
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (points_allowed != other.points_allowed)
			return false;
		return true;
	}

	
	
	
	
}