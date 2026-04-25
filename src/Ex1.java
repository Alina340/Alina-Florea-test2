public class Ex1 {

        public static void main(String[] args) {
            //din byte in short

            byte numberByte = 120;
            short numberShort = numberByte;

            System.out.println(numberByte);
            System.out.println(numberShort);
            System.out.println("------");

            //din int in double
            int numberInt = 300;
            double numberDouble = numberInt;

            System.out.println(numberInt);
            System.out.println(numberDouble);
            System.out.println("------");

            //din long in int
            long numberLong = 200;
            int numberInt2 = (int) numberLong;

            System.out.println(numberLong);
            System.out.println(numberInt2);
        }





}
