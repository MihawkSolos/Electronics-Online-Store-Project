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



G.  Adding the maxInv and minInv variables on lines 32-36. I also updated the constructor methods to include the two new variables as well as added getter/setter 
    methods for both (lines 63-74 for the getter/setter methods) all in Part.java file. Then, I went into the BootStrapDate.java file and setMaxInv and setMinInv 
    values for each of the parts. After that I added both maxInv and minInv values in both the InhousePartForm and OutsourcedPartForm html files (lines 26-31). Then, I renamed my 
    database file on my pc to 'springBootDatabase', and also renamed it on the application.properties file line 6. Then I went back into the Part.java file and 
    added a method to check if an inventory is valid on lines 66-68. Edited lines 40-41 and 50-51 on the mainscreen.html file to add columns for max/ min 
    inventory values. I added a isInvValid method on both the AddInHousePartController and AddOutsourcedPartController files. 


H.  I edited the AddinHousePartController file lines 54-64 to include two more if-statements to check if the user inputted inventory is less than or greater than 
    the min and max inventory and returning the necessary error messages. I also did the same thing in the AddOutsourcedPartController file lines 49-59. I also 
    edited both the InhousePartForm and OutSourcedPartForm files so that the error messages now occur right above the submit button instead of after reading the 
    inventory (line 31 for inHousePartForm, line 32 for OutSourcedPartForm). Then I went into the EnufPartsValidator file and added lines 32-42 to check and see 
    if adding/ updating a product would cause an associated part to fall below the minimum whenever the user is trying to update a product with the associated part.
    I currently can get two error messages, one for if the price of the product is below the price of the parts, and the other for if adding a part to a product 
    would lead to that parts inventory being lower than its minimum inventory. 


I.  Added two unit tests to check for maximum/ minimum inventory on PartTest.java file in the test package, lines 160-178. Both units test for both partIn and 
    partOut.


J.  Remove the class files for any unused validators in order to clean your code.
