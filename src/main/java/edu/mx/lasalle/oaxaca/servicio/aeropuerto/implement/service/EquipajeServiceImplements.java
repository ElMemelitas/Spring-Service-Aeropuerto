/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.EquipajeModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.EquipajeRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.EquipajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class EquipajeServiceImplements implements EquipajeService{
    @Autowired
    private EquipajeRepository EquipajeRepository;
    
    @Override
    public void registrarEquipaje(EquipajeModel equipajeModel) {
        EquipajeRepository.save(equipajeModel);
    }

    @Override
    public List<EquipajeModel> obtenerEquipajes() {
        return EquipajeRepository.findAll();
    }

    @Override
    public EquipajeModel getEquipaje(int id) {
        return EquipajeRepository.findById(id);
    }

    @Override
    public void actualizarDatosEquipaje(EquipajeModel equipajeModel, int id) {
       equipajeModel.setIdEquipaje(id); 
       EquipajeRepository.save(equipajeModel);
    }

    @Override
    public void borrarEquipaje(int id) {
       EquipajeRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosEquipajes() {
        EquipajeRepository.deleteAll();
    }
}
