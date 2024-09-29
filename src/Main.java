/*Ejercicio 2: Interfaces.
 Escribir una clase “Pasajero” y hacer que implemente la interface “Frecuencia”
 en la cual están definidos los siguientes métodos: */

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {
        
        // Fecha definida para Pasajero 1
        // Se utilizo la clase CALENDAR y DATE aunque estan en desuso y lo mejor seria usar java.time
        Calendar calendarPasajero1 = Calendar.getInstance();
        calendarPasajero1.set(2023, 1, 15); 
        Date fechaPasajero1 = calendarPasajero1.getTime();
        
        // Fecha definida para Pasajero 2
        Calendar calendarPasajero2 = Calendar.getInstance();
        calendarPasajero2.set(2023, 2, 22); 
        Date fechaPasajero2 = calendarPasajero2.getTime();
        
        // Fecha definida para vehiculo 1
        Calendar calendarVehiculo1 = Calendar.getInstance();
        calendarVehiculo1.set(2024, 5, 5); 
        Date fechaVehiculo1 = calendarVehiculo1.getTime();
        
        // Fecha definida para vehiculo 2
        Calendar calendarVehiculo2 = Calendar.getInstance();
        calendarVehiculo2.set(2024, 3, 12); 
        Date fechaVehiculo2 = calendarVehiculo2.getTime();
        
        // Creación de los objetos pasajero y vehiculo
        Pasajero pasajero1 = new Pasajero(1200, fechaPasajero1);
        Pasajero pasajero2 = new Pasajero(1500, fechaPasajero2);
        
        Vehiculo vehiculo1 = new Vehiculo(3000, fechaVehiculo1);
        Vehiculo vehiculo2 = new Vehiculo(2500, fechaVehiculo2);
        
        // Información de pasajeros y vehiculos
        
        System.out.println("------------INFORMACION PASAJEROS--------------");
        
        System.out.println("Pasajero 1:");
        pasajero1.getInformacion();
        
        System.out.println();
        
        System.out.println("Pasajero 2:");
        pasajero2.getInformacion();
        
        
        System.out.println("------------INFORMACION VEHICULOS--------------");
        
        System.out.println("Vehículo 1:");
        vehiculo1.getInformacion();
        
        System.out.println();
        
        System.out.println("Vehículo 2:");
        vehiculo2.getInformacion();
      
    }
    
    
    
}

