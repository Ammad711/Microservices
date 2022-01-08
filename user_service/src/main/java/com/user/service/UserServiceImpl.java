package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

        // fake user list
        public static List<User> list = new ArrayList<>();

        static {
            User ob = new User(1311L, "234234", "Aman");
            User ob2 = new User(1312L, "89126739", "Armaan");
            User ob3 = new User(1313L, "678763", "Amit");
            list.add(ob);
            list.add(ob2);
            list.add(ob3);
        }

    @Override
    public User getUser(Long id) {
        return  this.list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
