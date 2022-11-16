
package trabajo.pkgfinal.paradigmas;
import javax.swing.JOptionPane;


public class Controlador {
    Paciente vector[];
    public void setTamanio(int tam){
        if(tam>0) vector = new Paciente[tam];
    }
    public int getTamanio(){
        return vector.length;
    }
    
    public void insertar(){
    Paciente paciente;
    int i,edad,dni,peso,altura;
    String enfermedad,nombre;
    for(i=0;i<getTamanio();i++){
        
        enfermedad = caja("Patología del Paciente: ");
        nombre = caja("Nombre Paciente: ");
        edad = Integer.parseInt(caja("Edad: "));
        dni = Integer.parseInt(caja("DNI: "));
        peso = Integer.parseInt(caja("Peso: "));
        altura = Integer.parseInt(caja("Altura: "));
      
        paciente = new Paciente(enfermedad,edad,nombre,dni,peso,altura);
        vector[i] = paciente;
        }
   }
    public String caja(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    
    public void mostrarDatos(){
        int i;
        String info = "Historial Paciente\n";
        for(i=0;i<getTamanio();i++){
            info+="Patología: "+vector[i].getEnfermedad()+"\n";
            info+="Nombre: "+vector[i].getNombre()+"\n";
             info+="Edad: "+vector[i].getEdad()+"\n";
            info+="DNI: "+vector[i].getDni()+"\n";
            info+="Peso: "+vector[i].getPeso()+"\n";
            info+="Altura : "+vector[i].getAltura()+"\n";
            
            
        }
         JOptionPane.showMessageDialog(null, info);
    }
    
}
