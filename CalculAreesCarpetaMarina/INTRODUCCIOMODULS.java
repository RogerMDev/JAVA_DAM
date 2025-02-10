
public class INTRODUCCIOMODULS {

    private float[] notes = new float[5];
    LectorDatosTerminal lectordades = new LectorDatosTerminal();
    MaxMinMitjana maxminmitjana = new MaxMinMitjana();
    public void main(String[] args){
        LlegirDades();
        maxminmitjana.TrobarMax(notes);
        maxminmitjana.TrobarMin(notes);
        maxminmitjana.Mitjana(notes);
    }

public float[] LlegirDades(){

    System.out.println("Introdueix pel teclat les 5 notes");

    for (int i =0; i < notes.length;i++){
        System.out.println("Digues la nota numero " + (i+1) + " :" );
        notes[i] = lectordades.leerFloat();
        }
    return notes;
    }
}

