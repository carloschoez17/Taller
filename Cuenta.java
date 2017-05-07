/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg1;

import java.util.Date;

/**
 *
 * @author Home
 */
public class Cuenta {
   
    private int id;
    private double saldo;
    private double interes_anua;
    private Date fecha;

    public Cuenta() {
        this.id = 0;
        this.saldo = 0;
        this.interes_anua = 0;
    }

    public Cuenta(int id, double saldo) {
        this.id = 12;
        this.saldo = 120;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getInteres_anual() {
        return interes_anua;
    }

    public void setInteres_anual(double interes_anua) {
        this.interes_anua = interes_anua;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public double getinteres_mensual (){
        System.out.println("EL INTERES MENSUAL ES: ");
        System.out.println("INTERES ANUAL / 12");
        return 0;
    }
    
    void retiro(double retiro){
        saldo = saldo - retiro;
    }
    
    void deposito(double deposito){
        saldo = saldo + deposito;
    }
     
    public static void main (String[]args){
        Cuenta cuent = new Cuenta();
        cuent.getinteres_mensual();        
    }
}
