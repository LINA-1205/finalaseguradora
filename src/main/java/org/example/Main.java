package org.example;

import org.example.MODELOS.Agencia;
import org.example.MODELOS.Asegurado;
import org.example.MODELOS.Asesor;
import org.example.MODELOS.Beneficiario;
import org.example.MODELOS.Inmueble;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

    Agencia agenciaUno = new Agencia();
    Agencia agenciaDos = new Agencia(1L,"Sura Centro","calle 30 88 b 25", "3411221", "mi_marce1@hotmail.com", "1021", "seguros de vida", 10, 15, "L a V de 8:00 a.m. a 6:00 p.m.");

    Asegurado aseguradoUno = new Asegurado();
    Asegurado aseguradoDos = new Asegurado(4L, "Lina", "Alvarez", LocalDate.of(1985,12,5), "carrera 108 15 39", "3411221", "lina@gmail.com", "po2504", LocalDate.of(1995,12,1), LocalDate.of(2024,1,4), 1210, 1200000, "casado", "ingeniero", "magister");


    Asesor asesorUno = new Asesor();
    Asesor asesorDos = new Asesor(3L, "milu", "aristizabal", "1201", "seguros auto", 12, "Licenciado", "UdeM", "milu@gmail.com", "3411221");

    Beneficiario beneficiarioUno = new Beneficiario();
    Beneficiario beneficiarioDos = new Beneficiario(2L, "Andres Felipez", "Aristizabal", "71364097", "conyuge", LocalDate.of(1983,3,4), "calle 30 # 88B-25", "3022845075", "andrardu@gmail.com",0.15);

    Inmueble inmuebleUno = new Inmueble();
    Inmueble inmuebleDos = new Inmueble(5L, "calle 30 88 25", "casa", 3.5, 4, 2, "nuevo", 25.000000, "agua, electricidad, gas", "latitud 15");

        Scanner lea=new Scanner(System.in);
        Inmueble inmueble=new Inmueble();

        System.out.print("Digita tu id: ");
        inmueble.setId(lea.nextLong());

        System.out.print("Digita tu direccion: ");
        inmueble.setDireccion(lea.nextLine());

        System.out.print("Digita el tipo de inmueble: ");
        inmueble.setTipoInmueble(lea.nextLine());

        System.out.print("Digita la superficie: ");
        inmueble.setSuperficie(lea.nextDouble());

        System.out.print("Digita el numero de habitaciones: ");
        inmueble.setNumHabitaciones(lea.nextInt());

        System.out.print("Digita el numero de baños: ");
        inmueble.setNumBanos(lea.nextInt());

        System.out.print("Digita el estado de conservacion: ");
        inmueble.setEstadoConservacion(lea.nextLine());

        System.out.print("Digita el valor del inmueble: ");
        inmueble.setValorInmueble(lea.nextDouble());

        System.out.print("Digita los servicios incluidos: ");
        inmueble.setServiciosIncluidos(lea.nextLine());

        System.out.print("Digita la ubicacion geografica: ");
        inmueble.setUbicacionGeografica(lea.nextLine());


    }
}