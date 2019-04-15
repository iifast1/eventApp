package com.tt.eventApp.Repository;

import com.tt.eventApp.Entity.TrainerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainerRepository extends JpaRepository<TrainerEntity,Long> {

}
