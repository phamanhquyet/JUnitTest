package jUnitTest;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class PhepTinhTest {
	@Test
	public void Tong_1() {
		PhepTinh p = new PhepTinh(1, 1);
		int expected = 2;
		int actual = p.tong();
		assertEquals(expected, actual);
	}
	
//	@Test
//	public void Tong_2() {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt(),b = sc.nextInt();
//		PhepTinh p = new PhepTinh(a,b);
//		if(p.getA() > Integer.MAX_VALUE ||p.getA() < Integer.MIN_VALUE ) {
//			fail("Nhap sai");
//	}
//		
//	}
	@Test
	public void Tong_3() {
		Scanner sc = new Scanner(System.in);
		int a, b ;
		try {
			a = Integer.parseInt(sc.nextLine());
			b = Integer.parseInt(sc.nextLine());
//			a = sc.nextInt();
//			b = sc.nextInt();
			PhepTinh p = new PhepTinh(a, b);
		}catch(Exception ex) {
			System.out.println(ex);
			fail("sai");
		}
	}
	

} 
