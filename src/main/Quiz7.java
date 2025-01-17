package main;

import java.util.ArrayList;

public class Quiz7 {

	public static void main(String[] args) {

		ArrayList<Animal> list = new ArrayList<>();

		list.add(new Human());
		list.add(new Tiger());

		for (Animal ani : list) {
			ani.sleep();
			ani.move();
			if (ani instanceof Human) {
				Human human = (Human) ani;
				human.read();
			}
			if (ani instanceof Tiger) {
				Tiger tiger = (Tiger) ani;
				tiger.hunt();
			}
			System.out.println();
		}

	}

}

abstract class Animal {

	void sleep() {
		System.out.println("밤에는 잠을 잡니다");
	}

	abstract void move();

}

class Human extends Animal {

	@Override
	void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}

	void read() {
		System.out.println("사람이 책을 읽습니다");
	}

}

class Tiger extends Animal {

	@Override
	void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}

	void hunt() {
		System.out.println("호랑이가 사냥을 합니다");
	}

}