package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.SobrecargoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.SobrecargoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.SobrecargoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class SobrecargoServiceImplements implements SobrecargoService{
    @Autowired
    private SobrecargoRepository SobrecargoRepository;
    
    @Override
    public void registrarSobrecargo(SobrecargoModel sobrecargoModel) {
        SobrecargoRepository.save(sobrecargoModel);
    }

    @Override
    public List<SobrecargoModel> obtenerSobrecargos() {
        return SobrecargoRepository.findAll();
    }

    @Override
    public SobrecargoModel getSobrecargo(int id) {
        return SobrecargoRepository.findById(id);
    }

    @Override
    public void actualizarDatosSobrecargo(SobrecargoModel sobrecargoModel, int id) {
       sobrecargoModel.setIdSobrecargo(id); 
       SobrecargoRepository.save(sobrecargoModel);
    }

    @Override
    public void borrarSobrecargo(int id) {
       SobrecargoRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosSobrecargos() {
        SobrecargoRepository.deleteAll();
    }
}
