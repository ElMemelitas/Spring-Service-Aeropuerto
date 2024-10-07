package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.VehiculoAereoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.VehiculoAereoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.VehiculoAereoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class VehiculoAereoServiceImplements implements VehiculoAereoService{
    @Autowired
    private VehiculoAereoRepository VehiculoAereoRepository;
    
    @Override
    public void registrarVehiculoAereo(VehiculoAereoModel vehiculoAereoModel) {
        VehiculoAereoRepository.save(vehiculoAereoModel);
    }

    @Override
    public List<VehiculoAereoModel> obtenerVehiculosAereos() {
        return VehiculoAereoRepository.findAll();
    }

    @Override
    public VehiculoAereoModel getVehiculoAereo(int id) {
        return VehiculoAereoRepository.findById(id);
    }

    @Override
    public void actualizarDatosVehiculoAereo(VehiculoAereoModel vehiculoAereoModel, int id) {
       vehiculoAereoModel.setIdVehiculoAereo(id); 
       VehiculoAereoRepository.save(vehiculoAereoModel);
    }

    @Override
    public void borrarVehiculoAereo(int id) {
       VehiculoAereoRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosVehiculosAereos() {
        VehiculoAereoRepository.deleteAll();
    }
}
