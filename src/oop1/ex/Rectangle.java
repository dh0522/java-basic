package oop1.ex;

public class Rectangle {
	int width;
	int height;

	int calculateArea(){
		return width*height;
	}

	int calculatePerimeter(){
		return width*2 + height*2;
	}

	boolean isSquare() {
		if ( width == height )
			return true;

		return false;
	}
}
