package in.chetan.dto;

import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class CarDto {

	@PathParam("city")
	private String city;

	@FormParam("location")
	private String location;

	@FormParam("manufacturer")
	private String manufacturer;

	@FormParam("model")
	private String model;

	@FormParam("tyreSize")
	private int tyreSize;

	@FormParam("price")
	private double price;

	@QueryParam("kmdrove")
	private String kmdrove;

	@QueryParam("color")
	private String color;

	@QueryParam("ownershipType")
	private String ownershipType;

	@QueryParam("isInsured")
	private boolean isInsured;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTyreSize() {
		return tyreSize;
	}

	public void setTyreSize(int tyreSize) {
		this.tyreSize = tyreSize;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getKmdrove() {
		return kmdrove;
	}

	public void setKmdrove(String kmdrove) {
		this.kmdrove = kmdrove;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getOwnershipType() {
		return ownershipType;
	}

	public void setOwnershipType(String ownershipType) {
		this.ownershipType = ownershipType;
	}

	public boolean isInsured() {
		return isInsured;
	}

	public void setInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}

	@Override
	public String toString() {
		return "CarDto [city=" + city + ", location=" + location + ", manufacturer=" + manufacturer + ", model=" + model
				+ ", tyreSize=" + tyreSize + ", price=" + price + ", kmdrove=" + kmdrove + ", color=" + color
				+ ", ownershipType=" + ownershipType + ", isInsured=" + isInsured + "]";
	}

}
