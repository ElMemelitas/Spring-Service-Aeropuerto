package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AvionetaModel;

@Service
public interface AvionetaService {
    public void registrarAvioneta(AvionetaModel avionetaModel);
    @SuppressWarnings("rawtypes")
    public List obtenerAvionetas();
    public AvionetaModel getAvioneta(int id);
    public void actualizarDatosAvioneta(AvionetaModel avionetaModel, int id);
    public void borrarAvioneta(int id);
    public void borrarTodosLosAvionetas();
}
