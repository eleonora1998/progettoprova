/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_spedizioni;

/**
 *
 * @author lorenzodefeo
 */
public class Pacco {
   private String codice;
   private double dimensione; // in metri cubi

    public Pacco(String codice, double dimensione) {
        this.codice = codice;
        this.dimensione = dimensione;
    }

    public String getCodice() {
        return codice;
    }

    public double getDimensione() {
        return dimensione;
    }

    @Override
    public String toString() {
        return "Pacco{" + "codice=" + codice + ", dimensione=" + dimensione + '}';
    }
    
    
   
}
