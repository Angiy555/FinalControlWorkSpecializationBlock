package Program.Model;

import java.time.LocalDate;
import java.util.List;

public class Horse extends PackAnimal{

    public Horse(int ID, String name, LocalDate birthday, int age, List<String> commands, int packAnimalTypeID){

        super(ID, name, birthday, age, commands, packAnimalTypeID);
    }

}
