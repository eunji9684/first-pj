package FunBack;

public class ImageInfo {
    private String imageName;
    private int x;
    private int y;

    public ImageInfo(String imageName, int x, int y) {
        this.imageName = imageName;
        this.x = x;
        this.y = y;
    }

    public String getImageName() {
        return imageName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
