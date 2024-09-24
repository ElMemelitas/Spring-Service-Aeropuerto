package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.PasajeroModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.PasajeroService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author david
 */
@RestController
@RequestMapping("api/v1/pasajero")
public class PasajeroController {
    @Autowired
    private PasajeroService pasajeroService;
    
    @PostMapping("/registro")
    public CustomResponse registrarPasajero(@RequestBody PasajeroModel pasajeroModel){
        CustomResponse customResponse = new CustomResponse();
        pasajeroService.registrarPasajero(pasajeroModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMessage("PASAJERO REGISTRADO CORRECTAMENTE");
        return customResponse;
    };
    
    @GetMapping("/registros")
    public ResponseEntity<List<PasajeroModel>> getAllPasasjeros(){
        List<PasajeroModel> pasajeros =pasajeroService.obtenerPasajeros();
        
        if(pasajeros.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(pasajeros, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getPasajero (@PathVariable int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(
                    new CustomResponse(HttpStatus.OK, 
                            pasajeroService.getPasajero(id),
                            "Show all matches", 200)
            );
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                    new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY,
                            pasajeroService.getPasajero(id),
                            "ERROR: "+e,422
                    )
            );
        }
    }
    
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updatePasajero(
            @RequestBody PasajeroModel pasajeroModel,
            @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if(pasajeroService.getPasajero(id) == null){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                        new CustomResponse(HttpStatus.NO_CONTENT,
                        "", "This action cant execute, not found with id = "+id,204)
                );
            }
            
            pasajeroService.actualizarDatosPasajero(pasajeroModel,id);
            customResponse.setHttpCode(HttpStatus.OK);
            customResponse.setCode(200);
            customResponse.setMessage("Update success");
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
        } catch (Exception e) {
            customResponse.setMessage("Error: "+e);
            return ResponseEntity.status(HttpStatus.OK).body(customResponse);
        }
        
            }
    
    @DeleteMapping("/{id}/borrar")
    public ResponseEntity<Object> deletePasajero(@PathVariable int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try{
            pasajeroService.borrarPasajero(id);
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
