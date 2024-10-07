package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.VueloModel;

@Service
public interface VueloService {
    public void registrarVuelo(VueloModel vueloModel);
    @SuppressWarnings("rawtypes")
    public List obtenerVuelos();
    public VueloModel getVuelo(int id);
    public void actualizarDatosVuelo(VueloModel vueloModel, int id);
    public void borrarVuelo(int id);
    public void borrarTodosLosVuelos();
}
