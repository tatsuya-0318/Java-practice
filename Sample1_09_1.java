class Sample1_09_1 {
	public static void main (String[] args) {
		
		
		
		int[][] rooms = {{101, 102, 103}, {201, 202, 203}, {301, 302, 303}} ;
		
		System.out.println("rooms:" + rooms );

		String  name   = "moco" ;
		
		boolean check1 = name == args[0] ;
		
		System.out.println("check1:" + check1 );
		
		boolean check2 = name.equals( args[0] ) ;
		
		System.out.println("check2:" + check2 );

		String  nameOfficial1 = new String("moco") ;  
		String  nameOfficial2 = new String("moco") ;  
		String  nameGizi1   = "moco" ;                
		String  nameGizi2   = "moco" ;                
		
		boolean check3 = nameOfficial1 == nameOfficial2 ;
		System.out.println("check3:" + check3 );
		
		boolean check4 = nameGizi1 == nameOfficial1 ;
		System.out.println("check4:" + check4 );
		
		boolean check5 = nameGizi1 == nameGizi2 ;
		System.out.println("check5:" + check5 );
		
		
	}
}
