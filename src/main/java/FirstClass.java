public class FirstClass {
    public static void main(String[] args) {
        System.out.println("~~~" + SecondClass.i + "~~~");

        SecondClass secondClassInstance = new SecondClass();
        System.out.println(secondClassInstance.returnString("---<i>---"));

    }

}






