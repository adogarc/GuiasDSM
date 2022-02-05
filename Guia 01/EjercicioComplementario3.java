import java.util.Scanner;

public class EjercicioComplementario3 {
    public static void main(string[] ar){
        Scanner teclado=new Scanner(System.in);
        int pares=0;
        int impares=0;
        int x=1;
        int n,valor;

        System.out.print("Cuantos numeros desea ingresar:");
        n=teclado.nextInt();
        while (x<=n){
            System.out.print("Ingrese el número entero:");
            valor.teclado.nextInt();
            if (valor%2==0){
                pares=pares+1;
            }else {
                impares=impares+1;
            }
            x=x+1;
        }
        System.out.print("cantidad de pares:"+pares);
        System.out.print("cantidad de impares:"+impares);
    }
}