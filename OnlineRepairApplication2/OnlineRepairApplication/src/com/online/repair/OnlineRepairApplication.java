package com.online.repair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.online.repair.builder.DeviceBuilder;
import com.online.repair.model.Device;
import com.online.repair.service.DeviceRepairFactory;

public class OnlineRepairApplication {

	public static void main(String[] args) {

		List<Device> devices = getDevicesForRepair();

		for (Device device : devices) {
			System.out.println("Before Repair started ..... ");
			System.out.println(device);
			System.out.println("Start Repair ");
			device.startRepair();
			System.out.println("Moving device state ");
			device.completeRepair();
			System.out.println(device);
		}

	}

	private static List<Device> getDevicesForRepair() {

		List<Device> devices = new ArrayList<>();

		DeviceBuilder builder = new DeviceBuilder();

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_SCREEN_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair(builder));

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_AUDIO_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair(builder));

		builder = builder.addDevice("MOBILE").addRepairType("MOBILE_CAMERA_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair(builder));

		builder = builder.addDevice("TV").addRepairType("TV_SPEAKER_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair(builder));

		builder = builder.addDevice("TV").addRepairType("TV_DISPLAY_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair(builder));

		builder = builder.addDevice("TV").addRepairType("TV_MOTHERBOARD_REPAIR").addCustomerName("Test1")
				.addContactDetails("TX").addTransactionDate(new Date()).addEstimatedDeliveryDate(new Date());
		devices.add(DeviceRepairFactory.getDeviceInstanceForRepair(builder));

		return devices;
	}

}
