package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.VueloModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface VueloRepository extends JpaRepository<VueloModel, Integer>{
    public VueloModel findById (int id);
}
