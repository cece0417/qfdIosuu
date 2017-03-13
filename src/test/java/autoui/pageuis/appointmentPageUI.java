package autoui.pageuis;

import com.alibaba.fastjson.JSONArray;
import macaca.client.commands.Context;
import macaca.client.common.ElementSelector;
import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePageUI;
import macaca.java.biz.CommonUIBean;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/**
 * Created by caixiaoxue on 2017/3/2.
 */
public class appointmentPageUI extends BasePageUI {

    public static final CommonUIBean nameByc =
            new CommonUIBean(GetElementWay.CLASS_NAME,"TextField","nameByc");
    public static final CommonUIBean nameByx =
            new CommonUIBean(GetElementWay.XPATH,
                    "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]","nameByx");

    public static final CommonUIBean phoneByc = new CommonUIBean(GetElementWay.CLASS_NAME,"TextField","phoneByc");
    public static final CommonUIBean phoneByx = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[2]","phoneByx");

    public static final CommonUIBean gradeByc = new CommonUIBean(GetElementWay.CLASS_NAME,"Button","gradeByc");
    public static final CommonUIBean gradeByx = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]","gradeByx");

    public static final CommonUIBean subjectByc = new CommonUIBean(GetElementWay.CLASS_NAME,"Button","subjectByc");
    public static final CommonUIBean subjectByx = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[2]","subjectByx");

    public static final CommonUIBean appointByc = new CommonUIBean(GetElementWay.CLASS_NAME,"Button","appointByc");
    public static final CommonUIBean appointByx = new CommonUIBean(GetElementWay.XPATH,"//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[3]","appointByx");
    public static final CommonUIBean appointByn = new CommonUIBean(GetElementWay.NAME,"立即预约","appiontByn");

    public static final CommonUIBean UIBUTTON = new CommonUIBean(GetElementWay.CLASS_NAME,"XCUIElementTypeButton","UIBUTTON");
    public static final CommonUIBean UIPatchWheel = new CommonUIBean(GetElementWay.CLASS_NAME,"XCUIElementTypePickerWheel","pickWheel");

    public static final CommonUIBean SURE = new CommonUIBean(GetElementWay.NAME,"确定","sure");


    public static final CommonUIBean OTHER = new CommonUIBean(GetElementWay.CLASS_NAME,"XCUIElementTypeOther","other");

}
