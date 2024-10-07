package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AeropuertoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.AeropuertoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AeropuertoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class AeropuertoServiceImplements implements AeropuertoService{
    @Autowired
    private AeropuertoRepository AeropuertoRepository;
    
    @Override
    public void registrarAeropuerto(AeropuertoModel aeropuertoModel) {
        AeropuertoRepository.save(aeropuertoModel);
    }

    @Override
    public List<AeropuertoModel> obtenerAeropuertos() {
        return AeropuertoRepository.findAll();
    }

    @Override
    public AeropuertoModel getAeropuerto(int id) {
        return AeropuertoRepository.findById(id);
    }

    @Override
    public void actualizarDatosAeropuerto(AeropuertoModel aeropuertoModel, int id) {
       aeropuertoModel.setIdAeropuerto(id); 
       AeropuertoRepository.save(aeropuertoModel);
    }

    @Override
    public void borrarAeropuerto(int id) {
       AeropuertoRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosAeropuertos() {
        AeropuertoRepository.deleteAll();
    }
}
