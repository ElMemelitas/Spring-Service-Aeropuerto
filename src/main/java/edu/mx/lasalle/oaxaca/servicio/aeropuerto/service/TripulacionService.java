package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.TripulacionModel;

@Service
public interface TripulacionService {
    public void registrarTripulacion(TripulacionModel tripulacionModel);
    @SuppressWarnings("rawtypes")
    public List obtenerTripulaciones();
    public TripulacionModel getTripulacion(int id);
    public void actualizarDatosTripulacion(TripulacionModel tripulacionModel, int id);
    public void borrarTripulacion(int id);
    public void borrarTodosLosTripulaciones();
}
