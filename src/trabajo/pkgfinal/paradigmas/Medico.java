
package trabajo.pkgfinal.paradigmas;

//Clase Médico
public class Medico extends Persona{
    public String especialidad;
    public int matricula;

    public Medico(String especialidad, int matricula, int edad, String nombre, int dni, int peso, int altura) {
        super(edad, nombre, dni, peso, altura);
        this.especialidad = especialidad;
        this.matricula = matricula;
    }
}
    
    

