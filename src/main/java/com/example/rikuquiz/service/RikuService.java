package com.example.rikuquiz.service;

import com.example.rikuquiz.domain.Riku;
import com.example.rikuquiz.repository.RikuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RikuService {

      @Autowired
     private RikuRepository rikuRipository;

     public List<Riku> findAll(){
         return rikuRepository.findAll();
     }

     public Riku findOne(LOng id){
         return rikuRepository.findById(id).get();
     }

     public Riku save(Riku riku){
           return rikuRepository.save(riku);
     }

     public void delete(Long id){
         rikuRepository.deleteById(id);
     }

}
