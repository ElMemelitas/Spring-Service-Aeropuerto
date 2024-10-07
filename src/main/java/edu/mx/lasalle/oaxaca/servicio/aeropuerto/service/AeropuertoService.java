package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AeropuertoModel;

@Service
public interface AeropuertoService {
    public void registrarAeropuerto(AeropuertoModel aeropuertoModel);
    @SuppressWarnings("rawtypes")
    public List obtenerAeropuertos();
    public AeropuertoModel getAeropuerto(int id);
    public void actualizarDatosAeropuerto(AeropuertoModel aeropuertoModel, int id);
    public void borrarAeropuerto(int id);
    public void borrarTodosLosAeropuertos();
}
