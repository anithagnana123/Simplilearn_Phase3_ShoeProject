package simplilearn.errors;

import java.util.Date;

public class ErrorResponse {
	
	private Date timeStamp;
	private String errorMessage;
	private String clientDetails;
	
	
	public ErrorResponse(Date timeStamp , String errorMessage,String clientDetails) {
		this.timeStamp = timeStamp;
		this.errorMessage = errorMessage;
		this.clientDetails = clientDetails;
	}


	public Date getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}


	public String getErrorMessage() {
		return errorMessage;
	}


	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	public String getClientDetails() {
		return clientDetails;
	}


	public void setClientDetails(String clientDetails) {
		this.clientDetails = clientDetails;
	}
	
	

}