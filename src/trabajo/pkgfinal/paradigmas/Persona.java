
package trabajo.pkgfinal.paradigmas;

//Clase Persona
public class Persona {
    protected int edad;
    protected String nombre;
    protected int dni;
    protected int peso;
    protected int altura;
    

    public Persona(int edad, String nombre, int dni, int peso, int altura) {
        this.edad = edad;
        this.nombre = nombre;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
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
