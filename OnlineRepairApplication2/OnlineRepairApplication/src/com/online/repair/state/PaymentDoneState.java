package com.online.repair.state;

import com.online.repair.model.Device;

public class PaymentDoneState implements RepairState {

	Device device;

	public PaymentDoneState(Device device) {

		this.device = device;
	}

	@Override
	public void startRepair() {
		System.out.println("Device Repair already Started");

	}

	@Override
	public void repairInProgress() {
		System.out.println("Device repair completed state");

	}

	@Override
	public void completeRepair() {
		System.out.println("Device repair payment pending, cannot complete");
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PaymentDoneState");
		return builder.toString();
	}

	@Override
	public void paymentDone() {
		System.out.println("Device repair done payment");
		device.setState(device.getCompleteRepairState());
	}

}
