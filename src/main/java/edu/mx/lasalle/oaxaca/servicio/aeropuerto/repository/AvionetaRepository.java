package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AvionetaModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface AvionetaRepository extends JpaRepository<AvionetaModel, Integer>{
    public AvionetaModel findById (int id);
}
