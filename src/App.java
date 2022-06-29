import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Yılı Giriniz : ");
        year = input.nextInt();

        if(year%100 == 0 ){
            
            if (year%400 == 0 && year%4==0){
            System.out.println(year+" Artik bir yildir !");
            }
            else {
            System.out.println(year+" Artik bir yil değildir !");
            }

         }
        else if(year%4 ==0){
            System.out.println(year+" Artik bir yildr !");
         }else {
            System.out.println(year + " Artik bir yil değildir !");
         }
    }}