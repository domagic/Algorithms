package louis;

import java.util.Arrays;

public class BubbleSort
{
	/**
	 * 交换数组中的两个元素
	 *
	 * @param array       一维数组
	 * @param firstIndex  待交换的第一个元素下标
	 * @param secondIndex 待交换的第二个元素下标
	 */
	public static void swap(int[] array, int firstIndex, int secondIndex)
	{
		int buffer = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = buffer;
	}
	
	/**
	 * 冒泡排序
	 *
	 * @param array 待排序的数组，也作为排序后的数组
	 */
	public static void bubbleSort(int[] array)
	{
		for (int i = 0; i < array.length - 1; ++i)
		{
			for (int j = 0; j < array.length - 1 - i; ++j)
			{
				if (array[j] > array[j + 1])
				{
					swap(array, j, j + 1);
				}
			}
			System.out.println("第 " + (i + 1) + " 轮：" + Arrays.toString(array));
		}
	}
	
	/**
	 * 冒泡排序改进版
	 *
	 * @param array 待排序数组，也作为排序后的数组
	 */
	public static void bubbleSortAdvanced(int[] array)
	{
		boolean swapFlag = true;
		for (int i = 0; swapFlag && i < array.length - 1; ++i)
		{
			swapFlag = false;
			for (int j = 0; j < array.length - 1 - i; ++j)
			{
				if (array[j] > array[j + 1])
				{
					swap(array, j, j + 1);
					if (!swapFlag)
					{
						swapFlag = true;
					}
				}
			}
			System.out.println("第 " + (i + 1) + " 轮：" + Arrays.toString(array));
		}
	}
	
	/**
	 * main 函数，进行测试。
	 *
	 * @param args 系统输入的参数
	 */
	public static void main(String[] args)
	{
		int[] array = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
		bubbleSort(array);
		System.out.println("Bubble Sort 最终结果：" + Arrays.toString(array));
		
		array = new int[]{43, 32, 76, -98, 0, 64, 33, -21, 32, 99};
		bubbleSortAdvanced(array);
		System.out.println("Bubble Sort Advanced 最终结果：" + Arrays.toString(array));
	}
}