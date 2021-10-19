package com.online.repair.command;

import com.online.repair.model.Device;

public class RepairInProgressCommand implements Command {

	Device device;

	public RepairInProgressCommand(Device device) {
		this.device = device;
	}

	@Override
	public String execute() {
		device.repairInProgress();
		return "Repair_InProgress_State";
	}

}
