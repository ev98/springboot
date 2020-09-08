package com.ev;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.swing.text.html.HTML;
import java.io.File;

@SpringBootTest
class Springboot07YibuApplicationTests {

    @Autowired
    JavaMailSenderImpl mailSender;

    @Test
    void contextLoads() {

        //一个简单的邮件
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();

        simpleMailMessage.setSubject("hello,ev");
        simpleMailMessage.setText("加油！");

        simpleMailMessage.setTo("1301493116@qq.com");
        simpleMailMessage.setFrom("1301493116@qq.com");

        mailSender.send(simpleMailMessage);
    }

    @Test
    void contextLoads2() throws MessagingException {

        //一个复杂的邮件
        MimeMessage mimeMessage = mailSender.createMimeMessage();
        //组装
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
        //正文
        helper.setSubject("赵一玮");
        helper.setText("<p style='color:red'>你好瘦啊</p>",true);
        //附件
        helper.addAttachment("1.jpg",new File("D:\\GONGJU\\Hbuilder\\daima\\EV_html\\img2\\1.jpg"));

        helper.setTo("1301493116@qq.com");
        helper.setFrom("1301493116@qq.com");

        mailSender.send(mimeMessage);
    }

}
