package CosasDeVideojuego;

public class MainVideojuego {
    static void main() {
        Videojuego juego1= new Videojuego();
        Videojuego juego2= new Videojuego();
        Videojuego juego3= new Videojuego();

        juego1.activo= true;
        juego1.genero= "Terror ";
        juego1.nombre= "Plantas vs Zombies ";
        juego1.version= "6.7 ";

        juego2.activo= true;
        juego2.genero= "Accion ";
        juego2.nombre= "GTA V ";
        juego2.version= "60.7 ";

        juego3.activo= true;
        juego3.genero= "Free World ";
        juego3.nombre= "Geometry Dash ";
        juego3.version= "2.67 ";

        juego1.iniciar();
        juego1.mostrarinformacion();
        juego1.mostrarVersion();
        juego1.cerrar();

        juego2.iniciar();
        juego2.mostrarinformacion();
        juego2.mostrarVersion();
        juego2.cerrar();

        juego3.iniciar();
        juego3.mostrarinformacion();
        juego3.mostrarVersion();
        juego3.cerrar();




    }
}
