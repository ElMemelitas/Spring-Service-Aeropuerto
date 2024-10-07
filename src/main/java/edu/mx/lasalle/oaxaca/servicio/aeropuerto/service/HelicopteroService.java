package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.HelicopteroModel;

@Service
public interface HelicopteroService {
    public void registrarHelicoptero(HelicopteroModel helicopteroModel);
    @SuppressWarnings("rawtypes")
    public List obtenerHelicopteros();
    public HelicopteroModel getHelicoptero(int id);
    public void actualizarDatosHelicoptero(HelicopteroModel helicopteroModel, int id);
    public void borrarHelicoptero(int id);
    public void borrarTodosLosHelicopteros();
}
