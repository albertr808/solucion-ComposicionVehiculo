
public class Vehiculo {
   private String color;
    private String marca;
   private int anio;
   private Motor tipo;
   private Llanta condicion;
   private Chasis estructura;

    public Vehiculo(String color, String marca, int anio, Motor cilindros, Llanta condicion, Chasis estructura) {
        this.color = color;
        this.marca = marca;
        this.anio = anio;
        this.tipo = cilindros;
        this.condicion = condicion;
        this.estructura = estructura;
    }
public Vehiculo(){}

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Motor getCilindros() {
        return tipo;
    }

    public void setCilindros(Motor cilindros) {
        this.tipo = cilindros;
    }

    public Llanta getCondicion() {
        return condicion;
    }

    public void setCondicion(Llanta condicion) {
        this.condicion = condicion;
    }

    public Chasis getEstructura() {
        return estructura;
    }

    public void setEstructura(Chasis estructura) {
        this.estructura = estructura;
    }

   

    
   
   
}

   