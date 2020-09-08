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
public class Procesador {
    private String marca;
    private String modelo;
    
    public Procesador(){}
    public Procesador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
    public void procesarDatos(){
        System.out.println("Procesando datos!!!");
    }
      
    
}
