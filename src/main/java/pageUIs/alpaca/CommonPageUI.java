package pageUIs.alpaca;

public class CommonPageUI {
    public static final String KHACH_HANG_FORM_TAO_IFRAME = "//iframe";
    public static final String COMMON_BUTTON = "//button[contains(.,'%s')]";
    public static final String TAO_BAN_CHAO_ICON = "//i[@class='fal fa-plus']";
    public static final String TAO_KHACH_HANG_ICON = "//i[@class='fal fa-plus-circle fa-sm']";
    public static final String VALUE_TEXTBOX = "//div[contains(text(),'%s')]//ancestor::table//*[contains(text(),'%s')]";
    public static final String TOAST_MESSAGE = "//div[contains(@class,'react-toast-notifications__toast__content')]//div[text()='%s']";
    public static final String COMMON_PARENT_SELECTBOX = "//label[contains(text(),'%s')]/parent::fieldset[1]/*[2]";

    public static final String COMMON_CHILD_SELECTBOX = "//div[contains(@id,'react-select')]";
    public static final String COMMON_TEXTBOX="//label[contains(text(),'%s')]/following-sibling::article//input";

    public static final String COMMON_COLOUMN_INDEX = "//table[@class='table table-xs has-sorting table-borderless']//th[contains(@class,'text-right') and text()='%s']//preceding-sibling::th";

    public static final String COMMON_ROW_INDEX = "//td//*[text()='%s']/ancestor::tr/preceding-sibling::tr";

    public static final String COMMON_CELL_INPUT_INDEX = "//tr[%s]/td[%s]//input";
    public static final String COMMON_TRANG_THAI_INDEX_XPTAH = "//tr[%s]/td[%s]/div";
    public static final String COMMON_TRANG_THAI_INDEX = "tr:nth-of-type(%s) > td:nth-of-type(%s) > div";
    public static final String COMMON_CELL_INDEX = "//tr[%s]/td[%s]/input";
    public static final String COMMON_CHINH_SUA_LAN_CUOI_INDEX = "//tr[%s]/td[%s]";
    public static final String COMMON_CELL_LINK = "//tr[%s]/td[%s]/a";
    public static final String LOAI_HINH_BH_CHECKBOX = "//td//*[text()='%s']/ancestor::td/preceding-sibling::td//input";
    public static final String ACTION_MENU = "//a[contains(text(),'%s')]//parent::td//following-sibling::td[@class='action-col']";

    public static final String ACTION_OPTION = "//a[text()='%s']//parent::td//following-sibling::td[@class='action-col']//*[@class='dropdown-item delete' and contains(.,'%s')]";
    public static final String POPUP = "//div[@class='modal-content']//h3";
    public static final String POPUP_CSS = "h3.modal-title";
    public static final String COMMON_TEXTAREA = "//label[contains(text(),'%s')]/parent::*//textarea";
    public static final String NGAY_HIEU_LUC_DATE_PICKER = "//label[contains(text(),'%s')]/parent::div//div[@class='react-datepicker-wrapper']";
    public static final String CLOSE_POPUP_BUTTON = "//button[@class='close rounded-pill']";
    public static final String SEARCH_TEXTBOX = "//input[@name='keyword']";
    public static final String SECTION_LABEL = "//h5[contains(.,'%s')]";
    public static final String COMMON_DATETIME_PICKER="//a[text()='Th??ng tin xe']/ancestor::ul/following-sibling::div//label[contains(text(),'%s')]/following-sibling::article//input";
    public static final String COMMON_TAB = "//a[text()='%s']";
    public static final String COMMON_ICON = "//a[@title='%s']/i";
    public static final String COMMON_RADIO_BUTTON = "//label[text()='%s']/preceding-sibling::input";
    public static final String AVATAR= "//div[@class='avatar avatar-online']";
    public static final String DANG_XUAT_LINK= "//a[contains(.,'????ng xu???t')]";
    public static final String TEN_PAGE_TITLE = "//h3[contains(@class,'content-header-title') and text()='%s']";//anh Hai

}
