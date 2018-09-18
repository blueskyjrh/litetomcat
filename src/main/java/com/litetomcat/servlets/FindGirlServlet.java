package com.litetomcat.servlets;

import com.litetomcat.MyRequest;
import com.litetomcat.MyResponse;
import com.litetomcat.MyServlet;

import java.io.IOException;

public class FindGirlServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("get a girl...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("post a girl...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
