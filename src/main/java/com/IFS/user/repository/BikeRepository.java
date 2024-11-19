package com.IFS.user.repository;

import com.IFS.user.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike,Integer> {
}
