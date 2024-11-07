class Pattern6{
public static void main(String[] args) {
    int n=1;
    try{
        for (int i = 1; i<=5; i++) {
        for (int j = 1; j<=5; j++) {
            System.out.print(n+"\t");
            n++;
        } System.out.println();
    }}catch(Exception e){
        System.out.println("Error occured"+e.getMessage());
    }
}
}
/*
1       2       3       4       5
6       7       8       9       10
11      12      13      14      15
16      17      18      19      20
21      22      23      24      25
 */