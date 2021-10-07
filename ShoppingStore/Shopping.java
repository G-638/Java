import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.UUID;

/**
 * Main class Shopping
 */
public class Shopping {

    /**
     * It contain product list.
     */
    static ArrayList<ProductDetail> productList = new ArrayList<>();

    /**
     * It contains the list of cart items.
     */
    static LinkedHashSet<ProductDetail> cartList = new LinkedHashSet<>();

    /**
     * It gets input from user
     */
    static Scanner in = new Scanner(System.in);

    /**
     * It inserts elements into the product list
     */
    static void insertProductList() {
        try {
            Double price;
            String id, name;
            System.out.println("\n Enter product Details: ");
            id = UUID.randomUUID().toString();
            System.out.print("Enter Product Name: ");
            in.nextLine();
            name = in.nextLine();
            System.out.print("Enter Price Amount: ");
            price = in.nextDouble();
            productList.add(new ProductDetail(id, name, price));
        } catch (InputMismatchException e) {
            System.out.println("\n Provide an valid Input");
            insertProductList();
        }
    }

    /**
     * @print
     * It displays all the elements in the product list
     */
    static void displayProductList() {
        int iterate1;
        Iterator<ProductDetail> iterate = productList.iterator();
        iterate1 = 0;
        if (productList.isEmpty()) {
            System.out.println("----No Products in the List----");
        } else {
            System.out.println("PNo" + " \t " + "ProductName" + "\t \t \t" + "Price");
            System.out.println("----" + " \t " + "-----------" + "\t \t \t" + "----");
            while (iterate.hasNext()) {
                iterate.next();
                ProductDetail pd1 = productList.get(iterate1);
                System.out.format("%-1d \t %-17s %19s \n", iterate1, pd1.name, pd1.price);
                iterate1++;
            }
        }
    }

    /**
     * It removes a single element in the Product list
     */
    static void removeSingleProduct() {
        int removeId;
        if (productList.isEmpty()) {
            System.out.println("----No Products in the List----\n");
        } else {
            displayProductList();
            System.out.println("Enter product.No to remove:");
            removeId = in.nextInt();
            ProductDetail pd1 = productList.get(removeId);
            productList.remove(pd1);
            System.out.println(" Product " + removeId + " removed successfully");
        }
    }

    /**
     * It removes a bulk of elements in the Product list
     */
    static void removeBulkProduct() {
        int start, end;
        if (productList.isEmpty()) {
            System.out.println("----No Products in the List----\n");
        } else {
            System.out.println("Remove Bulk Products , Enter from and to Product.No to removes in list");
            displayProductList();
            System.out.print("From: ");
            start = in.nextInt();
            System.out.print("To: ");
            end = in.nextInt();
            int l = productList.size();
            if (start >= 0 && end >= 0 && start < l && end < l && start < end) {
                ProductDetail pd1;
                ArrayList<ProductDetail> productListRm = new ArrayList<>();
                for (int i = start; i <= end; i++) {
                    pd1 = productList.get(i);
                    productListRm.add(pd1);
                }
                productList.removeAll(productListRm);
                System.out.println("Product " + start + " to " + end + " removed successfully");
            } else {
                System.out.println("Please provide vproductListid input");
            }
        }
    }

    /**
     * It adds product list element into cart list
     * @input product number
     */
    static void addToCart() {
        int cartId;
        if (productList.isEmpty()) {
            System.out.println("----No Products in the List----\n");
        } else {
            displayProductList();
            System.out.println("Enter product.No to add into cart");
            cartId = in.nextInt();
            ProductDetail pd1 = productList.get(cartId);
            cartList.add(pd1);
            System.out.println("Product Added to cart successfully");
            displayCart();
        }
    }

    /**
     * @print
     * It displays all the elements in the cart list.
     */
    static void displayCart() {
        int itr1 = 0;
        if (cartList.isEmpty()) {
            System.out.println("---Cart is Empty---");
        } else {
            Iterator<ProductDetail> itr = cartList.iterator();
            System.out.println("PNo" + " \t " + "CartProduct" + "\t \t \t" + "Price");
            System.out.println("----" + " \t " + "-----------" + "\t \t \t" + "----");
            while (itr.hasNext()) {
                ProductDetail vl = itr.next();
                System.out.format("%-1d \t %-17s %19s \n", itr1, vl.name, vl.price);
                itr1++;
            }
        }
    }

    /**
     * It sorts the product list with help of name and price in the list.
     */
    static void sortProductList() {
        int sortType;
        System.out.println("Enter < 1 > sort by Name \t Enter < 2 > sort by price");
        sortType = in.nextInt();
        switch (sortType) {
            case 1:
                sortByName(productList);
                displayProductList();
                break;
            case 2:
                sortByPrice(productList);
                displayProductList();
                break;
            default:
                System.out.println("Please provide vproductListid Input");
                break;
        }
    }

    /**
     * It sort the element in the list with help of name.
     * @param productList
     */
    static void sortByName(ArrayList<ProductDetail> productList) {
        productList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
    }

    /**
     * It sort the element in the list with help of price.
     * @param productList
     */
    static void sortByPrice(ArrayList<ProductDetail> productList) {
        Collections.sort(productList, (o1, o2) -> o1.getPrice().compareTo(o2.getPrice()));
    }

    public static void main(String[] args) throws InputMismatchException {
        try {
            String choice = "N";
            int noOfProduct;
            do {
                System.out.println(
                        " Enter < 1 > to insert a single Product \t Enter < 2 > to insert multiple product \n Enter < 3 > to display a product \t \t Enter < 4 > to remove a single product \n Enter < 5 > to remove bulk product \t \t Enter < 6 > to sort \n Enter < 7 > to Add to cart \t \t \t Enter < 8 > to display cart");
                int userValue = in.nextInt();
                switch (userValue) {
                    case 1:
                        insertProductList();
                        break;
                    case 2:
                        System.out.println("Enter how many product you want to insert");
                        noOfProduct = in.nextInt();
                        for (int i = 0; i < noOfProduct; i++) {
                            insertProductList();
                        }
                        break;
                    case 3:
                        displayProductList();
                        break;
                    case 4:
                        removeSingleProduct();
                        break;
                    case 5:
                        removeBulkProduct();
                        break;
                    case 6:
                        sortProductList();
                        break;
                    case 7:
                        addToCart();
                        break;
                    case 8:
                        displayCart();
                        break;
                    default:
                        System.out.println("None of the above options, you have entered");
                        break;
                }
                System.out.print("Do you want to contiue or not [Y/N]: ");
                choice = in.next();
                if (choice.equals("Y") || choice.equals("N")) {
                } else {
                    System.out.println("Please provide valid Input");
                    System.out.print("Do you want to contiue or not [Y/N]: ");
                    choice = in.next();
                }
            } while (choice.equals("Y"));
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            in.close();
        }
    }
}
