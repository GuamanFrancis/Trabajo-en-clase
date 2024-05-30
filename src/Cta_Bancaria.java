public class Cta_Bancaria {
    public int Cedula;
    public String Nombre;
    public double Monto;

    public Cta_Bancaria(int Cedula, String Nombre, double Monto){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Monto = Monto;

    }

    public double getMonto() {
        return Monto;
    }

    public void setMonto(double monto) {
        Monto = monto;
    }

    public void Mostrar_Informacion(){
        System.out.println("------------------------------\n");
        System.out.println("       Datos Personales       \n");
        System.out.println("Nombre: "+Nombre+"\n");
        System.out.println("Cedula"+Cedula+"\n");
        System.out.println("Monto"+Monto+"\n");



    }
}


class Cte_Ahorros extends Cta_Bancaria{


    public Cte_Ahorros(int Cedula, String Nombre, double Monto ){
        super(Cedula,Nombre,Monto);



    }


    public double Depositar(double Cantidad){

        System.out.println("---------------------------------");
        System.out.println(" Monto de la cuenta bancaria\n");
        System.out.println("Monto: "+Monto+"\n");
        System.out.println("El nuevo monto de la cuenta bancaria es de:\n");
        System.out.println("Monto Actual realizado el deposito\n");
        System.out.println("Monto Actual: "+(getMonto()+Cantidad)+"\n");
        return getMonto();



    }

    public void Retiro(int cantidad){
        System.out.println("---------------------------------");
        System.out.println(" Monto de la cuenta bancaria Retiro\n");
        System.out.println("Monto inical: "+Monto+"\n");
        System.out.println("El  monto de la cuenta bancaria realizado el deposito es de:\n");
        System.out.println("Monto : "+getMonto()+"\n");
        System.out.println("Monto Actual realizado el retiro \n");
        System.out.println("Monto Actual: "+(getMonto()-cantidad)+"\n");



    }



}
