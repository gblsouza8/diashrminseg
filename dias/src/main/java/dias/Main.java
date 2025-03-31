package dias;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dias;
        Scanner input = new Scanner(System.in);
        System.out.println("Insira a quantidade de dias: ");
        dias = input.nextInt();
        input.close();


        verificarDias(dias);

        System.out.println(calcularSemanas(dias));
        System.out.println(calcularHoras(dias));
        System.out.println(calcularMinutos(dias));
        System.out.println(calcularSegundos(dias));


    }

    public static void verificarDias(int dias){
        if(dias <= 0)
        {
            throw new IllegalArgumentException("Insira uma quantidade de dias maior que 0");
        }
    }

    public static String calcularSemanas(int dias)
    {
        int semanas = dias/7;
        String mensagemSemana;
        if (semanas < 1)
        {
            mensagemSemana = "Se passou menos de uma semana nesse interválo.";
        }
        else
        {
            mensagemSemana = "Se passaram " + semanas + " semanas nesse interválo";
        }
        return mensagemSemana;
    }

    public static String calcularHoras(int dias)
    {
        int horas = dias*24;
        String mensagemDias = "Se passaram " + horas + " horas nesse interválo.";
        return mensagemDias;
    }

    public static String calcularMinutos(int dias)
    {
        int minutos = dias*1440;
        String mensagemMinutos = "Se passaram " + minutos + " minutos nesse interválo.";
        return mensagemMinutos;
    }

    public static String calcularSegundos(int dias)
    {
        int segundos = dias*86400;
        String mensagemSegundos = "Se passaram " + segundos + " Segundos nesse interválo.";
        return mensagemSegundos;
    }


}