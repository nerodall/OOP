package task4;

public class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.width = width;
    }

    @Override
    public void setHeight(int height) {
        super.height = height;
    }

    public int area() {
        return this.width * this.height;
    }
}
