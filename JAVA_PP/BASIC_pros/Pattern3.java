class Pattern3{
public static void main(String[] args) {
    try{
        for (int i = 1; i<=5; i++) {
        for (int j = 1; j<=5; j++) {
            System.out.print(j);
        } System.out.println();
    }}catch(Exception e){
        System.out.println("Error occured"+e.getMessage());
    }
}
}
/*
12345
12345
12345
12345
12345
 */