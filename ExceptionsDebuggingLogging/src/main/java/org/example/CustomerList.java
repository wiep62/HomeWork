package org.example;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CustomerList {

    //   TreeMap<String, String> map = new TreeMap<>();
    TreeMap<String, String> map = new TreeMap<>();

    boolean isPhoneBoolean(String phone){
        boolean isPhone;
        // String regex = "7[0-9]{10}";
        String regex = "[0-9]+?";
        if (phone.matches(regex)){
            //   System.out.println("правильный номер : " + phone);
            return  isPhone = true;
        }
        // System.out.println("Неправильный номер : " );

        return false;
    }
    boolean isNameBoolean(String name){
        boolean isName;
        // String regex = "[а-яА-я]+\\s?[а-яА-я]+?";
        String regex = "[а-яА-я]+?";
        if (name.matches(regex)){
            ///   System.out.println("правильное имя: " + name);

            return isName =  true;
        }
        //  System.out.println("НЕправильное имя: " + name);

        return isName =  false;

    }
    public void addContact(String phone, String name) {
        // проверьте корректность формата имени и телефона
        if (isNameBoolean(name) ==true && isPhoneBoolean(phone) ==true){
            map.put(phone, name);
            /**   String phone1 = phone;  //todo Как заменить имя  пользователя при совпадении телефона.
             if (map.containsKey(phone1)){
             System.out.println("Такой номер уже есть, перезаписываем имя абонента:" + map.values() + " с номером : " +  phone);
             //    map.replace(phone,name);
             }*/

          /*  for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println("Номер телефона: " + entry.getKey() + ", Имя: " + entry.getValue());
            }*/

        } else {
            System.out.println("Неверный формат ввода!");

        }
        // (рекомедуется написать отдельные методы для проверки является строка именем/телефоном)
        // если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public String getContactByPhone(String phone) {

        /**
         * Метод getContactByPhone().Дополнительное условие задачи - если контакт не найден - вернуть пустую строку.
         * На вход метода будем передавать строку с номером телефона.
         * public String getContactByPhone(String phone) {
         * }
         * ✏️ Реализация интерфейса Map позволяет получить наборы как ключей(метод keySet()),
         * так и значений(метод values()), а метод entrySet() возвращает набор всех элементов в виде объектов Map.Entry<K, V>.
         * Мы реализуем исполнение данного метода, перебором всех ключей (Номера телефонов), а получать значение (Имена) будем используя
         * метод .get()
         * */
        // если контакт не найдены - вернуть пустую строку
        String phoneFind = "";

/*        for (Map.Entry<String, String> entry : map.entrySet()) { //todo первый вариант поиска
if (entry.getKey().equals(phone)){
    phoneFind = "Имя : " + entry.getValue() + "\n" + "Номер телефона : " + entry.getKey();
}*/

        for (String key : map.keySet()) {
            if (phone.equals(key)){
                phoneFind =  map.get(key) + " - " + key;
            }
        }

        return phoneFind;
    }

    public Set<String> getContactByName(String name) {
        Set<String> nameFind = new TreeSet<>();
        // формат одного контакта "Имя - Телефон"
        for (String key : map.keySet()) {
            if (name.equals(map.get(key))){
                // nameFind = "Имя : " + map.get(key) + "\n" + "Номер телефона : " + key;
                nameFind.add(map.get(key) + " - " + key);
            }
        }

        return nameFind;

    }

    public Set<String> getAllContacts() {
        Map<String, String> mapForEqualsPhone = new TreeMap<>();
        Set<String> allContacts = new TreeSet<>();

        for (Map.Entry<String, String> entry : map.entrySet()) { //перебор элементов
            if (mapForEqualsPhone.containsKey(entry.getValue())) {
                String contact = mapForEqualsPhone.get(entry.getValue());
                mapForEqualsPhone.put(entry.getValue(), contact.concat(", ").concat(entry.getKey()));
            } else {
                mapForEqualsPhone.put(entry.getValue(), entry.getKey());
            }
        }
        for (String key : mapForEqualsPhone.keySet()) {allContacts.add(key + " - " + mapForEqualsPhone.get(key));
        }
        return allContacts;


        /**
         * public Set<String> getContactTwoNumbers(String phone, String name) {
         *     TreeSet<String> result = new TreeSet<>();
         *     String key = "";
         *     String namePlusNumber = "";
         *     if (phoneBookTreeMap.containsValue(name)){
         *         for(String k : phoneBookTreeMap.keySet())
         *         {
         *             if (phoneBookTreeMap.get(k).equals(name)){
         *                 key = k;
         *                 result.add(name + " - " + key + ", " + phone);
         *                 namePlusNumber = key + ", " + phone;
         *                 break;
         *             }
         *         }
         *     }
         *     phoneBookTreeMap.remove(key); // сюда передаем старый контакт по номеру (key) и удаляем его, чтобы остался в Map только один контакт с двумя номерами
         *     phoneBookTreeMap.put(namePlusNumber, name); // сюда добавляем в наш Map "новый" контакт уже с двумя номерами
         *     return result;
         * }
         * */
    }


}
