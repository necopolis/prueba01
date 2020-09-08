package testcomputadora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MArio
 */
public class Teclado {
    private String marca;
    private boolean conTeclasNumericas;
    public Teclado(){}
    public Teclado(String marca, boolean conTeclasNumericas) {
        this.marca = marca;
        this.conTeclasNumericas = conTeclasNumericas;
    }
    public void ingresarDatos(){
        System.out.println("Ingresando datos");
    }   
}
