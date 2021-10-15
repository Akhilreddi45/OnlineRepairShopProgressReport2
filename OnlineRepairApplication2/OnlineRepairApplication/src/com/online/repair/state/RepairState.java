package com.online.repair.state;

public interface RepairState {

	public void startRepair();

	public void repairInProgress();

	public void completeRepair();
}