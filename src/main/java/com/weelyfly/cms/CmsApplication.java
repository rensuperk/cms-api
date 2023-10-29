package com.weelyfly.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 * 
 * @author ruoyi
 */
@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class CmsApplication
{
    public static void main(String[] args)
    {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(CmsApplication.class, args);
        System.out.println(
                "\n" +
                        "_________     _____    _________\n" +
                        "\\_   ___ \\   /     \\  /   _____/\n" +
                        "/    \\  \\/  /  \\ /  \\ \\_____  \\ \n" +
                        "\\     \\____/    Y    \\/        \\\n" +
                        " \\______  /\\____|__  /_______  /\n" +
                        "        \\/         \\/        \\/ ");
    }
}
