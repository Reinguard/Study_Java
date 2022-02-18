public class One_Class {
    public static void main(String[] args) {
        int i = 23;    //присваивает значение 4 полям типа int
        int i1 = 9;
        int i2 = 7;
        int i3 = 1;

        int a = i + i1;   // суммирует попарно
        int b = i2 + i3;

        System.out.println(a);
        System.out.println(b);

        boolean c = a > b;
        System.out.println(c);  //выводит true, если первая сумма больше

        a += 1;
        System.out.println(a);  //увеличивает первую сумму на 1

        b -= 2;
        System.out.println(b);  //уменьшает вторую сумму на 2

        boolean d = a >= b;
        System.out.println(d); //выводит true, если первая сумма больше

        boolean x = a % 2 == 0;
        boolean y = b % 2 == 0;
        System.out.println(x);  // выводит true, если хотя бы одна сумма кратна 2
        System.out.println(y);


    }
}
