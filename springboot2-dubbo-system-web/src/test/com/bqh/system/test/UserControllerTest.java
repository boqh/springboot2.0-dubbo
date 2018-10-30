package com.bqh.system.test;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bqh.system.domain.SysUser;
import com.bqh.system.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest
public class UserControllerTest {

    private MockMvc mvc;

    @Reference
    private SysUserService sysUserService;


    @Test
    public void userInfo() throws Exception {
        SysUser sysUser = new SysUser();
        System.out.println("------------"+sysUserService.selectUserList(sysUser).size());
    }

    //    @Before
//    public void setUp() {
//        mvc = MockMvcBuilders.standaloneSetup(userController).build();
//    }

    /**
     * perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
     * get:声明发送一个get请求的方法。MockHttpServletRequestBuilder get(String urlTemplate, Object... urlVariables)：根据uri模板和uri变量值得到一个GET请求方式的。另外提供了其他的请求的方法，如：post、put、delete等。
     * param：添加request的参数，如下面发送请求的时候带上了name和password参数。假如使用需要发送json数据格式的时将不能使用这种方式，可见后面被@ResponseBody注解参数的解决方法
     * andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
     * andDo：添加ResultHandler结果处理器，比如调试时打印结果到控制台（对返回的数据进行的判断）；
     * andReturn：最后返回相应的MvcResult；然后进行自定义验证/进行下一步的异步处理（对返回的数据进行的判断）
     * @throws Exception
     */
//    @Test
//    public void login() throws Exception {
//        RequestBuilder request = post("/api/user/login")
//                .contentType(MediaType.APPLICATION_JSON)
//                .param("username","konghang")
//                .param("password","123456");
//        String rs = mvc.perform(request)
//                //.andDo(print())
//                .andExpect(status().isOk())
//                .andReturn()
//                .getResponse()
//                .getContentAsString();
//        System.out.println(rs);
//    }

//    @Test
//    public void register() throws Exception {
//        RequestBuilder request = post("/api/user/register")
//                .contentType(MediaType.APPLICATION_JSON)
//                .param("username","konghang1")
//                .param("password","123456")
//                .param("email","test@123.com")
//                .param("nickname","test");
//        String rs = mvc.perform(request)
//                //.andExpect(status().isOk())
//                .andReturn()
//                .getResponse()
//                .getContentAsString();
//        System.out.println(rs);
//    }

//    @Test
//    public void userInfo() throws Exception {
//        RequestBuilder request = post("/api/user")
//                .contentType(MediaType.APPLICATION_JSON)
//                .header("Authorization","11");
//        String rs = mvc.perform(request)
//                //.andDo(print())
//                .andExpect(status().isOk())
//                .andReturn()
//                .getResponse()
//                .getContentAsString();
//        System.out.println(rs);
//    }

}