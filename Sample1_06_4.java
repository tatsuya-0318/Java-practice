class Sample1_06_4 {
	public static void main (String[] args) {
		
		//�_�����Z�q�̊��p
		
		int numberX = 8 ;
		int numberY = 4 ;
		int numberZ = 5 ;
		
		//�w && �x
		boolean logicalValue1 = numberX != numberY && numberY > numberZ ;
		System.out.println("logicalValue1�F" + logicalValue1);
		
		//�w || �x
		boolean logicalValue2 = numberX != numberY || numberY > numberZ ;
		System.out.println("logicalValue2�F" + logicalValue2);
		
		//�w ^ �x
		boolean logicalValue3 = numberX != numberY ^ numberY > numberZ ;
		System.out.println("logicalValue3�F" + logicalValue3);
		
		// ���]
		boolean logicalValue4 = !logicalValue3 ;
		System.out.println("logicalValue4�F" + logicalValue4);
		
	}
}
