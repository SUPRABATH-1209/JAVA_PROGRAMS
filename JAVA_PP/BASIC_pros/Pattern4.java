class Pattern4{
public static void main(String[] args) {
    try{
        for (int i = 5; i>=1; i--) {
        for (int j = 5; j>=1; j--) {
            System.out.print(i);
        } System.out.println();
    }}catch(Exception e){
        System.out.println("Error occured"+e.getMessage());
    }
}
}
/*
55555
44444
33333
22222
11111
 */