package CosasDeVideojuego;

public class Videojuego {
    public String nombre;
    public String genero;
    String version;
    boolean activo;


    public void mostrarinformacion(){
        System.out.println("Nombre " +nombre);
        System.out.println("Genero "+genero);

        System.out.println("Activo "+activo);
    }

    public void iniciar(){

        System.out.println("Activo "+activo);
    }

    void cerrar(){
        activo=false;
        System.out.println("Activo "+activo);
    }
    void mostrarVersion(){
        System.out.println("Version "+version);
    }
}
