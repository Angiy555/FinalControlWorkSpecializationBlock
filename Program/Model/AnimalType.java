package Program.Model;

public enum AnimalType {

    Pet,
    PackAnimal;

    public static AnimalType getType(int tipeID){
        switch (tipeID) {
            case 1:
                return AnimalType.Pet;
            case 2:
                return AnimalType.PackAnimal;
            default:
                return null;
        }
    }
}
