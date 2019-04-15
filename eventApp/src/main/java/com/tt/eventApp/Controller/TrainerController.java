package com.tt.eventApp.Controller;

import com.tt.eventApp.Entity.TrainerEntity;
import com.tt.eventApp.Repository.TrainerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


    @RestController
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public class TrainerController {
        @Autowired
        TrainerRepository trainerRepository;

        @GetMapping("/trainer")
        public ResponseEntity<List<TrainerEntity>> findAllTrainers() {
            return new ResponseEntity<>(trainerRepository.findAll(), HttpStatus.OK);
        }

        @GetMapping("/findtrainer/{id}")
        public ResponseEntity<Optional<TrainerEntity>> getTrainer(@PathVariable("id") Long id) {
            return new ResponseEntity<>(trainerRepository.findById(id), HttpStatus.OK);
        }

        @PostMapping("/createtrainer")
        public ResponseEntity<TrainerEntity> saveTrainer(@RequestBody TrainerEntity trainer) {
            return new ResponseEntity<>(trainerRepository.save(trainer), HttpStatus.OK);
        }

        @PutMapping("/updatetrainer/{id}")
        public ResponseEntity<TrainerEntity> updateTrainer(@RequestBody TrainerEntity trainer) {
            return new ResponseEntity<>(trainerRepository.save(trainer), HttpStatus.OK);
        }

        @DeleteMapping(value = "/deletetrainer/{id}")
        public void  deleteTrainer(@PathVariable Long id) {
             trainerRepository.deleteById(id);
        }

    }


