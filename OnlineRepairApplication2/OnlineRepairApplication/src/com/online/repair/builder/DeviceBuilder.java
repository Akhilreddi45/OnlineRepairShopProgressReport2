package com.online.repair.builder;

import java.util.Date;

public class DeviceBuilder {

	String customerName;
	String contactDetails;
	Date transactionDate;
	Date estimatedDeliveryDate;
	String device;
	String repairType;

	public DeviceBuilder addDevice(String device) {
		this.device = device;
		return this;
	}

	public DeviceBuilder addRepairType(String repairType) {
		this.repairType = repairType;
		return this;
	}

	public DeviceBuilder addCustomerName(String customerName) {
		this.customerName = customerName;
		return this;
	}

	public DeviceBuilder addContactDetails(String contactDetails) {
		this.contactDetails = contactDetails;
		return this;
	}

	public DeviceBuilder addTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
		return this;
	}

	public DeviceBuilder addEstimatedDeliveryDate(Date estimatedDeliveryDate) {
		this.estimatedDeliveryDate = estimatedDeliveryDate;
		return this;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getContactDetails() {
		return contactDetails;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public Date getEstimatedDeliveryDate() {
		return estimatedDeliveryDate;
	}

	public String getDevice() {
		return device;
	}

	public String getRepairType() {
		return repairType;
	}

}
