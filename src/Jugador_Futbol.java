public class Jugador_Futbol {
    public  int Cedula;
    public String Nombre;
    public  int camiseta;

    public Jugador_Futbol(int Cedula, String Nombre,   int camiseta){
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.camiseta = camiseta;


    }

    public void Mostrar_Informacion(){
        System.out.println("-------------------------------------------");
        System.out.println("             Datos Jugador               \n");
        System.out.println("Nombre: " +Nombre+"\n");
        System.out.println("Cedula: " +Cedula+"\n");
        System.out.println("N. Camiseta: "+camiseta+"\n");

    }
}


//class Defensa extends Jugador_Futbol{
//  public String Posicion;
//  public int Tarjetas;
// public int goles;
//  public int faltas;


//   public Defensa(int Cedula, String Nombre,   int camiseta, String Posicion, int Tarjetas, int goles, int faltas){

//  super( Cedula,  Nombre,  camiseta);
//  this.Posicion = Posicion;
//   this.Tarjetas = Tarjetas;
//   this.goles = goles;
//   this.faltas = faltas;


//}



//}
