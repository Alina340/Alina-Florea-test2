public class Ex6 {
    public static void main(String[] args) {

        String s = "Ana are mere si merele sunt coapte";

        //aflati prima aparitie a literei m si ultima

        System.out.println(s);
        System.out.println("Prima aparitie a lui m = " + s.indexOf('m'));
        System.out.println("Ultima aparitie a lui m = " + s.lastIndexOf('m'));

    }
}
