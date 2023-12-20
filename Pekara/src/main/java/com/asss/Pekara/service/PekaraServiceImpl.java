package com.asss.Pekara.service;

import com.asss.Pekara.dao.PekaraRepository;
import com.asss.Pekara.entity.Pekara;
import com.asss.Pekara.dao.PekaraRepository;
import com.asss.Pekara.entity.Pekara;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PekaraServiceImpl  implements PekaraService{
    @Autowired
    private PekaraRepository pekaraRepository;

    @Override
    public List<Pekara> findAll() {
        return pekaraRepository.findAll();
    }

    @Override
    public Pekara findById(int id) {
        return pekaraRepository.findById(id).orElse(null);
    }



    @Override
    public List<Pekara> findAllPekarasByCenaDescending() {
        return pekaraRepository.findAllPekarasByCenaDescending();
    }

    @Override
    public Pekara save(Pekara pekara) {
        return pekaraRepository.save(pekara);
    }

    @Override
    public String updateByID(int id, Pekara pekara) {
        Pekara tempPekara = findById(id);
        if (tempPekara != null) {
            tempPekara.setKolicina(pekara.getKolicina());
            tempPekara.setTipProizvoda(pekara.getTipProizvoda());
            tempPekara.setCena(pekara.getCena());
            pekaraRepository.save(tempPekara);
            System.out.println(proveraStanja());
            return "PROIZVOD" + id + " je  prepravljen.";
        } else {
            return "PROIZVOD" + id + " ne postoji u bazi.";
        }

    }

   @Override
    public String deleteById(int id) {
        Pekara pekara = findById(id);
        if (pekara != null) {
            pekaraRepository.deleteById(id);
            return "PROIZVOD " + id + " je obrisana.\n" + proveraStanja();
        } else {
            return "PROIZVOD" + id + " ne postoji u bazi.";
        }

    }

    @Override
    public String proveraStanja() {
        List<Pekara> listaPekara = findAll();
        int tempBrojac = 0;

        for (Pekara pekara : listaPekara) {
            if (pekara.getTipProizvoda().equals("KIFLA")) {
               tempBrojac++;
            }
        }
      tempBrojac=0;

        for (Pekara pekara : listaPekara) {
            if (pekara.getTipProizvoda().equals("KROASAN")) {
                tempBrojac++;
            }
        }
        if (tempBrojac < 3) {
            return "Pekara ima manje od 3 kroasana!!!";
        }
        tempBrojac = 0;

        for (Pekara pekara : listaPekara) {
            if (pekara.getTipProizvoda().equals("KIFLA")) {
                tempBrojac++;
            }
        }
        if (tempBrojac < 3) {
            return "Pekara ima manje od 3 kifle!!!";
        }
        return null;
    }

}

