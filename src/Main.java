
public class Main {
    public static void main(String[] args) {
        Cte_Ahorros Cuentapersonal = new Cte_Ahorros(1755991617,"Francis",200);
        Jugador_Futbol Defensaa = new Jugador_Futbol(1755991617,"Francis",10 );
        //Defensa Defensa1 = new Defensa(1755859556, "Sicnarf",15,"Defensa",2,5,3);



        Defensaa.Mostrar_Informacion();

        // Defensa1.Mostrar_Informacion();

        Cuentapersonal.Depositar(10);
        Cuentapersonal.Retiro(20);
        sumar suma1 =new sumar(50,30,80);



        suma1.Resultado();


    }
}