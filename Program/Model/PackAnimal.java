package Program.Model;

import java.time.LocalDate;
import java.util.List;

public abstract class PackAnimal extends Animals{

    protected int packAnimalTypeID;

    public PackAnimal(int ID, String name, LocalDate birthday, int age, List<String> commands, int packAnimalTypeID){
        super(ID, name, birthday, age, commands);
        this.packAnimalTypeID = packAnimalTypeID;
    }

    public int getPackAnimalTypeID(){
        return packAnimalTypeID;
    }

    public void setPackAnimalTypeID(int packAnimalTypeID){
        this.packAnimalTypeID = packAnimalTypeID;
    }
}
