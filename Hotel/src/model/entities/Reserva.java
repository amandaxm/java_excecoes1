package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import model.exceptions.DomainException;

public class Reserva {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public Reserva() {
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

	public Reserva(Integer roomNumber, Date checkIn, Date checkOut) throws DomainException {
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Erro data checkout incorreta deve ser posterior à checkin");

		}
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public long duration() {// diferença entre duas datas
		// diferença milissegundos das duas datas
		long diff = checkOut.getTime() - checkIn.getTime(); // milisegundos
		// transformar em dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);// diff que estava em milissegundo

	}

	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Data deve ser futura");

		}
		if (!checkOut.after(checkIn)) {
			throw new DomainException("Erro data checkout incorreta deve ser posterior à checkin");

		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;

	}

	@Override
	public String toString() {

		return "Room" + roomNumber + " , check-in: " + sdf.format(checkIn) + ", check-out: " + sdf.format(checkOut)
				+ ", " + duration() + " nights";

	}

}
