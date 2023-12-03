package Controller;

import menu.Menu;
import modelo.*;


public class Main {
    public static void main(String[] args) {

        inicializar();

    }

    public static void inicializar(){

        Menu menu = new Menu(new Curso("1"));

        menu.menu();




    }


}
