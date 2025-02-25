package output;

public class Output {

    public void showMenu(){
        System.out.println("""
                1. - CREATE PRODUCT
                2. - LIST PRODUCTS
                3. - SELL PRODUCT
                4. - UPDATE LIST PRODUCTS
                5. - EXIT SYSTEM
                WHICH OPSTION DO YOU WANT TO DO:\s""");
    }
    public void askReference(){System.out.print("Reference: ");}
    public void askNumProducts(){System.out.print("Number of products: ");}
    public void askCreationDate(){System.out.print("Creation date (YYYYMMDDTHH:mm): ");}
    public void askModificationDate(){System.out.print("Modification date (YYYYMMDDHH:mm): ");}
    public void exitSystem(){System.out.println("EXIT SYSTEM");}
}
