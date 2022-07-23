package com.malyschewa.lesson7;

/*
Отсортировать записи, хранящиеся в записной книжке по времени их добавления и вывести в этом порядке в консоль
 */

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;

public class NotebookDate {

    public static void main(String[] args) {
        Record record1 = new Record("When the going gets tough , the tough get going", LocalDateTime.of(1997, 11, 20, 17, 35));
        Record record2 = new Record("A penny saved is a penny earned", LocalDateTime.of(2007, 11, 20, 18, 35));
        Record record3 = new Record("He that mischief hatches mischief catches", LocalDateTime.of(2007, 11, 20, 9, 35));
        Record[] list = new Record[]{record1, record2, record3};
        Arrays.sort(list, new Comparator<Record>() {
            @Override
            public int compare(Record o1, Record o2) {
                return o1.getTime().compareTo(o2.getTime());
            }
        });
        for (Record i :
                list) {
            System.out.println(i);

        }
    }
}

class Record {
    private String text;
    private LocalDateTime time;

    public Record(String text, LocalDateTime time) {
        this.text = text;
        this.time = time;
    }

    @Override
    public String toString() {
        return "Record{" +
                "text='" + text + '\'' +
                ", time=" + time +
                '}';
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}


