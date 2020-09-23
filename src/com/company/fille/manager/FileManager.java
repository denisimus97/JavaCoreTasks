package com.company.fille.manager;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.nio.file.*;

/*
 * - реализовать файловый менеджер (в виде консольного приложения).
 * На вход программе указывается абсолютный путь к файлу и ключ операции
 * (с параметрами), которую необходимо выполнить над файлом. Должны быть
 * реализованы операции создания файла, удаления, чтения, записи в файл.
 * Учесть пограничные случаи и не забыть про удобную обработку исключений
 * с выводом валидаций ользователю в консоль.*/
public class FileManager {
    private String link;


    public boolean userComand() {
        System.out.println("Формат ввода: путь к файлу -команда");
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String datas[] = command.split("\\s(|-|)");
        if (command.length() == 0)
            return false;
        this.link = datas[0];
        switch (datas[1]) {
            case "-create":
                try {
                    create();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "-write":
                try {
                    write();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                break;
            case "-delete":
                try {
                    delete();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            case "-read":
                try {
                    read();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
        }
        return true;
    }

    private void create() throws IOException {
        File file = new File(link);
        if (file.createNewFile()) {
            System.out.println(link + " Файл создан");
        } else {
            System.out.println("Файл " + link + " уже существует");
        }

    }

    private void write() throws IOException {
        FileWriter writer = new FileWriter(link);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine();
        writer.write(text);
        writer.close();

    }

    private void delete() throws IOException {
        try {
            Files.deleteIfExists(Paths.get(link));
        } catch (NoSuchFileException e) {
            System.out.println("Файл не найден!");
        }

        {
            System.out.println("Файл успешно удален");
        }


    }

    private void read() throws IOException {
        FileReader reader = new FileReader(link);
        int c;
        while ((c = reader.read()) != -1) {
            System.out.print((char) (c));
        }
        System.out.println(" ");
        reader.close();

    }
}


