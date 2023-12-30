package com.example.hotel.controller;

import com.example.hotel.model.Huesped;
import com.example.hotel.service.HuespedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/huespedes")
public class HuespedController {

    @Autowired
    private HuespedService huespedService;

    @GetMapping
    public List<Huesped> listarTodo(){
        return huespedService.getAllHuespedes();
    }

    @PostMapping
    public Huesped crear(@RequestBody Huesped huesped){
        return huespedService.createHuespec(huesped);
    }

    @PostMapping("editar/{id}")
    public Huesped actualizar(@RequestBody Huesped huesped, @PathVariable Long id){
        huesped.setIdHuesped(id);
        return huespedService.editarHuesped(huesped);
    }

    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        huespedService.deleteHuespedById(id);
    }
}
