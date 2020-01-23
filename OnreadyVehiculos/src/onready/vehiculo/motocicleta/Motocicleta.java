package onready.vehiculo.motocicleta;

import onready.vehiculo.Vehiculo;

/**
 *
 * @by Silverstand
 */
public class Motocicleta extends Vehiculo{
    private int cilindrada;
    
    public Motocicleta(String marca, String modelo, int cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String toString() {
        return "Marca: " + this.getMarca() + "//"+ "Modelo: "+ this.getModelo() + "//"+ "Cilindrada: " +
                this.getCilindrada() + "//"+ "Precio: "+ this.getPrecio();
    }
}
