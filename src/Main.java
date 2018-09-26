public class Main {

    public static void main(String[] args){
        int red=66;
        int green=33;
        int blue=45;
        Colour colour1=new Colour(red, green, blue);
        System.out.println(colour1);

        red=20;
        green=20;
        blue=20;
        Colour colour2=new Colour(red, green, blue);
        System.out.println(colour2);

        ColourPalette palette=new ColourPalette();

        System.out.println(palette.getNumberOfColours());

        palette.add(colour1);
        palette.add(colour2);

        System.out.println(palette.getNumberOfColours());

        System.out.println(palette.get(1));

        System.out.println(palette.getNumberOfGrayColours());

        palette.mixColour(1, colour1);
        System.out.println(colour2);

        palette.mixColour(1, colour1);
        System.out.println(colour2);

        System.out.println(palette.getNumberOfGrayColours());
    }


}
