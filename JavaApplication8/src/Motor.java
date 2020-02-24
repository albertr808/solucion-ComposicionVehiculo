/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto
 */
public class Motor {
    private int velocidad;
    private String marca;
    private int modelo;

    public Motor(int velocidad, String marca, int modelo) {
        this.velocidad = velocidad;
        this.marca = marca;
        this.modelo = modelo;
    }
    public Motor(){
 }


    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void conduciendo(){
        
        System.out.println("conduciendo");
    }
    }
    

