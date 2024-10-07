package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.CopilotoModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface CopilotoRepository extends JpaRepository<CopilotoModel, Integer>{
    public CopilotoModel findById (int id);
}
