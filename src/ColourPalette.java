import java.util.LinkedList;
import java.util.Objects;

public class ColourPalette {
    private int numberOfColours;

    private LinkedList<Colour> Colourlist = new LinkedList<>();

    public int getNumberOfColours(){
        return Colourlist.size();
    }

    public void add(Colour colour){
        Colourlist.add(colour);
    }

    public Colour get(int index) {

        if (index < 0 || index > Colourlist.size()) {
            return null;
        }
        return Colourlist.get(index);
    }

    public int getNumberOfGrayColours(){
        int numberOfGrayColours=0;
        int check=0;
        while(Colourlist.size()>check){

          if (Colourlist.getFirst().isGray()){
              numberOfGrayColours++;
              Colourlist.addLast(Colourlist.getFirst());
              Colourlist.removeFirst();
          }
          else {
              Colourlist.addLast(Colourlist.getFirst());
              Colourlist.removeFirst();
          }
          check++;
        }
        return numberOfGrayColours;
    }

    public void mixColour(int index, Colour colour2){

        Colourlist.get(index).mixWith(colour2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ColourPalette palette = (ColourPalette) o;
        return numberOfColours == palette.numberOfColours &&
                Objects.equals(Colourlist, palette.Colourlist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfColours, Colourlist);
    }

    @Override
    public String toString() {
        return "ColourPalette{" +
                "numberOfColours=" + numberOfColours +
                ", Colourlist=" + Colourlist +
                '}';
    }
}
