package trabajo.pkgfinal.paradigmas;


public class Paciente extends Persona {
    public String enfermedad;

    public Paciente(String enfermedad, int edad, String nombre, int dni, int peso, int altura) {
        super(edad, nombre, dni, peso, altura);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDni() {
        return dni;
    }

    public int getPeso() {
        return peso;
    }

    public int getAltura() {
        return altura;
    }
    

    
    

    
   }
