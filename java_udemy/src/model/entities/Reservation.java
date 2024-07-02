package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reservation {
	
	//Solução 1
//	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	
//	private Integer roomNumber;
//	private Date checkIn;
//	private Date checkOut;
//	
//	public Reservation() {
//		
//	}
//
//	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
//		this.roomNumber = roomNumber;
//		this.checkIn = checkIn;
//		this.checkOut = checkOut;
//	}
//
//	public Integer getRoomNumber() {
//		return roomNumber;
//	}
//
//	public void setRoomNumber(Integer roomNumber) {
//		this.roomNumber = roomNumber;
//	}
//
//	public Date getCheckIn() {
//		return checkIn;
//	}
//
//	public Date getCheckOut() {
//		return checkOut;
//	}
//	
//	//long = inteiro com mais numeros
//	//a diferença entre datas será calculada em milissegundos
//	public long duration() {
//		long diff = checkOut.getTime() - checkIn.getTime();
//		//converte milissegundos em dias
//		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
//	}
//	
//	public void updateDates(Date checkIn, Date checkOut){
//		this.checkIn = checkIn;
//		this.checkOut = checkOut;
//	}
//	
//	@Override
//	public String toString() {
//		return "Room "
//				+ roomNumber
//				+ ", check-in: "
//				+ sdf.format(checkIn)
//				+ ", check-out: "
//				+ sdf.format(checkOut)
//				+ ", "
//				+ duration()
//				+ " nights";
//	}
	
	//Solução 2
//	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//	
//	private Integer roomNumber;
//	private Date checkIn;
//	private Date checkOut;
//	
//	public Reservation() {
//		
//	}
//
//	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
//		this.roomNumber = roomNumber;
//		this.checkIn = checkIn;
//		this.checkOut = checkOut;
//	}
//
//	public Integer getRoomNumber() {
//		return roomNumber;
//	}
//
//	public void setRoomNumber(Integer roomNumber) {
//		this.roomNumber = roomNumber;
//	}
//
//	public Date getCheckIn() {
//		return checkIn;
//	}
//
//	public Date getCheckOut() {
//		return checkOut;
//	}
//	
//	//long = inteiro com mais numeros
//	//a diferença entre datas será calculada em milissegundos
//	public long duration() {
//		long diff = checkOut.getTime() - checkIn.getTime();
//		//converte milissegundos em dias
//		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
//	}
//	
//	public String updateDates(Date checkIn, Date checkOut){
//		
//		Date now = new Date();
//		if(checkIn.before(now) || checkOut.before(now)) {
//			return "Reservation dates for update must be future dates";
//		}
//		if(!checkOut.after(checkIn)) {
//			return "Error in reservation: Check-out date must be after check-in date";
//		}
//		
//		this.checkIn = checkIn;
//		this.checkOut = checkOut;
//		//O método espera que o retorno seja uma string, então o return null como 'default' e indicativo de q não houve erro na execução
//		return null;
//	}
//	
//	@Override
//	public String toString() {
//		return "Room "
//				+ roomNumber
//				+ ", check-in: "
//				+ sdf.format(checkIn)
//				+ ", check-out: "
//				+ sdf.format(checkOut)
//				+ ", "
//				+ duration()
//				+ " nights";
//	}
	
	//Solução 3
	private final static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	public Reservation() {
		
	}

	public Reservation(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		//programação defensiva - prática de tratar exceção já no construtor da classe
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	//long = inteiro com mais numeros
	//a diferença entre datas será calculada em milissegundos
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		//converte milissegundos em dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public String updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			return "Error in reservation: Reservation dates for update must be future dates";
		}
		if(!checkOut.after(checkIn)) {
			return "Error in reservation: Check-out date must be after check-in date";
		}
		
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		
		return null;

	}
	
	//como DomainException é uma classe que estende Exception, então é necessário ou propagar a exceção ou tratá-la
	//nesse caso, ela será propagada aqui e tratada no try-catch do programa
	public void updateDatesException(Date checkIn, Date checkOut) throws DomainException {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			//DomainException - classe de exceção personalizada
			throw new DomainException("Reservation dates for update must be future dates");
		}
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Error in reservation: Check-out date must be after check-in date");
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		


	}
	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ sdf.format(checkIn)
				+ ", check-out: "
				+ sdf.format(checkOut)
				+ ", "
				+ duration()
				+ " nights";
	}
}
