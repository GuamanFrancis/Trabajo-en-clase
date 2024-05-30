public class Calculos {
    private int Valor1;
    private int Valor2;
    private int Valor3;

    public Calculos(int Valor1,int Valor2,int Valor3){
        this.Valor1 = Valor1;
        this.Valor2 = Valor2;
        this.Valor3 = Valor3;
    }

    public int getValor1() {
        return Valor1;
    }

    public void setValor1(int valor1) {
        Valor1 = valor1;
    }

    public int getValor2() {
        return Valor2;
    }

    public void setValor2(int valor2) {
        Valor2 = valor2;
    }

    public int getValor3() {
        return Valor3;
    }

    public void setValor3(int valor3) {
        Valor3 = valor3;
    }



    private void Mostrar(){
        System.out.println("---------------------------------");
        System.out.println("            Datos              \n");
        System.out.println("Primer Valor: "+Valor1+"\n");
        System.out.println("Segundo Valor: "+Valor2+"\n");
        System.out.println("Tercer Valor: "+Valor3+"\n");

    }
    public void mostrardatos(){

        Mostrar();
    }



}

class sumar extends Calculos{
    public int Sumatoria;

    public sumar(int Valor1,int Valor2,int Valor3){
        super( Valor1,Valor2, Valor3);

    }

    public void Resultado(){
        mostrardatos();

        Sumatoria=( getValor1()+getValor2()+getValor3());
        System.out.println(" El resultado de la suma es: "+Sumatoria);

    }



}
