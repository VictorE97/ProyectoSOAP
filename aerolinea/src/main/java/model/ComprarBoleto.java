package model;

public class ComprarBoleto {
	private int idBoleto;
	private String fecha;
	private String origen;
	private String destino;
	private String asiento;
	private String pago;
	
	public ComprarBoleto() {}
	
	public ComprarBoleto(int idBoleto, String fecha, String origen, String destino, String asiento, String pago) {
		this.idBoleto = idBoleto;
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.pago = pago;
	}

	public ComprarBoleto(String fecha, String origen, String destino, String asiento, String pago) {
		this.fecha = fecha;
		this.origen = origen;
		this.destino = destino;
		this.asiento = asiento;
		this.pago = pago;
	}

	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getAsiento() {
		return asiento;
	}

	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}

	public String getPago() {
		return pago;
	}

	public void setPago(String pago) {
		this.pago = pago;
	}
	
	
}
