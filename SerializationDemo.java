/**
 * Created by 12 on 06.06.2018.
 */
public class SerializationDemo {

    public static void main(String[] args) {

            Person person = new Person("user1",1,22);

            final  String fileName = "C:person.ser";
        System.out.println("above to serialize...");

        Util.serialzeObject(person,fileName);


        try {
            System.out.println("about to deserialize...");


            person  = (Person)Util.deSerialzeObject(fileName);
            System.out.println("id " + person.getId() + " Name "+ person.getName()
                    + " Age " + person.getAge());

        }

        catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
