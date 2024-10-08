package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.TripulacionModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.TripulacionService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Controller for managing Tripulacion.
 * 
 */
@RestController
@RequestMapping("api/v1/tripulacion")
public class TripulacionController {
    @Autowired
    private TripulacionService tripulacionService;

    @PostMapping("/registro")
    public ResponseEntity<CustomResponse> registrarTripulacion(@RequestBody TripulacionModel tripulacionModel) {
        CustomResponse customResponse = new CustomResponse();
        
        // Verificar que idVuelo no sea null
        if (tripulacionModel.getIdVuelo() == null) {
            customResponse.setHttpCode(HttpStatus.BAD_REQUEST);
            customResponse.setCode(400);
            customResponse.setMessage("El campo idVuelo es obligatorio");
            return new ResponseEntity<>(customResponse, HttpStatus.BAD_REQUEST);
        }
        
        tripulacionService.registrarTripulacion(tripulacionModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMessage("TRIPULANTE REGISTRADO CORRECTAMENTE");
        return new ResponseEntity<>(customResponse, HttpStatus.CREATED);
    }

    @GetMapping("/registros")
    public ResponseEntity<List<TripulacionModel>> getAllTripulacions() {
        List<TripulacionModel> tripulaciones = tripulacionService.obtenerTripulaciones();

        if (tripulaciones.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(tripulaciones, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getTripulacion(@PathVariable int id) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(
                    new CustomResponse(HttpStatus.OK,
                            tripulacionService.getTripulacion(id),
                            "Show all matches", 200)
            );
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                    new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY,
                            tripulacionService.getTripulacion(id),
                            "ERROR: " + e, 422)
            );
        }
    }

    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updateTripulacion(
            @RequestBody TripulacionModel tripulacionModel,
            @PathVariable(value = "id") int id) {
        ResponseEntity<Object> responseEntity = null;
        // Lógica para actualizar la tripulación
        return responseEntity;
    }

    @DeleteMapping("/{id}/borrar")
    public ResponseEntity<Object> deleteTripulacion(@PathVariable int id) {
        ResponseEntity<Object> responseEntity = null;
        CustomResponse customResponse = new CustomResponse();
        try {
            tripulacionService.borrarTripulacion(id);
            customResponse.setHttpCode(HttpStatus.OK);
            customResponse.setCode(200);
            customResponse.setMessage("DELETE SUCCESS");
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
        } catch (Exception e) {
            customResponse.setMessage(e.getMessage());
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(customResponse);
        }
    }
}
