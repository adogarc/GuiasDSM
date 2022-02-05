import java.util.Scanner;

public class EjercicioComplementario1 {
    public static void main(String[] ar) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.print("Ingrese el primer numero:");
        num1=teclado.nextInt();
        System.out.print("Ingrese el segundo numero:");
        num2=teclado.nextInt();
        if(num1%num2=0){
            System.out.print("Los numeros ingresados entre si son divisibles");
        }
        else{
            System.out.print("Los numeros ingresados no son divisibles.");
        }
    }
}