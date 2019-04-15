package com.tt.eventApp.Service;

import com.tt.eventApp.Repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SalleService {

    @Autowired
    SalleRepository salleRepository;

    public SalleService (SalleRepository salleRepository){this.salleRepository=salleRepository;}
}


