package main.domain;

public class Suspect {
	
	private String name;
	private String hairColor;
	private Boolean hasGlasses;
	private String facialHair;
	private String shirt;
	private String pants;
	private String shoes;
	private Integer birthYear;
	

	public Suspect(String name, String hairColor, Boolean hasGlasses, String facialHair, String shirt, String pants, String shoes, Integer birthYear) {
		this.name = name;
		this.hairColor = hairColor;
		this.hasGlasses = hasGlasses;
		this.facialHair = facialHair;
		this.shirt = shirt;
		this.pants = pants;
		this.shoes = shoes;
		this.birthYear = birthYear;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getHairColor() {
		return hairColor;
	}


	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}


	public Boolean getHasGlasses() {
		return hasGlasses;
	}


	public void setHasGlasses(Boolean hasGlasses) {
		this.hasGlasses = hasGlasses;
	}


	public String getFacialHair() {
		return facialHair;
	}


	public void setFacialHair(String facialHair) {
		this.facialHair = facialHair;
	}


	public String getShirt() {
		return shirt;
	}


	public void setShirt(String shirt) {
		this.shirt = shirt;
	}


	public String getPants() {
		return pants;
	}


	public void setPants(String pants) {
		this.pants = pants;
	}


	public String getShoes() {
		return shoes;
	}


	public void setShoes(String shoes) {
		this.shoes = shoes;
	}


	public Integer getBirthYear() {
		return birthYear;
	}


	public void setBirthYear(Integer birthYear) {
		this.birthYear = birthYear;
	}


	@Override
	public String toString() {
		return "\nSuspect [Name: " + name + ", HairColor: " + hairColor + ", HasGlasses: " + hasGlasses + ", FacialHair: "
				+ facialHair + ", Shirt: " + shirt + ", Pants: " + pants + ", Shoes: " + shoes + ", BirthYear: " + birthYear
				+ "]";
	}
	
	
	
	

}
