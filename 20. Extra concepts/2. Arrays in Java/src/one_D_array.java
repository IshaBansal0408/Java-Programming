public class one_D_array {
    public static void main(String args[]){
        int a[]=new int[5];
        a[0]=100;
        a[1]=200;
        a[2]=300;
        a[3]=400;
        a[4]=500;
        System.out.print("First array is: ");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
        int a1[]={33,38,44,59};
        System.out.print("\nSecond array is: ");
        for(int i=0;i<a1.length;i++)
            System.out.print(a1[i]+" ");
    }
}
