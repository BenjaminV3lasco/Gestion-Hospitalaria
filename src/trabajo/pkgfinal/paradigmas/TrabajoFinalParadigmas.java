package trabajo.pkgfinal.paradigmas;
import trabajo.pkgfinal.paradigmas.Medico;
import javax.swing.JOptionPane;

public class TrabajoFinalParadigmas {

    public static void main(String[] args) {
       
      int respuesta, info,i;
      
      Controlador ctl = new Controlador();
      ctl.setTamanio(1);
      
      //Medicos
      Medico medico1 = new Medico("Médico General",234,52,"Thomas Tuchel",22456789,72,1724);
      Medico medico2 = new Medico("Traumatólogo",451,56,"Massimiliano Allegri",19456789,77,181);
      Medico medico3 = new Medico("Cardiólogo",125,41,"Jorge Sampaoli",31856709,81,177);
      Medico medico4 = new Medico("Oftalmólogo",225,43,"Alexander Medina",33456804,87,188);
      Medico medico5 = new Medico("Cirujano",100,49,"Carlos Velazquez",29756899,80,174);
      
     
    do{//Menú Principal
       respuesta = Integer.parseInt(JOptionPane.showInputDialog(
       "¡Bienvenido al Sistema de Gestión Hospitalaria!\n"
       +"1. Ingresar los datos del paciente\n"
       +"2. Ver Informacion\n"
       +"3. Salir del Sistema"));
       while(respuesta<1 || respuesta>3){
       respuesta = Integer.parseInt(JOptionPane.showInputDialog(
       "Opción invalida\n"
       +"1. Ingresar los datos del paciente\n"
       +"2. Ver Informacion\n"
       +"3. Salir del Sistema"));
       }
       
        switch(respuesta){
            case 1://Se inserta los datos del Paciente
                ctl.insertar();
                ctl.enfermedadPaciente();
                break;
            case 2:
                info = Integer.parseInt(JOptionPane.showInputDialog(
                "1. Médicos Disponibles\n"
                +"2. Historial Clínico del Paciente"));
                
                switch(info){
                    case 1://Listado Médicos de la Clínica
                        
                     JOptionPane.showMessageDialog(null,"Médico 1"+"\n"+"Nombre: "+medico1.nombre+"\n"+"Edad: "+medico1.edad+"\n"+"DNI: "+medico1.dni+"\n"+"Especialidad: "+medico1.especialidad+"\n"+"Matricula: "+medico1.matricula);
                     JOptionPane.showMessageDialog(null,"Médico 2"+"\n"+"Nombre: "+medico2.nombre+"\n"+"Edad: "+medico2.edad+"\n"+"DNI: "+medico2.dni+"\n"+"Especialidad: "+medico2.especialidad+"\n"+"Matricula: "+medico2.matricula);   
                     JOptionPane.showMessageDialog(null,"Médico 3"+"\n"+"Nombre: "+medico3.nombre+"\n"+"Edad: "+medico3.edad+"\n"+"DNI: "+medico3.dni+"\n"+"Especialidad: "+medico3.especialidad+"\n"+"Matricula: "+medico3.matricula);   
                     JOptionPane.showMessageDialog(null,"Médico 4"+"\n"+"Nombre: "+medico4.nombre+"\n"+"Edad: "+medico4.edad+"\n"+"DNI: "+medico4.dni+"\n"+"Especialidad: "+medico4.especialidad+"\n"+"Matricula: "+medico4.matricula);   
                     JOptionPane.showMessageDialog(null,"Médico 5"+"\n"+"Nombre: "+medico5.nombre+"\n"+"Edad: "+medico5.edad+"\n"+"DNI: "+medico5.dni+"\n"+"Especialidad: "+medico5.especialidad+"\n"+"Matricula: "+medico5.matricula);   
                        break;
                    case 2://Historial Clínico Paciente
                        ctl.mostrarDatos();
                        break;   
                }
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "¡Hasta luego, que tenga buen día!");
                break;
           }
    }while(respuesta<3);
    
  }//Fin Main

}
