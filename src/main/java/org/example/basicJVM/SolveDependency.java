package org.example.basicJVM;

public class SolveDependency {

    public static void main(String[] args) {
        BB bb = new BB();
        bb.initAA();
    }
}

class AA{
    private BB bb= new BB();
}

//intead using lazy init
class BB{
    private volatile AA a;
    // similar to singleInstance DCL check!
    void initAA(){
        if(a == null){
            synchronized (this){
                if(a == null){
                    a = new AA();
                }
            }
        }
    }
}
