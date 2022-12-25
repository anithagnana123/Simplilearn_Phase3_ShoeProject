package simplilearn.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import java.io.Serializable;

@Data
@Entity
@Table(name="purchase")
@AllArgsConstructor
@NoArgsConstructor

@IdClass(PurchaseId.class)
public class Purchase implements Serializable {

	private static final long serialVersionUID = -9092062626878526790L;
	
	@Id
	@Column(name = "order_id")
	private Long order_id;
	
	@Id
	@Column(name = "category")
	private Long category;
	
	@Id
	@Column(name = "product_id")
	private Long product_id;
	
	@NotEmpty @Size ( min = 2, message = "the username should have more than 2 characters")
	private String purchasedBy;
	
	private Date dateOfPurchase;
	private int quantity;
	private double Amount;
	
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public Long getCategory() {
		return category;
	}
	public void setCategory(Long category) {
		this.category = category;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	public String getPurchasedBy() {
		return purchasedBy;
	}
	public void setPurchasedBy(String purchasedBy) {
		this.purchasedBy = purchasedBy;
	}
	public Date getDateOfPurchase() {
		return dateOfPurchase;
	}
	public void setDateOfPurchase(Date dateOfPurchase) {
		this.dateOfPurchase = dateOfPurchase;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double amount) {
		Amount = amount;
	}
	
}
	
	