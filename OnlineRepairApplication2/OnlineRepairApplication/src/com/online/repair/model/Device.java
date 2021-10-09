package com.online.repair.model;

import java.util.Date;

import com.online.repair.builder.DeviceBuilder;

public abstract class Device {

	protected String device;
	protected String repairType;
	protected String customerName;
	protected String contactDetails;
	protected Date transactionDate;
	protected Date estimatedDeliveryDate;

	protected DeviceBuilder builder;

	public Device(DeviceBuilder builder) {
		this.device = builder.getDevice();
		this.repairType = builder.getRepairType();
		this.customerName = builder.getCustomerName();
		this.contactDetails = builder.getContactDetails();
		this.transactionDate = builder.getTransactionDate();
		this.estimatedDeliveryDate = builder.getEstimatedDeliveryDate();
	}

	public String getDevice() {
		return device;
	}

	public void setDevice(String device) {
		this.device = device;
	}

	public String getRepairType() {
		return repairType;
	}

	public void setRepairType(String repairType) {
		this.repairType = repairType;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public void setEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Device [device=");
		builder.append(device);
		builder.append(", repairType=");
		builder.append(repairType);
		builder.append(", customerName=");
		builder.append(customerName);
		builder.append(", contactDetails=");
		builder.append(contactDetails);
		builder.append(", transactionDate=");
		builder.append(transactionDate);
		builder.append(", estimatedDeliveryDate=");
		builder.append(estimatedDeliveryDate);
		builder.append("]");
		return builder.toString();
	}

}
