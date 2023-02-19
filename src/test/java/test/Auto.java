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
        for (Asiento item: asientos){ //Itera sobre el arreglo de asientos.
            if (item != null){ //Revisa que el asiento sea una instancia del objeto Asiento.
                contador++;
            }
        }
    }
       return contador;
    }

    public String verificarIntegridad(){
        //Verifica que el atributo registro de motor, auto y asientos sean iguales.
            for (Asiento item: asientos){//itera sobre el arreglo de asientos.
                if (item!= null &&(this.registro != item.registro) || (this.registro != this.motor.registro)){ //Revisa que el asiento sea una instancia del objeto Asiento.
                    return "Las piezas no son originales";
            }
        }
            return "Auto original";
    }
}

