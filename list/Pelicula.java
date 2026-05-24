package list;

import java.util.Objects;

public class Pelicula {

    private String nombre;
    private String director;
    private String genero;
    private double duracion;
    private int anio;
    private double rating;

    public Pelicula(String nombre,
                    String director,
                    String genero,
                    double duracion,
                    int anio,
                    double rating) {

        this.nombre = nombre;
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
        this.anio = anio;
        this.rating = rating;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirector() {
        return director;
    }

    public String getGenero() {
        return genero;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getAnio() {
        return anio;
    }

    public double getRating() {
        return rating;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "nombre='" + nombre + '\'' +
                ", director='" + director + '\'' +
                ", genero='" + genero + '\'' +
                ", duracion=" + duracion +
                ", anio=" + anio +
                ", rating=" + rating +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Pelicula))
            return false;

        Pelicula pelicula = (Pelicula) o;

        return nombre.equalsIgnoreCase(pelicula.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }
}