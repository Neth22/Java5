 interface Shape {
    abstract void getArea();
    default void getSide(){
        System.out.println("sides of this shape,");
    }
}
class Rectangle implements Shape{
    @Override
    public void getArea() {
        int length=10; int width=15; int area=length*width;
        System.out.println("Area of Rectangle :-"+ area);
    }

    @Override
    public void getSide() {
        System.out.println("I have Two sides");
    }
}
class Square implements Shape{
    @Override
    public void getArea() {
        int length=20;  int area=length*length;
        System.out.println("Area of Square :"+area);
    }
    static class Test1{
        public static void main(String[] args) {
            Shape r=new Rectangle();
            r.getArea();
            r.getSide();
            Shape s=new Square();
            s.getArea();
        }
    }
}

