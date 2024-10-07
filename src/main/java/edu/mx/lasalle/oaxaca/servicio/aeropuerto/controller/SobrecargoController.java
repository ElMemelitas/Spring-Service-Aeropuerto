
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.SobrecargoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.SobrecargoService;
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
@RequestMapping("api/v1/sobrecargo")
public class SobrecargoController {
    @Autowired
    private SobrecargoService sobrecargoService;
    
    @PostMapping("/registro")
    public CustomResponse registrarSobrecargo(@RequestBody SobrecargoModel sobrecargoModel){
        CustomResponse customResponse = new CustomResponse();
        sobrecargoService.registrarSobrecargo(sobrecargoModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMessage("EQUIPAJE REGISTRADO CORRECTAMENTE");
        return customResponse;
    };
    
    @GetMapping("/registros")
    public ResponseEntity<List<SobrecargoModel>> getAllSobrecargos(){
        @SuppressWarnings("unchecked")
        List<SobrecargoModel> sobrecargos =sobrecargoService.obtenerSobrecargos();
        
        if(sobrecargos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(sobrecargos, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getSobrecargo (@PathVariable int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(
                    new CustomResponse(HttpStatus.OK, 
                            sobrecargoService.getSobrecargo(id),
                            "Show all matches", 200)
            );
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                    new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY,
                            sobrecargoService.getSobrecargo(id),
                            "ERROR: "+e,422
                    )
            );
        }
    }
    
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updateSobrecargo(
            @RequestBody SobrecargoModel sobrecargoModel,
            @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if(sobrecargoService.getSobrecargo(id) == null){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                        new CustomResponse(HttpStatus.NO_CONTENT,
                        "", "This action cant execute, not found with id = "+id,204)
                );
            }
            
            sobrecargoService.actualizarDatosSobrecargo(sobrecargoModel,id);
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
    public ResponseEntity<Object> deleteSobrecargo(@PathVariable int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try{
            sobrecargoService.borrarSobrecargo(id);
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
