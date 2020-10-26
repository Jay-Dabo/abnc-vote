//*********************************************************************************
// PrimariesEllectionApplication.java 				 Author; Jeffrey K. D. A. Amoah
// 
// A voting software for the New Patriotic Party (Ablekuma North Constituency), NPP
//*********************************************************************************
package com.ablekumanorthprimaries.election;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PrimariesElectionApplication {

	public static void main(String[] dabo) {
		SpringApplication.run(PrimariesElectionApplication.class, dabo);
	}

}
