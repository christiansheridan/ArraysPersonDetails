package com.zipcodewilmington;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    public String whileLoop() {
        String result = "";
        // assume there is a `counter`
        // while `counter` is less than length of array
            // begin loop
        int counter = 0;
        while(counter < personArray.length){
             Person currentPerson = personArray[counter];
             String stringRepresentation = currentPerson.toString();
             result += stringRepresentation;
             counter++;
        }
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
        return result;
    }



    public String forLoop() {
        String result = "";
        // identify initial value
        // identify terminal condition
        // identify increment
        int i = 0;
        for(i =0; i < personArray.length; i++){
            Person currentPerson = personArray[i];
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;
        }
        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }



    public String forEachLoop() {
        String result = "";
        // identify array's type
        // identify array's variable-name

        for(Person person: personArray){
            Person currentPerson = person;
            String stringRepresentation = currentPerson.toString();
            result += stringRepresentation;}
        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop

        return result;
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
