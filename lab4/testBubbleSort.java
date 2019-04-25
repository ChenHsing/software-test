package lab4;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class testBubbleSort {
	@Test
    public void testBubbleSort(){
		BubbleSort bub = new BubbleSort();
        int arr1[] = new int[]{1,6,2,2,5};    
        BubbleSort.BubbleSort(arr1);
        int arr2[] = new int[]{1,2,3,4,5};   
        BubbleSort.BubbleSort(arr2);
        int arr3[] = new int[]{5,4,3,2,1};  
        BubbleSort.BubbleSort(arr3);
        int arr4[] = new int[]{1,1,1,1,1}; 
        assertEquals("[1, 2, 2, 5, 6]", Arrays.toString(arr1));
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(arr2));
        assertEquals("[1, 2, 3, 4, 5]", Arrays.toString(arr3));
        assertEquals("[1, 1, 1, 1, 1]", Arrays.toString(arr4));
    }

}
