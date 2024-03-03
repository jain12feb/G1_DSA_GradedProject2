package com.gl.driver;

import java.util.Scanner;

import com.gl.floor.Floor;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The total number of floors in the building");
		int noOfFloors = sc.nextInt();

		int[] floorSize = new int[noOfFloors];

		for (int i = 0; i < floorSize.length; i++) {
			System.out.println("Enter the floor size given on day : " + (i + 1));
			int size = sc.nextInt();
			if (size <= 0) {
				System.out.println("Floor size cannot be less than or equal to zero");
				i--;
			}
			else if (size > noOfFloors) {
				System.out.println("Floor size cannot be greater than totalfloor");
				i--;
			} else {
				floorSize[i] = size;
			}
		}
		
		sc.close();
		
		Floor floor = new Floor();
		floor.construct(noOfFloors, floorSize);

	}

}
