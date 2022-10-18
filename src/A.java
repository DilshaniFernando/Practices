class A {
    String X;
    A(){
        X = "Dilshani";
        //class eke inna string valin thiyena "X" variable eka apita constructor eka athule access karanna puluwan
    }

    public static void main(String[] args) {
        A a = new A();
        //Me api hada gaththa object eken constructor eka call wenawa
        System.out.println("User is "+a.X);
        //object eken constructor eke thiyena dewal call karagannawa
    }
}
