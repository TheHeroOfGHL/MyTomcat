package wj.mytomcat;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weilong
 * @version 2019/5/15
 */
public class ServletMappingConfig {
    public static List<ServletMapping> servletMappingList =new ArrayList<>();
    //制定哪个URL交给哪个servlet来处理
    static{
        servletMappingList.add(new ServletMapping("findGirl","/girl","wj.mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("helloWorld","/world","wj.mytomcat.HelloWorldServlet"));
    }
}
