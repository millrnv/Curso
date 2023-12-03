package dato;

import modelo.*;

import java.io.*;
import java.util.List;

public class GestorDatos {

    private static final String datosEstudiantes = "datos_estudiantes.txt";

    public static Curso cargarEstudiantesDesdeArchivo() {
        Curso curso = new Curso("1");

        try (BufferedReader br = new BufferedReader(new FileReader(datosEstudiantes))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosEstudiante = linea.split(",");
                String nombre = datosEstudiante[0];
                String rut = datosEstudiante[1];
                String email = datosEstudiante[2];

                Estudiante estudiante = new Estudiante(nombre, rut, email);
                curso.agregarEstudiante(estudiante);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo de datos. Se creará uno nuevo al agregar estudiantes.");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo de datos: " + e.getMessage());
        }

        return curso;
    }

    public static void guardarEstudiantesEnArchivo(List<Estudiante> estudiantes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(datosEstudiantes))) {
            for (Estudiante estudiante : estudiantes) {
                String linea = estudiante.getNombre() + "," + estudiante.getRut() + "," + estudiante.getEmail();
                bw.write(linea);
                bw.newLine();  // Agregar nueva línea después de cada estudiante
            }
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo de datos: " + e.getMessage());
        }
    }

}
