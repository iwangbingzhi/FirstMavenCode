package cn.google;

import com.opensymphony.xwork2.ActionSupport;

public class CustomerAction extends ActionSupport{
    public String save() throws Exception{
        System.out.println("customeraction的save方法被调用了");
        return SUCCESS;
    }
}
