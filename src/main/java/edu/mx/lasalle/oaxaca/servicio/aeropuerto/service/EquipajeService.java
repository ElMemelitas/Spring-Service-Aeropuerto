package edu.mx.lasalle.oaxaca.servicio.aeropuerto.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.EquipajeModel;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public interface EquipajeService {
    public void registrarEquipaje(EquipajeModel pasajeroModel);
    @SuppressWarnings("rawtypes")
    public List obtenerEquipajes();
    public EquipajeModel getEquipaje(int id);
    public void actualizarDatosEquipaje(EquipajeModel pasajeroModel, int id);
    public void borrarEquipaje(int id);
    public void borrarTodosLosEquipajes();
}
