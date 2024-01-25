# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS


C.  I edited the code on 'mainscreen.html' file on lines 40-71 to add the part names and lines 109-140 to add the product names. I also changed the header to 
    print "Electronics" on line 19, as well as the title to print "My Electronics Shop" on line 14. 


D.  First, I am a new template called about.html. Within about.html I copy and pasted the first 15 lines of code from my mainscreen.html file so that my about 
    screen will have the same styling/ formatting and changed the tile on line 14 to "About". The about.html file also contains simple informative text about the 
    company as well as a hyperlink to go back to the main screen. Secondly, I created a new controller class called "AboutController" under 
    src/main/java/com.example.demo/controllers. Within the AboutController file, I added the @Controller tag for the class and created a aboutPage() method which
    includes the @GetMapping tag. Lastly, I added a hyperlink on the about link page on mainscreen.html line 21 that redirects me back to the main screen page. 


E.  Firstly, I deleted my previous changed to the 'mainscreen.html' file where I added lines of code to add rows with the part and product names since I thought
    that I was supposed to do it at that time. Secondly, I went to the 'BootStrapData.java' file and edited the code from line 41-83. Within those lines of code 
    I first created two variable to check the count of both partRepository and productsRepository. Then, I check to see if partsCount variable is equal to zero, 
    and if it is then I created 5 instances, one for each part and set the values for each of them and added them to the outsourcedPartRepository list. I also 
    edited lines 88-44 to check for each of the part names and assign thePart value to part. Lastly, I edited lines 104-115 to check if productsCount variable is 
    equal to zero and if it is then I made 5 instances for the products and assigned the values for each and added them to the productRepository list. 


F.  I added a buy now button on the mainscreen.html file lines 87-90 which says "Buy Now". After that I created a BuyNowProductController java file, this file is
    responsible for handling the logic whenever a user clicks on the button and redirects them to either a purchaseError or purchaseSuccess page. The 
    BuyNowProductController file is also responsible for updating the product inventory whenever an item is bought. I do this by checking to see if the inventory 
    is equal to zero and if it is then I call a purchaseError method which redirects to me a new purhcaseError.html file that I created. Otherwise, I call the 
    purchaseSuccess method and update the inventory by decrementing one and saving it. As I said, I created two new .html files, purchaseSuccess and purchaseError.
    All they do is print out a simple message and have a button to go back to the main screen. I also edited my about.html file at this point because I forgot to
    add some text into the file before. 



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
