
package edu.mx.lasalle.oaxaca.servicio.aeropuerto.controller;

import edu.mx.lasalle.oaxaca.servicio.aeropuerto.model.CopilotoModel;
import edu.mx.lasalle.oaxaca.servicio.aeropuerto.service.CopilotoService;
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
@RequestMapping("api/v1/copiloto")
public class CopilotoController {
    @Autowired
    private CopilotoService copilotoService;
    
    @PostMapping("/registro")
    public CustomResponse registrarCopiloto(@RequestBody CopilotoModel copilotoModel){
        CustomResponse customResponse = new CustomResponse();
        copilotoService.registrarCopiloto(copilotoModel);
        customResponse.setHttpCode(HttpStatus.CREATED);
        customResponse.setCode(201);
        customResponse.setMessage("EQUIPAJE REGISTRADO CORRECTAMENTE");
        return customResponse;
    };
    
    @GetMapping("/registros")
    public ResponseEntity<List<CopilotoModel>> getAllCopilotos(){
        @SuppressWarnings("unchecked")
        List<CopilotoModel> copilotos =copilotoService.obtenerCopilotos();
        
        if(copilotos.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(copilotos, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Object> getCopiloto (@PathVariable int id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(
                    new CustomResponse(HttpStatus.OK, 
                            copilotoService.getCopiloto(id),
                            "Show all matches", 200)
            );
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(
                    new CustomResponse(HttpStatus.UNPROCESSABLE_ENTITY,
                            copilotoService.getCopiloto(id),
                            "ERROR: "+e,422
                    )
            );
        }
    }
    
    @PutMapping("/{id}/actualizar")
    public ResponseEntity<Object> updateCopiloto(
            @RequestBody CopilotoModel copilotoModel,
            @PathVariable(value = "id") int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try {
            if(copilotoService.getCopiloto(id) == null){
                return ResponseEntity.status(HttpStatus.NO_CONTENT).body(
                        new CustomResponse(HttpStatus.NO_CONTENT,
                        "", "This action cant execute, not found with id = "+id,204)
                );
            }
            
            copilotoService.actualizarDatosCopiloto(copilotoModel,id);
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
    public ResponseEntity<Object> deleteCopiloto(@PathVariable int id){
        ResponseEntity<Object> responseEntity =null;
        CustomResponse customResponse = new CustomResponse();
        try{
            copilotoService.borrarCopiloto(id);
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
