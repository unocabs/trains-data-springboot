package com.rgian.trainsproject1.repository;

import com.rgian.trainsproject1.entity.TrainsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainsRepository extends JpaRepository <TrainsEntity, Long> {
}
