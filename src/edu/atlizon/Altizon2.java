package edu.atlizon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Altizon2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp[] = br.readLine().split(" ");
		int N = Integer.parseInt(temp[0]);
		int K = Integer.parseInt(temp[1]);
		int a[][] = new int[N][N];
		int suba[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			String s[] = br.readLine().split(" ");
			for (int j = 0; j < N; j++)
				a[i][j] = Integer.parseInt(s[j]);
		}

		for (int j = 0; j < N; j++) {
			int total = 0;
			// First sum row
			for (int i = 0; i < K; i++) {
				total += a[i][j];
			}
			suba[0][j] = total;
			// All rows
			for (int i = 1; i < N - K + 1; i++) {
				total += (a[i + K - 1][j] - a[i - 1][j]);
				suba[i][j] = total;
			}
		}
		/*
		 * for(int i=0;i<N;i++){ System.out.println(); for(int j=0;j<N;j++)
		 * System.out.print(suba[i][j]+" "); }
		 */
		int count = 0;
		for (int i = 0; i < N - K + 1; i++) {
			for (int j = 0; j < N; j++) {
				int total = 0;
				int x = 0;
				for (int k = j; k < N && x < K; k++) {
					total += suba[i][k];
					x++;
				}
				int val = (int) Math.round(Math.pow(total, 1.0 / 3.0));
				if (val * val * val == total)
					count++;
			}
		}
		System.out.println(count);
	}
}