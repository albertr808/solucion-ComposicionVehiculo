/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto
 */
public class Llanta {
    private int diametro;
    private int ancho;
    private String condicion;

    public Llanta(int diametro, int ancho, String condicion) {
        this.diametro = diametro;
        this.ancho = ancho;
        this.condicion = condicion;
    }
    public Llanta(){
 }


    public int getDiametro() {
        return diametro;
    }

    public void setDiametro(int diametro) {
        this.diametro = diametro;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }
    
   public void rodando(){
       System.out.println("rodando");
   }
   
   
   }
    

