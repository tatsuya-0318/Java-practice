class Sample1_06_2 {
	public static void main (String[] args) {
		
		//������Z�q�̊��p
		
		//�w += �x
		int number0 = 10 ;
		number0 += 3 ;
		System.out.println("number0�F" + number0);
		
		//�w �ϐ�x += 3 �x�́w �ϐ�x = �ϐ�x + 3 �x�Ɠ����Ӗ�
		int number1 = 10 ;
		number1 = number1 + 3 ;
		System.out.println("number1�F" + number1 + " ��number0�Ɠ����l�ɂȂ�");
		
		//�w -= �x
		int number2 = 10 ;
		number2 -= 3 ;
		System.out.println("number2�F" + number2);
		
		//�w *= �x
		int number3 = 10 ;
		number3 *= 3 ;
		System.out.println("number3�F" + number3);
		
		//�w /= �x�i����؂�Ȃ��ꍇ�j
		int number4 = 10 ;
		number4 /= 3 ;
		System.out.println("number4�F" + number4);
		
		//�w %= �x
		int number5 = 10 ;
		number5 %= 3 ;
		System.out.println("number5�F" + number5);
		
		//�w += �x�i�����̌����j
		String stNumber6 = "10" ;
		stNumber6 += "3" ;
		System.out.println("stNumber6�F" + stNumber6);
		
	}
}
