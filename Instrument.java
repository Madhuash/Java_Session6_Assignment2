package sets;

abstract class Instrument {

     protected String name;
     abstract public void play();

}
abstract class StringedInstrument extends Instrument {

     protected int numberOfStrings;

}


