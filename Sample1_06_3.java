class Sample1_06_3 {
	public static void main (String[] args) {
		
		//�֌W���Z�q�̊��p
		
		int numberX = 8 ;
		int numberY = 8 ;
		int numberZ = 7 ;
		char chNumberX = '��';
		char chNumberY = '��';
		
		//�w == �x
		boolean logicalValue1 = numberX == numberY ;
		System.out.println("logicalValue1�F" + logicalValue1);
		
		//�w != �x
		boolean logicalValue2 = numberX != numberY ;
		System.out.println("logicalValue2�F" + logicalValue2);
		
		//�w > �x
		boolean logicalValue3 = numberX > numberZ ;
		System.out.println("logicalValue3�F" + logicalValue3);
		
		//�w >= �x
		boolean logicalValue4 = numberX >= numberY ;
		System.out.println("logicalValue4�F" + logicalValue4);
		
		//�w < �x
		boolean logicalValue5 = numberX < numberZ ;
		System.out.println("logicalValue5�F" + logicalValue5);
		
		//�w <= �x
		boolean logicalValue6 = numberX <= numberY ;
		System.out.println("logicalValue6�F" + logicalValue6);
		
		//�w == �x�i�֌W�㖼���͐��l�ȊO�ɂ��g�p�\�Fchar�^�j
		boolean logicalValue7 = chNumberX == chNumberY ;
		System.out.println("logicalValue7�F" + logicalValue7);
		
		//�w == �x�i�֌W�㖼���͐��l�ȊO�ɂ��g�p�\�Fboolean�^�j
		boolean logicalValue8 = logicalValue1 == logicalValue2 ;
		System.out.println("logicalValue8�F" + logicalValue8);
		
	}
}
