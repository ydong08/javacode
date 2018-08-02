public class Tools
{
	public int max(int[] arr) {
		int len = arr.length;
		int tmp = 0;
		for (int i = 0; i < len; ++i)
		{
			if (tmp < arr[i])
				tmp = arr[i];
		}
		return tmp;
	}
};
