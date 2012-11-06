/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chemistrytester;


public class Kirjautuminen {
    //Tähän toteutetaan kirjautuminen, ja jossakin on joku tietorakenne joka sisältää
    //nimet ja salaSanat
    //private Map kayttajat;
    
    public String luoUusi (String nimi, String salaSana){
        KayttajaTunnus tunnus = new KayttajaTunnus(nimi, salaSana);
        //tallenna tunnus 
        return "Tunnuksesi luotiin.";
        
}
    public String tarkistaSalasana (String nimi, String salaSana) {
        //etsitään nimelle kuuluva sanasana
        String nimensalasana = "";
        if (nimensalasana.equals(salaSana)) {
            return "Kirjaudutaan sisään";
        }
            return "Väärä tunnus tai salasana.";
    }
    
}
