package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PasajeroModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface PasajeroRepository extends JpaRepository<PasajeroModel, Integer>{
    public PasajeroModel findById (int id);
}
