package com.tt.eventApp.Controller;

import com.tt.eventApp.Entity.SalleEntity;
import com.tt.eventApp.Repository.SalleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


    @RestController
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public class SalleController {
        @Autowired
        SalleRepository salleRepository;

        @GetMapping("/salle")
        public ResponseEntity<List<SalleEntity>> findAllSalles() {
            return new ResponseEntity<>(salleRepository.findAll(), HttpStatus.OK);
        }

        @GetMapping("/findsalle/{id}")
        public ResponseEntity<Optional<SalleEntity>> getSalle(@PathVariable("id") Long id) {
            return new ResponseEntity<>(salleRepository.findById(id), HttpStatus.OK);
        }

        @PostMapping("/createsalle")
        public ResponseEntity<SalleEntity> saveSalle(@RequestBody SalleEntity salle) {
            return new ResponseEntity<>(salleRepository.save(salle), HttpStatus.OK);
        }

        @PutMapping("/updatesalle/{id}")
        public ResponseEntity<SalleEntity> updateSalle(@RequestBody SalleEntity salle) {
            return new ResponseEntity<>(salleRepository.save(salle), HttpStatus.OK);
        }

        @DeleteMapping(value = "/deletesalle/{id}")
        public void  deleteSalle(@PathVariable Long id) {
            salleRepository.deleteById(id);
        }

    }
