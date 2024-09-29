package Program.Model;

public enum PackAnimalType {
    Horse,
    Camel,
    Donkey;

    public static PackAnimalType getType(int tipeID){
        switch (tipeID) {
            case 1:
                return PackAnimalType.Horse;
            case 2:
                return PackAnimalType.Camel;
            case 3:
                return PackAnimalType.Donkey;
            default:
                return null;
        }
    }
}
