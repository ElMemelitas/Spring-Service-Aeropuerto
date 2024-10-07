package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.TripulacionModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface TripulacionRepository extends JpaRepository<TripulacionModel, Integer>{
    public TripulacionModel findById (int id);
}
