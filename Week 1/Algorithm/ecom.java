class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
}
public class ecom {
    public static Product linearSearch(Product[] products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) {
                return p;
            }
        }
        return null;
    }
    public static Product binarySearch(Product[] products, int targetId) {
        int low = 0;
        int high = products.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (products[mid].productId == targetId) {
                return products[mid];
            }else if (products[mid].productId < targetId) {
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Phone", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories"),
            new Product(105, "Bag", "Fashion")
        };
        int searchId = 104;
        System.out.println("Linear Search:");
        Product result1 = linearSearch(products, searchId);
        if(result1 != null) {
            System.out.println("product found:"+result1.productName+"|"+result1.category);
        }
        System.out.println("\nBinary Search:");
        Product result2 = binarySearch(products, searchId);
        if(result2 != null) {
            System.out.println("product found:"+result2.productName+"|"+result2.category);
        }
    }
}