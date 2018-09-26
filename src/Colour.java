import java.util.Objects;

public class Colour {
    private int red;
    private int green;
    private int blue;

    public Colour(int red, int green, int blue){
        this.red=red;
        this.green=green;
        this.blue=blue;
    }

    public int getRed(){
        return red;
    }
    public int getGreen(){
        return green;
    }
    public int getBlue(){
        return blue;
    }

    public boolean isGray(){
        if (red==green&&red==blue){
            return true;
        }
        else{
            return false;
        }
    }

    public void mixWith(Colour colour2){
        this.red=(int) (0.5*this.red+0.5*colour2.getRed());
        this.green=(int) (0.5*this.green+0.5*colour2.getGreen());
        this.blue= (int) (0.5*this.blue+0.5*colour2.getBlue());
    }

    public Colour copy(){
        Colour copy=new Colour(this.red, this.green, this.blue);
        return copy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour = (Colour) o;
        return red == colour.red &&
                green == colour.green &&
                blue == colour.blue;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
