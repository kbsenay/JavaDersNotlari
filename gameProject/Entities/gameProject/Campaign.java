package gameProject;

import java.time.LocalDate;

public class Campaign implements Entity{
	private int id;
	private String  campaingName;
	private double discountRate;
	private LocalDate startDate;
	private LocalDate expirationDate;
	
	public Campaign () {
		
	}

	public Campaign(int id, String campaingName, double discountRate, LocalDate startDate, LocalDate expirationDate ) {
		super();
		this.id = id;
		this.campaingName = campaingName;
		this.discountRate = discountRate;
		this.startDate = startDate;
		this.expirationDate = expirationDate;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampaingName() {
		return campaingName;
	}

	public void setCampaingName(String campaingName) {
		this.campaingName = campaingName;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

}
