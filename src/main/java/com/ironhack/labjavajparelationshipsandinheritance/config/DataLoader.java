package com.ironhack.labjavajparelationshipsandinheritance.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ironhack.labjavajparelationshipsandinheritance.model.contact.Contact;
import com.ironhack.labjavajparelationshipsandinheritance.model.contact.Name;
import com.ironhack.labjavajparelationshipsandinheritance.repository.ContactRepository;


@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(
            ContactRepository contactRepository
    ) {
        return args -> {

            Name name1 = new Name("Dr.", "Carmen", "Maria", "Carpio");
            Name name2 = new Name("Mr.", "Arturo", "Luis", "Cardenas");
            Name name3 = new Name("Mrs.", "Laura", "Elena", "Martinez");

            Contact contact1 = new Contact();
            contact1.setCompany("Health PR");
            contact1.setTitle("Director");
            contact1.setName(name1);

            Contact contact2 = new Contact();
            contact2.setCompany("Global Media");
            contact2.setTitle("Manager");
            contact2.setName(name2);

            Contact contact3 = new Contact();
            contact3.setCompany("Public Voice");
            contact3.setTitle("Consultant");
            contact3.setName(name3);

            contactRepository.save(contact1);
            contactRepository.save(contact2);
            contactRepository.save(contact3);
        };
    }
}
