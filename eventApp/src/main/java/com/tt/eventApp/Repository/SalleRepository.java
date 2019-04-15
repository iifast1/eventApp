package com.tt.eventApp.Repository;

import com.tt.eventApp.Entity.SalleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalleRepository extends JpaRepository<SalleEntity,Long>{

}
