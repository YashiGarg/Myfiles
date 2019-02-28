package com.cg.trainer.util;

import java.util.Random;

public class CollectionUtil {

	public static double getId() {
		Random random=new Random();
		return random.nextInt(999)+100;
	}
}
