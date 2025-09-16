package Grandhi_Nithin;

import java.util.HashMap;

public class Problem_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,8,9,12,46,76,82,15,20,30};
		HashMap<Integer, Integer>map = new HashMap<>();
		for(int i=1; i<=9; i++) {
		    int count = 0;
		    for(int j=0; j<arr.length; j++) {
		    	if(arr[j]%i == 0) {
		    		count++;
		    	}
		    }
		    map.put(i, count);
		}
		System.out.println(map);
	}

}
