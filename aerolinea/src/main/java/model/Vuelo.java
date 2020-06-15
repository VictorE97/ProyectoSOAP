package model;

public class Vuelo {
	private int idVuelo;
	private String avion;
	private String destino;
	private String fecha;
	private String horaSalida;
	private String horaLlegada;
	
	public Vuelo() {
	}

	public Vuelo(int idVuelo, String avion, String destino, String fecha, String horaSalida, String horaLlegada) {
		this.idVuelo = idVuelo;
		this.avion = avion;
		this.destino = destino;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}

	public Vuelo(String avion, String destino, String fecha, String horaSalida, String horaLlegada) {
		this.avion = avion;
		this.destino = destino;
		this.fecha = fecha;
		this.horaSalida = horaSalida;
		this.horaLlegada = horaLlegada;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getAvion() {
		return avion;
	}

	public void setAvion(String avion) {
		this.avion = avion;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}

	public String getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(String horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
	
}
