package mx.uv.aerolinea;

import java.util.ArrayList;

import org.example.aerolinea.ActualizarAvionRequest;
import org.example.aerolinea.ActualizarAvionResponse;
import org.example.aerolinea.ActualizarBoletoRequest;
import org.example.aerolinea.ActualizarBoletoResponse;
import org.example.aerolinea.ActualizarPasajeroRequest;
import org.example.aerolinea.ActualizarPasajeroResponse;
import org.example.aerolinea.ActualizarVueloRequest;
import org.example.aerolinea.ActualizarVueloResponse;
import org.example.aerolinea.ConsultarAvionRequest;
import org.example.aerolinea.ConsultarAvionResponse;
import org.example.aerolinea.ConsultarBoletoRequest;
import org.example.aerolinea.ConsultarBoletoResponse;
import org.example.aerolinea.ConsultarPasajeroRequest;
import org.example.aerolinea.ConsultarPasajeroResponse;
import org.example.aerolinea.ConsultarVueloRequest;
import org.example.aerolinea.ConsultarVueloResponse;
import org.example.aerolinea.EliminarAvionRequest;
import org.example.aerolinea.EliminarAvionResponse;
import org.example.aerolinea.EliminarCompraBoletoRequest;
import org.example.aerolinea.EliminarCompraBoletoResponse;
import org.example.aerolinea.EliminarPasajeroRequest;
import org.example.aerolinea.EliminarPasajeroResponse;
import org.example.aerolinea.EliminarVueloRequest;
import org.example.aerolinea.EliminarVueloResponse;
import org.example.aerolinea.ListarAvionesRequest;
import org.example.aerolinea.ListarAvionesResponse;
import org.example.aerolinea.ListarBoletosRequest;
import org.example.aerolinea.ListarBoletosResponse;
import org.example.aerolinea.ListarPasajerosRequest;
import org.example.aerolinea.ListarPasajerosResponse;
import org.example.aerolinea.ListarVuelosRequest;
import org.example.aerolinea.ListarVuelosResponse;
import org.example.aerolinea.RegistrarAvionRequest;
import org.example.aerolinea.RegistrarAvionResponse;
import org.example.aerolinea.RegistrarComprarBoletoRequest;
import org.example.aerolinea.RegistrarComprarBoletoResponse;
import org.example.aerolinea.RegistrarPasajeroRequest;
import org.example.aerolinea.RegistrarPasajeroResponse;
import org.example.aerolinea.RegistrarVueloRequest;
import org.example.aerolinea.RegistrarVueloResponse;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import controller.AvionDAO;
import controller.ComprarBoletoDAO;
import controller.PasajeroDAO;
import controller.VueloDAO;
import model.Avion;
import model.ComprarBoleto;
import model.Pasajero;
import model.Vuelo;

@Endpoint
public class EndPoint {
	/* Pasajero */
    @PayloadRoot(localPart = "RegistrarPasajeroRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public RegistrarPasajeroResponse getRegistrarPasajero (@RequestPayload RegistrarPasajeroRequest peticion) {
		RegistrarPasajeroResponse respuesta = new RegistrarPasajeroResponse();
		
		PasajeroDAO pasajero = new PasajeroDAO(peticion.getNombre(), peticion.getApellido(), 
				peticion.getDireccion(), peticion.getTelefono(), peticion.getCorreo());
		
		if (pasajero.registrarPasajero()) {
			respuesta.setRespuesta("Pasajero registrado correctamente");
		} else {
			respuesta.setRespuesta("No se ha podido registrar el pasajero ");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ActualizarPasajeroRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ActualizarPasajeroResponse getActualizarPasajero (@RequestPayload ActualizarPasajeroRequest peticion) {
		ActualizarPasajeroResponse respuesta = new ActualizarPasajeroResponse();
		PasajeroDAO pasajero = new PasajeroDAO(peticion.getIdPasajero(),peticion.getNombre(), peticion.getApellido(), 
				peticion.getDireccion(), peticion.getTelefono(), peticion.getCorreo());
		if (pasajero.verificarIdPasajero()) {
			if (pasajero.actualizarPasajero()) {
				respuesta.setRespuesta("Pasajero actualizado correctamente");
			} else {
				respuesta.setRespuesta("No se ha podido actualizar pasajero ");
			}
		} else {
			respuesta.setRespuesta("El idPasajero que ha ingresado no existe");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "EliminarPasajeroRequest", namespace = "http://www.example.org/Aerolinea")
	@ResponsePayload
	public EliminarPasajeroResponse getEliminarPasajero (@RequestPayload EliminarPasajeroRequest peticion) {
		EliminarPasajeroResponse respuesta = new EliminarPasajeroResponse();
		PasajeroDAO pasajero = new PasajeroDAO(peticion.getIdPasajero());
		if (pasajero.eliminarPasajero()) {
			respuesta.setRespuesta("Pasajero eliminado correctamente");
		} else {
			respuesta.setRespuesta("Pasajero no eliminado");
		}
		return respuesta;
	}
		
	@PayloadRoot(localPart = "ConsultarPasajeroRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ConsultarPasajeroResponse getConsultarPasajero (@RequestPayload ConsultarPasajeroRequest peticion) {
		ConsultarPasajeroResponse respuesta = new ConsultarPasajeroResponse();
		PasajeroDAO pasajero = new PasajeroDAO(peticion.getIdPasajero());
		
		Pasajero p = pasajero.consultarPasajero(peticion.getIdPasajero());
		
		
		if (p != null) {
			respuesta.setNombre(p.getNombre());
			respuesta.setApellido(p.getApellido());
			respuesta.setDireccion(p.getDireccion());
			respuesta.setTelefono(p.getTelefono());
			respuesta.setCorreo(p.getCorreo());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ListarPasajerosRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ListarPasajerosResponse getListarPasajeros (@RequestPayload ListarPasajerosRequest peticion) {
		ListarPasajerosResponse respuesta = new ListarPasajerosResponse();
		PasajeroDAO p = new PasajeroDAO();
		ArrayList<ListarPasajerosResponse.Pasajero> pasajeros = p.getListarPasajeros();
		
		if(pasajeros.size() != 0) {
			
			for (int i=0;i<pasajeros.size();i++) {
				respuesta.getPasajero().add(pasajeros.get(i));	
			}
			
		}
		
		
		return respuesta;
	}
	/* Avion */
	@PayloadRoot(localPart = "RegistrarAvionRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public RegistrarAvionResponse getRegistrarAvion (@RequestPayload RegistrarAvionRequest peticion) {
		RegistrarAvionResponse respuesta = new RegistrarAvionResponse();
		
		AvionDAO avion = new AvionDAO(peticion.getModelo(), peticion.getNumPasajeros(), 
				peticion.getPiloto(), peticion.getAeromosas(), peticion.getDestino());
		
		if (avion.registrarAvion()) {
			respuesta.setRespuesta("Avion registrado");
		} else {
			respuesta.setRespuesta("No se ha podido registrar el avion ");
		}
		
		return respuesta;
	}

	@PayloadRoot(localPart = "ConsultarAvionRequest", namespace = "http://www.example.org/Aerolinea")

	@ResponsePayload
	public ConsultarAvionResponse getConsultarAvion (@RequestPayload ConsultarAvionRequest peticion) {
		ConsultarAvionResponse respuesta = new ConsultarAvionResponse();
		AvionDAO avion = new AvionDAO(peticion.getIdAvion());
	
		Avion a = avion.consultarAvion(peticion.getIdAvion());
	
	
		if (a != null) {
			respuesta.setModelo(a.getModelo());
			respuesta.setNumPasajeros(a.getNumPasajeros());
			respuesta.setPiloto(a.getPiloto());
			respuesta.setAeromosas(a.getAeromosas());
			respuesta.setDestino(a.getDestino());
		}
	
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ActualizarAvionRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ActualizarAvionResponse getActualizarAvion (@RequestPayload ActualizarAvionRequest peticion) {
		ActualizarAvionResponse respuesta = new ActualizarAvionResponse();
		AvionDAO avion = new AvionDAO(peticion.getIdAvion(), peticion.getModelo(), peticion.getNumPasajeros(), 
				peticion.getPiloto(), peticion.getAeromosas(), peticion.getDestino());
		if (avion.verificarIdAvion()) {
			if (avion.actualizarAvion()) {
				respuesta.setRespuesta("Se ha actualizado el avion ");
			} else {
				respuesta.setRespuesta("No se ha podido actualizar el avion ");
			}
		} else {
			respuesta.setRespuesta("El idAvion que ha ingresado no existe");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "EliminarAvionRequest", namespace = "http://www.example.org/Aerolinea")
	@ResponsePayload
	public EliminarAvionResponse getEliminarAvion (@RequestPayload EliminarAvionRequest peticion) {
		EliminarAvionResponse respuesta = new EliminarAvionResponse();
		AvionDAO avion = new AvionDAO(peticion.getIdAvion());
		if (avion.eliminarAvion()) {
			respuesta.setRespuesta("Se ha eliminado el avion del sistema");
		} else {
			respuesta.setRespuesta("No se ha podido eliminar el avion de la base de datos");
		}
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ListarAvionesRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ListarAvionesResponse getListarAviones (@RequestPayload ListarAvionesRequest peticion) {
		ListarAvionesResponse respuesta = new ListarAvionesResponse();
		AvionDAO a = new AvionDAO();
		ArrayList<ListarAvionesResponse.Avion> aviones = a.getListarAviones();
		
		if(aviones.size() != 0) {
			
			for (int i=0;i<aviones.size();i++) {
				respuesta.getAvion().add(aviones.get(i));	
			}
			
		}
		
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "RegistrarComprarBoletoRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public RegistrarComprarBoletoResponse getRegistrarComprarBoleto (@RequestPayload RegistrarComprarBoletoRequest peticion) {
		RegistrarComprarBoletoResponse respuesta = new RegistrarComprarBoletoResponse();
		
		ComprarBoletoDAO boleto = new ComprarBoletoDAO(peticion.getFecha(), peticion.getOrigen(), 
				peticion.getDestino(), peticion.getAsiento(), peticion.getPago());
		
		if (boleto.registrarComprarBoleto()) {
			respuesta.setRespuesta("Boleto comprado");
		} else {
			respuesta.setRespuesta("No se ha podido realizar la compra ");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ConsultarBoletoRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ConsultarBoletoResponse getConsultarBoleto (@RequestPayload ConsultarBoletoRequest peticion) {
		ConsultarBoletoResponse respuesta = new ConsultarBoletoResponse();
		ComprarBoletoDAO boleto = new ComprarBoletoDAO(peticion.getIdBoleto());
		
		ComprarBoleto b = boleto.consultarBoleto(peticion.getIdBoleto());
		
		
		if (b != null) {
			respuesta.setFecha(b.getFecha());
			respuesta.setOrigen(b.getOrigen());
			respuesta.setDestino(b.getDestino());
			respuesta.setAsiento(b.getAsiento());
			respuesta.setPago(b.getPago());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "EliminarCompraBoletoRequest", namespace = "http://www.example.org/Aerolinea")
	@ResponsePayload
	public EliminarCompraBoletoResponse getEliminarBoleto (@RequestPayload EliminarCompraBoletoRequest peticion) {
		EliminarCompraBoletoResponse respuesta = new EliminarCompraBoletoResponse();
		ComprarBoletoDAO boleto = new ComprarBoletoDAO(peticion.getIdBoleto());
		if (boleto.eliminarBoleto()) {
			respuesta.setRespuesta("Boleto eliminado correctamente");
		} else {
			respuesta.setRespuesta("Boleto no eliminado");
		}
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ActualizarBoletoRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ActualizarBoletoResponse getActualizarBoleto (@RequestPayload ActualizarBoletoRequest peticion) {
		ActualizarBoletoResponse respuesta = new ActualizarBoletoResponse();
		ComprarBoletoDAO boleto = new ComprarBoletoDAO(peticion.getIdBoleto(),peticion.getFecha(), peticion.getOrigen(), 
				peticion.getDestino(), peticion.getAsiento(), peticion.getPago());
		if (boleto.verificarIdBoleto()) {
			if (boleto.actualizarBoleto()) {
				respuesta.setRespuesta("Boleto actualizado correctamente");
			} else {
				respuesta.setRespuesta("No se ha podido actualizar el boleto ");
			}
		} else {
			respuesta.setRespuesta("El idBoleto que ha ingresado no existe");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ListarBoletosRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ListarBoletosResponse getListarBoletos (@RequestPayload ListarBoletosRequest peticion) {
		ListarBoletosResponse respuesta = new ListarBoletosResponse();
		ComprarBoletoDAO b = new ComprarBoletoDAO();
		ArrayList<ListarBoletosResponse.Boleto> boletos = b.getListarBoletos();
		
		if(boletos.size() != 0) {
			
			for (int i=0;i<boletos.size();i++) {
				respuesta.getBoleto().add(boletos.get(i));	
			}
			
		}
		
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "RegistrarVueloRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public RegistrarVueloResponse getRegistrarVuelo (@RequestPayload RegistrarVueloRequest peticion) {
		RegistrarVueloResponse respuesta = new RegistrarVueloResponse();
		
		VueloDAO vuelo = new VueloDAO(peticion.getAvion(), peticion.getDestino(), 
				peticion.getFecha(), peticion.getHoraSalida(), peticion.getHoraLlegada());
		
		if (vuelo.registrarVuelo()) {
			respuesta.setRespuesta("Vuelo registrado");
		} else {
			respuesta.setRespuesta("No se ha podido de dar alta vuelo ");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ConsultarVueloRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ConsultarVueloResponse getConsultarVuelo (@RequestPayload ConsultarVueloRequest peticion) {
		ConsultarVueloResponse respuesta = new ConsultarVueloResponse();
		VueloDAO vuelo = new VueloDAO(peticion.getIdVuelo());
		
		Vuelo v = vuelo.consultarVuelo(peticion.getIdVuelo());
		
		
		if (v != null) {
			respuesta.setAvion(v.getAvion());
			respuesta.setDestino(v.getDestino());
			respuesta.setFecha(v.getFecha());
			respuesta.setHoraSalida(v.getHoraSalida());
			respuesta.setHoraLlegada(v.getHoraLlegada());
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "EliminarVueloRequest", namespace = "http://www.example.org/Aerolinea")
	@ResponsePayload
	public EliminarVueloResponse getEliminarVuelo (@RequestPayload EliminarVueloRequest peticion) {
		EliminarVueloResponse respuesta = new EliminarVueloResponse();
		VueloDAO vuelo = new VueloDAO(peticion.getIdVuelo());
		if (vuelo.eliminarVuelo()) {
			respuesta.setRespuesta("Vuelo eliminado correctamente");
		} else {
			respuesta.setRespuesta("Vuelo no eliminado");
		}
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ActualizarVueloRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ActualizarVueloResponse getActualizarVuelo (@RequestPayload ActualizarVueloRequest peticion) {
		ActualizarVueloResponse respuesta = new ActualizarVueloResponse();
		VueloDAO vuelo = new VueloDAO(peticion.getIdVuelo(),peticion.getAvion(), peticion.getDestino(), 
				peticion.getFecha(), peticion.getHoraSalida(), peticion.getHoraLlegada());
		if (vuelo.verificarIdVuelo()) {
			if (vuelo.actualizarVuelo()) {
				respuesta.setRespuesta("Vuelo actualizado correctamente");
			} else {
				respuesta.setRespuesta("No se ha podido actualizar el vuelo ");
			}
		} else {
			respuesta.setRespuesta("El idVuelo que ha ingresado no existe");
		}
		
		return respuesta;
	}
	
	@PayloadRoot(localPart = "ListarVuelosRequest", namespace = "http://www.example.org/Aerolinea")
	
	@ResponsePayload
	public ListarVuelosResponse getListarVuelos (@RequestPayload ListarVuelosRequest peticion) {
		ListarVuelosResponse respuesta = new ListarVuelosResponse();
		VueloDAO v = new VueloDAO();
		ArrayList<ListarVuelosResponse.Vuelo> vuelos = v.getListarVuelos();
		
		if(vuelos.size() != 0) {
			
			for (int i=0;i<vuelos.size();i++) {
				respuesta.getVuelo().add(vuelos.get(i));	
			}
			
		}
		
		
		return respuesta;
	}
}
