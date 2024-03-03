package com.gl.floor;

import java.util.PriorityQueue;

public class Floor {

	private PriorityQueue<Integer> size = null;

	public Floor() {
		size = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
	}

	public void construct(int requiredFloorSize, int[] floorSizes) {
		System.out.println("The order of construction is as follows :");
		for (int i = 0; i < floorSizes.length; i++) {
			int day = i + 1;
			System.out.println("Day: " + day);
			if (floorSizes[i] != requiredFloorSize) {
				System.out.println();
				size.offer(floorSizes[i]);
			} else {
				System.out.println(floorSizes[i] + " ");
				while (!size.isEmpty() && requiredFloorSize == size.peek()) {
					System.out.println(size.poll() + " ");
					requiredFloorSize -= 1;
				}
			}
		}
	}
}