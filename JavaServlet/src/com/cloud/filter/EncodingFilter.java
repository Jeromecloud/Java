package com.cloud.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
 /*Web 中过滤器的作用：
         1.可以在请求资源之前设置请求的编码
         2.可以进行登录校验
         3.可以进行请求参数的内容的过滤
         4.数据压缩 / 数据加密 / 数据格式的转换
         5.可以设置浏览器相关的数据
    1、在启动服务器的时候，就创建了 Filter 对象并执行了初始化方法 init()。Filter 先于 Servlet 存在于服务端
    2、在应用中允许存在多个 Filter ，执行顺序取决于在 web.xml 中定义的先后次序
    （如果使用注解配置，则 Filter 的执行顺序由 Filter 的类名的字母的顺序来决定，如 AFilter 和 BFilter，则先执行 AFilter）
    3、一个 Filter 可以配置多个 <url-pattern> 也可以对指定的 Servlet 做过滤
    （注解通过 servletNames 指定，配置由 <servlet-name> 指定）
    4、默认情况下，Filter 只对新的请求做拦截，如果是请求转发，则不会过滤。
        <dispatcher>配置项指定了 Filter 的过滤时间：
        REQUEST：只对请求做过滤，默认选项，如果有该配置项则必须显式写明
        FORWARD：只对请求转发(forword)方式做过滤
        ERROR：只对跳转到全局的错误页面做过滤
        INCLUDE：只对请求包含(include)方式做过滤
        对应的注解属性为:dispatcherTypes
 */
@WebFilter(filterName = "EncodingFilter",urlPatterns = "/*")
public class EncodingFilter implements Filter {
    public EncodingFilter(){
        System.out.println("过滤器构造器执行");
     }
    public void destroy() {
        System.out.println("过滤器销毁");
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        chain.doFilter(request, response);
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("过滤器初始化");
    }

}
