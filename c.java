
// was not accepted but working on my compiler
import java.util.*;
import java.math.*;


public class c{
    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);

        int nn=input.nextInt();

        while(nn-->0){

            long n=input.nextLong();
            //to 
            // long time1=System.currentTimeMillis();

            List <Long> list=new ArrayList<>();

            for(long num=1;num<=Math.sqrt(n);num++){
                if(n%num==0){
                    if(n/num==num)
                        list.add(num);
                    else 
                    {
                        list.add(num);
                        list.add(n/num);
                    }
                }
            }

            Collections.sort(list);


            Iterator<Long> itr = list.iterator();
            while (itr.hasNext()) {
                System.out.print(itr.next()+" ");
            }

            // long time2=System.currentTimeMillis();
            //double totalTimetaken=(time2-time1)/1000.0;

            System.out.println();
        }

    }





}




/*
import java.util.*;
import java.math.*;


public class c{
	public static void main(String[] args) {

		Scanner input=new Scanner (System.in);

		int nn=input.nextInt();

		while(nn-->0){

			long n=input.nextLong();
			
			long time1=System.currentTimeMillis();

			List <Long> listLeft=new ArrayList<>();
			List <Long> listRight=new ArrayList<>();

			long maxLimit=(long)Math.sqrt(n);
			for(long num=1;num<=maxLimit;num++){
				if(n%num==0){
					
					if(n/num==num)
						listLeft.add(num);
					else 
					{
						listLeft.add(num);
						listRight.add(n/num);
					}
				}
			}

			// Collections.sort(list);


			Iterator<Long> itr = listLeft.iterator();
			while (itr.hasNext()) {
				System.out.print(itr.next()+" ");
			}

			for(int i=listRight.size()-1;i>=0;i--){
				System.out.print(listRight.get(i)+" ");
			}
			
			long time2=System.currentTimeMillis();
			// double totalTimetaken=(time2-time1)/1000.0;

			System.out.println("\n"+(time2-time1)/1000.0);
		}

	}

	



}





*/