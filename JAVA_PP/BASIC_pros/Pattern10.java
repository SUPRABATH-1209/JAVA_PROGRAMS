class Pattern10{
public static void main(String[] args) {

    try{
        for (int i = 1; i<=5; i++) {
        for (int j = 1; j<=3; j++) {
            System.out.print(j+" "+i+" ");
        } System.out.println();
    }}catch(Exception e){
        System.out.println("Error occured"+e.getMessage());
    }
}
}
/*
1 1 2 1 3 1
1 2 2 2 3 2
1 3 2 3 3 3
1 4 2 4 3 4
1 5 2 5 3 5
 */