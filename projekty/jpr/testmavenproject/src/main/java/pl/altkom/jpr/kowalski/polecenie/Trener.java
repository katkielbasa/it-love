package pl.altkom.jpr.kowalski.polecenie;

/* obiekt wywolujacy */
public class Trener {
private Polecenie mode;
public void setMode(Polecenie polecenie){
mode = polecenie;
}
 
public void rozkaz(){
mode.wykonaj();
}
 
public void cofnij(){
mode.cofnij();
}
}