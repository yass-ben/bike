package com.bikers.bike.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikers.bike.models.Bike;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
