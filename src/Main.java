import java.util.Date;

public class Main {
    public static int voltear(int numero, int resultado) {
        // Caso base: si el número es 0, retornamos el resultado acumulado
        if (numero == 0) {
            return resultado;
        }
        // Tomamos el último dígito del número y lo agregamos al resultado
        resultado = resultado * 10 + (numero % 10);
        System.out.println(resultado);
        // Llamada recursiva eliminando el último dígito del número
        System.out.println(numero / 10);
        return voltear(numero / 10, resultado);
    }

    public static void main(String[] args) {
        int numero = 12345;
        int numeroVolteado = voltear(numero, 0);
        System.out.println("Número original: " + numero);
        System.out.println("Número volteado: " + numeroVolteado);

        for(int i = 0 ; i < 10 ; i++){
            // inicia









            // acaba
        }
        // finalizado
    }
}

class ClaseGenerica<Tipo>{

    public void funcion(Tipo variable){

    }

}

class VoltearNumero {


}




class ClasePrueba {
    String[] municipiosSinaloa = {
            "Ahome",
            "Angostura",
            "Badiraguato",
            "Concordia",
            "Cosalá",
            "Culiacán",
            "Choix",
            "Elota",
            "Escuinapa",
            "El Fuerte",
            "Guasave",
            "Mazatlán",
            "Mocorito",
            "Navolato",
            "Rosario",
            "Salvador Alvarado",
            "San Ignacio",
            "Sinaloa de Leyva"
    };

    public void buena_practica(){
        System.out.println("Municipios de Sinaloa");
        for(int i = 0; i < municipiosSinaloa.length; i++){
            System.out.println((i+1) + " - " + municipiosSinaloa[i]);
        }
    }

    public void mala_practica(){
        System.out.println("Municipios de Sinaloa");
        System.out.println( "1 - Ahome");
        System.out.println( "2 - Angostura");
        System.out.println( "3 - Badiraguato");
        System.out.println( "4 - Concordia");
        System.out.println( "5 - Cosalá");
        System.out.println( "6 - Culiacán");
        System.out.println( "7 - Choix");
        System.out.println( "8 - Elota");
        System.out.println( "9 - Escuinapa");
        System.out.println( "10 - El Fuerte");
        System.out.println( "11 - JJR");
        System.out.println( "11 - Guasave");
        System.out.println( "12 - Mazatlán");
        System.out.println( "13 - Mocorito");
        System.out.println( "14 - Navolato");
        System.out.println( "15 - Rosario");
        System.out.println( "16 - Salvador Alvarado");
        System.out.println( "17 - San Ignacio");
        System.out.println( "18 - Sinaloa de Leyva");
    }
}