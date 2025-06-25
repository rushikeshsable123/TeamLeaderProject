package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ProjectTeamLeaderApplication {

	public static void main(String[] args) {
		
		
		SpringApplication.run(ProjectTeamLeaderApplication.class, args);
		System.out.println("This is Project Relation Executive Model");
	}

}
