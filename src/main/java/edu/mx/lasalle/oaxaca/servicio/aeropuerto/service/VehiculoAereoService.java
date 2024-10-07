package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.VehiculoAereoModel;

@Service
public interface VehiculoAereoService {
    public void registrarVehiculoAereo(VehiculoAereoModel vehiculoAereoModel);
    @SuppressWarnings("rawtypes")
    public List obtenerVehiculosAereos();
    public VehiculoAereoModel getVehiculoAereo(int id);
    public void actualizarDatosVehiculoAereo(VehiculoAereoModel vehiculoAereoModel, int id);
    public void borrarVehiculoAereo(int id);
    public void borrarTodosLosVehiculosAereos();
}
