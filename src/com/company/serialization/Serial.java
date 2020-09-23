package com.company.serialization;
import java.io.*;
import java.util.*;

/*
 *- Создать список объектов типа "Человек" с полями имя, возраст и род деятельности.
 * Данный список объектов должен быть сериализован в файл при помощи интерфейса
 * Serializable, при этом поле род деятельности не должно сериализовываться -
 * оно должно быть вычислимым. Соответственно при десериализации оно должно
 * вычисляться (и заполняться в объектах) по следующему правилу: если человеку от
 * 0 до 3 лет - он сидит дома, если человеку от 3 до 7 лет - ходит в детский сад,
 * от 7 до 18 лет - учится в школе, от 17 до 23 - учится в институте, от 24 до 65
 * - ходит на работу, от 65 и выше - на пенсии.
 */

public class Serial {


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<SerializationPeople> listOfPeople = new ArrayList<SerializationPeople>();
        SerializationPeople firstMan = new SerializationPeople("Denis", 24);
        SerializationPeople secondMan = new SerializationPeople("Oleg", 67);
        SerializationPeople thirddMan = new SerializationPeople("Nastya", 2);
        listOfPeople.add(firstMan);
        listOfPeople.add(secondMan);
        listOfPeople.add(thirddMan);

        //serialization
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\Денис\\Desktop\\save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(listOfPeople);
        objectOutputStream.close();
        System.out.println("Before Serialization:\n");
        System.out.println(listOfPeople + "\n");
        //deserialization
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\Денис\\Desktop\\save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        List<SerializationPeople> listOfPeople1 = (ArrayList<SerializationPeople>) objectInputStream.readObject();
        System.out.println("After Serialization:\n");

        for (SerializationPeople s : listOfPeople1) {
            s.definition();
            System.out.println(s);

        }




    }

}
