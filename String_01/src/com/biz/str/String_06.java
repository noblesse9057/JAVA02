package com.biz.str;

public class String_06 {

	public static void main(String[] args) {

		String strNation = "Republic of Korea";
		String[] s1 = strNation.split("");

		// s1�� ���� ���ڿ��� ��� �ִ� �迭�̴�.
		// �� s1 ���ڿ� �迭���� ������ o��
		// ���ʷ� ���°���� ��Ÿ���� ã�� ���ô�.

		for (int i = 0; i < s1.length; i++) {
			//if (s1[i] == "o") {
			if(s1[i].equals("o")) {
				System.out.println(i + "��°���� ã��");
				break;
			}

		}

		/*
		 * ���ڿ��� ==�� ����ؼ� �񱳸� �Ұ��
		 * ���ڿ� ������ ����� ���� ���� ������ �ʰ�
		 * ���� ���ڿ��� ����� �ּҸ� ���� �񱳸� �Ѵ�.
		 * 
		 * ���� ���ڿ� ������ ����� ���� � ���ڿ��� ���ϰ��� �Ҷ���
		 * == ��ſ� equals() �޼��带 ����ؾ� �Ѵ�.
		 */
	}

}