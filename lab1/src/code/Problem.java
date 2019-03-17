package code;
import java.util.ArrayList;
public class Problem {
	 
	public boolean isTrue(int x) {
		int fifty = 1;
		int twenty =1;
		int five =2;
		int one = 3;
		ArrayList<Integer> all = new ArrayList<Integer>();
		int temp = 0;
		//循环穷举出所有可能
		for(int i = 0; i <=fifty;i++) {
			for(int j =0; j<=twenty;j++) {
				for(int m =0; m <=five; m++) {
					for(int n =0; n <=one ;n++) {
						temp = i*50+j*20+m*5+ n*1;
						all.add(temp);
					}
				}
			}
		}

		//循环遍历判断该数是否在所有的可能结果中
		for(int i =0;i<all.size();i++) {
			if(x== all.get(i)) {
				return true;
			}
		}
		return false;
		
	}
}
