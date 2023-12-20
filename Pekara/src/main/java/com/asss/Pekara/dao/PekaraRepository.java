package com.asss.Pekara.dao;

import com.asss.Pekara.entity.Pekara;
import com.asss.Pekara.entity.Pekara;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PekaraRepository extends JpaRepository<Pekara,Integer> {
   @Query("FROM Pekara ORDER BY cena DESC")
    List<Pekara> findAllPekarasByCenaDescending();
}