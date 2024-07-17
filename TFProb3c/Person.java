package CS401MPPSolutions.TFProb3c;

import java.util.function.Supplier;
class Person{
    String name;
    Person(){
        this.name ="Unknown";
    }
    Person(String name){
        this.name =name;
    }

    @Override
    public String toString(){
        return name;
    }

    public static void main(String[] args){
        Supplier<Person> ps= Person :: new;
        Person p1=ps.get();
        System.out.println(p1);
    }

}




