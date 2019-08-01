/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diagramadeclases;

/**
 *
 * @author Usuario
 */
public class bicicleta {
   private String numerodeserie;
   private String modelo;
   private int año;
   private float precio;

    public bicicleta(String numerodeserie, String modelo, int año, float precio) {
        this.numerodeserie = numerodeserie;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNumerodeserie() {
        return numerodeserie;
    }
   
}
