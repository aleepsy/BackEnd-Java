package practicaHarry;

public class Wizard {
    //Caracteristicas
    public String name;
    public String gender;
    public String house;
    public String boggart;
    public String patronus;

    //Getters
    public String getName(){  return name;  }
    public String getGender(){  return gender;  }
    public String getHouse(){  return house;  }
    public String getBoggart(){  return boggart;  }
    public String getPatronus(){  return patronus;  }

    //Setters
    public boolean setName(String name){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        } else
            return false;
    }

    public boolean setGender(String gender){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        } else
            return false;
    }

    public boolean setHouse(String house){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        } else
            return false;
    }

    public boolean setBoggart(String boggart){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        } else
            return false;
    }

    public boolean setPatronus(String patronus){
        if(!patronus.isEmpty()){
            this.patronus = patronus;
            return true;
        } else
            return false;
    }

    //metodo showInfo devuelve la informacion de cada mago
    public String showInfo(){
        return "Name: "+name+
                "\nGender: "+gender+
                "\nHouse: "+house+
                "\nBoggart: "+boggart+
                "\nPatronus: "+patronus+
                "\n*****************************************";
    }

}
