public class Winner {
    
    public static void main(String[] args) {
        
        System.out.println("Lets start the game");
        int[] arr = {1,5,250,233};
        boolean[] isfiiled = new boolean[arr.length];
        int count=0;
        System.out.println("Values to choose from");

        
        for(int i=0;i<arr.length;i++){
            
            if(!isfiiled[i])
            System.out.print(arr[i]+" ");
        }
        int a_score=0;
        int b_score=0;
        System.out.println();
        System.out.println("A turn ");

        System.out.println("After round  = "+(count+1));
        if(arr[0]>arr[arr.length-1])
        {
            a_score+=arr[0];
            count++;
            isfiiled[0]=true;
            System.out.println("A chose  "+arr[0]);
        }
        else{
            a_score+=arr[arr.length-1];
            count++;
            isfiiled[arr.length-1]=true;
            System.out.println("A chose  "+arr[arr.length-1]);
        }
        
        System.out.println("A score = "+a_score);
        System.out.println("B score = "+b_score);
       
        while(count<arr.length){
           
            
            int v = getMax(arr,isfiiled);
         //   System.out.println("Max value is "+v);
         System.out.println("Values to choose from");
        for(int i=0;i<arr.length;i++){
            
            if(!isfiiled[i])
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        
            if(v != -1 ){
            if(count%2==0)
            {
            System.out.println("A turn ");
            System.out.println("A chose  "+arr[v]);
            a_score += arr[v];
            }
            else{
            b_score += arr[v];
            System.out.println("B turn ");
            System.out.println("B chose  "+arr[v]);
            }

            isfiiled[v]=true;



            
            
        }
        System.out.println("After round  = "+(count+1));
        count++;
        System.out.println("A score = "+a_score);
        
        System.out.println("B score = "+b_score);
    }
 
if(a_score>b_score)
 System.out.println("A is the winner ");
 else
 System.out.println("B is the winner ");

    }

    private static int getMax(int[] arr, boolean[] isfiiled) {

        int max_id =-1;
        int max_v=0;

        for(int i=0;i<arr.length;i++){

            if(!isfiiled[i] && arr[i]>max_v )
            {
                max_v=arr[i];
                max_id=i;
            }
        //    System.out.println("Max value "+max_v+" max id = "+max_id);

        }
        return max_id;
    }
}
