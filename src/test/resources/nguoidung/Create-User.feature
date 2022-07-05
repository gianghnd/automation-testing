@Create-User
Feature: Create User
  As a Admin User I want to Create User

  Scenario Outline: Create User with all fields
    Given I launch login Admin page as admin
    When I click "Tạo mới" button
    Then page "Tạo người dùng" appear
    When I input "Tên đăng nhập" textbox with value "<Tên Đăng Nhập>"

    And I input "Họ và tên" textbox with value "<Họ Và Tên>"
    And I input "Email" textbox with value "<Email>"
    And I input "Số điện thoại" textbox with value "<Số điện thoại>"

    #Select dropdown list
    And I select "Đơn vị" dropdown list with "Đơn Vị" value
      | Đơn Vị   |
      | <Đơn Vị> |
    And I select "Phòng ban" dropdown list with "Phòng Ban" value
      | Phòng Ban   |
      | <Phòng Ban> |
    And I select "Chức năng" dropdown list with "Chức Năng" value
      | Chức Năng   |
      | <Chức Năng> |
    And I select "Chức danh" dropdown list with "Chức Danh" value
      | Chức Danh   |
      | <Chức Danh> |
    And I click Tạo icon
    And I logout
    When I activate account with value "<Email>"

    Examples:
      | Tên Đăng Nhập | Họ Và Tên | Email | Số điện thoại | Đơn Vị       | Phòng Ban     | Chức Năng | Chức Danh |
      | autoZ16 | automa_tion16 	| axutoz16@mailinator.com 	| 0939799999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
      | autoZ17 | automa_tion17 	| axutoz17@mailinator.com 	| 0939799999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
      | autoZ18 | automa_tion18 	| axutoz18@mailinator.com 	| 0939799999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
      | autoZ19 | automa_tion19 	| axutoz19@mailinator.com 	| 0939799999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
      | autoZ20 | automa_tion20 	| axutoz20@mailinator.com 	| 0939799999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
     # | autoY15 | test_ing15 	| autoy15@mailinator.com 	| 0999042154 	| Trụ sở chính 	| Tái bảo hiểm 	| Tái bảo hiểm 	| Nhân viên |
    #  | autoX35 | automa_tion35 	| axutox35@mailinator.com 	| 0988049999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
    #  | autoY15 | test_ing15 	| autoy15@mailinator.com 	| 0999042154 	| Trụ sở chính 	| Tái bảo hiểm 	| Tái bảo hiểm 	| Nhân viên |