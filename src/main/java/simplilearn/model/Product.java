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
@Table(name="product")
public class Product {
	
		@Id
		private Long product_id;
		private String product_name;
		private Long category;
		private double price;
		
		public Product(Long category, Long product_id, String product_name, double price) {
			this();
			this.category = category;
			this.product_id = product_id;
			this.product_name = product_name;
			this.price = price;
		}
     
		
		public Product() {
			super();
		}


		public Long getCategory() {
			return category;
		}

		public void setCategory(Long category) {
			this.category = category;
		}

		public Long getProductId() {
			return product_id;
		}

		public void setProductId(Long product_id) {
			this.product_id = product_id;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public String getProduct_name() {
			return product_name;
		}

		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

}
