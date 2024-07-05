/*
 * Copyright(C) 2007-2013 National Institute of Informatics, All rights reserved.
 */
package app.checkout;

import app.AppException;
import app.checkin.CheckInRoomControl;//後で修正

/**
 * Form class for Check-out Customer
 * 
 */
public class CheckOutRoomForm {

	private CheckOutRoomControl checkOutRoomControl = new CheckOutRoomControl();

	private CheckOutRoomControl getCheckOutRoomControl() {
		return checkOutRoomControl;
	}

	private String roomNumber;

	public void checkOut() throws AppException {
		//編集した
		/**
		 * Your code for conducting check-out by using some Control object  
		 */
		CheckOutRoomControl checkOutRoomControl = getCheckOutRoomControl();
		checkOutRoomControl.checkOut(roomNumber);
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

}
