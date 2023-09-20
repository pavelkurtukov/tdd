package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
    @Test
    @DisplayName("Тест вставки и возврата количества записей")
    void addCount() {
        PhoneBook phoneBook = new PhoneBook();
        int actualValue;
        phoneBook.add("Иванов Иван", 79998887766l);
        actualValue = phoneBook.add("Петров Пётр", 79998887755l);

        Assertions.assertEquals(2, actualValue);
    }

    @Test
    @DisplayName("Тест поиска номера телефона по имени")
    void findByName() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван", 79998887755l);

        Assertions.assertEquals(79998887755l, phoneBook.findByName("Иванов Иван"));
    }

    @Test
    @DisplayName("Тест запрета добавлять повторяющиеся имена")
    void addDuplicate() {
        PhoneBook phoneBook = new PhoneBook();
        int actualValue;
        phoneBook.add("Иванов Иван", 79998887766l);
        actualValue = phoneBook.add("Иванов Иван", 79998887755l);

        Assertions.assertEquals(1, actualValue);
        Assertions.assertEquals(79998887766l, phoneBook.findByName("Иванов Иван"));
    }

    @Test
    @DisplayName("Тест поиска имени по номеру телефона")
    void findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Иванов Иван", 79998887755l);

        assertEquals("Иванов Иван", phoneBook.findByNumber(79998887755l));
    }
}