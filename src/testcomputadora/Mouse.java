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
public class Mouse {
    //Atributos
    private String marca;
    //Metodos
    public Mouse(){}

    public Mouse(String marca) {
        this.marca = marca;
    }
    public void hacerClik(){
        System.out.println("Haciendo clik");
    }
}
