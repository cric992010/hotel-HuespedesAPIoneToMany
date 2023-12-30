package com.example.hotel.service;

import com.example.hotel.model.Huesped;
import com.example.hotel.model.Reserva;
import com.example.hotel.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {
    @Autowired
    private ReservaRepository reservaRepository;

    //Mostrar los Reservas.
    public List<Reserva> getAllHuespedes(){
        return reservaRepository.findAll();
    }

    //Crear Reserva
    public Reserva createHuespec(Reserva reserva){
        return reservaRepository.save(reserva);
    }


    //editar Reserva
    public Reserva editarReserva(Reserva reserva){
        return reservaRepository.save(reserva);
    }

    //Eliminar Reserva.
    public void deleteReservaById(Long id){
        reservaRepository.deleteById(id);
    }
}
