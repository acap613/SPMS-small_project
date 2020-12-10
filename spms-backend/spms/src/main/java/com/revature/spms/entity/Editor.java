package com.revature.spms.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="EDITOR")
public class Editor {

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long editor_id;
	
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
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JsonManagedReference
	@JoinTable(
			name = "editor_genres", 
			joinColumns = @JoinColumn(name="editor_id"), 
			inverseJoinColumns = @JoinColumn(name="genre_id")
	)
	public Set<Genre> genres = new HashSet<>();;
	
	public Editor() {
		
	}	

	public Editor(Long editor_id, String first_name, String last_name, int points_allowed, char is_assistant,
			char is_senior, char is_general, Set<Genre> genres) {
		super();
		this.editor_id = editor_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.points_allowed = points_allowed;
		this.is_assistant = is_assistant;
		this.is_senior = is_senior;
		this.is_general = is_general;
		this.genres = genres;
	}

	public Long getId() {
		return editor_id;
	}

	public void setId(Long id) {
		this.editor_id = id;
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
	
	public Set<Genre> getGenres() {
		return genres;
	}

	
	public void setGenres(Set<Genre> genres) {
		this.genres = genres;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((editor_id == null) ? 0 : editor_id.hashCode());
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((genres == null) ? 0 : genres.hashCode());
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
		if (editor_id == null) {
			if (other.editor_id != null)
				return false;
		} else if (!editor_id.equals(other.editor_id))
			return false;
		if (first_name == null) {
			if (other.first_name != null)
				return false;
		} else if (!first_name.equals(other.first_name))
			return false;
		if (genres == null) {
			if (other.genres != null)
				return false;
		} else if (!genres.equals(other.genres))
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

	@Override
	public String toString() {
		return "Editor [editor_id=" + editor_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", points_allowed=" + points_allowed + ", is_assistant=" + is_assistant + ", is_senior=" + is_senior
				+ ", is_general=" + is_general + ", genres=" + genres + "]";
	}

	

	
	
	
	
}
