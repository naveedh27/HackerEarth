package edu.atlizon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GridAltizon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String t[] = br.readLine().split(" ");

		int N = Integer.parseInt(t[0]);
		int K = Integer.parseInt(t[1]);
		int Array[][] = new int[N][N];
		int SubArray[][] = new int[N][N];
		int total = 0, count = 0;
		int i,j,z = 0;

		for (i = 0; i < N; i++) {
			String inp[] = br.readLine().split(" ");
			for (j = 0; j < N; j++) {
				Array[i][j] = Integer.parseInt(inp[j]);
			}
		}

		for (j = 0; j < N; j++) {

			for ( i = 0; i < N - K + 1; i++) {
				total = 0;
				for ( z = i; z < i + K; z++) {
					total += Array[z][j];
				}
				SubArray[i][j] = total;
			}

		}
		
	
			for ( i = 0; i < N - K + 1; i++) {
				for (j = 0; j < N -K+ 1; j++) {
					total = 0;
					for ( z = j; z < j + K ; z++) {
						total += SubArray[i][z];
					}
					int val = (int) Math.round(Math.pow(total, 1.0 / 3.0));
					if (val * val * val == total)
						count++;
				}
			}
		

		System.out.println(count);

		/*
		 * for(int i = 0; i < N; i++){ for(int j = 0; j<N; j++){
		 * System.out.print(SubArray[i][j]+" "); } System.out.println(); }
		 */

	}

}
