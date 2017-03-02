package autoui.pages;

import macaca.java.biz.BaseMacacaClient;
import macaca.java.biz.BasePage;
import autoui.pageuis.myclassPageUI;

/**
 * Created by caixiaoxue on 2017/3/2.
 */
public class myclassPage extends BasePage{


    public myclassPage(String pageDesc){

        super(pageDesc);

    }

    public void onclickAppointment() throws Exception{

        driver.onclickBean(myclassPageUI.appointment);
    }

}
