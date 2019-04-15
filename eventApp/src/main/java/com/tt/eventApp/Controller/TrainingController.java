package com.tt.eventApp.Controller;

import com.tt.eventApp.Entity.TrainingEntity;
import com.tt.eventApp.Repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;


    @RestController
    @RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
            public class TrainingController {
        @Autowired
        TrainingRepository trainingRepository;

        @GetMapping("/training")
        public ResponseEntity<List<TrainingEntity>> findAllTrainings() {
            return new ResponseEntity<>(trainingRepository.findAll(), HttpStatus.OK);
        }

        @GetMapping("/findtraining/{id}")
        public ResponseEntity<Optional<TrainingEntity>> getTraining(@PathVariable("id") Long id) {
            return new ResponseEntity<>(trainingRepository.findById(id), HttpStatus.OK);
        }

        @PostMapping("/createtraining")
        public ResponseEntity<TrainingEntity> saveTraining(@RequestBody TrainingEntity training) {
            return new ResponseEntity<>(trainingRepository.save(training), HttpStatus.OK);
        }

        @PutMapping("/updatetraining/{id}")
        public ResponseEntity<TrainingEntity> updateTraining(@RequestBody TrainingEntity training) {
            return new ResponseEntity<>(trainingRepository.save(training), HttpStatus.OK);
        }

        @DeleteMapping(value = "/deletetraining/{id}")
        public void deleteTraining(@PathVariable Long id) {
            trainingRepository.deleteById(id);
        }
    }







