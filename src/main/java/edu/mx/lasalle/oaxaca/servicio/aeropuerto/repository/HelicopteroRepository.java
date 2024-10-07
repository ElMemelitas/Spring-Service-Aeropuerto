package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.HelicopteroModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface HelicopteroRepository extends JpaRepository<HelicopteroModel, Integer>{
    public HelicopteroModel findById (int id);
}
