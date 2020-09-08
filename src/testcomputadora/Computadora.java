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
public class Computadora {
    //Atributos
    private String marca;
    private String modelo;
    //Metodos
    public Computadora(){}
    public void procesar(){
        Procesador p1=new Procesador();
        Teclado t1=new Teclado();
        Mouse m1=new Mouse();
        p1.procesarDatos();
        t1.ingresarDatos();
        m1.hacerClik();
        
    }
    
}
