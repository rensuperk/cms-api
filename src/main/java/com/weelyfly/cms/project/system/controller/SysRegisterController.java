package com.weelyfly.cms.project.system.controller;

import com.weelyfly.cms.common.utils.StringUtils;
import com.weelyfly.cms.project.system.service.ISysConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.weelyfly.cms.framework.security.RegisterBody;
import com.weelyfly.cms.framework.security.service.SysRegisterService;
import com.weelyfly.cms.framework.web.controller.BaseController;
import com.weelyfly.cms.framework.web.domain.AjaxResult;

/**
 * 注册验证
 * 
 * @author cms
 */
@RestController
public class SysRegisterController extends BaseController
{
    @Autowired
    private SysRegisterService registerService;

    @Autowired
    private ISysConfigService configService;

    @PostMapping("/register")
    public AjaxResult register(@RequestBody RegisterBody user)
    {
        if (!("true".equals(configService.selectConfigByKey("sys.account.registerUser"))))
        {
            return error("当前系统没有开启注册功能！");
        }
        String msg = registerService.register(user);
        return StringUtils.isEmpty(msg) ? success() : error(msg);
    }
}
