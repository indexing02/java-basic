package oop1.ex;

public class Rectangle {
    int width;
    int height;

    void calculateArea() {
        int area = width * height;
        System.out.println("넓이 : "+area);
    }

    void calculatePerimeter() {
        int perimeter = 2*(width + height);
        System.out.println("둘레 길이 : "+perimeter);
    }

    void isSquare() {
        boolean square = false;

        if(width == height){
            square = true;
            System.out.println("정사각형 여부 : " + square);
        }else {
            System.out.println("정사각형 여부 : " + square);
        }
    }
}
