package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class List_04 {

	public static void main(String[] args) {

		Random rnd = new Random();
		Scanner scan = new Scanner(System.in);
		List<Integer> intList = new LinkedList<Integer>();

		for (int i = 0; i < 50; i++) {
			int intR = rnd.nextInt(50);
			intList.add(intR);

		}
		// 키보드에서 임의 숫자를 입력받고
		// 그 숫자가 intList에 몇번에 포함되어있는지 찾아보기

		System.out.print("숫자입력(0~49)");
		String strNum = scan.nextLine();

		int intNum = Integer.valueOf(strNum);
//		int intLen = intList.size();
//		for (int i = 0; i < intLen; i++) {
//			if (intNum == intList.get(i)) {
//				System.out.println(i + "번째에 있습니다");
//				break;
//			}//else {
//				//System.out.println("숫자가 없습니다");
//			//}

		int listSize = intList.size();
		for (int i = 0; i < listSize; i++) {
			if (intList.get(i) == intNum) {
				System.out.println(i + "번째에 있음");
			}
		}
		
		int index = 0;
		listSize = intList.size();

		for (Integer in : intList) {
			index++;
			if (in == intNum) {
				System.out.println(index + "번쨰에 있음");
				break; // 찾았다면 중단
			}
		}
		// 못찾았다면 index 값은 listSize보다 크다.
		if (index > listSize) {
			System.out.println("값을 찾지 못함");
		}

	}

}
