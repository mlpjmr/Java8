package lets_get_certified.collections.searching;

public class Catcomp implements Comparable<Catcomp>{
    private String name;
    private int age;

    public Catcomp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Catcomp{" + "name=" + name + ", age=" + age + '}';
    }
    @Override
    public boolean equals(Object obj){ // consistency with compareTo
        if(obj instanceof Catcomp){
            Catcomp otherCat = (Catcomp)obj;
            if(name.equals(otherCat.getName()))
                return true;
        }
        return false;
    }
    @Override
    public int compareTo(Catcomp otherCat){ // natural sort order is by name
        return name.compareTo(otherCat.getName());
    }
}
