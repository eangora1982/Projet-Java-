package org.sid;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.sid.dao.ContactRepository;
import org.sid.entities.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AngularJavaeApplication implements CommandLineRunner{
	@Autowired
	private ContactRepository contactRepository;

	public static void main(String[] args) {
		SpringApplication.run(AngularJavaeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		DateFormat df=new SimpleDateFormat("dd/MM/yyyy");
		contactRepository.save(new Contact("ANGORA","Barth",df.parse("29/01/1989"),"ehueni.angora@gmail.com",68909445,"barth.png" ));
		contactRepository.save(new Contact("ANGORA","Bob",df.parse("29/01/1989"),"ehueni.angora@gmail.com",68909445,"barth.png" ));
		contactRepository.save(new Contact("ANGORA","Mamert",df.parse("29/01/1989"),"ehue.angora@gmail.com",68909445,"Earth.png" ));
		contactRepository.findAll().forEach(c->{
			System.out.println(c.getNom());
		});
		
	}

}
