/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author blood
 */
public class Buho extends Personajes {
    
    private String rasgoUnico;

    public Buho() {
        super();
    }

    public Buho(String nombre, int vidas, String dificultad) {
        super();
        setNombre(nombre);
        setVidas(vidas);
        setDificultad(dificultad);
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

    public boolean estaVivo() {
        return false;
    }
    
}
