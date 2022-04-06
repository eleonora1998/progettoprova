/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestione_spedizioni;

/**
 *
 * @author eleonoratrapani
 */
public class Box implements Comparable <Box>{
    private double dimensione;
    private boolean isEmpty;
    private Deposito paccoDeposito;

    public Box(double dimensione) {
        this.dimensione = dimensione;
        this.isEmpty = isEmpty;
        this.paccoDeposito = paccoDeposito;
    }

    public double getDimensione() {
        return dimensione;
    }
    
    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public int compareTo(Box o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
