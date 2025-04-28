/**
 * Definition of the Cow class
 * @author Pavarasan Karunainathan
 * @version 17.0.1
 */
class Cow{
    String name;
    int age;
    double weight;

    /**
     * Constructor of the Cow class
     * @param _name The name of the Cow
     * @param _age The age of the Cow
     * @param _weight The weight of the Cow
     */
    public Cow(String _name, int _age, double _weight){
        name = _name;
        age = _age;
        weight = _weight;
    }

    /**
     * Gets the name of the Cow
     * @return The name of the Cow
     */
    public String getName(){return name;}
    
    /**
     * Gets the age of the Cow
     * @return The age of the Cow
     */
    public int getAge(){return age;}

    /**
     * Gets the weight of the Cow
     * @return The weight of the Cow
     */
    public double getWeight(){return weight;}

    /**
     * Overrides the toString method of Cow
     * @return The name, age - weight formatted
     */
    @Override
     public String toString(){
        return name + ", " + String.valueOf(age) + " - " + String.valueOf(weight);
    }

    /**
     * Overrides the equals method of Cow
     * @param other The other Object to measure to
     * @return If the Cow is equal to the other Object
     */
    @Override
    public boolean equals(Object other){
        if(other instanceof Cow){
            Cow otherCow = (Cow)other;
            return otherCow.name.equals(name) && otherCow.age == age && otherCow.weight == weight;
        }else{
            return false;
        }
    }
}