import java.util.*;
public class Disarium {
    int n; int count=0; int z=1;int sum=0; int cout;int temp;int temp2;
    public void input(){

        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        temp=n;
        temp2=n;
    }
public void counting() {
    
while(n!=0){
    int r=n%10;
    count++;
    n=n/10;
}


for(int i=count;i>=1;i--){
    int r =temp%10;
    z=1;
    cout=count;
    while(cout!=0){
        z=z*r;
        cout--;

    }
   count--;
   System.out.println(z);
    sum=sum+z;
    temp=temp/10;
}
    System.out.println("th value of sum is = "+sum);
    if (sum==temp2 ){
        System.out.println("disarium");
        
    }
    else{
        System.out.println("not diasirium");
    }
    System.out.println(temp2);

}
public static void main(String[] args) {
    Disarium obj =new Disarium();
    obj.input();
    obj.counting();
}
    
}
