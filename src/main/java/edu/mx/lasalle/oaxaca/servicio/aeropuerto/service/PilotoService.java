package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PilotoModel;

@Service
public interface PilotoService {
    public void registrarPiloto(PilotoModel pilotoModel);
    @SuppressWarnings("rawtypes")
    public List obtenerPilotos();
    public PilotoModel getPiloto(int id);
    public void actualizarDatosPiloto(PilotoModel pilotoModel, int id);
    public void borrarPiloto(int id);
    public void borrarTodosLosPilotos();
}
