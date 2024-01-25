# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS


C.  I edited the code on 'mainscreen.html' file on lines 40-71 to add the part names and lines 109-140 to add the product names. I also changed the header to 
    print "Electronics" on line 19, as well as the title to print "My Electronics Shop" on line 14. 


D.  First, I am a new template called about.html. Within about.html I copy and pasted the first 15 lines of code from my mainscreen.html file so that my about 
    screen will have the same styling/ formatting and changed the tile on line 14 to "About". The about.html file also contains simple informative text about the 
    company as well as a hyperlink to go back to the main screen. Secondly, I created a new controller class called "AboutController" under 
    src/main/java/com.example.demo/controllers. Within the AboutController file, I added the @Controller tag for the class and created a aboutPage() method which
    includes the @GetMapping tag. Lastly, I added a hyperlink on the about link page on mainscreen.html line 21 that redirects me back to the main screen page. 

E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.


Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.


G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.


H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.


I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.


J.  Remove the class files for any unused validators in order to clean your code.
