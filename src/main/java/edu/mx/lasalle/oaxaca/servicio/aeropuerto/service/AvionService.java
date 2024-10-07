package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AvionModel;

@Service
public interface AvionService {
    public void registrarAvion(AvionModel avionModel);
    @SuppressWarnings("rawtypes")
    public List obtenerAviones();
    public AvionModel getAvion(int id);
    public void actualizarDatosAvion(AvionModel avionModel, int id);
    public void borrarAvion(int id);
    public void borrarTodosLosAviones();
}
