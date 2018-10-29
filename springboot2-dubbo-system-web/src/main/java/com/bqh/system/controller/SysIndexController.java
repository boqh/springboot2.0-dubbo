package com.bqh.system.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bqh.common.config.Global;
import com.bqh.system.core.base.BaseController;
import com.bqh.system.domain.SysMenu;
import com.bqh.system.domain.SysUser;
import com.bqh.system.service.SysMenuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 首页 业务处理
 * 
 * @author ruoyi
 */
@Controller
public class SysIndexController extends BaseController
{
    @Reference(version = "1.0.0")
    private SysMenuService menuService;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        SysUser user = getUser();
        // 根据用户id取出菜单
        List<SysMenu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", Global.getCopyrightYear());
        return "index";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", Global.getVersion());
        return "main";
    }
}
