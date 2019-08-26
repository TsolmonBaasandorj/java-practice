package day_59_Polymorphism;

public class Circle extends Shape {
@Override
public void draw() {
	System.out.println("    * * *    \n" +
                       " *         * \n" +
                       "*           *\n" +
                       "*           *\n" +
                       "*           *\n" +
                       " *         * \n" +
                       "    * * *  ");
}
}
