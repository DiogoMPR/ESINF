package PLs_Week2_JCF;

import java.time.LocalDate;
import java.util.*;

public class Supermarket {
    Map<Invoice, Set<Product>> sup = new HashMap<>(); //Creation of the map that uses the Invoice as the key and the Product as the value

    // Reads invoices from a list of String
    void getInvoices(List<String> l) {
        Invoice i;
        Product p;
        Set<Product> sp = null; // Intended to hold a set of Product objects.
        for (String linha : l) {
            String[] str = linha.split(",");
            switch (str[0]) {
                case "I":
                    i = new Invoice(str[1], str[2]);
                    sp = new TreeSet<>(); // creates a new TreeSet object and assigns it to the variable sp. This TreeSet will hold Product objects
                    sup.put(i, sp); // adding an entry to the sup map. The i variable represents an Invoice object that we previously created. We are using this Invoice object as the key in the map, and we're associating it with the TreeSet sp as its value.
                    break;
                case "P":
                    p = new Product(str[1], Integer.parseInt(str[2]), Long.parseLong(str[3]));
                    sp.add(p); // Adding the Product object "p" to the TreeSet "sp".
                    break;
                default:
            }
        }
    }

    // returns a set in which each number is the number of products in the r
    // invoice
    Map<Invoice, Integer> numberOfProductsPerInvoice() {
        Map<Invoice, Integer> numberOfProductsPerInvoice = new HashMap<>(); // Creation of the Map to be returned
        for (Map.Entry<Invoice, Set<Product>> entry : sup.entrySet()) { // For each entry in the Map of Invoice/Product :
            // Retrieve the Invoice object and the associated "TreeSet" of Product objects
            Invoice invoice = entry.getKey();
            Set<Product> products = entry.getValue();
            int numberOfProducts = products.size(); // Saves the number of the products in each Invoice
            numberOfProductsPerInvoice.put(invoice, numberOfProducts); // Saves the Invoice object as the ket and the quantity of products as a value
        }
        return numberOfProductsPerInvoice;
    }

    // returns a Set of invoices in which each date is >d1 and <d2
    Set<Invoice> betweenDates(LocalDate d1, LocalDate d2) {
        Set<Invoice> invoiceResults = new HashSet<>(); // Creation of the Map to be returned
        for (Map.Entry<Invoice, Set<Product>> entry : sup.entrySet()) { // For each entry in the Map of Invoice/Product :
            // Retrieve the Invoice object and the associated date of the given Invoice object
            Invoice invoice = entry.getKey();
            LocalDate invoiceDate = invoice.getDate();
            if (invoiceDate.isAfter(d1) && invoiceDate.isBefore(d2)) {
                invoiceResults.add(invoice); // If the condition is verified, we add the given Invoice to the Invoices's Map
            }
        }
        return invoiceResults;
    }

    // returns the sum of the price of the product in all the invoices
    long totalOfProduct(String productId) {
        long totalPrice = 0;

        for (Set<Product> products : sup.values()) { // Iterate through the values in the sup Map
            for (Product product : products) { // Iterate through each product in the set of products
                if (product.getIdentification().equals(productId)) {
                    totalPrice += product.getPrice() * product.getQuantity();
                }
            }
        }
        return totalPrice;
    }

    // converts a map of invoices and troducts to a map which key is a product
    // identification and the values are a set of the invoices in which it appears
    Map<String, Set<Invoice>> convertInvoices() {
        Map<String, Set<Invoice>> result = new HashMap<>(); // Creation of the map to be returned
        for (Map.Entry<Invoice, Set<Product>> entry : sup.entrySet()) { // For each entry in the Invoice/Product map :
            // Retrieve the Invoice object and the associated "TreeSet" of Product objects
            Invoice invoice = entry.getKey();
            Set<Product> products = entry.getValue();
            for (Product product : products) { // For each product in the products in the given Invoice :
                String productId = product.getIdentification();// Retrieve the product identification
                // The below code line defines what to do when the key (productId, in this case) is not already present in the map - it creates a new HashSet and returns it as the value for the key.
                //After "computeIfAbsent" ensures that the key (productId) exists in the map and associates it with a HashSet, we then add the invoice to this HashSet.
                result.computeIfAbsent(productId, k -> new HashSet<>()).add(invoice); // This is a lambda expression that defines what to do when the key (productId) is not already present in the map. In this case, it creates a new HashSet and returns it as the value for the key.
            }
        }
        return result;
    }
}