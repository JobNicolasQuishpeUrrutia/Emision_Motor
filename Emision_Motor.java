/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emision_motor;

/**
 *
 * @author Quishpe Urrutia Job Nicolas
 */
class Emision_Contaminante{
    public void EmitirContaminacion(){
        System.out.println("Gases contaminantes");
    }
}

class Hidrocarburo extends Emision_Contaminante{
    public void EmitirContaminacion(){
        System.out.println("Hidrocarburo");
    }
}

class MonoxidoCarbono extends Emision_Contaminante{
    public void EmitirContaminacion(){
        System.out.println("Monóxido de Carbono");
    }
}

class OxidoNitrogeno extends Emision_Contaminante{
    public void EmitirContaminacion(){
        System.out.println("Óxido de Nitrógeno");
    }
}

class DioxidoCarbono extends Emision_Contaminante{
    public void EmitirContaminacion(){
        System.out.println("Dióxido de carbono");
    }
}

public class Emision_Motor {

    public static void main(String[] args) {
        
        Emision_Contaminante emision1=new Hidrocarburo();
        Emision_Contaminante emision2=new MonoxidoCarbono();
        Emision_Contaminante emision3=new OxidoNitrogeno();
        Emision_Contaminante emision4=new DioxidoCarbono();
       
        System.out.println("                                Universidad de las Fuerzas Armadas ESPE ");
        System.out.println("                                            Sede Latacunga");
        System.out.println("Asignatura: Programacion [7450]");
        System.out.println("Docente: Ing. Guerra Cruz Luis Alberto");
        System.out.println("Alumno: Job Nicolas Quishpe Urrutia");
        System.out.println("Carrera: Ingeniería Automotriz");
        System.out.println("Tema: Polimorfismo\n");
        
        System.out.println("Emisiones del motor de combustión interna (MCI) modelo Z16SE 2005,");
        System.out.println("según su porcentaje de contaminación");
       
        System.out.println("Alto porcentaje de contaminación: HC");
        emision1.EmitirContaminacion();
        
        System.out.println("Regular porcentaje de contaminación: CO");
        emision2.EmitirContaminacion();
        
        System.out.println("Bajo porcentaje de contaminación: NOx");
        emision3.EmitirContaminacion();
        
        System.out.println("Porcentaje despreciable de contaminación: CO2");
        emision4.EmitirContaminacion();
        
    }
    
}
