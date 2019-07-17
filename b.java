//correct on my compiler but was not accepted
import java.util.*;

public class b{

public static void main(String[] args) {
	Scanner input=new Scanner(System.in);

	int n=input.nextInt();

	if(n>3999){
		System.out.println(n);
		return;
	}

	
	System.out.println(ans(n));
}

static int ans(int n){
	if(n>3999){
		return n;
	}
	String roman=roman(n);
	char max='A';
	for(int i=0;i<roman.length();i++){
		if(roman.charAt(i)>max)
			max=roman.charAt(i);
	}

	int base=max-64+10;

	int nn=0;
	for(int i=0;i<roman.length();i++){
		nn+=((int)Math.pow(base,i))* ((int)roman.charAt(roman.length()-1-i)+9-64);
	}
	nn=ans(nn);
	return nn;
}


static String roman(int num)  
    {  
        
        String m[] = {"","M","MM","MMM"};

        String c[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"}; 
        String x[] = {"", "X", "XX", "XXX", "XL", "L","LX", "LXX", "LXXX", "XC"}; 
        String i[] = {"", "I", "II", "III", "IV", "V","VI", "VII", "VIII", "IX"}; 
              
        String thousand = m[num/1000]; 
        String hundered = c[(num%1000)/100]; 
        String ten = x[(num%100)/10]; 
        String one = i[num%10]; 
              
        String temp = thousand + hundered + ten + one; 
              
        return temp; 
    } 

    }