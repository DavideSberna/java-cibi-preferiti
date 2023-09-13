package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] list = {"pasta","pollo","riso","stinco","spiedo","polenta","insalata","pesca","sushi"};
		
		String best = list[0];
		String notBest = list[list.length - 1];
		String medium = null;
		
		if(list.length % 2 == 0) {
			medium = list[(list.length / 2) - 1];
		} else {
			medium = list[(list.length / 2)];
		}
		
		System.out.println("il miglior piatto è: " + best);
		System.out.println("il miglior ma non troppo: " + notBest);
		System.out.println("il piatto medio: " + medium);

	}

}
