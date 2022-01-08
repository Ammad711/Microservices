package com.contact.service;
import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService {

    // fake list of contacts
    public static List<Contact> list=new ArrayList<>();
    static {
        Contact ob=new Contact(1L,"aman@gmail.com","Aman",1311L);
        Contact ob2=new Contact(2L,"armaan@gmail.com","Armaan",1312L);
        Contact ob3=new Contact(3L,"amit@gmail.com","Amit",1313L);
        Contact ob4=new Contact(4L,"sameer@gmail.com","Sameer",1314L);
        list.add(ob);
        list.add(ob2);
        list.add(ob3);
        list.add(ob4);
    }

    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
