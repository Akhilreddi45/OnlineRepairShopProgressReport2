package com.online.repair.state;

import com.online.repair.model.Device;

public class RepairInProgressState implements RepairState {

	Device device;

	public RepairInProgressState(Device device) {

		this.device = device;
	}

	@Override
	public void startRepair() {
		System.out.println("Device Repair already Started");

	}

	@Override
	public void repairInProgress() {
		System.out.println("Device repair is in progress State");
		device.setState(device.getCompleteRepairState());
	}

	@Override
	public void completeRepair() {
		System.out.println("Device repair is in progress, cannot complete");
	}

}