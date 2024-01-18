package java07_inherit.practice.controller;

import java.util.Scanner;

import java07_inherit.practice.model.Circle;
import java07_inherit.practice.model.Point;
import java07_inherit.practice.model.Rectangle;

public class Main {
	public static void main(String[] args) {
		
			
		Scanner sc = new Scanner(System.in);
		
//		Point[] po = new Point[5];
//
//		
//		for(int i = 0; i < po.length; i++) {
//			po[i] = new Circle();
//			
//			System.out.print("x 좌표를 입력하세요 : ");
//			po[i].setX(sc.nextInt());
//			System.out.print("y 좌표를 입력하세요 : ");
//			po[i].setY(sc.nextInt());
//			
//			
//			po[i].draw();
//		}
		
		
		Circle[] cir = new Circle[3];
		Rectangle[] rec = new Rectangle[3];
	
	
		for(int i = 0; i < cir.length; i++) {
			cir[i] = new Circle();
			
			System.out.print("x 좌표를 입력하세요 : ");
			cir[i].setX(sc.nextInt());
			System.out.print("y 좌표를 입력하세요 : ");
			cir[i].setY(sc.nextInt());
			System.out.print("반지름을 입력하세요 : ");
			cir[i].setRadius(sc.nextInt());
			
			cir[i].draw();
		}
		
		for(int i = 0; i < rec.length; i++) {
			rec[i] = new Rectangle();
			
			System.out.print("x 좌표를 입력하세요 : ");
			rec[i].setX(sc.nextInt());
			System.out.print("y 좌표를 입력하세요 : ");
			rec[i].setY(sc.nextInt());
			System.out.print("길이을 입력하세요 : ");
			rec[i].setWidth(sc.nextInt());
			System.out.print("높이을 입력하세요 : ");
			rec[i].setHeight(sc.nextInt());
			
			rec[i].draw();
		}
			
		
	}
}
