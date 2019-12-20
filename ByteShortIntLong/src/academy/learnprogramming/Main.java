package academy.learnprogramming;

public class Main {
	public static void main(String[] args) {
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer Minimum Value: " + myMinIntValue);
		System.out.println("Integer Maximum Value: " + myMaxIntValue);
		System.out.println("BUSTED Max Value: " + (myMaxIntValue + 1));
		System.out.println("BUSTED Min Value: " + (myMinIntValue - 1));
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		
		System.out.println("Minimum Byte: " + myMinByteValue);
		System.out.println("Maximum Byte: " + myMaxByteValue);
		System.out.println("Minimum Short: " + myMinShortValue);
		System.out.println("Maximum Short: " + myMaxShortValue);
		System.out.println("Minimum Long: " + myMinLongValue);
		System.out.println("Maximum Long: " + myMaxLongValue);
		
		byte mcByte = 122;
		short mcShort = 667;
		int mcInt = 99_999;
		long mcLong = 50_000 + 10 * (mcByte + mcShort + mcInt);
		
		System.out.println("Long answer: " + mcLong);
		
		float myMinFloatValue = Float.MIN_VALUE;
		float myMaxFloatValue = Float.MAX_VALUE;
		
		double myMinDoubleValue = Double.MIN_VALUE;
		double myMaxDoubleValue = Double.MAX_VALUE;
		
		System.out.println("Minimum Float: " + myMinFloatValue);
		System.out.println("Maximum Float: " + myMaxFloatValue);
		System.out.println("Minimum Double: " + myMinDoubleValue);
		System.out.println("Maximum Double: " + myMaxDoubleValue);
		
		double poundWeight = 166;
		double kiloConversionWeight = poundWeight * 0.45359237;
		double hereNumber = 1_2_7________7;
		
		System.out.println("Converted Weight: " + kiloConversionWeight);
		System.out.println(hereNumber);
	}
}
