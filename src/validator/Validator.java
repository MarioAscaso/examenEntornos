package validator;

import main.Main;
import producto.Producto;

public class Validator {
    public boolean validateOptionMenu(int optionMenu){
        boolean valid = true;
        if(optionMenu < Main.CREATE || optionMenu > Main.EXIT){
            valid = false;
        }
        return valid;
    }
}
