/**
 * Created by 12 on 06.06.2018.
 */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.Serializable;

public class Person implements Serializable{

    private static final long serialVersionUID = 9140203997753929147L;
    private String name;
    private int id;
    private int age;

    Person (String name, int id, int age){

        System.out.println("In constructor with args");
        this.name = name;
        this.id = id;
        this.age = age;

    }

    Person ()
    {

        System.out.println("no-arg constructor");

    }

    public String getName(){

        return name;

    }

    public int getAge(){

        return age;

    }

    public int getId(){

        return id;

    }

    private Object writeReplace (){

        System.out.println("In writeReplace() method");
        return new PersonProxy(this);

    }

    private static class PersonProxy implements Serializable{

        private static final long serialVersionUID = -5965328891170223339L;
        private String name;
        private int id;
        private int age;

        PersonProxy(Person p){

            this.name = p.name;
            this.id = p.id;
            this.age = p.age;

        }

        private Object readResolve (){

            System.out.println("In readresolve () method");
            return new Person (name, id, age);

        }

    }

}
