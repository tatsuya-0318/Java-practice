class Sample1_06_1 {
	public static void main (String[] args) {
		
		//�Z�p���Z�q�̊��p
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		String stNumberX = "1";
		String stNumberY = "2";
		
		//�w + �x
		int answer1 = numberX + numberY ;
		System.out.println("answer1�F" + answer1);
		
		//�w - �x
		int answer2 = numberX - numberY ;
		System.out.println("answer2�F" + answer2);
		
		//�w * �x
		int answer3 = numberX * numberY ;
		System.out.println("answer3�F" + answer3);
		
		//�w / �x
		int answer4 = numberX / numberY ;
		System.out.println("answer4�F" + answer4);
		
		//�w / �x�i����؂�Ȃ��ꍇ�j
		int answer5 = numberX / numberZ ;
		System.out.println("answer5�F" + answer5);
		
		//�w % �x
		int answer6 = numberX % numberZ ;
		System.out.println("answer6�F" + answer6);
		
		// �������]
		int answer7 = -answer6 ;
		System.out.println("answer7�F" + answer7);
		
		//�w ��++ �x
		int answer8 = numberX++ ;
		System.out.println("answer8�F" + answer8);
		System.out.println("�i numberX�F" + numberX + " �j");
		
		//�w ++�� �x
		int answer9 = ++numberY ;
		System.out.println("answer9�F" + answer9);
		System.out.println("�i numberY�F" + numberY + " �j");
		
		//�w +1 �x�Ɓw ++ �x�̎g�������̒���
		int answer10 = numberZ + 1 ;
		System.out.println("answer10�F" + answer10);
		System.out.println("�i numberZ�F" + numberZ + " �j");
		
		//�w -- �x
		int answer11 = numberZ-- ;
		System.out.println("answer11�F" + answer11);
		System.out.println("�i numberZ�F" + numberZ + " �j");
		
		//�w + �x�i�����̌����j
		String answer12 = stNumberX + stNumberY ;
		System.out.println("answer12�F" + answer12);
		
	}
}
