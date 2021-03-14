package com.company;

public class Animal {
    final String species;
    public String name;
    private Double weight;

static public final Double DEFAULT_ANIMAL_WEIGHT= 1.0;
        Animal(String species) {
        this.species = species;

    switch(this.species) {
        case "dog":
            this.weight = 20.0;
            break;
        case "cow":
            this.weight = 400.0;
            break;
        default:
            this.weight = DEFAULT_ANIMAL_WEIGHT;


    }
    }

    public void feed(){
            if(weight >0) {
                this.weight += 1;
                System.out.println("thx for feed my weight is now" + this.weight);
             } else {
                System.out.println("too late, im dead");
            }
        }

        public void takeForAWalk(){
            if(weight >0) {
                this.weight -= 1;
                System.out.println("thx walk done my weight is now:" + this.weight);
            }else{
                System.out.println("too late, im dead");
            }
        }

}
