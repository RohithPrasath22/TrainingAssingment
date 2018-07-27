package com.del;

public class UserMainCode {

	public static boolean checkTriplets(int arr[]) {
		int len=arr.length;
		for(int i=0;i<(len-2);i++)
		{
			if(arr[i]==arr[i+1]&&arr[i]==arr[i+2])
			{
				return true;
			}
		}
		return false;
	}

}