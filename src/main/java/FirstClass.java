public class FirstClass {
    public static void main(String[] args) {

        System.out.printf("~~~%d~~~\n",SecondClass.i);


        SecondClass secondClassInstance = new SecondClass();

        System.out.println(secondClassInstance.returnString("---%d---"));
    }

}






