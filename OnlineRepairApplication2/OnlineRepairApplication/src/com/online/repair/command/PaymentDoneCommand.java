package com.online.repair.command;

import com.online.repair.model.Device;

public class PaymentDoneCommand implements Command {

	Device device;

	public PaymentDoneCommand(Device device) {
		this.device = device;
	}

	@Override
	public String execute() {
		device.paymentDone();
		return "Payment_Done_State";
	}

}
