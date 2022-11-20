package ru.mirea.newpr.pr13_done.num3;

import java.util.StringTokenizer;

public class Address {

    final private String country, region, city, street, house, housing, flat;

    public Address(String address, boolean isMultiDivider){
        if(address == null) throw new NullPointerException();
        String[] s;
        if(isMultiDivider){
            StringTokenizer token = new StringTokenizer(address, ",.;");
            s = new String[token.countTokens()];
            int i = 0;
            while(token.hasMoreTokens())
                s[i++] = token.nextToken();
        }
        else {
            s = address.split(",");
        }
        if(s.length < 7) {
            throw new IllegalArgumentException("\nНеверный формат адреса, слишком мало полей\n");
        }
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        housing = s[5].trim();
        flat = s[6].trim();
    }

    @Override
    public String toString() {
        return "Адресс:\n    Страна: " + country + "\n    Регион: " + region + "\n    Город: " + city + '\n' +
                "    Улица: " + street + "    Дом: " + house + "\n    Корпус: " + housing + '\n' +
                "    Квартира: " + flat + "\n";
    }


    public static void main(String [] args){
        Address first = new Address("Россия, Московская область, Москва, улица 54 Парковая, 54, 1, 1321", false);
        Address third = new Address("Россия, Московская область. Москва; улица 123 Парковая; 873, 3. 8743", true);
        System.out.println(first);
        System.out.println(third);
        Address second = new Address("Россия, Московская область, 405484", false);
        System.out.println(second);

    }
}
