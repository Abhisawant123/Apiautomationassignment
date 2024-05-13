package api.endpoints;


/* here we have to maintain all our URLs 
 "url": https://reqres.in

 create user(POST):  https://reqres.in/api/users
 get users details(GET) : https://reqres.in/api/users
 to get single user details(GET): https://reqres.in/api/users/1(creted user id)

here > this is our base url: https://reqres.in and others are our end points.
*/

public class roots {
	
	// here in root class we are storing our  all URLs.
	public static String url = "https://reqres.in";
	
	// (here we use public so we can user everywhere and  user static keyword - as we know that static variables are accessible through every where without creating object )

   public static String  post_request ="https://reqres.in/api/users";
   public static String  getalluser_request ="https://reqres.in/api/users";
   public static String  get_singleuserrequest ="https://reqres.in/api/users/{createduserid}";


}

/*
 We have to create some pre-requisites for before starting the project


.here firstly we have to create  maven project and after that we have to add pom.xml dependencies.
(create maven project)

here we use dependencies to download required jar files and  plugins are used for to compile and execute the project.



src/main/java
src/main/resources

these are used by developers  and  
src/test/java > here we are writing our all test cases
src/test/resources  > here all  our test resource is present which is required for our testing purpose.

these are used for testing purpose.

 
2. here we have to add some dependencies in pom.xml file
they are

(here we will  update pom.xml with required dependencies)



2.1. rest assured = this is for rest assured
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>rest-assured</artifactId>
    <version>5.4.0</version>
    <scope>test</scope>
</dependency>

2.2. json - this is for json path

<!-- https://mvnrepository.com/artifact/io.rest-assured/json-path -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-path</artifactId>
    <version>5.3.2</version>
    <scope>test</scope>
</dependency>

2.3. json- we have to validate json  so we add json here 

<!-- https://mvnrepository.com/artifact/org.json/json -->
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20240303</version>
</dependency>

 2.4. Testng depencies also required

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>

 2.5. script java dependencies also required for authentication purpose , because when we have authentication for our api for that we need this dependencies

<!-- https://mvnrepository.com/artifact/com.github.scribejava/scribejava-apis -->
<dependency>
    <groupId>com.github.scribejava</groupId>
    <artifactId>scribejava-apis</artifactId>
    <version>8.3.1</version>
    <scope>runtime</scope>
</dependency>

2.6. to validate json schema validation plugins

<!-- https://mvnrepository.com/artifact/io.rest-assured/json-schema-validator -->
<dependency>
    <groupId>io.rest-assured</groupId>
    <artifactId>json-schema-validator</artifactId>
    <version>5.3.0</version>
</dependency>

2.7. javafaker to generate random or fake data

<!-- https://mvnrepository.com/artifact/com.github.javafaker/javafaker -->
<dependency>
    <groupId>com.github.javafaker</groupId>
    <artifactId>javafaker</artifactId>
    <version>1.0.2</version>
</dependency>

2.8. To get the report of our testing we use  extent reporter

<!-- https://mvnrepository.com/artifact/com.aventstack/extentreports -->
<dependency>
    <groupId>com.aventstack</groupId>
    <artifactId>extentreports</artifactId>
    <version>5.0.9</version>
</dependency>


 2.9. these to depencies are for apache poi , to read the data for the excel sheet , so we use this dependencies.


<!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>


3 .here in our framework we have to maintain all classes properly in a folder structure

3.1 -- src/java/test i.e.
 1. api.endpoints > here we maintain all our endpoints here

 2. api.payload  > here we maintain all our payloads i.e. pojo classes

 3. api.test  > here we maintain all our test cases 

 4. api.utilities > here we maintain all our reusable components 

 3.2 ---- src/java/resources 

here we will maintain all our properties like url etc.

here we will create all the packages that are required for our testing i.e.

api.endpoints ,api.payload,  api.test, api.utilities.


here we have to create  report, log folder on project level 
 report folder for report storing purpose and  log folder for  storing log purpose.

-----------------------------------------------------------------------------------------------------------------------------------------

Here we have to create root class in endpoint package  because when we create root class here we will store our urls.

in root class we will store all our urls. 

*/
