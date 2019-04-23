package org.wecancodeit.finalproject.models;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CleanUpComment extends Comment {
	
	@ManyToOne 
	@JsonIgnore
	private CleanUp cleanUp;
	
	public CleanUpComment() {}
	
	public CleanUpComment(String content, User user, CleanUp cleanUp) {
		super(content, user);
		this.cleanUp = cleanUp;
	}
	public CleanUp getCleanUp() {
		return cleanUp;
	}
	
	@Override
	public String toString() {
		return "CleanUpComment [cleanUp=" + cleanUp + ", getId()=" + getId() + ", getContent()=" + getContent()
				+ ", getUser()=" + getUser() + "]";
	}
	
	
	
}
