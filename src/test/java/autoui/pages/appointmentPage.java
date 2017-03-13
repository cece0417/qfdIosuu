package autoui.pages;

import autoui.pageuis.appointmentPageUI;
import macaca.client.commands.Element;
import macaca.client.common.GetElementWay;
import macaca.java.biz.BasePage;

import java.util.List;

/**
 * Created by caixiaoxue on 2017/3/7.
 */
public class appointmentPage extends BasePage{

    public appointmentPage (String pageDesc){

        super(pageDesc);
    }

    public void appointment(String nameByx,String phoneByx) throws Exception {

        driver.clearText(appointmentPageUI.nameByx);
        driver.inputBean(appointmentPageUI.nameByx,nameByx);
        driver.clearText(appointmentPageUI.phoneByx);
        driver.inputBean(appointmentPageUI.phoneByx,phoneByx);
        //点击年级
        Element el=driver.findElementByIndex(appointmentPageUI.UIBUTTON,1);
        el.click();

        driver.scrollToElement(GetElementWay.valueOf("一年级"),"一年级");

        Element wheel = driver.findElementByIndex(appointmentPageUI.UIPatchWheel,0);
        System.out.print("打印："+wheel.getText());
        wheel.click();

        driver.onclickBean(appointmentPageUI.SURE);

        driver.onclickBean(appointmentPageUI.subjectByx);

        Element other = driver.findElementByIndex(appointmentPageUI.OTHER,13);
        System.out.println("other:"+other.getText());

        driver.onclickBean(appointmentPageUI.SURE);



        //driver.onclickBean(appointmentPageUI.gradeByx);
        //Element el = driver.findElement(appointmentPageUI.gradeByx);
        //el.click();

        //Element SUB = driver.findElementByIndex(appointmentPageUI.subjectByc,3);
        //System.out.print(el.getText());
        //driver.onclickBeanAtIndex(appointmentPageUI.subjectByc,3);
        driver.onclickBean(appointmentPageUI.appointByn);
    }

    public void scolltoup() throws Exception {
        driver.drag(150,437,150,400,0.05,10);
    }
}
