public class Main {
    public static void main(String[] args) {
        Product product=new Product(1,"Laptop","Asus Laptop",3000,2,"Siyah");

        ProductManager productManager=new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());


        productManager.Add2(1,"","",2,200);





    }
}