@Execute-With-New-User
Feature: Execute With New User
  As the User ...
  Scenario Outline: Action for The User
    Given user navigates to Login page with user "<Tên Đăng Nhập>" and password "<Mật Khẩu>"
    When I logout
   #Then User should be logged in successfully

    Examples:
      | Tên Đăng Nhập | Mật Khẩu |
      | autoZ11 | Abc@123 |