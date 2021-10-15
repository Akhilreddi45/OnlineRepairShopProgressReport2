package com.online.repair.state;

import com.online.repair.model.Device;

public class StartRepairState implements RepairState {

	Device device;

	public StartRepairState(Device device) {

		this.device = device;
	}

	@Override
	public void startRepair() {
		System.out.println("Device Repair Started");
		device.setState(device.getRepairInProgressState());
	}

	@Override
	public void repairInProgress() {
		System.out.println("Device repair is not started yet");
	}

	@Override
	public void completeRepair() {
		System.out.println("Device repair is not started yet");
	}

}