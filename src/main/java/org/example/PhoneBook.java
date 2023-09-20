package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

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
        return phones.get(name).longValue();
    }

    // Поиск имени по телефону
    public String findByNumber(long number) {
        for (Map.Entry<String, Long> map : phones.entrySet()) {
            if (map.getValue() == number) return map.getKey();
        }
        return "";
    }

    // Вывод всех имён в алфавитном порядке
    public void printAllNames() {
        System.out.println("0");
    }
}