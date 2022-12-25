package simplilearn.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="purchase1")
public class Purchase3 {

	@Id
	private Long orderId;
	private int category, productId;
	
	@NotEmpty @Size ( min = 2, message = "the username should have more than 2 characters")
	private String purchasedBy;
	
	private Date dateOfPurchase;
	private int quantity;
	private double Amount;
	
	public Purchase3(Long orderId, int category, int productId,
			@NotEmpty @Size(min = 2, message = "the username should have more than 2 characters") String purchasedBy,
			Date dateOfPurchase, int quantity, double amount) {
		super();
		this.orderId = orderId;
		this.category = category;
		this.productId = productId;
		this.purchasedBy = purchasedBy;
		this.dateOfPurchase = dateOfPurchase;
		this.quantity = quantity;
		Amount = amount;
	}
	
	
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		orderId = orderId;
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
	public double getAmount() {
		return Amount;
	}
	public void setAmount(double Amount) {
		this.Amount = Amount;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
	
	