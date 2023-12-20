package com.asss.Pekara.service;

import com.asss.Pekara.entity.Pekara;
import com.asss.Pekara.entity.Pekara;

import java.util.List;

public interface PekaraService {
   List<Pekara> findAll();
   Pekara findById(int id);

    List<Pekara> findAllPekarasByCenaDescending();

   Pekara save(Pekara pekara);

   String updateByID(int id, Pekara pekara);

    String deleteById(int id);

    String proveraStanja();

}