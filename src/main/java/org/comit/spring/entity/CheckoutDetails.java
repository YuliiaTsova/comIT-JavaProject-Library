package org.comit.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
@Table (name = "checkout_details")
public class CheckoutDetails {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "checkout_id")
	    private Checkout checkout;

	    @ManyToOne(fetch = FetchType.EAGER, optional = false)
	    @JoinColumn(name = "book_id")
	    private Book book;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public Checkout getCheckout() {
			return checkout;
		}

		public void setCkeckout(Checkout checkout) {
			this.checkout = checkout;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		@Override
		public String toString() {
			return String.format("CheckoutDetails [id=%s, ckeckout=%s, book=%s]", id, checkout, book);
		}

		public CheckoutDetails(Long id, Checkout ckeckout, Book book) {
			this.id = id;
			this.checkout = ckeckout;
			this.book = book;
		}

		public CheckoutDetails() {
		}

}
