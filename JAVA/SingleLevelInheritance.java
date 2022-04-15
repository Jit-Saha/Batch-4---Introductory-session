class parent{
    void sing(){
        System.out.println("Classical");
    }
    void draw(){
        System.out.println("Draw a square");
    }
}

class child extends parent{
    void sing(){//overriding sing
        //super.sing();
        System.out.println("Hip-Hop");
    }
}

public class SingleLevelInheritance {
    public static void main(String args[]){
        child ob = new child();
        ob.sing();
        ob.draw();
    }
}
