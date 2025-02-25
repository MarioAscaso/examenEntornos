package input;

import java.util.Scanner;

public class Input {
    Scanner sc = new Scanner(System.in);
    int intValue;
    String stringValue;

    private void getInt(){intValue = sc.nextInt();}
    public int getIntValue(){
        getInt();
        return intValue;
    }

    private void getString(){stringValue = sc.next();}
    public String getStringValue(){
        getString();
        return stringValue;
    }
}
