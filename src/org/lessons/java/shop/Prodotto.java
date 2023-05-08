package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
	private int code;
	private String name;
	private String description;
	private double price;
	private int vat;
	
	
	public Prodotto(String name, String description, double price, int vat) {
		
		setRandomCode();
		setName(name);
		setDescription(description);
		setPrice(price);
		setVat(vat);
	}
	
	public int getCode() {
		return code;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price){
		this.price = price;
	}
	
	public int getVat(){
		return vat;
	}
	
	public void setVat(int vat) {
		this.vat = vat;
	}
	
	
	public int setRandomCode() {
		Random rnd = new Random();
		return code = rnd.nextInt(20);	
		
	}
	
	
	public double vatPrice() {
		return price + (price * vat / 100);
	}
	
	public String codeName() {
		return getLongCode() + getName();
	}
	
	public String getLongCode() {
		return String.format("%08d", code);

	}
	
	@Override
	public String toString() {
		return "[" + codeName() + "] - prezzo "
				+ String.format("%.2f", getPrice()) + "€ - IVA "
				+ getVat() + "% - prezzo con iva "
				+ vatPrice() + "€";
	}
}
