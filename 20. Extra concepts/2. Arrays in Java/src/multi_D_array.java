public class multi_D_array {
    public static void main(String args[]){
        System.out.println("ARRAY ONE");
        int a[][]=new int[2][3];
        a[0][0]=34;
        a[0][1]=44;
        a[0][2]=54;
        a[1][0]=32;
        a[1][1]=78;
        a[1][2]=89;
        System.out.println("No of rows: "+a.length);
        System.out.println("No of columns: "+a[1].length);
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nARRAY TWO");
        int arr[][]={{1,2,3,7},{2,4,5,4},{4,6,4,5}};
        System.out.println("No of rows: "+arr.length);
        System.out.println("No of columns: "+arr[1].length);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
