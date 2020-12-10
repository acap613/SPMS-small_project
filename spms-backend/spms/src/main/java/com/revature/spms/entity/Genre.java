package com.revature.spms.entity;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="genre")
public class Genre {

	// fields
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Long genre_id; // points to story pitch
		@Column(name="genre")
		private String genre;
		
		@ManyToMany(mappedBy= "genres", cascade = CascadeType.ALL)
		@JsonBackReference
		private Set<Editor> editors = new HashSet<>();	
	

		public Genre() {
			
		}	
		
		public Genre(Long genre_id, String genre, Set<Editor> editors) {
			super();
			this.genre_id = genre_id;
			this.genre = genre;
			this.editors = editors;
		}

		public Long getId() {
			return genre_id;
		}
		public void setId(Long id) {
			this.genre_id = id;
		}
		public String getGenre() {
			return genre;
		}		
		
		public void setGenre(String genre) {
			this.genre = genre;
		}
		
		public Set<Editor> getEditors() {
			return editors;
		}

		public void setEditors(Set<Editor> editors) {
			this.editors = editors;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((genre == null) ? 0 : genre.hashCode());
			result = prime * result + ((genre_id == null) ? 0 : genre_id.hashCode());
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
			Genre other = (Genre) obj;
			if (genre == null) {
				if (other.genre != null)
					return false;
			} else if (!genre.equals(other.genre))
				return false;
			if (genre_id == null) {
				if (other.genre_id != null)
					return false;
			} else if (!genre_id.equals(other.genre_id))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Genre [id=" + genre_id + ", genre=" + genre + "]";
		} 
		
		
	
}
