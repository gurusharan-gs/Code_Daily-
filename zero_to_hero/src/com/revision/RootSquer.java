package com.revision;

public class RootSquer {

	public static int squerRoot(int x) {
		int st = 0, end = x;
		int ans = -1;
		while (st <= end) {
			int mid = st + (end - st) / 2;
			long val = (long) mid * mid;
			if (val == x) {
				return mid;
			} else if (val < x) {
				ans = mid;
				st = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int x = 16;
		System.out.println(squerRoot(x));
	}

}
