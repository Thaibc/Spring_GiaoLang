package com.baobao.spring.ioc.v1scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//class nay la noi khai bao cac object dependency va chich vao cho cac class bi phu thuoc
//gui cho Spring container để nó giữ
//khai báo cho Spring biết luu dependency khác mà ta ko tự tạo, IoC hẳn cho Spring lo dùm
// tóm lại đây là class lưu các dependency mà ta nhờ thư viện Spring lo dùm
//các object dependency sẽ đc khai báo ở class này  và sau đó chuyển giao lại cho Spring lo

@Configuration
// những object dependency từ nay sẽ gọi là Bean
@ComponentScan("com.baobao.spring.ioc.v1scan") //scan tat ca package nay xem Class nay co @Component / @Service / @Repository thì quan ly nó
//@ComponentScan(basePackages = {"package1","package"}) su dung cai nay neu muon add nhieu package

public class AppConfig {
}
