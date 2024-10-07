package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AeropuertoModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface AeropuertoRepository extends JpaRepository<AeropuertoModel, Integer>{
    public AeropuertoModel findById (int id);
}
