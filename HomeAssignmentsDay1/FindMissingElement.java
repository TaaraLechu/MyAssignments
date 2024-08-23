package HomeAssignments;

import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) 
	{
		
      int[] array={1, 4,3,2,8, 6, 7};
      Arrays.sort(array);
      System.out.println("The Sorted Array is "+Arrays.toString(array));
      for(int i=0;i<array.length;i++)
      {
    	  if(array[i+1] - array[i] !=1) {
				System.out.println(array[i]+1);
				break;	
			}
      }

}
}
