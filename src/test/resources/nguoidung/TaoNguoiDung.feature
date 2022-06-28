@Tao_Nguoi_Dung
Feature: Tao Nguoi Dung
  As a Admin User I want to Tao Nguoi Dung

  Scenario Outline: Create Người Dùng with all fields
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
    And I logoutx
    When I activate account with value "<Email>"

    Examples:
      | Tên Đăng Nhập | Họ Và Tên | Email | Số điện thoại | Đơn Vị       | Phòng Ban     | Chức Năng | Chức Danh |
      | autoX32 | automa_tion32 	| axutox32@mailinator.com 	| 0988049999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
      | autoY14 | test_ing14 	| autoy13@mailinator.com 	| 0999042154 	| Trụ sở chính 	| Tái bảo hiểm 	| Tái bảo hiểm 	| Nhân viên |
      | autoX33 | automa_tion33 	| axutox29@mailinator.com 	| 0988049999 	| Trụ sở chính 	| Tái bảo hiểm 	| Điều hành 	| Giám đốc Ban |
      | autoY15 | test_ing15 	| autoy12@mailinator.com 	| 0999042154 	| Trụ sở chính 	| Tái bảo hiểm 	| Tái bảo hiểm 	| Nhân viên |