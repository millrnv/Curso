package Menu;

import java.nio.channels.AsynchronousChannelGroup;
import java.util.Scanner;
import modelo.*;

public class Menu {

    private Curso curso;


    public Menu(Curso curso){

        this.curso = curso;
    }


    public void Menu (){

        int opcion = 0;

        do{
            imprimirMenu();
            opcion = pedirEntrada();

            switch (opcion){

                case 1: curso.agregarEstudiante();
                break;

                case 2: curso.buscarEstudiante();
                break;

                case 3: curso.mostrarEstudiantes();
                break;

                case 4: curso.eliminarEstudiante();
                break;

                case 5:
                    break;

            }


        }while(opcion != 5);

    }

    public static void imprimirMenu(){

        System.out.println("\n1) Agregar estudiante. " +
                "\n2) Buscar estudiante. " +
                "\n3) Mostrar estudiantes. " +
                "\n4) Eliminar un estudiante. " +
                "\n5) Salir. ");

    }

    public static int pedirEntrada(){

        Scanner entrada = new Scanner(System.in);
        int opcion = entrada.nextInt();
        if(opcion < 1 || opcion > 5){
            System.out.println("Opción inválida. ");
            return pedirEntrada();

        }

        return opcion;
    }








}
