//correct and accepted
import java.util.Scanner; 



public class d{
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);

		int n=input.nextInt();

		String line1="";

		for(int i=1;i<=n;i++){
			line1+=i+"0";
		}
		for(int i=n*n+1;i<n*n+1+n;i++){
			line1+=i+"0";
		}

		System.out.println(line1.substring(0,line1.length()-1));

		
		int front=n+1,back=n*n;

		for(int i=n-1;i>0;i--){
			String line2="";

			for(int j=0;j<n-i;j++){
				line2+="**";
			}

			for(int j=0;j<i;j++){
				line2+=front+"0";
				front++;				
			}

			String temp="";
			for(int j=0;j<i;j++){
				temp=back+"0"+temp;
				back--;				
			}

			line2+=temp;

			System.out.println(line2.substring(0,line2.length()-1));

		}

		

	}




}





