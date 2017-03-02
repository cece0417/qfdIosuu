package autoui.pageuis;

import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

/**
 * Created by caixiaoxue on 2017/3/2.
 */
public class appointmentPageUI extends BasePageUI {

    public static final CommonUIBean nameByc = new CommonUIBean(GetElementWay.CLASS_NAME,"TextField","nameByc");
    public static final CommonUIBean nameByx = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]","nameByx");

    public static final CommonUIBean phoneByc = new CommonUIBean(GetElementWay.CLASS_NAME,"Button","phoneByc");
    public static final CommonUIBean phoneByx = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]","phoneByc");

}
