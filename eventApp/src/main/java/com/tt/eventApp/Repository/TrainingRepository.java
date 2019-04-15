package com.tt.eventApp.Repository;

import com.tt.eventApp.Entity.TrainingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TrainingRepository extends JpaRepository<TrainingEntity,Long> {

}

