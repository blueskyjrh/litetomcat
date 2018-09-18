package com.litetomcat;

import java.util.ArrayList;
import java.util.List;

public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    static {
        servletMappingList.add(new ServletMapping("findGirl", "/girl", "com.litetomcat.servlets.FindGirlServlet"));
    }
}
