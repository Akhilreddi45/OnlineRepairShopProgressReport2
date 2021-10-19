package com.online.repair.command;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.online.repair.builder.DeviceBuilder;
import com.online.repair.model.mobile.MobileAudioRepair;

class StartRepairCommandTest {

	@Test
	void testExecute() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_AUDIO_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		MobileAudioRepair expectedDevice = new MobileAudioRepair(builder);
		StartRepairCommand command = new StartRepairCommand(expectedDevice);
		String state = command.execute();
		Assert.assertEquals("Start_Repair_State", state);
	}

}
