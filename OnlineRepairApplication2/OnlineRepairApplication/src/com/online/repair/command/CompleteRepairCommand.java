package com.online.repair.command;

import com.online.repair.model.Device;

public class CompleteRepairCommand implements Command {

	Device device;

	public CompleteRepairCommand(Device device) {
		this.device = device;
	}

	@Override
	public String execute() {
		device.completeRepair();
		return "Complete_Repair_State";
	}

}
