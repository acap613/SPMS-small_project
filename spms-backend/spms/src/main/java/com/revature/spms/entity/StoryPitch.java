package com.revature.spms.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="story_pitch")
public class StoryPitch {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long book_id;
	
	@Column(name="author_id")
	private Long author_id;
	@Column(name="title")
	private String title;
	@Column(name="completion_date")
	private Date completion_date;
	@Column(name="word_count")
	private int word_count;
	@Column(name="genre")
	private String genre;
	@Column(name="story_tag")
	private String story_tag;
	@Column(name="description")
	private String description;
	@Column(name="approved")
	private char approved;
	@Column(name="on_hold")
	private char on_hold;
	
	public StoryPitch() {
		
	}

	public StoryPitch(Long book_id, Long author_id, String title, Date completion_date, int word_count, String genre,
			String story_tag, String description, char approved, char on_hold) {
		super();
		this.book_id = book_id;
		this.author_id = author_id;
		this.title = title;
		this.completion_date = completion_date;
		this.word_count = word_count;
		this.genre = genre;
		this.story_tag = story_tag;
		this.description = description;
		this.approved = approved;
		this.on_hold = on_hold;
	}

	public Long getId() {
		return book_id;
	}

	public void setId(Long book_id) {
		this.book_id = book_id;
	}

	public Long getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getCompletion_date() {
		return completion_date;
	}

	public void setCompletion_date(Date completion_date) {
		this.completion_date = completion_date;
	}

	public int getWord_count() {
		return word_count;
	}

	public void setWord_count(int word_count) {
		this.word_count = word_count;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getTag() {
		return story_tag;
	}

	public void setTag(String story_tag) {
		this.story_tag = story_tag;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public char getApproved() {
		return approved;
	}

	public void setApproved(char approved) {
		this.approved = approved;
	}

	public char getOn_hold() {
		return on_hold;
	}

	public void setOn_hold(char on_hold) {
		this.on_hold = on_hold;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + approved;
		result = prime * result + ((author_id == null) ? 0 : author_id.hashCode());
		result = prime * result + ((completion_date == null) ? 0 : completion_date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((genre == null) ? 0 : genre.hashCode());
		result = prime * result + ((book_id == null) ? 0 : book_id.hashCode());
		result = prime * result + on_hold;
		result = prime * result + ((story_tag == null) ? 0 : story_tag.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + word_count;
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
		StoryPitch other = (StoryPitch) obj;
		if (approved != other.approved)
			return false;
		if (author_id == null) {
			if (other.author_id != null)
				return false;
		} else if (!author_id.equals(other.author_id))
			return false;
		if (completion_date == null) {
			if (other.completion_date != null)
				return false;
		} else if (!completion_date.equals(other.completion_date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (genre == null) {
			if (other.genre != null)
				return false;
		} else if (!genre.equals(other.genre))
			return false;
		if (book_id == null) {
			if (other.book_id != null)
				return false;
		} else if (!book_id.equals(other.book_id))
			return false;
		if (on_hold != other.on_hold)
			return false;
		if (story_tag == null) {
			if (other.story_tag != null)
				return false;
		} else if (!story_tag.equals(other.story_tag))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (word_count != other.word_count)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "StoryPitch [id=" + book_id + ", author_id=" + author_id + ", title=" + title + ", completion_date="
				+ completion_date + ", word_count=" + word_count + ", genre=" + genre + ", story_tag=" + story_tag
				+ ", description=" + description + ", approved=" + approved + ", on_hold=" + on_hold + "]";
	}
	
	
	
}
