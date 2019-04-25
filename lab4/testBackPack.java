package lab4;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import org.junit.Test;

public class testBackPack {
	@Test
    public void testBackPack(){
		BackPack bac = new BackPack();
        int arr1[] = new int[10];    
        int arr2[] = new int[10];
        int arr3[] = new int[10];
        
        //最大容量为10
        int m = 10;
        int n = 3;
        /*
        放入的三个物体重量分别为3， 4， 5；价值分别为4， 5， 6
         */
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = bac.BackPack_Solution(m, n, w, p);
        for (int i = 1; i <=m; i++) {
            arr1[i-1]=c[1][i];
        }
        for (int i = 1; i <=m; i++) {
            arr2[i-1]=c[2][i];
        }
        for (int i = 1; i <=m; i++) {
            arr3[i-1]=c[3][i];
        }
        assertEquals("[0, 0, 4, 4, 4, 4, 4, 4, 4, 4]", Arrays.toString(arr1));
        assertEquals("[0, 0, 4, 5, 5, 5, 9, 9, 9, 9]", Arrays.toString(arr2));
        assertEquals("[0, 0, 4, 5, 6, 6, 9, 10, 11, 11]", Arrays.toString(arr3));
    }

}
