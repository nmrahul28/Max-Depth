package com.maxdepth;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxdepthTest {

	@Test
	void test() {
		Maxdepth max_depth=new Maxdepth();
		int tri[][] = { {3, 0, 0,0}, 
                {7, 4, 0,0}, 
                {2, 4, 6,0},
                {8,5,9,3}}; 
		int output=max_depth.findMaxDdepth(tri, tri[0].length-1);
		assertEquals(23,output);
	}

}
