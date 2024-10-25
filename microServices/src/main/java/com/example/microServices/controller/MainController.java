package com.example.microServices.controller;

import com.example.microServices.repository.AccauntRepositore;
import com.example.microServices.repository.HistoryRepository;
import com.example.microServices.repository.HospitalRepository;
import com.example.microServices.table.Accaunts;
import com.example.microServices.table.History;
import com.example.microServices.table.Hospital;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class MainController {


    private final AccauntRepositore accauntRepositore;
    private final ObjectMapper objectMapper;
    private final HospitalRepository hospitalRepository;
    private final HistoryRepository historyRepository;

    @PostMapping("/api/Authentication/SignUp")
    public void addAcc(@RequestBody Accaunts accaunts){
        log.info("New row: "+accauntRepositore.save(accaunts));
    }

    @SneakyThrows
    @GetMapping("/api/Accounts")
    public List<Accaunts> getAll(){
        return accauntRepositore.findAll();
    }

    @GetMapping("/api")
    public Accaunts getAcc(@RequestParam int id){
        return accauntRepositore.findById(String.valueOf(id)).orElseThrow();
    }

    @DeleteMapping("/api")
    public void deleteAcc(@RequestParam int id){
        accauntRepositore.deleteById(String.valueOf(id));
    }

   @PutMapping("/api/Accounts/Update")
    public String changeAcc(@RequestBody Accaunts accaunts){
        if(!accauntRepositore.existsById(String.valueOf(accaunts.getId()))){
            return "No such row";
        }
        return accauntRepositore.save(accaunts).toString();
   }
////////////////////////////HOSPITAL//////////////////////////////////////////////
@PostMapping("/api/Hospitals")
public void addAcc(@RequestBody Hospital hospital){
    log.info("New row: "+hospitalRepository.save(hospital));
}

    @SneakyThrows
    @GetMapping("/api/Hospitals")
    public List<Hospital> getAllHospital(){
        return hospitalRepository.findAll();
    }

    @GetMapping("/api/Hospitals/{id}")
    public Hospital getHosp(@RequestParam int id){
        return hospitalRepository.findById(String.valueOf(id)).orElseThrow();
    }

    @DeleteMapping("/api/Hospitals/{id}")
    public void deleteHosp(@RequestParam int id){
        hospitalRepository.deleteById(String.valueOf(id));
    }

    @PutMapping("/api/Hospitals/{id}")
    public String changeHosp(@RequestBody Hospital hospital){
        if(!hospitalRepository.existsById(String.valueOf(hospital.getId()))){
            return "No such row";
        }
        return hospitalRepository.save(hospital).toString();
    }
////////////////////////////////History////////////////////////////////////////
@PostMapping("/api/History")
public void addAcc(@RequestBody History history){
    log.info("New row: "+historyRepository.save(history));
}

    @SneakyThrows
    @GetMapping("/api/History")
    public List<History> getAllHistory(){
        return historyRepository.findAll();
    }

    @GetMapping("/api/History/{id}")
    public History getHistory(@RequestParam int id){
        return historyRepository.findById(String.valueOf(id)).orElseThrow();
    }

    @DeleteMapping("/api/History/{id}")
    public void deleteHistory(@RequestParam int id){
        historyRepository.deleteById(String.valueOf(id));
    }

    @PutMapping("/api/History/{id}")
    public String changeHistory(@RequestBody History history){
        if(!historyRepository.existsById(String.valueOf(history.getId()))){
            return "No such row";
        }
        return historyRepository.save(history).toString();
    }

}
