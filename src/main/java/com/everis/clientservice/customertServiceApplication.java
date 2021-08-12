package com.everis.clientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient; 

@EnableEurekaClient 
@SpringBootApplication
public class customertServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(customertServiceApplication.class, args);
    System.out.println("-Micro servicio cliente, activado.");
  }
}
