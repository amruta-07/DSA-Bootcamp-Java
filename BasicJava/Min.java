package JavaBasic;

import java.util.Scanner;

public class Min {
    public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
		int a = s.nextInt();
		arr[i] = a;
		
	}
	int min = arr[0];
	for(int i=1;i<n;i++) {
		if(arr[i]<min) {
			min = arr[i];
		}
	}
	System.out.println("Min array element is"+ min);

}
