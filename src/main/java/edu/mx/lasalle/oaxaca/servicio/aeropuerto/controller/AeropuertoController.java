
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.AeropuertoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.AeropuertoService;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.utils.CustomResponse;
import java.util.HashSet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/**
 *
 * @author david
 */
@RestController
@RequestMapping("api/v1/aeropuerto")
public class AeropuertoController {
    @Autowired
    private AeropuertoService aeropuertoService;
    
    @PostMapping("/registro")
    public CustomResponse registrarAeropuerto(@RequestBody AeropuertoModel aeropuertoModel){
        CustomResponse customResponse = new CustomResponse();
        aeropuertoService.registrarAeropuerto(aeropuertoModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMessage("Aeropuerto REGISTRADO CORRECTAMENTE");
        return customResponse;
    };
    
    @GetMapping("/registros")
    public ResponseEntity<List<AeropuertoModel>> getAllAeropuertos(){
        @SuppressWarnings("unchecked")
        List<AeropuertoModel> aeropuertos =aeropuertoService.obtenerAeropuertos();
        
        if(aeropuertos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(aeropuertos, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getAeropuerto (@PathVariable int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(
                    new CustomResponse(HttpStatus.OK, 
                            aeropuertoService.getAeropuerto(id),
                            "Show all matches", 200)
            );
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                    new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY,
                            aeropuertoService.getAeropuerto(id),
                            "ERROR: "+e,422
                    )
            );
        }
    }
    
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updateAeropuerto(
            @RequestBody AeropuertoModel aeropuertoModel,
            @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if(aeropuertoService.getAeropuerto(id) == null){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                        new CustomResponse(HttpStatus.NO_CONTENT,
                        "", "This action cant execute, not found with id = "+id,204)
                );
            }
            
            aeropuertoService.actualizarDatosAeropuerto(aeropuertoModel,id);
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
    public ResponseEntity<Object> deleteAeropuerto(@PathVariable int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try{
            aeropuertoService.borrarAeropuerto(id);
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
