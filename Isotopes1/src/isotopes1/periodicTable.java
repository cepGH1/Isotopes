/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isotopes1;

/**
 *
 * @author hp18
 */
public class periodicTable {
    private String cep = "Hello";
    private String[] period1;
    int randomAtomicNumber;
    
    
    private String[] pTable = {"Hydrogen", "Helium", "Lithium", "Beryllium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon", 
            "Sodium", "Magnesium", "Aluminium", "Silicon", "Phosphorus", "Sulphur", "Chlorine", "Argon",
            "Potassium", "Calcium", "Scandium", "Titanium", "Vanadium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel", "Copper", "Zinc",
            "Gallium", "Germanium", "Arsenic", "Selenium", "Bromine", "Krypton",
            "Rubidium", "Strontium", "Yttrium", "Zirconium", "Niobium", "Molybdenum", "Technetium", "Ruthenium", "Rhodium", "Palladium", "Silver", "Cadmium",
            "Indium", "Tin", "Antimony", "Tellurium", "Iodine", "Xenon",
            "Cesium", "Barium", "Lanthanum", "Cerium", "Praseodymium", "Neodymium", "Promethium", "Samarium", "Europium", "Gadolinium", "Terbium", "Dysprosium", "Holmium", "Erbium", "Thulium", "Ytterbium", "Lutetium",
            "Hafnium", "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Thallium", "Lead", "Bismuth", "Polonium", "Astatine", "Radon",
            "Francium", "Radium", "Actinium", "Thorium", "Protactinium", "Uranium", "Neptunium", "Plutonium", "Americium", "Curium", "Berkelium", "Californium", "Einsteinium", "Fermium"};
    
        private String[][] pTableI = {{"Hydrogen", "1", "2", "3"}, {"Helium","4"}, {"Lithium", "7"}, {"Beryllium", "9"}, {"Boron", "11"}, {"Carbon", "12", "13", "14"}, {"Nitrogen", "14"}, {"Oxygen", "16"}, {"Fluorine", "19"}, {"Neon", "20"}, 
            {"Sodium", "23"}, {"Magnesium", "24"}, {"Aluminium", "27"}, {"Silicon", "28", "30"}, {"Phosphorus", "31", "32"}, {"Sulphur", "32"}, {"Chlorine", "35", "37"}, {"Argon", "40"},
            {"Potassium"}, {"Calcium"}, {"Scandium"}, {"Titanium"}, {"Vanadium"}, {"Chromium"},{ "Manganese"}, {"Iron"}, {"Cobalt"}, {"Nickel"}, {"Copper"}, {"Zinc"},
            {"Gallium"}, {"Germanium"}, {"Arsenic"}, {"Selenium"}, {"Bromine"}, {"Krypton"},
            {"Rubidium"}, {"Strontium"}, {"Yttrium"}, {"Zirconium"}, {"Niobium"}, {"Molybdenum"}, {"Technetium"}, {"Ruthenium"}, {"Rhodium"}, {"Palladium"}, {"Silver"}, {"Cadmium"},
            {"Indium"}, {"Tin"}, {"Antimony"}, {"Tellurium"}, {"Iodine"}, {"Xenon"},
            {"Cesium"}, {"Barium"}, {"Lanthanum"}, {"Cerium"}, {"Praseodymium"}, {"Neodymium"}, {"Promethium"}, {"Samarium"}, {"Europium"}, {"Gadolinium"}, {"Terbium"}, {"Dysprosium"}, {"Holmium"}, {"Erbium"}, {"Thulium"}, {"Ytterbium"}, {"Lutetium"},
            {"Hafnium"}, {"Tantalum"}, {"Tungsten"}, {"Rhenium"}, {"Osmium"}, {"Iridium"}, {"Platinum"}, {"Gold"}, {"Mercury"}, {"Thallium"}, {"Lead"}, {"Bismuth"}, {"Polonium"}, {"Astatine"}, {"Radon"},
            {"Francium"}, {"Radium"}, {"Actinium"}, {"Thorium"}, {"Protactinium"}, {"Uranium"}, {"Neptunium"}, {"Plutonium"}, {"Americium"}, {"Curium"}, {"Berkelium"}, {"Californium"}, {"Einsteinium"}, {"Fermium"}};
        
    private int[] massNumbers = {1,4,7,9,11,12,14,16,19,20,23,24,27,28,31,32,35,40,39,40,45,48,51,52,55,56,59,58,63,64,69,73,75,80,79,84,85,87,89,92,93,96,98,101,103,106,107,114,
    115,120,121,130,127,132};
    public periodicTable(){
        
    }
    
    private String selectElement(){
        String element;
        double rando;
        rando = Math.random();
        System.out.println(rando);
        randomAtomicNumber = (int)(rando*18);
        System.out.println(randomAtomicNumber);
        element = pTable[randomAtomicNumber];
        System.out.println(element);
        return element;
    }
    
    public String displayElement(){
        String element = selectElement();
        return element;
    }
    public int getMassNumber(){
        return massNumbers[randomAtomicNumber];
    }
    
    public String[] getIsotopeMasses(){
        int lengthI = pTableI[randomAtomicNumber].length;
        System.out.println(lengthI);
        String[] isotopeArray = pTableI[randomAtomicNumber];
        //int length = isotopeArray.length;
        System.out.println(isotopeArray.length);
        String[] test = {"rt"};
        return isotopeArray;
    }
    
    
    
}
