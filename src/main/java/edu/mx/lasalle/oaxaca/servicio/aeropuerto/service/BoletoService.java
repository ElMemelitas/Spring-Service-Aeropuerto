package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.BoletoModel;

@Service
public interface BoletoService {
    public void registrarBoleto(BoletoModel boletoModel);
    @SuppressWarnings("rawtypes")
    public List obtenerBoletos();
    public BoletoModel getBoleto(int id);
    public void actualizarDatosBoleto(BoletoModel boletoModel, int id);
    public void borrarBoleto(int id);
    public void borrarTodosLosBoletos();
}
