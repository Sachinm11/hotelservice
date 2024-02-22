package com.mircodemo.hotelservice.hotelservice.services;

import java.util.List;

import com.mircodemo.hotelservice.hotelservice.entities.Hotel;

public interface HotelService {

    Hotel create(Hotel hotel);
    List<Hotel> getAll();
    Hotel get(String hotelId);

}
