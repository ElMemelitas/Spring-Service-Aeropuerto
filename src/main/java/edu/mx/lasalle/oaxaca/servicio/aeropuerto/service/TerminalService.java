package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.TerminalModel;

@Service
public interface TerminalService {
    public void registrarTerminal(TerminalModel terminalModel);
    @SuppressWarnings("rawtypes")
    public List obtenerTerminales();
    public TerminalModel getTerminal(int id);
    public void actualizarDatosTerminal(TerminalModel terminalModel, int id);
    public void borrarTerminal(int id);
    public void borrarTodosLosTerminales();
}
