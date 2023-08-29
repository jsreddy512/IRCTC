package in.sai.service;

import in.sai.request.Passenger;
import in.sai.responce.Ticket;

public interface BookingService {
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNumber);
}
