package com.example.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Formula;
import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Building {

	private enum PropertyType {
		APARTAMENT, HOUSE, INDUSTRIAL
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "address_id")
	@RestResource(path = "address", rel = "address")
	private Address address;
	
	private String owner ;

	private int size;

	private int value;

	private PropertyType type;
	
    @Formula("value * 0.03")
    private int Taxes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public PropertyType getType() {
		return type;
	}

	public void setType(PropertyType type) {
		this.type = type;
	}

	public int getTaxes() {
		return Taxes;
	}

	public void setTaxes(int taxes) {
		Taxes = taxes;
	}

}
