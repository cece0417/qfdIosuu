package autoui.pages;


import autoui.pageuis.myclassPageUI;
import macaca.java.biz.BasePage;

/**
 * Created by caixiaoxue on 2017/3/2.
 */
public class myclassPage extends BasePage {


    public myclassPage(String pageDesc){

        super(pageDesc);

    }

    public void onclickAppointment() throws Exception{

        driver.onclickBean(myclassPageUI.appointment);
    }

}
