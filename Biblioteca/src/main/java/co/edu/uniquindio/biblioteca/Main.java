package co.edu.uniquindio.biblioteca;

public class Main {
    public static void main(String[] args) {
        Libro libro232 = new Libro();
        libro232.setTitulo("Calculo Integral");
        libro232.setAutor("S. burbano");
        libro232.setGenero("Academico");
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
        System.out.println("_________________________________________________________________________________________" +
                "____________________________________________________________________________________________________");
                System.out.println("Los titulos de los libros son: "
                        + '\n'+ tituloMinuscula232 +  " "
                        + '\n'+ tituloMinuscula233 + " "
                        + '\n'+ tituloMinuscula234 + " "
                        + '\n'+  tituloMinuscula235 + " "
                        + '\n'+  tituloMinuscula236);
        System.out.println("________________________________________________________________________________________" +
                "____________________________________________________________________________________________________");

        Integer contadorVocales = 0;
        Integer contadorConsonantes = 0;

        if (tituloMinuscula232.charAt(0)== 'a' || tituloMinuscula232.charAt(0)== 'e'
                || tituloMinuscula232.charAt(0)== 'i' || tituloMinuscula232.charAt(0)== 'o'
                || tituloMinuscula232.charAt(0)== 'u'){
            contadorVocales = contadorVocales+1;


        }else {
            contadorConsonantes = contadorConsonantes+1;
        }

        if (tituloMinuscula233.charAt(0)== 'a' || tituloMinuscula233.charAt(0)== 'e'
                || tituloMinuscula233.charAt(0)== 'i' || tituloMinuscula233.charAt(0)== 'o'
                || tituloMinuscula233.charAt(0)== 'u'){
            contadorVocales = contadorVocales+1;


        }else {
            contadorConsonantes = contadorConsonantes+1;

        }
        if (tituloMinuscula234.charAt(0)== 'a' || tituloMinuscula234.charAt(0)== 'e'
                || tituloMinuscula234.charAt(0)== 'i' || tituloMinuscula234.charAt(0)== 'o'
                || tituloMinuscula234.charAt(0)== 'u'){
            contadorVocales = contadorVocales+1;


        }else {
            contadorConsonantes = contadorConsonantes+1;
        }
        if (tituloMinuscula235.charAt(0)== 'a' || tituloMinuscula235.charAt(0)== 'e'
                || tituloMinuscula235.charAt(0)== 'i' || tituloMinuscula235.charAt(0)== 'o'
                || tituloMinuscula235.charAt(0)== 'u'){
            contadorVocales = contadorVocales+1;


        }else {
            contadorConsonantes = contadorConsonantes+1;
        }
        if (tituloMinuscula236.charAt(0)== 'a' || tituloMinuscula236.charAt(0)== 'e'
                || tituloMinuscula236.charAt(0)== 'i' || tituloMinuscula236.charAt(0)== 'o'
                || tituloMinuscula236.charAt(0)== 'u'){
            contadorVocales = contadorVocales+1;


        }else {
            contadorConsonantes = contadorConsonantes+1;
        }

        System.out.println("la cantidad de titulos que empiezan con consonante son: "+contadorConsonantes);
        System.out.println("la cantidad de titulos que empiezan con vocal son: " +contadorVocales);
        System.out.println("________________________________________________________________________________________" +
                "____________________________________________________________________________________________________");
        //Modificar titulo del libro232
        System.out.println("Actualización del titulo calculo integral");

         String tituloActual= "Calculo Integral";
         if (libro235.getTitulo().equalsIgnoreCase(tituloActual)) {

             System.out.println("El nombre del titulo235 antes de actualizarse es: "+ libro235.getTitulo());
             libro235.setTitulo("Calculo Integral y diferencial");
             System.out.println("El nombre del titulo235 actualizado es: "+ libro235.getTitulo());

         } else if (libro233.getTitulo().equalsIgnoreCase(tituloActual)) {

             System.out.println("El nombre del titulo233 antes de actualizarse es: "+ libro233.getTitulo());
             libro233.setTitulo("Calculo Integral y diferencial");
             System.out.println("El nombre del titulo232 actualizado es: "+ libro233.getTitulo());

         } else if (libro234.getTitulo().equalsIgnoreCase(tituloActual)) {

             System.out.println("El nombre del titulo234 antes de actualizarse es: "+ libro234.getTitulo());
             libro234.setTitulo("Calculo Integral y diferencial");
             System.out.println("El nombre del titulo232 actualizado es: "+ libro234.getTitulo());

         } else if (libro232.getTitulo().equalsIgnoreCase(tituloActual)) {

             System.out.println("El nombre del titulo232 antes de actualizarse es: "+ libro232.getTitulo());
             libro232.setTitulo("Calculo Integral y diferencial");
             System.out.println("El nombre del titulo232 actualizado es: "+ libro232.getTitulo());

         }else if (libro236.getTitulo().equalsIgnoreCase(tituloActual)) {

             System.out.println("El nombre del titulo236 antes de actualizarse es: "+ libro236.getTitulo());
             libro236.setTitulo("Calculo Integral y diferencial");
             System.out.println("El nombre del titulo235 actualizado es: "+ libro236.getTitulo());

         }
        System.out.println("________________________________________________________________________________________" +
                "____________________________________________________________________________________________________");


        //Cuantos libros tienen mas de 100 paginas
        System.out.println("Cantidad de libros con mas de 100 paginas");

        int paginasMayorCien= 0;
         if (libro232.getNumPaginas() > 100){
             paginasMayorCien= paginasMayorCien +1;
         }
        if (libro233.getNumPaginas() > 100){
            paginasMayorCien= paginasMayorCien +1;
        }
        if (libro234.getNumPaginas() > 100){
            paginasMayorCien= paginasMayorCien +1;
        }
        if (libro235.getNumPaginas() > 100){
            paginasMayorCien= paginasMayorCien +1;
        }
        if (libro236.getNumPaginas() > 100){
            paginasMayorCien= paginasMayorCien +1;
        }
        System.out.println("La cantidad de libros que tienen mas de 100 paginas son: "+ paginasMayorCien);
        System.out.println("_________________________________________________________________________________________" +
                "____________________________________________________________________________________________________");

        // Cuantos libros tienen el genero academico
        System.out.println("cantidad de libros de genero academico");

        int generoAcademico= 0;
        if (libro232.getGenero().equalsIgnoreCase("Academico")){
            generoAcademico= generoAcademico +1;
        }
        if (libro233.getGenero().equalsIgnoreCase("Academico")){
            generoAcademico= generoAcademico +1;
        }
        if (libro234.getGenero().equalsIgnoreCase("Academico")){
            generoAcademico= generoAcademico +1;
        }
        if (libro235.getGenero().equalsIgnoreCase("Academico")){
            generoAcademico= generoAcademico +1;
        }
        if (libro236.getGenero().equalsIgnoreCase("Academico")){
            generoAcademico= generoAcademico +1;
        }
        System.out.println("La cantidad de libros con genero academico son: "+ generoAcademico);
        System.out.println("________________________________________________________________________________________" +
                "____________________________________________________________________________________________________");
    }
}
