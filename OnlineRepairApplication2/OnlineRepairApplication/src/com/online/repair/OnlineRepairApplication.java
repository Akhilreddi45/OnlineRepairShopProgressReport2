package com.online.repair;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.online.repair.builder.DeviceBuilder;
import com.online.repair.command.CompleteRepairCommand;
import com.online.repair.command.PaymentDoneCommand;
import com.online.repair.command.RepairInProgressCommand;
import com.online.repair.command.StartRepairCommand;
import com.online.repair.model.Device;
import com.online.repair.factory.DeviceRepairFactory;

public class OnlineRepairApplication {

	public static void main(String[] args) {

		System.out.printf("\n");
		System.out.printf("            WELCOME TO ONLINE REPAIR SHOP                \n");
		System.out.printf("\n");

		Scanner scanner = new Scanner(System.in);
		List<Device> devices = new ArrayList<>();
		StartRepairCommand startRepairCommand = null;
		RepairInProgressCommand repairInProgressCommand = null;
		PaymentDoneCommand paymentDoneCommand = null;
		CompleteRepairCommand completeRepairCommand = null;

		do {

			System.out.println("Main Menu: ");
			System.out.println("1.Repair on Mobile");
			System.out.println("2.Repair on TV");
			System.out.println("3.Do Payment");
			System.out.println("4.Get All Devices");
			System.out.println("5.Exit");

			System.out.println("Choose one to proceed");

			int mainMenuOption = scanner.nextInt();
			DeviceBuilder builder = new DeviceBuilder();
			switch (mainMenuOption) {

			case 1:
				System.out.println("Mobile Repair Menu: ");
				System.out.println("1.Mobile Audio Repair");
				System.out.println("2.Mobile Screen Replacement");
				System.out.println("3.Mobile Camera Repair");
				int mobileMenuOption = scanner.nextInt();

				switch (mobileMenuOption) {
				case 1:

					builder = builder.addDevice("MOBILE").addRepairType("MOBILE_AUDIO_REPAIR").addCustomerName("Test1")
							.addContactDetails("TX").addTransactionDate(new Date())
							.addEstimatedDeliveryDate(new Date());
					Device mobileAudioRepairDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);
					devices.add(mobileAudioRepairDevice);

					startRepairCommand = new StartRepairCommand(mobileAudioRepairDevice);
					startRepairCommand.execute();

					break;
				case 2:
					builder = builder.addDevice("MOBILE").addRepairType("MOBILE_SCREEN_REPAIR").addCustomerName("Test1")
							.addContactDetails("TX").addTransactionDate(new Date())
							.addEstimatedDeliveryDate(new Date());
					Device mobileScreenRepairDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);
					devices.add(mobileScreenRepairDevice);
					startRepairCommand = new StartRepairCommand(mobileScreenRepairDevice);
					startRepairCommand.execute();
					break;
				case 3:
					builder = builder.addDevice("MOBILE").addRepairType("MOBILE_CAMERA_REPAIR").addCustomerName("Test1")
							.addContactDetails("TX").addTransactionDate(new Date())
							.addEstimatedDeliveryDate(new Date());
					Device mobileCameraRepairDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);
					devices.add(mobileCameraRepairDevice);
					startRepairCommand = new StartRepairCommand(mobileCameraRepairDevice);
					startRepairCommand.execute();
					break;

				}

				break;
			case 2:
				System.out.println("TV Repair Menu: ");
				System.out.println("1.TV Display Repair");
				System.out.println("2.TV Motherboard Repair");
				System.out.println("3.TV Speaker Repair");
				int tvMenuOption = scanner.nextInt();

				switch (tvMenuOption) {
				case 1:

					builder = builder.addDevice("TV").addRepairType("TV_DISPLAY_REPAIR").addCustomerName("Test1")
							.addContactDetails("TX").addTransactionDate(new Date())
							.addEstimatedDeliveryDate(new Date());
					Device tvDisplayRepairDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);
					devices.add(tvDisplayRepairDevice);

					startRepairCommand = new StartRepairCommand(tvDisplayRepairDevice);
					startRepairCommand.execute();
					break;
				case 2:
					builder = builder.addDevice("TV").addRepairType("TV_MOTHERBOARD_REPAIR").addCustomerName("Test1")
							.addContactDetails("TX").addTransactionDate(new Date())
							.addEstimatedDeliveryDate(new Date());
					Device tvMotherBoardRepairDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);
					devices.add(tvMotherBoardRepairDevice);
					startRepairCommand = new StartRepairCommand(tvMotherBoardRepairDevice);
					startRepairCommand.execute();
					break;
				case 3:
					builder = builder.addDevice("TV").addRepairType("TV_SPEAKER_REPAIR").addCustomerName("Test1")
							.addContactDetails("TX").addTransactionDate(new Date())
							.addEstimatedDeliveryDate(new Date());
					Device tvSpeakerRepairDevice = DeviceRepairFactory.getDeviceInstanceForRepair(builder);
					devices.add(tvSpeakerRepairDevice);
					startRepairCommand = new StartRepairCommand(tvSpeakerRepairDevice);
					startRepairCommand.execute();
					break;

				}

				break;
			case 3:
				int deviceId = Integer.MIN_VALUE;
				int id = 0;
				for (Device device : devices) {
					System.out.println("deviceId " + id + " " + device);
					id++;
				}
				do {
					if (devices.size() == 0) {
						break;
					}
					System.out.println("Please enter the device Id to pay the payment.");
					deviceId = scanner.nextInt();
					if (deviceId >= devices.size() || deviceId < 0) {
						System.out.println("Please enter valid deviceId.");
					} else {
						break;
					}
				} while (true);
				if (deviceId >= 0) {
					Device removedDevice = devices.remove(deviceId);
					repairInProgressCommand = new RepairInProgressCommand(removedDevice);
					repairInProgressCommand.execute();
					paymentDoneCommand = new PaymentDoneCommand(removedDevice);
					paymentDoneCommand.execute();
					completeRepairCommand = new CompleteRepairCommand(removedDevice);
					completeRepairCommand.execute();
				} else {
					System.out.println("No device is availble for Payment");
				}
				break;
			case 4:
			id = 0;
				if (devices.size() == 0) {
					System.out.println(" No Devices available for Repair");
				}
				for (Device device : devices) {
					System.out.println("deviceId " + id + " " + device);
					id++;
				}
				break;
			case 5:
				break;
			default:
				System.out.println("Invalid Option");
				break;

			}

			if (mainMenuOption == 5) {
				break;
			}

		} while (true);

		System.out.println("THANK YOU FOR USING THE ONLINE REPAIR APPLICATION");

	}

}
