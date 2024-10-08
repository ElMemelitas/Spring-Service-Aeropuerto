package edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.BoletoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PasajeroModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author david
 */
public interface BoletoRepository extends JpaRepository<BoletoModel, Integer>{
    public BoletoModel findById (int id);
}
