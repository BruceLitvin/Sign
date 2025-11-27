public class Sign {

    private String code; //declare global variables
    private int width;

    public Sign(String message, int width) { //constructor for translation purposes
        code = message;
        this.width = width;

    }

    public int numberOFLines() {
        if (code.equals("")) {
            return 0; //if no string exists return null
        } else if (code.length() % width == 0) {//if length of code is divisible by width
            return (code.length() / width);
        } else return (code.length() / width) + 1;// if it isn't divisible

    }

    public String getLines() {
        String s = ""; //declare a new string
        if (code.equals("")) { //if there is no string return null
            return null;
        } else if (code.length() <= width) { //if the length of the string is shorter than the width return string as is
            return code;
        }
        if (code.length() % width == 0) { //if it is even run a for loop to assemble string
            for(int i=0; i<numberOFLines();i++){
                s += code.substring((width * i), width * (i + 1));
                s += ";";
            }
             //to prevent semicolon after last width
            return s.substring(0, s.length() - 1);

        }

        else for (int i = 0; i < numberOFLines() - 1; i++) { //same here for odd numbers if it isn't divisible
            s += code.substring((width * i), width * (i + 1));
            s += ";";

        }
        s += code.substring(numberOFLines() + width);
        return s; //return final value
    }

}
