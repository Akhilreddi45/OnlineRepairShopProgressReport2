package com.online.repair.state;

import com.online.repair.model.Device;

public class CompleteRepairState implements RepairState {

	Device device;

	public CompleteRepairState(Device device) {

		this.device = device;
	}

	@Override
	public void startRepair() {
		System.out.println("Device Repair is yet to complete");

	}

	@Override
	public void repairInProgress() {
		System.out.println("Device Repair is yet to complete");

	}

	@Override
	public void completeRepair() {
		System.out.println("Device repair is Completed");
		device.setState(null);
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CompleteRepairState");
		return builder.toString();
	}
	
	@Override
	public void paymentDone() {
		System.out.println("Device Repair is yet to complete");

		
	}


}