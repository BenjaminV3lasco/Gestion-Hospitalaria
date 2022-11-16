
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
    
    int i,edad,dni,peso,altura,codPaciente;
    String nombre;
    String info = "Ingrese los datos del Paciente\n";
    for(i=0;i<getTamanio();i++){
        
        codPaciente = Integer.parseInt(caja("Código del Paciente:"));
        nombre = caja("Nombre Paciente: ");
        edad = Integer.parseInt(caja("Edad: "));
        dni = Integer.parseInt(caja("DNI: "));
        peso = Integer.parseInt(caja("Peso: "));
        altura = Integer.parseInt(caja("Altura: "));
        
        
        paciente = new Paciente(codPaciente,edad,nombre,dni,peso,altura);
        
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
            info+="Código Paciente: "+vector[i].getCodPaciente()+"\n";
            info+="Nombre: "+vector[i].getNombre()+"\n";
             info+="Edad: "+vector[i].getEdad()+"\n";
            info+="DNI: "+vector[i].getDni()+"\n";
            info+="Peso: "+vector[i].getPeso()+"\n";
            info+="Altura : "+vector[i].getAltura()+"\n";
            
            
        }
         JOptionPane.showMessageDialog(null, info);
    }
   public void enfermedadPaciente(){
       int enfermedad =0;
       int grado_enfermedad;
        enfermedad = Integer.parseInt(JOptionPane.showInputDialog(
        "Ingrese la Enfermedad del Paciente\n"
        +"1.Gripe\n"
        +"2.Resfriado\n"
        +"3.Covid\n"
        +"4.Problemas del Corazón\n"
        +"5.Miopia o Astigmatismo\n"
        +"6. Lesion"));
       switch(enfermedad){
           case 1:
               JOptionPane.showMessageDialog(null, "Ustedes será atendido por el Médico 1\n");
               grado_enfermedad = Integer.parseInt(caja("Grado Enfermedad (1 al 10): "));
               if(grado_enfermedad>=5){
                   JOptionPane.showMessageDialog(null, "Usted fue derivado a internación por el Médico\n");
               }if (grado_enfermedad<5){
                   JOptionPane.showMessageDialog(null, "Usted no será derivado a internación\n");
               }
               break;
           case 2:
               JOptionPane.showMessageDialog(null, "Ustedes será atendido por el Médico 1\n");
               grado_enfermedad = Integer.parseInt(caja("Grado Enfermedad (1 al 10): "));
               if(grado_enfermedad>=5){
                   JOptionPane.showMessageDialog(null, "Usted fue derivado a internación por el Médico\n");
               }if (grado_enfermedad<5){
                   JOptionPane.showMessageDialog(null, "Usted no será derivado a internación\n");
               }
               break;
           case 3:
               JOptionPane.showMessageDialog(null, "Ustedes será atendido por el Médico 1\n");
               grado_enfermedad = Integer.parseInt(caja("Grado Enfermedad (1 al 10): "));
               if(grado_enfermedad>=5){
                   JOptionPane.showMessageDialog(null, "Usted fue derivado a internación por el Médico\n");
               }if (grado_enfermedad<5){
                   JOptionPane.showMessageDialog(null, "Usted no será derivado a internación\n");
               }
               break;
           case 4:
               JOptionPane.showMessageDialog(null, "Ustedes será atendido por el Médico 3\n");
               grado_enfermedad = Integer.parseInt(caja("Grado Enfermedad (1 al 10): "));
               if(grado_enfermedad>=5){
                   JOptionPane.showMessageDialog(null, "Usted fue derivado a internación por el Médico\n");
               }if (grado_enfermedad<5){
                   JOptionPane.showMessageDialog(null, "Usted no será derivado a internación\n");
               }
               break;
           case 5:
               JOptionPane.showMessageDialog(null, "Ustedes será atendido por el Médico 4\n");
               grado_enfermedad = Integer.parseInt(caja("Grado Enfermedad (1 al 10): "));
               if(grado_enfermedad>=5){
                   JOptionPane.showMessageDialog(null, "Usted fue derivado a internación por el Médico\n");
               }if (grado_enfermedad<5){
                   JOptionPane.showMessageDialog(null, "Usted no será derivado a internación\n");
               }
               break;
           case 6:
               JOptionPane.showMessageDialog(null, "Ustedes será atendido por el Médico 2\n");
               grado_enfermedad = Integer.parseInt(caja("Grado Enfermedad (1 al 10): "));
               if(grado_enfermedad>=5){
                   JOptionPane.showMessageDialog(null, "Usted fue derivado a internación por el Médico\n");
               }if (grado_enfermedad<5){
                   JOptionPane.showMessageDialog(null, "Usted no será derivado a internación\n");
               }
               break;
       }
   }
}
