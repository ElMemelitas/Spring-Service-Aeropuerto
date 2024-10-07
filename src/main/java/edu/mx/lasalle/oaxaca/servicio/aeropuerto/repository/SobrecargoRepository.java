package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.SobrecargoModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface SobrecargoRepository extends JpaRepository<SobrecargoModel, Integer>{
    public SobrecargoModel findById (int id);
}
