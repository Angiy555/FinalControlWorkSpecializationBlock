package Program.Model;

import java.time.LocalDate;
import java.util.List;

public class Cat extends Pet{

    public Cat(int ID, String name, LocalDate birthday, int age, List<String> commands, int petTypeID){

        super(ID, name, birthday, age, commands, petTypeID);
    }
}
