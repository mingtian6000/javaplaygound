package org.example.serial;

import lombok.*;

import javax.annotation.processing.Generated;
import java.io.*;

@Setter
@Getter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Serializable {
    private String name;
    private String career;
    private int age;
    @SneakyThrows
    public void writeObject(ObjectOutput out){
        out.writeInt(age);
        out.writeUTF(name);
        out.writeUTF(career);
    }
    @SneakyThrows
    public void readObject(ObjectInput in){
        age=in.readInt();
        name=in.readUTF();
        career=in.readUTF();

    }

    @SneakyThrows
    public static void main(String[] args) {
        Person p = new PersonBuilder().age(18).name("hello").career("student").build();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("test.txt")));
        p.writeObject(oos);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("test.txt")));
        Person pp = new Person();
        pp.readObject(ois);
        System.out.println(pp);
        ois.close();
    }
}
