import java.util.Scanner;
public class principal1 {
    public static void main(String [] args){
        funcion f = new funcion();
        Scanner read= new Scanner (System.in);
        int n = read.nextInt();
        int x= f.contar(n);
        System.out.println("El numero de dgt es: "+x);
        //Tambien se puede hacer
        System.out.println("El numero de digitos ES:" +f.contar(n));
        System.out.println("El numero de divisibilidad:" +f.nro_divisibilidades(n));
        if(f.nro_divisibilidades(n)==2)
        {
            System.out.println("El nro: "+ n+ "  Es Primo");
        }
        else
        {
            System.out.println("El nro: "+ n+ "  NO Es Primo");
        }
        System.out.println("El numero de divisibilidad:" +f.invertir(n));
    }

}
