package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.TerminalModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.TerminalRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.TerminalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class TerminalServiceImplements implements TerminalService{
    @Autowired
    private TerminalRepository TerminalRepository;
    
    @Override
    public void registrarTerminal(TerminalModel terminalModel) {
        TerminalRepository.save(terminalModel);
    }

    @Override
    public List<TerminalModel> obtenerTerminales() {
        return TerminalRepository.findAll();
    }

    @Override
    public TerminalModel getTerminal(int id) {
        return TerminalRepository.findById(id);
    }

    @Override
    public void actualizarDatosTerminal(TerminalModel terminalModel, int id) {
       terminalModel.setIdTerminal(id); 
       TerminalRepository.save(terminalModel);
    }

    @Override
    public void borrarTerminal(int id) {
       TerminalRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosTerminales() {
        TerminalRepository.deleteAll();
    }
}
