class Rectangle{
    int width;
    int height;
    int area;
    int perimeter;

    public Rectangle(int initWidth, int initHeight){
        width = initWidth;
        height = initHeight;
    }

    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public int getArea(){
        area = width*height;
        return area;
    }
    public int getPerimeter(){
        perimeter = (2*width) + (2*height);
        return area;
    }

    public boolean isSquare(){
        if (width == height){
            System.out.println("The rectangle is a square.");
            return true;
        }
        else{
            System.out.println("The rectangle is not a square.");
            return false;
        }
    }

    public static void main(String[] args){
        Rectangle shape1 = new Rectangle(24,24);
        System.out.println(shape1.isSquare());
    }

}