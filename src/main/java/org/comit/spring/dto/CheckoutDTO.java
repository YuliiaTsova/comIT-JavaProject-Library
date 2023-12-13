package org.comit.spring.dto;

import java.sql.Date;

import jakarta.persistence.Column;

public class CheckoutDTO {
	  private Long id;
	    private UserDTO user;
		private  java.sql.Date dueDate;
		private int returned;
		private java.sql.Date creationDate;
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public UserDTO getUser() {
			return user;
		}
		public void setUser(UserDTO user) {
			this.user = user;
		}
		public java.sql.Date getDueDate() {
			return dueDate;
		}
		public void setDueDate(java.sql.Date dueDate) {
			this.dueDate = dueDate;
		}
		public int getReturned() {
			return returned;
		}
		public void setReturned(int returned) {
			this.returned = returned;
		}
		public java.sql.Date getCreationDate() {
			return creationDate;
		}
		public void setStartDate(java.sql.Date startDate) {
			this.creationDate = creationDate;
		}
		@Override
		public String toString() {
			return String.format("CheckoutDTO [id=%s, user=%s, dueDate=%s, returned=%s, creationDate=%s]", id, user,
					dueDate, returned, creationDate);
		}
		public CheckoutDTO(Long id, UserDTO user, Date dueDate, int returned, Date startDate) {
			this.id = id;
			this.user = user;
			this.dueDate = dueDate;
			this.returned = returned;
			this.creationDate = startDate;
		}
		public CheckoutDTO() {
		}
		 
}
