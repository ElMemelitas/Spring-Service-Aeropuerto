package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PilotoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.PilotoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PilotoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class PilotoServiceImplements implements PilotoService{
    @Autowired
    private PilotoRepository PilotoRepository;
    
    @Override
    public void registrarPiloto(PilotoModel pilotoModel) {
        PilotoRepository.save(pilotoModel);
    }

    @Override
    public List<PilotoModel> obtenerPilotos() {
        return PilotoRepository.findAll();
    }

    @Override
    public PilotoModel getPiloto(int id) {
        return PilotoRepository.findById(id);
    }

    @Override
    public void actualizarDatosPiloto(PilotoModel pilotoModel, int id) {
       pilotoModel.setIdPiloto(id); 
       PilotoRepository.save(pilotoModel);
    }

    @Override
    public void borrarPiloto(int id) {
       PilotoRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosPilotos() {
        PilotoRepository.deleteAll();
    }
}
