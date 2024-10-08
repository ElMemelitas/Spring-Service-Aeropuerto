package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.TerminalModel;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author david
 */
public interface TerminalRepository extends JpaRepository<TerminalModel, Integer>{
    public TerminalModel findById (int id);
}
