package co.edu.uniquindio.biblioteca;

public class Main {
    public static void main(String[] args) {
        Libro libro232 = new Libro();
        libro232.setTitulo("Fisica General");
        libro232.setAutor("S. burbano");
        libro232.setGenero("Cientifico");
        libro232.setEditorial(" Tebar Flores");
        libro232.setNumPaginas(794);
        libro232.setAnioPublicacion(2019);

        Libro libro233 = new Libro();
        libro233.setTitulo("Matematicas Discretas");
        libro233.setAutor("Carlos Gaviria");
        libro233.setGenero("Academico");
        libro233.setEditorial(" U de San Buenaventura");
        libro233.setNumPaginas(252);
        libro233.setAnioPublicacion(2015);

        Libro libro234 = new Libro();
        libro234.setTitulo("Blancanieves");
        libro234.setAutor("Hermanos Grimm");
        libro234.setGenero("Cuento");
        libro234.setEditorial("Editorial Everest");
        libro234.setNumPaginas(32);
        libro234.setAnioPublicacion(1812);

        Libro libro235 = new Libro();
        libro235.setTitulo("Cien Años de Soledad");
        libro235.setAutor("Gabriel Garcia Marquez");
        libro235.setGenero("Novela");
        libro235.setEditorial("Sudamericana");
        libro235.setNumPaginas(471);
        libro235.setAnioPublicacion(1967);

        Libro libro236 = new Libro();
        libro236.setTitulo("A traves de ti");
        libro236.setAutor("Ariana Godoy");
        libro236.setGenero("Ficcion, adulto joven");
        libro236.setEditorial("Montena");
        libro236.setNumPaginas(336);
        libro236.setAnioPublicacion(2021);

        String tituloMinuscula232 = libro232.getTitulo().toLowerCase();
        String tituloMinuscula233 = libro233.getTitulo().toLowerCase();
        String tituloMinuscula234 = libro234.getTitulo().toLowerCase();
        String tituloMinuscula235 = libro235.getTitulo().toLowerCase();
        String tituloMinuscula236 = libro236.getTitulo().toLowerCase();
                System.out.println("El titulo del libro es: "+ '\n'+ tituloMinuscula232 +  " " + '\n'+ tituloMinuscula233 + " "+ '\n'+ tituloMinuscula234 + " "+ '\n'+  tituloMinuscula235 + " " + '\n'+  tituloMinuscula236);

        Integer contadorVocales = 0;
        Integer contadorConsonantes = 0;

        if (true){}



    }
}
