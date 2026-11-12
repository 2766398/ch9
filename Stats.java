import java.util.Arrays;
public class Stats{
	public static void main (String [] args){
	count(args);
	sum(args);
	min(args);
	max(args);
	avg(args);
	}
	public static void max (String[] a){
		int max = Integer.MIN_VALUE;
		for (String arg : a) {
			int value = Integer.parseInt(arg);
			if (value > max) {
			max = value;
			}
		}
	System.out.println("Max: " + max);
	}
	
	public static void min (String[] a){
		int min = Integer.MIN_VALUE;
		for (String arg : a) {
			int value = Integer.parseInt(arg);
			if (value < min) {
			min = value;
			}
		}
	System.out.println("Min: " + min);
	}
	
	public static void count (String[] a){
		System.out.println("Count: " + a.length);
	}
	
	public static int sum (String[] a){
		int sum = 0;
		for(String arg : a){
			int value = Integer.parseInt(arg);
			sum += value;
		}
		System.out.println("Sum: " + sum);
		return sum;
	}
	
	public static void avg (String[] a){
		double length = (double) a.length;
		double avg = sum(a)/length;
		System.out.printf("Avg: " + "%.2f", avg);
	}
}
