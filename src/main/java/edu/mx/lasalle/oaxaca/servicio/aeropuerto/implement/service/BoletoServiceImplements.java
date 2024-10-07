package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.BoletoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.BoletoRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.BoletoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class BoletoServiceImplements implements BoletoService{
    @Autowired
    private BoletoRepository BoletoRepository;
    
    @Override
    public void registrarBoleto(BoletoModel boletoModel) {
        BoletoRepository.save(boletoModel);
    }

    @Override
    public List<BoletoModel> obtenerBoletos() {
        return BoletoRepository.findAll();
    }

    @Override
    public BoletoModel getBoleto(int id) {
        return BoletoRepository.findById(id);
    }

    @Override
    public void actualizarDatosBoleto(BoletoModel boletoModel, int id) {
       boletoModel.setIdBoleto(id); 
       BoletoRepository.save(boletoModel);
    }

    @Override
    public void borrarBoleto(int id) {
       BoletoRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosBoletos() {
        BoletoRepository.deleteAll();
    }
}
