package modelos;

import java.io.Serializable;

public class moto implements Serializable {
    private String modelo;
    private String marca;
    private String cilindrada;

    public moto() {
    }

    public moto(String modelo, String marca, String cilindrada) {
        this.modelo = modelo;
        this.marca = marca;
        this.cilindrada = cilindrada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "moto{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", cilindrada='" + cilindrada + '\'' +
                '}';
    }
}
