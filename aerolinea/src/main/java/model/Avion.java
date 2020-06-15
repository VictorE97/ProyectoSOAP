package model;

public class Avion {
	private int idAvion;
	private String modelo;
	private int numPasajeros;
	private String piloto;
	private String aeromosas;
	private String destino;
	
	public Avion() {}
	
	public Avion(int idAvion, String modelo, int numPasajeros, String piloto, String aeromosas, String destino) {
		this.idAvion = idAvion;
		this.modelo = modelo;
		this.numPasajeros = numPasajeros;
		this.piloto = piloto;
		this.aeromosas = aeromosas;
		this.destino = destino;
	}

	public Avion(String modelo, int numPasajeros, String piloto, String aeromosas, String destino) {
		this.modelo = modelo;
		this.numPasajeros = numPasajeros;
		this.piloto = piloto;
		this.aeromosas = aeromosas;
		this.destino = destino;
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}

	public String getPiloto() {
		return piloto;
	}

	public void setPiloto(String piloto) {
		this.piloto = piloto;
	}

	public String getAeromosas() {
		return aeromosas;
	}

	public void setAeromosas(String aeromosas) {
		this.aeromosas = aeromosas;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	
}
