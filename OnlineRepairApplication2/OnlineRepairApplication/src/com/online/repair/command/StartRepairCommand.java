package com.online.repair.command;

import com.online.repair.model.Device;

public class StartRepairCommand implements Command {
	
	Device device;
	
	public StartRepairCommand(Device device) {
		this.device = device;
	}

	@Override
	public String execute() {
		device.startRepair();
		return "Start_Repair_State";
	}

}
