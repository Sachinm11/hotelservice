package com.mircodemo.hotelservice.hotelservice.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mircodemo.hotelservice.hotelservice.entities.Hotel;
import com.mircodemo.hotelservice.hotelservice.exceptions.ResourceNotFoundException;
import com.mircodemo.hotelservice.hotelservice.repository.HotelRepo;
import com.mircodemo.hotelservice.hotelservice.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepo hotelRepo;

    @Override
    public Hotel create(Hotel hotel) {
        String id = UUID.randomUUID().toString();
        hotel.setHotelId(id);
        return hotelRepo.save(hotel);
    }

    @Override
    public Hotel get(String id) {

        return hotelRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not forund!"));
    
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepo.findAll();
    }

}
