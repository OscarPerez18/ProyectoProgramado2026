/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author blood
 */
public class Explorador extends Personajes {
    
    private int puntos;
    private String rasgoUnico;

    public Explorador() {
        super();
    }

    public Explorador(int puntos, String nombre, int vidas) {
        super();
        this.puntos = puntos;
        setNombre(nombre);
        setVidas(vidas);
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String getRasgoUnico() {
        return rasgoUnico;
    }

    public void setRasgoUnico(String rasgoUnico) {
        this.rasgoUnico = rasgoUnico;
    }

    @Override
    public void perderVida() {
    }

    public void ganarPuntos() {
    }

    public boolean estaVivo() {
        return false;
    }
    
}
