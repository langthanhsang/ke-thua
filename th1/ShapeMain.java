package kethua.th1;

public class ShapeMain {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1 = new Rectangle(2.4, 4.5);
        rectangle1 = new Rectangle(2.4, 3.4,"red",true);

        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);
        square = new Square(5.8,"yellow",true);
        System.out.println(square);
    }
}
