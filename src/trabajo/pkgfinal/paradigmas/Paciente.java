package trabajo.pkgfinal.paradigmas;

//Clase Paciente
public class Paciente extends Persona {
    public int codPaciente;

    public Paciente(int codPaciente, int edad, String nombre, int dni, int peso, int altura) {
        super(edad, nombre, dni, peso, altura);
        this.codPaciente = codPaciente;
    }

    public int getCodPaciente() {
        return codPaciente;
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
