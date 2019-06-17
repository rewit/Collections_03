package com.biz.coll.list;

import java.util.LinkedList;
import java.util.List;

public class List_02 {

	public static void main(String[] args) {
		//중간중간 데이터를 삭제, 추가가 자주 일어날 것 같다
		//ArrayList보다 LinkedList를 사용하는것이 좋다
		
		//ArrayList<String>();
		//List 인터페이스를 사용해서
		//객체를 선언해주면
		//필요에 따라서 클래스를 바꿀때
		//코드 변경이 거의 일어나지 않는다.
		List<String> strList = new LinkedList<String>();
		
		//List에 데이터를 추가
		strList.add("홍길동"); //0~4
		strList.add("성춘향");
		strList.add("이몽룡");
		strList.add("임꺽정");
		strList.add("장녹수");
		
		//List 를 확인하고자 할 때
		for(String s : strList) {
			System.out.println(s);
		}
		
		//중간에 포함된 List를 변경하고자 할 때
		strList.set(3,"장보고");
		
		System.out.println("====================================");
		
		//0부터 시작하기때문에 3번 자리에 있는 임꺽정을 장보고로 변경
		for(String s : strList) {
			System.out.println(s.toString()); //원칙적으론 .toString을 호출해야하나 내부에서 toString을 호출하도록 만들어줘서 안써도 같은 구조
		}
		System.out.println("====================================");
		//중간에 포함된 List를 삭제하고자 할 때
		
		strList.remove(2); //2번 위치의 List를 제거
		for(String s : strList) {
			System.out.println(s.toString());
		}
		System.out.println("====================================");
		
		//중간에 List를 삭제하면
		//자동으로 전체 크기가 1만큼 감소

		//List 중간에 한개의 값을 읽어서 변수에 담기
		String strName = strList.get(2);
		System.out.println(strName);
		
		//특정한 위치를 지정해서 데이터를 추가하고자 할 때
		strList.add(2, "장영실");
		System.out.println("====================================");
		for(String s : strList) {
			System.out.println(s.toString());
		}
		
	}

}
