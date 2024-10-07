package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.CopilotoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.CopilotoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.CopilotoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class CopilotoServiceImplements implements CopilotoService{
    @Autowired
    private CopilotoRepository CopilotoRepository;
    
    @Override
    public void registrarCopiloto(CopilotoModel copilotoModel) {
        CopilotoRepository.save(copilotoModel);
    }

    @Override
    public List<CopilotoModel> obtenerCopilotos() {
        return CopilotoRepository.findAll();
    }

    @Override
    public CopilotoModel getCopiloto(int id) {
        return CopilotoRepository.findById(id);
    }

    @Override
    public void actualizarDatosCopiloto(CopilotoModel copilotoModel, int id) {
       copilotoModel.setIdCopiloto(id); 
       CopilotoRepository.save(copilotoModel);
    }

    @Override
    public void borrarCopiloto(int id) {
       CopilotoRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosCopilotos() {
        CopilotoRepository.deleteAll();
    }
}
