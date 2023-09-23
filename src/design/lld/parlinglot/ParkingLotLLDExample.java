/**
 * 
 */
package design.lld.parlinglot;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 91978
 *
 */
public class ParkingLotLLDExample {

	/**
	 *
	 *Requirements:
	 * 1. There should be multiple floors available at parking lot 
	 * 2. There should be multiple gates available at parking lot
	 * 3. There should be parking attendant present at each gate
	 * 4. Entry gate should process parking ticket
	 * 5. Exit gate should process payment for parking
	 * 6. Parking Lot should provide facility for parking different types of vehicles
	 * 7. There should be display board available at each parking for showing vacant spots details
	 * 
	 */
	public ParkingLotLLDExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class ParkingLot{
	
	List<ParkingFloor> floors;
	List<Entrance> entrances;
	List<Exit> exits;
	
	Address address;
	String parkingLotname;
	
	public Boolean isParkingSpaceAvailable(Vehicle vehicle) {return null;}
	public Boolean upadteParkingAttendant(ParkingAttendant parkingAttendant,Integer gateId) {return null;}
}

class ParkingFloor{
	
	Integer levelId;
	Boolean full;
	List<ParkingSpace> spaces;
	ParkingDisplayBoard displayBoard;
	
	
}

class ParkingDisplayBoard{
	
	Map<ParkingSpaceType, Integer> freeSpotsAvailable;
	
	public Boolean updateFreeSpots(ParkingSpaceType parkingSpaceType, Integer spots) {return null;}
	
}

class Gate{
	
	Integer gateId;
	ParkingAttendant parkingAttendant;
	
}

class Entrance extends Gate{
	
	public ParkingTicket processParkingTicket(Vehicle vehicle) {return null;}
	
}

class Exit extends Gate{
	
	public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {return null;}
	
}

class ParkingSpace{
	
	Integer spaceId;
	Boolean isFree;
	Double costPerHour;
	ParkingSpaceType spaceType;
	
}

class Account{
	
	String accountId;
	String name;
	String email;
	String password;
	Address address;
	
}

class Address{
	
	String pincode;
	String city;
	String country;
	String street;
	
}


class Admin extends Account{
	
	public Boolean addParkingFloor(ParkingLot parkingLot, ParkingFloor parkingFloor) {return null;}
	public Boolean addParkingSpace(ParkingFloor parkingFloor, ParkingSpace parkingSpace) {return null;}
	public Boolean addParkingDisplayBoard(ParkingFloor parkingFloor, ParkingDisplayBoard parkingDisplayBoard ){return null;}

}

class ParkingAttendant extends Account{
	
	Payment paymentService;
	
	public ParkingTicket processParkingTicket(Vehicle vehicle) {return null;}
	
	public PaymentInfo processPayment(ParkingTicket parkingTicket, PaymentType paymentType) {return null;}
	
}

class Vehicle{
	
	String licenseNumber;
	VehicleType vehicleType;
	ParkingTicket parkingTicket;
	PaymentInfo parkingInfo;
	
}

class ParkingTicket{
	
	Integer ticketId;
	Integer levelId;
	Integer spaceId;
	Date entryDateTime;
	Date exitDateTime;
	Double cost;
	ParkingSpaceType parkingSpaceType;
	ParkingStatus parkingStatus;
	
	public Boolean updateCost() {return null;}
	public Boolean updateExitDateTime(Date exit) {return null;}
	
	
}

class PaymentInfo{
	
	Integer transactionId;
	Date paymentDate;
	ParkingTicket parkingTicket;
	PaymentStatus paymentStatus;
	
}

class Payment{
	
	public PaymentInfo makePayment(ParkingTicket parkingTicket, PaymentType paymentType) {return null;}
	
}

enum ParkingSpaceType{
	
	CAR_PARKING, BIKE_PARKING, TRUCK_PARKING;
	
}

enum VehicleType{
	
	CAR, BIKE, TRUCK;
}

enum PaymentType{
	
	CASH, UPI, DEBIT_CARD, CREDIT_CARD;
	
}

enum ParkingStatus{
	
	ACTIVE, PAID;
	
}

enum PaymentStatus{
	
	UNPAID, PENDING, COMPLETED, CANCELLED, DECLINED, REFUNDED;
	
}
