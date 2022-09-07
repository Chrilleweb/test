public class Personer {
    private String name;
    private int alder;
    private String lastName;
    private String club;



    // Konstruktør
    public Personer(String name, String lastName, String club, int alder) {
        this.name = name;
        this.lastName = lastName;
        this.club = club;
        this.alder = alder;
    }

    public Personer(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
        this.club = "N/A";
        this.alder = 0;
    }

    public String toString(){
        return getName() + " " + lastName + " " + club + " " + alder;
    }


    public void setAlder(int alder){
        this.alder = alder;
    }

    public String getName(){
        return name;
    }

    public String getLastName(){
        return lastName;
    }

    public String getClub(){
        return club;
    }
    public int getAlder(){
        return alder;
    }




}

