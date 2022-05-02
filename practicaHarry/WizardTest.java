package practicaHarry;

public class WizardTest {
    public static void main(String[] args) {
        wizards();
    }

    public static void wizards(){
        //creamos al objeto Newt Scamander de la clase Wizard
        Wizard newtonScamander = new Wizard();
        newtonScamander.setName("Newton Scamander");
        newtonScamander.setGender("Male");
        newtonScamander.setHouse("Hufflepuff");
        newtonScamander.setBoggart("Office work");
        newtonScamander.setPatronus("Porcupine");
        System.out.println(newtonScamander.showInfo());

        //creamos al objeto Luna Lovegood
        Wizard lunaLovegood = new Wizard();
        lunaLovegood.setName("Luna Lovegood");
        lunaLovegood.setGender("Female");
        lunaLovegood.setHouse("Ravenclaw");
        lunaLovegood.setBoggart("Full moon");
        lunaLovegood.setPatronus("Hare");
        System.out.println(lunaLovegood.showInfo());

        //creamos al objeto Hermione Granger
        Wizard hermioneGranger = new Wizard();
        hermioneGranger.setName("Hermione Granger");
        hermioneGranger.setGender("Female");
        hermioneGranger.setHouse("Gryffindor");
        hermioneGranger.setBoggart("To fail exams");
        hermioneGranger.setPatronus("Otter");
        System.out.println(hermioneGranger.showInfo());

        //creamos al objeto Ronald Weasley
        Wizard ronaldWeasley = new Wizard();
        ronaldWeasley.setName("Ronald Weasley");
        ronaldWeasley.setGender("Male");
        ronaldWeasley.setHouse("Gryffindor");
        ronaldWeasley.setBoggart("Acromantula");
        ronaldWeasley.setPatronus("Jack Russell Terrier");
        System.out.println(ronaldWeasley.showInfo());

        //creamos al objeto Neville Longbottom
        Wizard nevilleLongbottom = new Wizard();
        nevilleLongbottom.setName("Neville Longbottom");
        nevilleLongbottom.setGender("Male");
        nevilleLongbottom.setHouse("Gryffindor");
        nevilleLongbottom.setBoggart("Severus Snape");
        nevilleLongbottom.setPatronus("Not corporeal");
        System.out.println(nevilleLongbottom.showInfo());
    }
}
