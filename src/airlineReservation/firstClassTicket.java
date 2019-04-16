package airlineReservation;

import java.sql.Date;
import java.sql.Time;

public class firstClassTicket extends businessClassTicket {
	
	private boolean fineDining;
	private boolean prioritySeating;
	
	// what else can we add here??
	// need ideas...
	//Ideas: Drinks/Free Checked bags/access to movies/shows etc. /More flight points for first class (Like FC get x3 points,
	//business would get x2, and coach would get x1)
	
	public firstClassTicket(double price, int ticketNumber, String origin, String destination, String customerID,
			boolean roundTrip, Date departureDate, Time departureTime, Date arrivalDate, Time arrivalTime,
			int baggageNum, float frequentFlyerMiles, boolean openBar, boolean moreLegRoom, boolean fineDining,
			boolean prioritySeating) {
		super(price, ticketNumber, origin, destination, customerID, roundTrip, departureDate, departureTime,
				arrivalDate, arrivalTime, baggageNum, frequentFlyerMiles, openBar, moreLegRoom);
		this.fineDining = fineDining;
		this.prioritySeating = prioritySeating;
	}
	
	public boolean isFineDining() {
		return fineDining;
	}
	public void setFineDining(boolean fineDining) {
		this.fineDining = fineDining;
	}
	public boolean isPrioritySeating() {
		return prioritySeating;
	}
	public void setPrioritySeating(boolean prioritySeating) {
		this.prioritySeating = prioritySeating;
	}
	

	
	

}
