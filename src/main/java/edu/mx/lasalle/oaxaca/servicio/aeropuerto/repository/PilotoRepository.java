package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PilotoModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface PilotoRepository extends JpaRepository<PilotoModel, Integer>{
    public PilotoModel findById (int id);
}
