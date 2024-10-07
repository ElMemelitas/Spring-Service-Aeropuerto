package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.SobrecargoModel;

@Service
public interface SobrecargoService {
    public void registrarSobrecargo(SobrecargoModel sobrecargoModel);
    @SuppressWarnings("rawtypes")
    public List obtenerSobrecargos();
    public SobrecargoModel getSobrecargo(int id);
    public void actualizarDatosSobrecargo(SobrecargoModel sobrecargoModel, int id);
    public void borrarSobrecargo(int id);
    public void borrarTodosLosSobrecargos();
}
