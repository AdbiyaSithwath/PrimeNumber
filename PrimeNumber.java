public class PrimeNumber{ 
public static void main(String[] args){
int i,a=0,flag=0; 
int b=3; 
a=b/2;
if(b==0||b==1){
System.out.println(b+" is not a prime number");
} 
else{ 
for(i=2;i<=a;i++){ 
if(b%i==0){ 
System.out.println(b+" is not a prime number");
flag=1;
break;
} 
}
If(flag==0){ 
System.out.println(b+" is a prime number");
}
}
}
}
