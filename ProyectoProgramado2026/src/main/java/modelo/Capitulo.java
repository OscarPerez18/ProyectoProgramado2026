/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author blood
 */
public class Capitulo {

    private ArrayList<Pregunta> pregunta;
    private int numero;
    private String titulo;
    private String narracion;

    public Capitulo() {
        pregunta = new ArrayList<>();
    }

    public ArrayList<Pregunta> getPregunta() {
        return pregunta;
    }

    public void setPregunta(ArrayList<Pregunta> pregunta) {
        this.pregunta = pregunta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNarracion() {
        return narracion;
    }

    public void setNarracion(String narracion) {
        this.narracion = narracion;
    }

    public void mostrarNarracion() {
    }

    public void iniciarReto() {
    }
}
