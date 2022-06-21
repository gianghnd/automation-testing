Innit
1. Download ChromeDriver
https://chromedriver.storage.googleapis.com/index.html?path=103.0.5060.24/
- Download to the folder browserDriver
I. The project directory structure


II. Framework Workflow


III. Executing the tests
TC Cucumber included FT: src -> test -> resources
1 FT/TC
nguoidung/TaoNguoiDung.feature - just create user
connguoi/CheckBieuPhiChiTietSK12.feature - validation


EXECUTE 
src -> test -> java -> cucumberOption -> DemoTestRunner


IV. Other Libraries

Next step:
Java Faker - This library is used in the tests to generate random data to be passed to the application like user details
Jackson - To read test data from yaml file and load it to DTO class
Lombok - To reduce boilerplate code in DTO classes and increase readabilty
Assertj - To assert the tests. Soft assertions are used where multiple assertions are present so that user can see all passing assertions along with the failed ones