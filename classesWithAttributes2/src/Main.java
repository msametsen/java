public class Main {
    public static void main(String[] args) {
        Product product =new Product(1,"laptop","Asus Leptop",3000,2,"Siyah"); //aşağıdaki satırların yerine bunuda yazabilrsin Product product =new Product();
        /* product.set_name("Laptop");
        product.setId(1);
        product.set_description("Apple Laptop");
        product.set_stockAmount(3);*/


        //Veri tabanına eklemek icin bu kod kullanılır.
        ProductManager productManager=new ProductManager();
        productManager.Add(product);


        System.out.println(product.get_name());
    }
}

