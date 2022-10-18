class MethodOverloading {
    void display(int a, double b){
        System.out.println("Method 1");
    }
    void display(int a, double b, double c){
        System.out.println("Method 2");
    }
    public static void main(String[] args) {
        MethodOverloading  dp1 = new MethodOverloading ();
        dp1.display(12,45.236);
        dp1.display(5, 45.32, 8.23695);

    }
}
