package com.maxdepth;

public class Maxdepth {
	public int findMaxDdepth(int array[][],int lenght) {
		for(int row=lenght-1; row>=0;row--) {
			for(int col=0;col<=row;col++) {
				if(array[row+1][col+1]>array[row+1][col]) {
					array[row][col]=array[row][col]+array[row+1][col+1];
				}
				else {
					array[row][col]=array[row][col]+array[row+1][col];
				}
			}
		}
	return array[0][0];
	}
}
