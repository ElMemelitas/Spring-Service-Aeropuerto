package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AvionetaModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.AvionetaRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AvionetaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class AvionetaServiceImplements implements AvionetaService{
    @Autowired
    private AvionetaRepository AvionetaRepository;
    
    @Override
    public void registrarAvioneta(AvionetaModel avionetaModel) {
        AvionetaRepository.save(avionetaModel);
    }

    @Override
    public List<AvionetaModel> obtenerAvionetas() {
        return AvionetaRepository.findAll();
    }

    @Override
    public AvionetaModel getAvioneta(int id) {
        return AvionetaRepository.findById(id);
    }

    @Override
    public void actualizarDatosAvioneta(AvionetaModel avionetaModel, int id) {
       avionetaModel.setIdAvioneta(id); 
       AvionetaRepository.save(avionetaModel);
    }

    @Override
    public void borrarAvioneta(int id) {
       AvionetaRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosAvionetas() {
        AvionetaRepository.deleteAll();
    }
}
