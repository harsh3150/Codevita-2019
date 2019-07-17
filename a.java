//correct and accepted
import java.util.Scanner;


public class a{
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);

		int n=input.nextInt();

		int diamHoles[]=new int[n];
		int diamHolesTrack[]=new int[n];

		for(int i=0;i<n;i++)
			diamHoles[i]=input.nextInt();

		int m=input.nextInt();

		int diamBalls[]=new int[m];

		for(int i=0;i<m;i++)
			diamBalls[i]=input.nextInt();

		int ballPosition[]=new int[m];



		for(int i=0;i<m;i++){

			for(int j=n-1;j>=0;j--){
				if(diamHolesTrack[j]<j+1  &&  diamHoles[j]>=diamBalls[i]){
					ballPosition[i]=j+1;
					diamHolesTrack[j]++;
					break;
				}
			}
		}

		for(int i=0;i<m;i++)
			System.out.print(ballPosition[i]+" ");
		System.out.println();





	}




}





