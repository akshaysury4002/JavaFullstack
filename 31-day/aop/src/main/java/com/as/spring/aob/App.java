package com.as.spring.aob;

import java.lang.ProcessBuilder.Redirect;
import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.as.spring.aob.config.AppConfig;
import com.as.spring.aob.xl.XLReader;



public final class App {
  
    public static void main(String[] args) {
        
      
       
            ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

           //  XLReader reader =  ctx.getBean(XLReader.class);
    
            XLReader reader1 =  (XLReader) ctx.getBean("XLReader");
            reader1.readXLData();
    
    }
}
