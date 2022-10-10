
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba {

    public static void main(String[] args) {
        Matricula matricula = new Matricula();
        Estudiante estudiante = new Estudiante();
        Scanner s = new Scanner(System.in);

        matricula.Fecha = JOptionPane.showInputDialog("Ingrese la fecha de la matricula");

        estudiante.nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");

        estudiante.Promedio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el promedio anterior"));

        matricula.estudiante = estudiante;
        
        
        int cursos = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de cursos a matricularse"));
        
        matricula.Cursos = new Curso[cursos];
        int creditos_usados = 0;
        for(int i=1; i<=cursos; i++) {
            
            
            JOptionPane.showMessageDialog(null, "Creditos disponibles:" + (estudiante.getCreditos()-creditos_usados));
            Curso curso = new Curso();
            curso.Codigo = i;

            curso.Nombre = JOptionPane.showInputDialog("Ingrese el nombre del curso "+i+":");

            
            curso.Ciclo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ciclo del curso "+i+":"));


            do {
                
                curso.Creditos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los creditos del curso "+i+":"));
                
            } while(!(curso.Creditos > 0) || creditos_usados + curso.Creditos > estudiante.getCreditos());
            creditos_usados += curso.Creditos;
        }
        
        JOptionPane.showMessageDialog(null, "Estudiante "+estudiante.nombre+" matriculado con la fecha "+matricula.Fecha);
        //p1();
        //prestamo.Get_amortizacion_mes(4);
        //System.out.println("amortizacion mes 4 " + prestamo.Get_amortizacion_mes(4));

    }
}
     