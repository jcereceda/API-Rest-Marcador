package com.utad.controller;

import org.springframework.web.bind.annotation.RestController;
import com.utad.model.Marcador;
import com.utad.model.Equipo;
import com.utad.service.MarcadorService;

import java.util.List;
// Autoconfiguracion del servicio
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
// Mapeo de rutas y conexion con app cliente
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RestController // Informar que es una clase controlador
public class MarcadorController {
    @Autowired
    MarcadorService servicio;


    @GetMapping("/api/equipos")
    public List<Equipo> getEquipos(){
        return servicio.getAllEquipos();
    }
    /**
     * Método para pedir todos los partido
     * @return lista de partidos 
     */
    @GetMapping("/api/partidos")
    public List<Marcador> getAllPartidos (){
        // Getmapping recoge esa ruta y ejecuta el metodo
        return servicio.getAllPartidos();
    }

    /**
     * Método para pedir un partido concreto
     * @param id del partido
     * @return partido solicitado al servicio
     */
    @GetMapping("/api/partidos/{id}")
    public Marcador getPartido(@PathVariable("id") int id){ 
        // Con pathvariable indicamos que la ruta a recoger será distinta para tratarlo de forma distinta según el id
        return servicio.getPartido(id);
    }

    /**
     * Método para guardar un nuevo partido
     * @param marcador a guardar
     * 
     */
    
    @PostMapping(value="/api/partidos")
    public void SavePartido(@RequestBody Marcador marcador){
        
        System.out.println(marcador.getEquipoLocal());
        System.out.println(marcador.getEquipoVisitante());
        // Requestbody coge el objeto marcador del cliente para enviarlo al servicio y guardarlo en este caso
        servicio.savePartido(marcador);
    }

    /**
     * Método para dar orden de eliminar un partido en concreto
     * @param id del partido a eliminar
     */
    @DeleteMapping("/api/partidos/{id}")
    public void dropPartido(@PathVariable("id") int id){ 
        servicio.dropPartido(id);
    }

    /**
     * métoodo para actualizar marcador
     * @param marcador a actualizar
    */
    @PutMapping("/api/partidos/{id}")
    public void updateMarcador(@RequestBody Marcador marcador){
        servicio.updateMarcador(marcador);
    }

}
