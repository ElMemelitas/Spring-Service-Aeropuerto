package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.HelicopteroModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.HelicopteroRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.HelicopteroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class HelicopteroServiceImplements implements HelicopteroService{
    @Autowired
    private HelicopteroRepository HelicopteroRepository;
    
    @Override
    public void registrarHelicoptero(HelicopteroModel helicopteroModel) {
        HelicopteroRepository.save(helicopteroModel);
    }

    @Override
    public List<HelicopteroModel> obtenerHelicopteros() {
        return HelicopteroRepository.findAll();
    }

    @Override
    public HelicopteroModel getHelicoptero(int id) {
        return HelicopteroRepository.findById(id);
    }

    @Override
    public void actualizarDatosHelicoptero(HelicopteroModel helicopteroModel, int id) {
       helicopteroModel.setIdHelicoptero(id); 
       HelicopteroRepository.save(helicopteroModel);
    }

    @Override
    public void borrarHelicoptero(int id) {
       HelicopteroRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosHelicopteros() {
        HelicopteroRepository.deleteAll();
    }
}
