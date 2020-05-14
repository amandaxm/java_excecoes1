package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public Reserva() {}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckIn() {
		return checkIn;
	}
	
	public Date getCheckOut() {
		return checkOut;
	}
	
	public Reserva(Integer roomNumber, Date checkIn, Date checkOut) {
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	public long duration() {//diferença entre duas datas
		//diferença milissegundos das duas datas
		long diff = checkOut.getTime() - checkIn.getTime(); //milisegundos
		//transformar em dias
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);//diff que estava em milissegundo
		
	}
	public String updateDates(Date checkIn, Date checkOut) {
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "Data deve ser futura";

		}
		if (!checkOut.after(checkIn)) {
			return "Erro data checkout incorreta deve ser posterior à checkin";

		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;//nulo nao deu nenhum erro
		
	}
	@Override 
	public String toString() {
		
		return "Room"
				+roomNumber
				+ " , check-in: "
				+sdf.format(checkIn)
				+", check-out: "
				+sdf.format(checkOut)
				+", "
				+duration()
				+" nights";
				
	
	}

}
