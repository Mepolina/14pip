public class Osoba {
    private String imię;
    private String nazwisko;
    private String email;
    private String kraj;




    public Osoba(String imię, String nazwisko, String email, String kraj){
        setImie(imię);
        setNazwisko(nazwisko);
        setEmail(email);
        setKraj(kraj);

    }

    public String getImie(){
        return this.imię;
    }

    public String getNazwisko(){
        return this.nazwisko;
    }

    public String getEmail(){
        return this.email;
    }

    public String getKraj(){
        return this.kraj;
    }



    public void setImie(String imie){
        if(!(imie.equals("") || imie == null)){
            this.imię = imie;
        }
    }

    public void setNazwisko(String nazwisko){
        if(!(nazwisko.equals("") || nazwisko == null)){
            this.nazwisko = nazwisko;
        }
    }

    public void setEmail(String email){
        if(!(email.equals("") || email == null)){
            this.email = email;
        }
    }

    public void setKraj(String kraj){
        if(!(kraj.equals("") || kraj == null)){
            this.kraj = kraj;
        }
    }

    public String toString(){
        return this.imię+" "+this.nazwisko+" - "+this.email+" - "+this.kraj;
    }
}


