/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alberto
 */
public class Chasis {
    private String estructura;
    private String material;
    private String serie;

    public Chasis(String estructura, String material, String serie) {
        this.estructura = estructura;
        this.material = material;
        this.serie = serie;
    }
public Chasis(){
 }

    public String getEstructura() {
        return estructura;
    }

    public void setEstructura(String estructura) {
        this.estructura = estructura;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
    
    public void conduciendo(){
        System.out.println("Conduciendo");
    }
}
