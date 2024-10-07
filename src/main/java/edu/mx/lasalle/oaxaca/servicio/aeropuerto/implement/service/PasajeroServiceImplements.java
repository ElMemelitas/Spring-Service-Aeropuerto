/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.implement.service;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PasajeroModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.repository.PasajeroRepository;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PasajeroService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class PasajeroServiceImplements implements PasajeroService{
    
    @Autowired
    private PasajeroRepository pasajeroRepository;
    
    @Override
    public void registrarPasajero(PasajeroModel pasajeroModel) {
        pasajeroRepository.save(pasajeroModel);
    }

    @Override
    public List<PasajeroModel> obtenerPasajeros() {
        return pasajeroRepository.findAll();
    }

    @Override
    public PasajeroModel getPasajero(int id) {
        return pasajeroRepository.findById(id);
    }

    @Override
    public void actualizarDatosPasajero(PasajeroModel pasajeroModel, int id) {
       pasajeroModel.setIdPasajero(id); 
       pasajeroRepository.save(pasajeroModel);
    }

    @Override
    public void borrarPasajero(int id) {
       pasajeroRepository.deleteById(id);
    }

    @Override
    public void borrarTodosLosPasasjero() {
        pasajeroRepository.deleteAll();
    }
    
}
