/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sidhhi
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Scanner;
 
class Sort_Array
{
 
	Scanner scan;
	//int[] num;
	int n=6;
	int[] num={10,20,35,45,50,60,70,80,90,100};
        int max=num[0];
        int[] sort=new int[num.length];
        
        public void getVal2() 
        {
            System.out.println(" getVal2() ");
            max=num[0];
            int j=0;
             this.sortIndexASC(num);
                for(int i=0; i<num.length-1; i=i+2)
                {
                    //max=num[i+1];
                    //this.sortIndexASC(num);
                    System.out.println(" "+sort[i]);
                 }
        }
	public void getVal1() 
        {
		
            System.out.println(" getVal1() ");
		for(int i=0; i<num.length-1; i++)
                {
			
			//num[i] = Integer.parseInt(scan.nextLine());
		}
                max=num[0];
                for(int i=0; i<num.length-1; i=i+2)
                {
			
			//if(this.sortDSC(num[i])>this.sortASC(num[i]))
                           System.out.println(i+" "+this.sortDSC(num[i])+" "+this.sortASC(num[i+1]));
// System.out.println(" "+num[i+1]);
                       //else
                         // System.out.print(" "+num[i]);
		}
		
	}
        public void printIndex() 
        {
                //Arrays.sort(num);
            
            System.out.println(" printIndex()  ");
                        sortIndexDSC(num); 
                        sortIndexASC(num); 
                  int j=num[0];      
                for(int i=0; i<num.length-1;i=i+2) 
                {
			 
                        
                        //sort[i]=this.sortIndexASC(num);
                        //sort[i+1]=this.sortIndexDSC(num);
			System.out.println(" "+num[i+1]+" "+num[i]);
                        
		}
            
        }
        public int sortASC(int num) 
        {
                //Arrays.sort(num);
                max=num;
		for(int i=0; i<max; i++) 
                {
			
			return(num);
		}
            return 0;
        }
        public int  sortDSC(int num) 
        {
            for(int i=n; i>=0; i--)
            {
			return(num);
            }
            return 0;
	}
        public void sortIndexASC(int num[]) 
        {
                //Arrays.sort(num);
               max=num[0];
		for(int i=num.length-1; i>num[i]; i--) 
                {
			
			sort[i]=num[i];
                        System.out.println(" "+sort[i]);
		}
                
           // return 0;
        }
        public void  sortIndexDSC(int num[]) 
        {
            int j=0;
            max=num[0];
		
            for(int i=n-1; num[i]>=max; i--)
            {
			System.out.println(i+" "+num[i]+" "+num[i-1]);
                        
            }
            
           // return 0;
            
	}
		
        public static void main(String args[])
        {
		
		Sort_Array obj = new Sort_Array();
		//obj.getVal1();
		obj.getVal2();
                //obj.getVal3();
               
                
                //obj.printIndex();
        }
}
