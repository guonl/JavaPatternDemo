package com.guonl.distribution;

import java.util.Random;

/**
 * 如何实现按比例分配
 * 
 * @author guonl
 *
 */
public class Distribution {

	public static void main(String[] args) {

		// 定义App数组
		String[] sApps = new String[] {"A", "B", "C" };
		/*
		 * 定义分配比例数组，值为1～100间的整数 分配比例数组元素下标与App数组元素下标对应 数组中所有元素的值之和等于100
		 */
		int[] iRates = new int[] { 20, 30, 50 };

		// 定义随机数，随机数区间为[1,100]中的整数
		int rndNum = new Random().nextInt(100) + 1;
		int iStart = 1; // 区间起始位
		int iEnd = 0; // 区间结束位

		/*
		 * 将100分成App个数个连续区间 每个App分配比例对应一个区间 循环判断产生的随机数在哪个区间
		 */
		for (int i = 0; i < iRates.length; i++) {
			iEnd += iRates[i];

			if (iStart <= rndNum && rndNum <= iEnd) {
				System.out.println("Winner:" + sApps[i]);
				break;
			}

			iStart = iStart + iRates[i];
		}

	}

}
