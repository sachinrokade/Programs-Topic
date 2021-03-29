package ContentSphereTechnologies;

public class Intersection 
{
        public static void main(String s[])
        {
                int i = 0,j = 0;
                int a1[]={1,2,3,4};
                int a2[]={1,2,3};
                

                int n1=a1.length;
                int n2=a2.length;

        i=j=0;
        System.out.print("Intersection of Arrays: ");
        while(i<n1&&j<n2)
        {
            if(a1[i]<a2[j])
                i++;
            else
            {
                if(a2[j]<a1[i])
                   j++;
                else
                {
                    System.out.print(a2[i]+" ");
                    i++;
                    j++;
                }
            }
        }
    }
}