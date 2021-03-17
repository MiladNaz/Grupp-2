package triangle;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    @Test
    void isScalene(){
        Triangle tri = new Triangle(1,2,3);
        var actualResult = tri.isScalene();
        assertTrue(actualResult);
    }

    @Test
    void isEquilateral(){
        Triangle tri = new Triangle(1,1,1);
                var actualResult = tri.isEquilateral();
        assertTrue(actualResult);
    }

    @Test
    void isNotEquilateral(){
        Triangle tri = new Triangle(1,2,1);
        var actualResult = tri.isEquilateral();
        assertFalse(actualResult);
    }

    @Test
    void isIsosceles(){
        Triangle tri = new Triangle(1,1,2);
        var actualResult = tri.isIsosceles();
        assertTrue(actualResult);
    }

    @Test
    void isNotIsosceles(){
        Triangle tri = new Triangle(1,1,1);
        var actualResult = tri.isIsosceles();
        assertFalse(actualResult);
    }
    @Test
    void isTriangleArrayConstructor(){
        double[] num = new double[]{1, 2, 3};
        Triangle tri = new Triangle(num);
        assertArrayEquals(new double[]{1, 2, 3}, tri.sides);
    }
    @Test
    void isTriangleArrayConstructorWithPoint(){
        Point a = new Point(1,1);
        Point b = new Point(5,1);
        Point c = new Point(5,4);
        Triangle tri = new Triangle(a,b,c);
        assertArrayEquals(new double[]{4, 3, 5} ,tri.sides);
    }

    @Test
    void isTriangleArrayConstructorWithPointArray(){
        Point abc[] = new Point[]{new Point(1,1), new Point(5,1), new Point(5,4)};

        Triangle tri = new Triangle(abc);

        assertArrayEquals(new double[]{4, 3, 5} ,tri.sides);
    }

}