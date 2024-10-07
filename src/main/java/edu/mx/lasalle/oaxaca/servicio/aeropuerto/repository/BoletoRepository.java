package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.BoletoModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface BoletoRepository extends JpaRepository<BoletoModel, Integer>{
    public BoletoModel findById (int id);
}
