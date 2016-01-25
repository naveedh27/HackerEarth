package edu.betsol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BetsolAS {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		BufferedReader brReader = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(brReader.readLine());
		
		int i=0;
		int fnArr[] = new int[N];
		String fn = brReader.readLine();
		for (String temStr : fn.split(" "))
			fnArr[i++] = Integer.parseInt(temStr);
		 
		int x = fnArr[0],z=0;
		
		System.out.print(x+" ");
		for(i=1;i<N;i++){
			z = (fnArr[i]*(i+1)) - x;
			System.out.print(z+" ");
			x += z;
		}
		
		
	}

}
