class MethodOverloading1 {
    static void b(int x){
        System.out.println("Arguments = "+ x);
    }
    static void b(int y, int z){
        System.out.println("Arguments = " + y + " & " + z);
    }

    public static void main(String[] args) {
        b(3,5);
        b(2);
    }
}
