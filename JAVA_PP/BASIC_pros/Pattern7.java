class Pattern7{
public static void main(String[] args) {
    int n=1;
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
1       3       5       7       9
11      13      15      17      19
21      23      25      27      29
31      33      35      37      39
41      43      45      47      49
 */