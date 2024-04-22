<strong>** DO NOT DISTRIBUTE OR PUBLICLY POST SOLUTIONS TO THESE LABS. MAKE ALL FORKS OF THIS REPOSITORY WITH SOLUTION CODE PRIVATE. PLEASE REFER TO THE STUDENT CODE OF CONDUCT AND ETHICAL EXPECTATIONS FOR COLLEGE OF INFORMATION TECHNOLOGY STUDENTS FOR SPECIFICS. ** </strong>

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.  Mainscreen.html, line 14, changed the title to "My Guitar Shop".
    Mainscreen.html, line 21, changed subheading to "Components".
    Mainscreen.html, line 53, changed subheading to "Instruments".

D.  src/main/resources/templates, Added an about.html.
    about.html, line 6, copy-pasted the same css styling from mainscreen.html. 
    about.html, line 8, created title "About Us - My Guitar Shop".
    about.html, line 2, created subheading "About us".
    about.html, line 14, created a paragraph for the about statement.
    about.html, line  17, created button that redirects user back to the mainscreen.html similar to buttons used in that
    page.
    mainscreen.html, line 89, created similar button that sends user to about.html.
    src/main/java/controllers, created AboutController class.
    AboutController, line 6, annotate class as a Controller.
    AboutController, line 7, created public class AboutController.
    AboutController, line 8, annotate as GetMapping.
    AboutController, line 9, defined class to return "about" string.


E.  bootstrapdata, line 40, added if statement to check if repositories were empty
    bootstrapdata, lines 42 - 70, added outsourcedParts
    bootstrapdata, lines 72 - 76, saved parts to repository
    bootstrapdata, lines 82 - 86, added products
    bootstrapdata, lines 88 - 92, saveds products to repository


F.  ProductService.java, line 20, declared DecrementProductInventory()
    ProductServiceImpl.java, lines 70 to 83, defined DecrementProductInventory()
    src/main/java/controllers, created BuyController
    BuyController, lines 9 to 24, created and annotated BuyController class along
    with the buyProduct method if-else with PostMapping
    src/main/resources/templates, created confirmation.html and error.html
    confirmation.html, line 8 - 12, created Title, heading and body contents
    confirmation.html, line 13, created button back to mainscreen.html
    error.html, line 8 - 12, created Title, heading and body contents
    error.html, line 13, created button back to mainscreen.html
    mainscreen.html, lines 82 - 85, added Buy Now button form


G.  part.java, lines 32 - 33, created Int minInv member and set a constraint/message
    to limit how low it can be set.
    part.java, lines 34 - 35, created Int maxInv member and set a constraint/message
    to limit for big it can be set.
    part.java, lines 58 - 65, created new overloaded constructor that includes minInv and MaxInv
    part.java, lines 97 - 109, generated getters and setters for minInv and maxInv
    inhousePartForm.html, lines 24 - 28, added fields for minInv and maxInv user inputs
    OutsourcedPartForm.html, lines 25 - 29, added fields for minInv and maxInv user inputs
    application.properties, renamed database
    addOutsourcedPartController.java, lines 43 - 45, added custom validation logic that checks
    inventory is in between the set minInv and maxInv range
    AddinhousePartController.java, lines 42 - 44, added custom validation logic that checks
    inventory is in between the set minInv and maxInv range
    BootStrapData.java, Lines 47 - 48, added values minInv and maxInv to the sample inventory
    BootStrapData.java, Lines 55 - 56, added values minInv and maxInv to the sample inventory
    BootStrapData.java, Lines 63 - 64, added values minInv and maxInv to the sample inventory
    BootStrapData.java, Lines 71 - 72, added values minInv and maxInv to the sample inventory
    BootStrapData.java, Lines 79 - 80, added values minInv and maxInv to the sample inventory


H.  AddinhousePartController.java, Lines 44 - 50, added if else statement logic to specialize
    the error messages given depending on what went wrong.
    AddOutsourcedPartController.java, Lines 45 - 51, added if else statement logic to specialize
    the error messages given depending on what went wrong.
    EnufPartsValidator.java, Lines 36 - 37, added additional if statement that checks if part inventory
    would dip below minInv and returns false if so.

I.  PartTest.java, Lines 104 - 138, Created tests for the newly created minInv and maxInv fields
    using @test annotaions and assertations (assertEquals) for comparisons on expected outcomes

J.  Remove the class files for any unused validators in order to clean your code.
