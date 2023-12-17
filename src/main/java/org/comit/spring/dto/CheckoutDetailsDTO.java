package org.comit.spring.dto;

public class CheckoutDetailsDTO {
	private Long id;
	private CheckoutDTO checkout;
	private BookDTO product;
	////////
	private UserDTO user;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public CheckoutDTO getCheckout() {
		return checkout;
	}
	public void setCheckout(CheckoutDTO order) {
		this.checkout = order;
	}
	public BookDTO getProduct() {
		return product;
	}
	public void setProduct(BookDTO product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return String.format("CheckoutDetailsDTO [id=%s, order=%s, product=%s]", id, checkout, product);
	}
	public CheckoutDetailsDTO(Long id, CheckoutDTO order, BookDTO product,UserDTO user) {
		this.id = id;
		this.checkout = order;
		this.product = product;
		this.user = user;
	}
	public CheckoutDetailsDTO() {
	}
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	
}
