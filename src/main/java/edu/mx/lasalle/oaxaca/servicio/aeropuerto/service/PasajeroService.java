package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PasajeroModel;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */

@Service
public interface PasajeroService {
    public void registrarPasajero(PasajeroModel pasajeroModel);
    @SuppressWarnings("rawtypes")
    public List obtenerPasajeros();
    public PasajeroModel getPasajero(int id);
    public void actualizarDatosPasajero(PasajeroModel pasajeroModel, int id);
    public void borrarPasajero(int id);
    public void borrarTodosLosPasasjero();
}
