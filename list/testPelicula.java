package list;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;
import java.util.TreeSet;

public class testPelicula {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Pelicula> listaPeliculas = new ArrayList<>();

        // =========================
        // AGREGAR PELICULAS
        // =========================

        listaPeliculas.add(
                new Pelicula(
                        "Batman",
                        "Christopher Nolan",
                        "SuperHeroes",
                        168,
                        2008,
                        9.5
                )
        );

        listaPeliculas.add(
                new Pelicula(
                        "Transformers",
                        "Michael Bay",
                        "Accion",
                        180,
                        2011,
                        8.0
                )
        );

        listaPeliculas.add(
                new Pelicula(
                        "Avatar",
                        "James Cameron",
                        "Ciencia Ficcion",
                        162,
                        2009,
                        9.4
                )
        );

        System.out.println("===== LISTA =====");

        for(Pelicula p : listaPeliculas) {
            System.out.println(p);
        }



        listaPeliculas.get(0).setDuracion(200);

        System.out.println("\n===== PELICULA MODIFICADA =====");

        for(Pelicula p : listaPeliculas) {
            System.out.println(p);
        }

        // =========================
        // HASHSET
        // =========================

        Set<Pelicula> peliculaSet = new HashSet<>();

        peliculaSet.add(
                new Pelicula(
                        "Batman",
                        "Christopher Nolan",
                        "SuperHeroes",
                        168,
                        2008,
                        9.5
                )
        );

        peliculaSet.add(
                new Pelicula(
                        "Batman",
                        "Christopher Nolan",
                        "SuperHeroes",
                        168,
                        2008,
                        9.5
                )
        );

        System.out.println("\n===== HASHSET =====");

        for(Pelicula p : peliculaSet) {
            System.out.println(p);
        }

        Map<String, List<Pelicula>> peliculasGenero = new HashMap<>();

        for(Pelicula p : listaPeliculas) {

            if(!peliculasGenero.containsKey(p.getGenero())) {

                peliculasGenero.put(
                        p.getGenero(),
                        new ArrayList<>()
                );
            }

            peliculasGenero.get(p.getGenero()).add(p);
        }

        System.out.println("\n===== MAP =====");

        for(String genero : peliculasGenero.keySet()) {

            System.out.println("\nGenero: " + genero);

            for(Pelicula p : peliculasGenero.get(genero)) {

                System.out.println(p);
            }
        }

        System.out.println("\nIngrese nombre:");
        String nombre = sc.nextLine();

        System.out.println("Ingrese director:");
        String director = sc.nextLine();

        System.out.println("Ingrese genero:");
        String genero = sc.nextLine();

        System.out.println("Ingrese duracion:");
        double duracion = sc.nextDouble();

        System.out.println("Ingrese anio:");
        int anio = sc.nextInt();

        System.out.println("Ingrese rating:");
        double rating = sc.nextDouble();

        Pelicula nuevaPelicula = new Pelicula(
                nombre,
                director,
                genero,
                duracion,
                anio,
                rating
        );

        listaPeliculas.add(nuevaPelicula);


        if(!peliculasGenero.containsKey(genero)) {

            peliculasGenero.put(
                    genero,
                    new ArrayList<>()
            );
        }

        peliculasGenero.get(genero).add(nuevaPelicula);


        System.out.println("\n===== NUEVA LISTA =====");

        for(Pelicula p : listaPeliculas) {

            System.out.println(p);
        }


        System.out.println("\nIngrese pelicula a buscar:");
        sc.nextLine();

        String buscar = sc.nextLine();

        System.out.println("\n===== BUSQUEDA EN LIST =====");

        for(Pelicula p : listaPeliculas) {

            if(p.getNombre().equalsIgnoreCase(buscar)) {

                System.out.println(p);
            }
        }


        System.out.println("\n===== BUSQUEDA EN SET =====");

        for(Pelicula p : peliculaSet) {

            if(p.getNombre().equalsIgnoreCase(buscar)) {

                System.out.println(p);
            }
        }


        System.out.println("\n===== BUSQUEDA EN MAP =====");

        for(String generoMapa : peliculasGenero.keySet()) {

            for(Pelicula p : peliculasGenero.get(generoMapa)) {

                if(p.getNombre().equalsIgnoreCase(buscar)) {

                    System.out.println(p);
                }
            }
        }


        listaPeliculas.sort(
                Comparator.comparingDouble(Pelicula::getDuracion)
        );

        System.out.println("\n===== ORDENADAS POR DURACION =====");

        for(Pelicula p : listaPeliculas) {

            System.out.println(p);
        }


        Set<String> nombresOrdenados = new TreeSet<>();

        for(Pelicula p : listaPeliculas) {

            nombresOrdenados.add(p.getNombre());
        }

        System.out.println("\n===== TREESET =====");

        for(String nombrePelicula : nombresOrdenados) {

            System.out.println(nombrePelicula);
        }

        sc.close();
    }
}