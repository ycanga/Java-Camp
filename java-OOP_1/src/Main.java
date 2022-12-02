public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        // Set Value
        product1.setName("Delonghi1 Kahve makinesi");
        product1.setDiscount(7);
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);
        product1.setImageUrl("abc1.jpg");

        // Get Value
        //System.out.println(product1.name);

        Product product2 = new Product();
        // Set Value
        product2.setName("Delonghi2 Kahve makinesi");
        product2.setDiscount(7);
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);
        product2.setImageUrl("abc2.jpg");

        Product product3 = new Product();
        // Set Value
        product3.setName("Delonghi3 Kahve makinesi");
        product3.setDiscount(7);
        product3.setUnitPrice(7500);
        product3.setUnitsInStock(3);
        product3.setImageUrl("abc3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>"+product.getName()+"</li>");
        }
        System.out.println("</ul>");

        IndıvidualCustomer indıvidualCustomer = new IndıvidualCustomer();
        indıvidualCustomer.setId(1);
        indıvidualCustomer.setPhone("05222222222");
        indıvidualCustomer.setCustomerNumber("222");
        indıvidualCustomer.setFirstName("ali");
        indıvidualCustomer.setLastName("veli");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Java");
        corporateCustomer.setPhone("0533333333");
        corporateCustomer.setTaxNumber("11111111111111");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {indıvidualCustomer,corporateCustomer};
        for (Customer customer: customers){
            System.out.println(customer.getPhone());
        }
    }
}