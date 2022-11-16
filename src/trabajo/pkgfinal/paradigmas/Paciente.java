package trabajo.pkgfinal.paradigmas;


public class Paciente extends Persona {
    private String enfermedad;

    public Paciente(String enfermedad, int edad, String nombre, int dni, int peso, int altura) {
        super(edad, nombre, dni, peso, altura);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }

    
    
    
    
}
