package com.example.hotel.service;

import com.example.hotel.model.Huesped;
import com.example.hotel.repository.HuespedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HuespedService {

    @Autowired
    private HuespedRepository huespedRepository;

    //Mostrar los huespedes.
    public List<Huesped> getAllHuespedes(){
        return huespedRepository.findAll();
    }

    //Crear Huesped
    public Huesped createHuespec(Huesped huesped){
        return huespedRepository.save(huesped);
    }


    //editar Huesped
     public Huesped editarHuesped(Huesped huesped){
            return huespedRepository.save(huesped);
    }

    //Eliminar huesped.
    public void deleteHuespedById(Long id){
        huespedRepository.deleteById(id);
    }

}
