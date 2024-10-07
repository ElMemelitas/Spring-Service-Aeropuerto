package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.CopilotoModel;

@Service
public interface CopilotoService {
    public void registrarCopiloto(CopilotoModel copilotoModel);
    @SuppressWarnings("rawtypes")
    public List obtenerCopilotos();
    public CopilotoModel getCopiloto(int id);
    public void actualizarDatosCopiloto(CopilotoModel copilotoModel, int id);
    public void borrarCopiloto(int id);
    public void borrarTodosLosCopilotos();
}
