class B {
    String numbers;
    B(String value){
        //constructor eke parameter eka object eke arguments ekata gelapenna hadanna oni
        numbers = value;
        //numbers & values dennama string nisa assign karanna puluwan
        System.out.println("Number is "+numbers);
        //numbers = value nisa parameter eke value variable eka call una, ekanisa object eke value eka print wenawa
    }

    public static void main(String[] args) {
        B num = new B("1");
        //object eke parameter ekata gelapena type ekka arguments value ekak danna oni
    }
}
