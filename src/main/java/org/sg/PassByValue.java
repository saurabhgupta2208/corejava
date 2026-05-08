package org.sg;

public class PassByValue {

    static void main(){
        PassByValueObject passByValueObject = new PassByValueObject();
        passByValue(passByValueObject);
        System.out.println(passByValueObject);
    }

    static void passByValue(PassByValueObject object){
        object = new PassByValueObject();
        object.setName("test");
    }
}
