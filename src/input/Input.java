package input;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    byte intValue;
    String stringValue;

    private void getInt(){intValue = (byte) Integer.parseInt(sc.nextLine());}
    public byte getIntValue(){
        getInt();
        return intValue;
    }

    private void getString(){stringValue = sc.nextLine();}
    public String getStringValue(){
        getString();
        return stringValue;
    }
}
