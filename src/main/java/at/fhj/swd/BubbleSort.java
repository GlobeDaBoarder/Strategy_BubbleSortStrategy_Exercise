package at.fhj.swd;

public class BubbleSort implements Sorter {
	@Override
	public int[] sort(int... data)
	{
		int len = data.length;
		int tmp = 0;
		for (int i = 0; i < len; i++)
		{
			for (int j = (len - 1); j >= (i + 1); j--)
			{
				if (data[j] < data[j - 1])
				{
					tmp = data[j];
					data[j] = data[j - 1];
					data[j - 1] = tmp;
				}
			}
		}
		return data;
	}
}
