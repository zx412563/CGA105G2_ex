package com.foodorder.model.Reserva.dao;

import com.foodorder.model.Reserva.pojo.Reserva;

import java.util.List;


public interface ReservaDAO_interface {
    public void insert(Reserva reservaVO);
    public void update(Reserva reservaVO);
//    public void delete(Integer REN_ID);
    public Reserva getById(Integer REN_ID);
    public List<Reserva> getAll();
}
