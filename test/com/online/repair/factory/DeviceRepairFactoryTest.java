package com.online.repair.factory;

import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import com.online.repair.builder.DeviceBuilder;
import com.online.repair.model.Device;
import com.online.repair.model.mobile.MobileAudioRepair;
import com.online.repair.model.mobile.MobileCameraRepair;
import com.online.repair.model.mobile.MobileScreenReplacement;
import com.online.repair.model.tv.TVDisplayRepair;
import com.online.repair.model.tv.TVMotherboardRepair;
import com.online.repair.model.tv.TVSpeakerRepair;

class DeviceRepairFactoryTest {

	@Test
	void testGetDeviceInstanceForRepair_MOBILEAUDIO() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_AUDIO_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		MobileAudioRepair expectedDevice = new MobileAudioRepair(builder);

		Device actualDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);

		Assert.assertEquals(expectedDevice.toString(), actualDevice.toString());
	}

	@Test
	void testGetDeviceInstanceForRepair_MOBILE_CAMERA() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_CAMERA_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		MobileCameraRepair expectedDevice = new MobileCameraRepair(builder);

		Device actualDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);

		Assert.assertEquals(expectedDevice.toString(), actualDevice.toString());
	}

	@Test
	void testGetDeviceInstanceForRepair_MOBILE_SCREEN() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_SCREEN_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		MobileScreenReplacement expectedDevice = new MobileScreenReplacement(builder);

		Device actualDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);

		Assert.assertEquals(expectedDevice.toString(), actualDevice.toString());
	}

	@Test
	void testGetDeviceInstanceForRepair_TV_DISPLAY() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("TV").addRepairType("TV_DISPLAY_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		TVDisplayRepair expectedDevice = new TVDisplayRepair(builder);

		Device actualDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);

		Assert.assertEquals(expectedDevice.toString(), actualDevice.toString());
	}

	@Test
	void testGetDeviceInstanceForRepair_TV_MOTHERBOARD() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("TV").addRepairType("TV_MOTHERBOARD_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		TVMotherboardRepair expectedDevice = new TVMotherboardRepair(builder);

		Device actualDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);

		Assert.assertEquals(expectedDevice.toString(), actualDevice.toString());
	}

	@Test
	void testGetDeviceInstanceForRepair_TV_SPEAKER() {
		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("TV").addRepairType("TV_SPEAKER_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		TVSpeakerRepair expectedDevice = new TVSpeakerRepair(builder);

		Device actualDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);

		Assert.assertEquals(expectedDevice.toString(), actualDevice.toString());
	}

}
