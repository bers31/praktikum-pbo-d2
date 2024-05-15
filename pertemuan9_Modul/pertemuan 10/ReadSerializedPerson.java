import java.io.*;

public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person person = null;

        try{
            FileInputStream f = new FileInputStream("person.ser");
            ObjectInputStream s = new ObjectInputStream(f);
            person = (Person)s.readObject();
            s.close();
            System.out.println("Serializable person name = "+person.getName());
            s.close();
        }catch(Exception ioe){
            ioe.printStackTrace();
        }
    }
}
