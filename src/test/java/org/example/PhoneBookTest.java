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
    @DisplayName("Тест запрета добавлять повторяющиеся имена")
    void addDuplicate() {
        PhoneBook phoneBook = new PhoneBook();
        int actualValue;
        phoneBook.add("Иванов Иван", 79998887766l);
        actualValue = phoneBook.add("Иванов Иван", 79998887755l);

        Assertions.assertEquals(1, actualValue);
        Assertions.assertEquals(79998887766l, phoneBook.findByName("Иванов Иван"));
    }
}