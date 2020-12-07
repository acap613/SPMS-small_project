package com.revature.spms.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="AUTHOR")
public class Author {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name="last_name")
	private String last_name;
	
	@Column(name="current_points")
	private int current_points;
	
	@Column(name="points_allowed")
	private int points_allowed;
	
	@OneToMany(targetEntity = StoryPitch.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "sp_fk", referencedColumnName = "id")
	private List<StoryPitch> storyPitches;
	
	public Author() {
		
	}

	public Author(Long id, String first_name, String last_name, int current_points, int points_allowed,
			List<StoryPitch> storyPitches) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.current_points = current_points;
		this.points_allowed = points_allowed;
		this.storyPitches = storyPitches;
	}

	public List<StoryPitch> getStoryPitches() {
		return storyPitches;
	}


	public void setStoryPitches(List<StoryPitch> storyPitches) {
		this.storyPitches = storyPitches;
	}
	
	public int getCurrent_points() {
		return current_points;
	}


	public void setCurrent_points(int current_points) {
		this.current_points = current_points;
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

	@Override
	public String toString() {
		return "Author [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", current_points="
				+ current_points + ", points_allowed=" + points_allowed + ", storyPitches=" + storyPitches + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + current_points;
		result = prime * result + ((first_name == null) ? 0 : first_name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((last_name == null) ? 0 : last_name.hashCode());
		result = prime * result + points_allowed;
		result = prime * result + ((storyPitches == null) ? 0 : storyPitches.hashCode());
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
		Author other = (Author) obj;
		if (current_points != other.current_points)
			return false;
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
		if (last_name == null) {
			if (other.last_name != null)
				return false;
		} else if (!last_name.equals(other.last_name))
			return false;
		if (points_allowed != other.points_allowed)
			return false;
		if (storyPitches == null) {
			if (other.storyPitches != null)
				return false;
		} else if (!storyPitches.equals(other.storyPitches))
			return false;
		return true;
	}

	
	
	
	
	
}
