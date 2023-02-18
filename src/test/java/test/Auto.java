package test;
public class Auto {
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados = 0;

    public int cantidadAsientos(){
       int contador = 0;
       if (asientos != null){ //Revisa que el arreglo no sea nulo.
        for (Asiento asiento: asientos){ //Es como un for element in list en python.
            if (asiento instanceof Asiento){ //Revisa que el asiento sea una instancia del objeto Asiento.
                contador++;
            }
        }
    }
       return contador;
    }

    public String verificarIntegridad(){
        //Verifica que el atributo registro de motor, auto y asientos sean iguales.
        if (motor.registro == registro){
            for (Asiento asiento: asientos){
                if (asiento.registro != registro){
                    return "Las piezas no son originales";
                }
            }
            return "Auto original";
        }
        else{
            return "Las piezas no son originales";
        }

    }
}
