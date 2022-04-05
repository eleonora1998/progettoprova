/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_spedizioni;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author lorenzodefeo
 */
public class Deposito {
    private Pacco pacco;
    private  GregorianCalendar dataConsegna;

    public Deposito(Pacco pacco, GregorianCalendar dataConsegna) {
        this.pacco = pacco;
        this.dataConsegna = dataConsegna;
    }

    public Pacco getPacco() {
        return pacco;
    }

    public GregorianCalendar getDataConsegna() {
        return dataConsegna;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String formatoData = sdf.format(this.dataConsegna.getTime());
        return "Deposito{" + "pacco=" + pacco + ", dataConsegna=" + formatoData + '}';
    }
    
    
}
