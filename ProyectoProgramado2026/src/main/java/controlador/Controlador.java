/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.*;
import vista.*;

/**
 *
 * @author blood
 */
public class Controlador {
    
    private Capitulo capitulo;
    private Personajes personaje;

    private Juego juego;
    private InfoPersonajes infoPersonajes;
    private MenuPrincipal menu;
    private Instrucciones instrucciones;

    public Controlador() {
    }

    public Capitulo getCapitulo() {
        return capitulo;
    }

    public void setCapitulo(Capitulo capitulo) {
        this.capitulo = capitulo;
    }

    public Personajes getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personajes personaje) {
        this.personaje = personaje;
    }

    public Juego getJuego() {
        return juego;
    }

    public void setJuego(Juego juego) {
        this.juego = juego;
    }

    public InfoPersonajes getInfoPersonajes() {
        return infoPersonajes;
    }

    public void setInfoPersonajes(InfoPersonajes infoPersonajes) {
        this.infoPersonajes = infoPersonajes;
    }

    public MenuPrincipal getMenu() {
        return menu;
    }

    public void setMenu(MenuPrincipal menu) {
        this.menu = menu;
    }

    public Instrucciones getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(Instrucciones instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void iniciarMenuPrincipal() {
    }

    public void iniciarJuego() {
    }

    public void salirSistema() {
    }

    public void volverMenuPrincipal() {
    }
    
}
