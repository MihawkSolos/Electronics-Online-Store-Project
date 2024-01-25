package com.example.demo.controllers;

import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@Controller
public class BuyNowProductController {

    @Autowired      //this is to interact with the database to edit the inventory
    private ProductRepository productRepository;

    @PostMapping("/buynow")
    public String productBought(@RequestParam Long productID){

        // Retrieve the product from the database
        Optional<Product> optionalProduct = productRepository.findById(productID);

        // Check if the product exists
        if (optionalProduct.isPresent()) {
            Product product = optionalProduct.get();

            // Check if the product has enough inventory
            if (product.getInv() > 0) {
                // Decrease the inventory by 1
                product.setInv(product.getInv() - 1);

                // update product to the database
                productRepository.save(product);

                // call purchase success method and redirect to it
                return "redirect:/purchaseSuccess";
            }
            else {
                // call purchase error method and go to the error page
                return "redirect:/purchaseError";
            }
        }
        else {
            // call purchase error method and go to the error page
            return "redirect:/purchaseError";
        }
    }

    // method to return that the purchase was a success
    @GetMapping("/purchaseSuccess")
    public String displayPurchaseSuccess() {
        return "purchaseSuccess";
    }

    // method to return that there was an error with the purchase
    @GetMapping("/purchaseError")
    public String displayPurchaseError() {
        // Return the name of the error template (e.g., "purchaseError")
        return "purchaseError";
    }

}
