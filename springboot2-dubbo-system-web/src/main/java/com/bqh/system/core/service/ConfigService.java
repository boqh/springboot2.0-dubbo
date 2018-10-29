package com.bqh.system.core.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.bqh.system.service.SysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RuoYi首创 html调用 thymeleaf 实现参数管理
 * 
 * @author ruoyi
 */
@Service("config")
public class ConfigService
{
    @Reference(version = "1.0.0")
    private SysConfigService configService;

    /**
     * 根据键名查询参数配置信息
     * 
     * @param configName 参数名称
     * @return 参数键值
     */
    public String getKey(String configKey)
    {
        return configService.selectConfigByKey(configKey);
    }
}
