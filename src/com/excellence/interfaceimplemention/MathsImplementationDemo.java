package com.excellence.interfaceimplemention;

import com.excellence.interfacedemo.MathParimeterInterface;
import com.excellence.interfacedemo.MathsApplication;

public class MathsImplementationDemo implements MathsApplication, MathParimeterInterface {

	public double areaOfCircle(double radius) {

		return pie * radius * radius;
	}

	public double areaOfSquare(double side) {

		return side * side;
	}

	public double perimeterOfCircle(double radius) {

		return 2 * pie * radius;
	}

	public double perimeterOfSquare(double side) {

		return 4 * side;
	}
}
