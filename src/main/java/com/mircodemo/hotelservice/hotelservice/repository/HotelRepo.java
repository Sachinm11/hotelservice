package com.mircodemo.hotelservice.hotelservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mircodemo.hotelservice.hotelservice.entities.Hotel;

public interface HotelRepo extends JpaRepository <Hotel,String>{

}
