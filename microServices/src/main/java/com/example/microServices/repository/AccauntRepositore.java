package com.example.microServices.repository;

import com.example.microServices.table.Accaunts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccauntRepositore extends JpaRepository<Accaunts, String> {

}
