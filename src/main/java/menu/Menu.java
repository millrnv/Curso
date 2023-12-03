package menu;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.*;
import static dato.GestorDatos.guardarEstudiantesEnArchivo;

public class Menu {

    private Curso curso;

    public Menu(Curso curso) {
        this.curso = curso;
    }

    public void menu() {
        int opcion = 0;
        Scanner entrada = new Scanner(System.in);

        do{
            imprimirMenu();
            opcion = pedirEntrada();

            switch (opcion){

                case 1:
                    System.out.println("Ingrese nombre, rut y email del estudiante: ");
                    Estudiante estudianteIngresar = new Estudiante(entrada.nextLine(),entrada.nextLine(),entrada.nextLine());
                    curso.agregarEstudiante(estudianteIngresar);
                    guardarEstudiantesEnArchivo(curso.getEstudiantes());
                    break;

                case 2:
                    System.out.println("Ingrese el n de rut del estudiante que desea buscar: ");
                    curso.buscarEstudiante(entrada.nextLine());
                    break;

                case 3:
                    curso.mostrarEstudiantes(curso.getEstudiantes());
                    break;

                case 4:
                    System.out.println("Ingrese el rut del estudiante que desea eliminar: ");
                    curso.eliminarEstudiante(entrada.nextLine());
                    guardarEstudiantesEnArchivo(curso.getEstudiantes());
                    break;

                case 5:
                    break;

            }


        }while(opcion != 5);
    }

    public int pedirEntrada() {
        Scanner entrada = new Scanner(System.in);

        try {
            int opcion = entrada.nextInt();
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción inválida. ");
                return pedirEntrada();

            }

            return opcion;

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes ingresar un número entero entre 1 y 5.");
            entrada.nextLine(); // Limpiar el búfer de entrada
            return pedirEntrada();
        }
    }

    public void imprimirMenu() {
        System.out.println("\n1) Agregar estudiante. " +
                "\n2) Buscar estudiante. " +
                "\n3) Mostrar estudiantes. " +
                "\n4) Eliminar un estudiante. " +
                "\n5) Salir. ");
    }








}
