import java.util.Scanner;

public class EjercicioComplementario4 {
    public static void main(String[] ar){
        Scanner teclado=new Scanner(System.in);
        int i,x,y,num;
        System.out.print("Cuantos pares de puntos desea utilizar:");
        num=teclado.nextInt();
        for(i=1;i<=num,i++){
            System.out.print("Ingrese la coordenada x:");
            x=teclado.nextInt();
            System.out.print("Ingrese la coordenada y:");
            y=teclado.nextInt();

            if(x>0 && y>0){
                System.out.print("El numero se encuentra en el primer cuadrante");
            }else if(x<0 && y>0){
                System.out.print("El numero se encuentra en el segundo cuadrante");
            }else if(x<0 && y<0){
                System.out.print("El numero se encuentra en el tercer cuadrante");
            }else{
                System.out.print("El numero se encuentra en el tercer cuadrante");
            }
        }
    }
}
