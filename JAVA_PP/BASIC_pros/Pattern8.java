class Pattern8{
public static void main(String[] args) {
    int n=2;
    try{
        for (int i = 0; i<5; i++) {
        for (int j = 0; j<5; j++) {
            System.out.print(n+"\t");
            n=n+2;
        } System.out.println();
    }}catch(Exception e){
        System.out.println("Error occured"+e.getMessage());
    }
}
}
/*
2       4       6       8       10
12      14      16      18      20
22      24      26      28      30
32      34      36      38      40
42      44      46      48      50
 */