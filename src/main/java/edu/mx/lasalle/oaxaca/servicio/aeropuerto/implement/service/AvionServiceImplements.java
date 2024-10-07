package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AvionModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.AvionRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AvionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class AvionServiceImplements implements AvionService{
    @Autowired
    private AvionRepository AvionRepository;
    
    @Override
    public void registrarAvion(AvionModel avionModel) {
        AvionRepository.save(avionModel);
    }

    @Override
    public List<AvionModel> obtenerAviones() {
        return AvionRepository.findAll();
    }

    @Override
    public AvionModel getAvion(int id) {
        return AvionRepository.findById(id);
    }

    @Override
    public void actualizarDatosAvion(AvionModel avionModel, int id) {
       avionModel.setIdAvion(id); 
       AvionRepository.save(avionModel);
    }

    @Override
    public void borrarAvion(int id) {
       AvionRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosAviones() {
        AvionRepository.deleteAll();
    }
}
