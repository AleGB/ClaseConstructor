/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practuno;

/**
 *
 * @author Alumno
 */
public abstract class Libro {

    String nombreautor = "";
    String nombrelibro = "";
    int numeropaginas = 0;
    String editorial = "";
    float precio = 0;

    
    public abstract void buscarlibro();

    public abstract void ventaLibros();

    public abstract void buscaautor();

    public abstract void publicalibro();

    Libro(String nombreautor, String nombrelibro) {
        this.nombreautor = nombreautor;
        this.nombrelibro = nombrelibro;
    }
  
    Libro(String nombrelibro, float precio) {
        this.nombrelibro = nombrelibro;
        this.precio = precio;
    }

    Libro(String nombreautor) {
        this.nombreautor = nombreautor;
    }

    Libro(String nombrelibro, int numeropaginas) {
        this.nombrelibro = nombrelibro;
        this.numeropaginas = numeropaginas;
    }

    Libro(String nombreautor, String nombrelibro, int numeropaginas, float precio, String editorial) {
        this.nombrelibro = nombrelibro;
        this.numeropaginas = numeropaginas;
        this.nombreautor = nombreautor;
        this.precio = precio;
        this.editorial = editorial;
    }
}
