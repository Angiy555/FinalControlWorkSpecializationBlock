package Program.Model;

import java.time.LocalDate;
import java.util.List;

public abstract class Pet extends Animals{

    protected int petTypeID;

    public Pet(int ID, String name, LocalDate birthday, int age, List<String> commands, int petTypeID){
        super(ID, name, birthday, age, commands);
        this.petTypeID = petTypeID;
    }

    public int getPetTipeID(){
        return petTypeID;
    }

    public void setPetTypeID(int petTypeID){
        this.petTypeID = petTypeID;
    }
}
