package com.revature.spms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="story_draft")
public class Story {
	
	// fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long draft_id; // points to story pitch
	@Column
	String draft_text; // use this for actual text?
	@Column
	char is_completed; // Y or N
	@Column
	char is_approved; // Y or N		
	
	public Story() {
		
	}
	
	public Story(long id, String text, char is_completed, char is_approved) {
		super();
		this.draft_id = id;
		this.draft_text = text;
		this.is_completed = is_completed;
		this.is_approved = is_approved;
	}

	public long getId() {
		return draft_id;
	}

	public void setId(long id) {
		this.draft_id = id;
	}

	public String getText() {
		return draft_text;
	}

	public void setText(String text) {
		this.draft_text = text;
	}

	public char getIs_completed() {
		return is_completed;
	}

	public void setIs_completed(char is_completed) {
		this.is_completed = is_completed;
	}

	public char getIs_approved() {
		return is_approved;
	}

	public void setIs_approved(char is_approved) {
		this.is_approved = is_approved;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (draft_id ^ (draft_id >>> 32));
		result = prime * result + is_approved;
		result = prime * result + is_completed;
		result = prime * result + ((draft_text == null) ? 0 : draft_text.hashCode());
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
		Story other = (Story) obj;
		if (draft_id != other.draft_id)
			return false;
		if (is_approved != other.is_approved)
			return false;
		if (is_completed != other.is_completed)
			return false;
		if (draft_text == null) {
			if (other.draft_text != null)
				return false;
		} else if (!draft_text.equals(other.draft_text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Story [id=" + draft_id + ", text=" + draft_text + ", is_completed=" + is_completed + ", is_approved=" + is_approved
				+ "]";
	}
	
	
}
