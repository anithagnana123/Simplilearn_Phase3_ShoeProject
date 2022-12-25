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
@Table(name="users")
public class Users {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long userId;
		
		@NotEmpty 
		private String emailId;
		
		private long contactNumber;

		public Users(Long userId, @NotEmpty String emailId, int contactNumber) {
			this();
			this.userId = userId;
			this.emailId = emailId;
			this.contactNumber = contactNumber;
		}
		public Users() {
			super();
		}
		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}

		
}
