import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        // 1) Вычислить сумма чисел от 1 до n
        Scanner vvod = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = vvod.nextInt();
        System.out.println("Сумма чисел равна " + summa(n));
        

        // 2) Вывести все простые числа от 1 до 1000
        for(int i = 2; i <=1000; i++){
            if(primeTest(i)){
                System.out.println(i);
            }
            
        }
        // 3) Реализовать простой калькулятор
        
        System.out.println("Введите число 1: ");
        int p = vvod.nextInt();
        
        Scanner vvod2 = new Scanner(System.in);
        System.out.println("Введите операцию: ");
        String m = vvod2.nextLine();
        
        System.out.println("Введите число 2: ");
        int k = vvod.nextInt();
        vvod.close();
        vvod2.close();
        
        System.out.println("Результат равен:" + result(p, m, k));
              
        
    }

   
    private static int summa(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }

    private static boolean primeTest(int num) {
        boolean res = true;
        for (int i = 2; i < 1000; i++) {
            if (num >= i && num % i == 0 && i != num) {
                res = false;
                break;
            }
        }
        return res;
    }
   
    private static <str> int result(int p, String m, int k) {
        int res = 0;
        if(m.equals("+")){
            res = p+k;
        }
        if(m.equals( "-")){
            res = p-k;
        }
        if(m.equals("/")){
            res = p/k;
        }
        if(m.equals("*")){
            res = p*k;
        }

        return res;
    }

}
