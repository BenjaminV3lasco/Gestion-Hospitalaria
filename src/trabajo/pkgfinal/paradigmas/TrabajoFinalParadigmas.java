package trabajo.pkgfinal.paradigmas;

import java.util.Scanner;

public class TrabajoFinalParadigmas {

    public static void main(String[] args) {
      Scanner Teclado = new Scanner (System.in); 
      int respuesta, info,i;
      respuesta=0;
      info=0;
      
      Medico medico1 = new Medico();
      medico1.edad = 32;
      medico1.nombre ="Marco";
      medico1.dni = 22456789;
      medico1.altura = 176;
      medico1.peso = 72;
      medico1.especialidad = "Kinesiologo";
      medico1.matricula = 234;
      
      
     
        
        
    System.out.println("¡Bienvenido al Sistema de Gestión Hospitalaria!");
    
    do{
       System.out.println("1. Ingresar los datos del paciente");
       System.out.println("2. Ver Informacion");
       System.out.println("3. Salir del Sistema");
       respuesta = Teclado.nextInt();
       Teclado.nextLine();
        while(respuesta<1 || respuesta>3){
          System.out.println("Error: La opción ingresada no es válida");
          System.out.println("1. Ingresar los datos del paciente");
          System.out.println("2. Ver Informacion");
          System.out.println("3. Salir del Sistema");
          respuesta = Teclado.nextInt();
          Teclado.nextLine();
            }
        switch(respuesta){
            case 1:
                break;
            case 2:
                System.out.println("1. Pacientes Cargados");
                System.out.println("2. Médicos Disponibles");
                System.out.println("3. Historial Clínico");
                info = Teclado.nextInt();
                Teclado.nextLine();
                switch(info){
                    case 1://Info Pacientes
                        break;
                    case 2://Listado Médicos de la Clínica
                        System.out.println("");
                        
                        break;
                    case 3://Historial Clínico Paciente
                        break;   
                }
                break;
                
        }
    }while(respuesta<3);
    
    
    
    
    }//Fin Main
    
}
