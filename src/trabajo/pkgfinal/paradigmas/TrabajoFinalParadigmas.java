package trabajo.pkgfinal.paradigmas;

import java.util.Scanner;
import trabajo.pkgfinal.paradigmas.Persona;
import trabajo.pkgfinal.paradigmas.Medico;
import trabajo.pkgfinal.paradigmas.Paciente;
import javax.swing.JOptionPane;

public class TrabajoFinalParadigmas {

    public static void main(String[] args) {
      Scanner Teclado = new Scanner (System.in); 
      int respuesta, info,i;
      
      info=0;
      Controlador ctl = new Controlador();
      ctl.setTamanio(1);
      
      //Medicos
      Medico medico1 = new Medico("Kinesiólogo",234,52,"Thomas Tuchel",22456789,72,1724);
      
      
      Medico medico2 = new Medico("Traumatólogo",451,56,"Massimiliano Allegri",19456789,77,181);
      
      
      Medico medico3 = new Medico("Cardiólogo",125,41,"Jorge Sampaoli",31856709,81,177);
     
      
      Medico medico4 = new Medico("Oftalmólogo",225,43,"Alexander Medina",33456804,87,188);
     
      
      Medico medico5 = new Medico("Cirujano",100,49,"Carlos Velazquez",29756899,80,174);
      
     
        
        
    System.out.println("¡Bienvenido al Sistema de Gestión Hospitalaria!");
    
    do{
       respuesta = Integer.parseInt(JOptionPane.showInputDialog(
       
       "1. Ingresar los datos del paciente\n"
       +"2. Ver Informacion\n"
       +"3. Salir del Sistema"));
       
        switch(respuesta){
            case 1:
                ctl.insertar();
                break;
            case 2:
                info = Integer.parseInt(JOptionPane.showInputDialog(
       
                "1. Médicos Disponibles\n"
                +"2. Historial Clínico del Paciente"));
                
                switch(info){
                    case 1://Listado Médicos de la Clínica
                        System.out.println("============================");
                        System.out.println("Nombre: "+medico1.nombre);
                        System.out.println("Edad: "+medico1.edad);
                        System.out.println("DNI: "+medico1.dni);
                        System.out.println("Especialidad: "+medico1.especialidad);
                        System.out.println("Matricula: "+medico1.matricula);
                        System.out.println("============================");
                        System.out.println("Nombre: "+medico2.nombre);
                        System.out.println("Edad: "+medico2.edad);
                        System.out.println("DNI: "+medico2.dni);
                        System.out.println("Especialidad: "+medico2.especialidad);
                        System.out.println("Matricula: "+medico2.matricula);
                        System.out.println("============================");
                        System.out.println("Nombre: "+medico3.nombre);
                        System.out.println("Edad: "+medico3.edad);
                        System.out.println("DNI: "+medico3.dni);
                        System.out.println("Especialidad: "+medico3.especialidad);
                        System.out.println("Matricula: "+medico3.matricula);
                        System.out.println("============================");
                        System.out.println("Nombre: "+medico4.nombre);
                        System.out.println("Edad: "+medico4.edad);
                        System.out.println("DNI: "+medico4.dni);
                        System.out.println("Especialidad: "+medico4.especialidad);
                        System.out.println("Matricula: "+medico4.matricula);
                        System.out.println("============================");
                        System.out.println("Nombre: "+medico5.nombre);
                        System.out.println("Edad: "+medico5.edad);
                        System.out.println("DNI: "+medico5.dni);
                        System.out.println("Especialidad: "+medico5.especialidad);
                        System.out.println("Matricula: "+medico5.matricula);
                        System.out.println("============================");
                        JOptionPane.showMessageDialog(null, info);
                        break;
                    case 2://Historial Clínico Paciente
                        ctl.mostrarDatos();
                        break;   
                }
                break;
                
        }
    }while(respuesta<3);
    
    
    
    
    }//Fin Main
    
}
