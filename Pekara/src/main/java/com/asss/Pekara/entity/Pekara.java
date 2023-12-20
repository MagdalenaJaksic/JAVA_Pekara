package com.asss.Pekara.entity;

import javax.persistence.*;

@Entity
@Table(name = "Pekara")
public class Pekara {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipProizvoda")
    private String tipProizvoda;
    @Column(name = "cena")
    private int cena;
    @Column(name = "kolicina")
    private int kolicina;

    public Pekara() {
    }

    public Pekara(int id, String tipProizvoda, int cena, int kolicina) {
        this.id = id;
        this.tipProizvoda = tipProizvoda;
        this.cena = cena;
        this.kolicina = kolicina;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipProizvoda() {
        return tipProizvoda;
    }

    public void setTipProizvoda(String tipProizvoda) {
        this.tipProizvoda = tipProizvoda;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getKolicina() {
        return kolicina;
    }

    public void setKolicina(int kolicina) {
        this.kolicina = kolicina;
    }

    @Override
    public String toString() {
        return "Pekara{" +
                "id=" + id +
                ", tip='" + tipProizvoda + '\'' +
                ", cena='" + cena + '\'' +
                ", kolicina='" + kolicina + '\'' +
                '}';

    }
    public enum TipProizvoda {
        HLEB("HLEB"),
        KROASAN("KROASAN"),
        KIFLA("KIFLA");

        private String tipProizvoda;

        TipProizvoda(String tipProizvoda) {
            this.tipProizvoda = tipProizvoda;
        }

        public String getTipProizvoda() {
            return tipProizvoda;
        }

        public void setTipProizvoda(String tipProizvoda) {
            this.tipProizvoda = tipProizvoda;
        }
    }

}

