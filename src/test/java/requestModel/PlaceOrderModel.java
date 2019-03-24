package requestModel;

public class PlaceOrderModel {

	private float id;
	private float petId;
	private float quantity;
	private String shipDate;
	private String status;
	private boolean complete;

	// Getter Methods

	public float getId() {
		return id;
	}

	public float getPetId() {
		return petId;
	}

	public float getQuantity() {
		return quantity;
	}

	public String getShipDate() {
		return shipDate;
	}

	public String getStatus() {
		return status;
	}

	public boolean getComplete() {
		return complete;
	}

	// Setter Methods

	public void setId(float id) {
		this.id = id;
	}

	public void setPetId(float petId) {
		this.petId = petId;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public void setShipDate(String shipDate) {
		this.shipDate = shipDate;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

}
