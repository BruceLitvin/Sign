public class Main {
   public static void main(String[] args) {
       String str;
       int x;  //many many test cases
        Sign sign1= new Sign("ABC222DE",3);
        x = sign1.numberOFLines();
       System.out.println(x);
       str=sign1.getLines();
       System.out.println(str);
        str = sign1.getLines();
       System.out.println(str);
       Sign sign2= new Sign("ABCD",10);
       x = sign2.numberOFLines();
       System.out.println(x);
       str = sign2.getLines();
       System.out.println(str);
       Sign sign3 = new Sign("ABCDEF",6);
       x=sign3.numberOFLines();
       System.out.println(x);
       str=sign3.getLines();
       System.out.println(str);
       Sign sign4 = new Sign("",4);
       x=sign4.numberOFLines();
       System.out.println(x);
       str=sign4.getLines();
       System.out.println(str);
       Sign sign5 = new Sign("AB_CD_EF",2);
       x=sign5.numberOFLines();
       System.out.println(x);
       str=sign5.getLines();
       System.out.println(str);
    }
}