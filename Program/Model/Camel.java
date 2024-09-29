package Program.Model;

import java.time.LocalDate;
import java.util.List;

public class Camel extends PackAnimal{

    public Camel(int ID, String name, LocalDate birthday, int age, List<String> commands, int packAnimalTypeID){

        super(ID, name, birthday, age, commands, packAnimalTypeID);
    }

}
