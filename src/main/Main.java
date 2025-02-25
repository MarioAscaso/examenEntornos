package main;

import input.Input;
import output.Output;
import producto.Producto;
import validator.Validator;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {

    public static final int CREATE = 1;
    public static final int LIST = 2;
    public static final int SELL = 3;
    public static final int UPDATE = 4;
    public static final int EXIT = 5;

    public static Input input;
    public static Output output;
    public static Validator validator;
    public static Producto producto;

    public static List<Producto> listProducts;

    public static void main(String[] args) {

        listProducts = new ArrayList<>();
    }

    public static void createProduct(){
        UUID uuid = UUID.randomUUID();
        output.askReference();
        String reference = input.getStringValue();
        output.askNumProducts();
        byte numProducts = input.getIntValue();
        output.askCreationDate();
        String creationDate = input.getStringValue();
        listProducts.add(new Producto(uuid, reference, numProducts, creationDate));
    }

}
