package Program.Model;

import java.time.LocalDate;
import java.util.List;
import java.time.format.DateTimeFormatter;

public abstract class Animals {

    protected int ID;
    protected String name;
    protected LocalDate birthday;
    protected int age;
    protected List<String> commands;

    public Animals(int ID, String name, LocalDate birthday, int age, List<String> commands){
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
        this.age = age;
        this.commands = commands;
    }

    public int getId(){
        return ID;
    }

    public void setID(int ID){
        this.ID = ID;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getBirthday(){
        return birthday;
    }

    public void setBirthday(LocalDate birthday){
        this.birthday = birthday;
    }

    public String getBirthdayString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return formatter.format(birthday);
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public List<String> getCommands(){
        return commands;
    }

    public void setCommands(List<String> commands){
        this.commands = commands;
    }

    @Override
    public String toString(){
        return String.format("%d. name: %s, birthday: %s", ID, name, getBirthdayString());
    }
}
