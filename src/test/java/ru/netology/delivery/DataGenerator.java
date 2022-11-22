package ru.netology.delivery;


import com.github.javafaker.Faker;
import lombok.Value;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

public class DataGenerator {
    private DataGenerator() {
    }

    public static String generateCity() {

        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Москва");
        cityList.add("Омск");
        cityList.add("Пенза");
        cityList.add("Астрахань");
        cityList.add("Самара");
        cityList.add("Сочи");
        cityList.add("Биробиджан");
        cityList.add("Благовещенск");
        cityList.add("Брянск");
        cityList.add("Великий Новгород");
        cityList.add("Владивосток");
        cityList.add("Владикавказ");
        cityList.add("Владимир");
        cityList.add("Волгоград");
        cityList.add("Вологда");
        cityList.add("Воронеж");
        cityList.add("Горно-Алтайск");
        cityList.add("Грозный");
        cityList.add("Екатеринбург");
        cityList.add("Иваново");
        cityList.add("Ижевск");
        cityList.add("Иркутск");
        cityList.add("Тула");

        Collections.shuffle(cityList);

        String city = cityList.get(7);
        return city;
    }


    public static String generateName(String locale) {
        var faker = new Faker(new Locale(locale));
        return faker.name().lastName() + " " + faker.name().firstName();
    }

    public static String generatePhone(String locale) {
        var faker = new Faker(new Locale(locale));
        return faker.phoneNumber().phoneNumber();
    }




    public static class Registration {
        private static String city;
        private static String name;
        private static String phone;

        private Registration() {
        }


        public static UserInfo generateUser(String locale) {
            return new UserInfo(generateCity(), generateName(locale), generatePhone(locale), city, name, phone);
        }
    }

            @Value
            public static class UserInfo {
                String city;
                String name;
                String phone;

                public UserInfo(String generateCity, String generateName, String generatePhone, String city, String name, String phone) {

                    this.city = city;
                    this.name = name;
                    this.phone = phone;


                }
            }


        public static String generateDate(int shift) {
            return LocalDate.now().plusDays(shift).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        }


    }


