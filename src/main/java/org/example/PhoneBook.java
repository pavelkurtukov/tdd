package org.example;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    Map<String, Long> phones;

    public PhoneBook() {
        phones = new HashMap<>();
    }

    // Добавление имени и номера телефона
    public int add(String name, long phone) {
        phones.putIfAbsent(name, phone);
        return phones.size();
    }

    // Поиск телефона по имени
    public long findByName(String name) {
        return 0;
    }
}