package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.VueloModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.VueloRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.VueloService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class VueloServiceImplements implements VueloService{
    @Autowired
    private VueloRepository VueloRepository;
    
    @Override
    public void registrarVuelo(VueloModel vueloModel) {
        VueloRepository.save(vueloModel);
    }

    @Override
    public List<VueloModel> obtenerVuelos() {
        return VueloRepository.findAll();
    }

    @Override
    public VueloModel getVuelo(int id) {
        return VueloRepository.findById(id);
    }

    @Override
    public void actualizarDatosVuelo(VueloModel vueloModel, int id) {
       vueloModel.setIdVuelo(id); 
       VueloRepository.save(vueloModel);
    }

    @Override
    public void borrarVuelo(int id) {
       VueloRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosVuelos() {
        VueloRepository.deleteAll();
    }
}
