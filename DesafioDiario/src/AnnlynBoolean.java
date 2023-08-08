/*
Having found the kidnappers, Annalyn considers which of the following actions she can engage in:
Fast attack: a fast attack can be made if the knight is sleeping,
as it takes time for him to get his armor on, so he will be vulnerable.
Spy: the group can be spied upon if at least one of them is awake.
Otherwise, spying is a waste of time.
Signal prisoner: the prisoner can be signalled using bird sounds if the prisoner is
awake and the archer is sleeping, as archers are trained in bird signaling, 
so they could intercept the message.
Free prisoner: Annalyn can try sneaking into the camp to free the prisoner. 
This is a risky thing to do and can only succeed in one of two ways:
If Annalyn has her pet dog with her she can rescue the prisoner if the archer is asleep. 
The knight is scared of the dog and the archer will not have time to get ready before 
Annalyn and the prisoner can escape.
If Annalyn does not have her dog then she and the prisoner must be very sneaky! 
Annalyn can free the prisoner if the prisoner is awake and the knight and archer are both sleeping, 
but if the prisoner is sleeping they can't be rescued: 
the prisoner would be startled by Annalyn's sudden appearance and wake up the knight and archer.
 */

public class AnnlynBoolean {
    public static void main(String[] args) {

        boolean knight = true; // awake
        boolean archer = true;
        boolean prisoner = false;
        boolean dog = true; // don't have your dog

        boolean fastAtack = knight == false && archer == true && dog == false ? true : false;

        boolean spy = knight == false || archer == false ? true : false;

        boolean signal = archer == true && prisoner == false ? true : false;

        boolean freePriosinoerone = knight == false && archer == true && dog == true ? true : false;

        boolean freePriosinoertwo = knight == true && archer == true && prisoner == false ? true : false;

        if (freePriosinoerone == true) {
            System.out.println("Annlyn rescued the prisoner with the sleeping archer and her dog's help.");
        } else if (freePriosinoertwo == true) {
            System.out.println("Annlyn rescued the prisoner with the sleeping archer and knight.");
        } else if (fastAtack == true) {
            System.out.println("Annlyn made a quick attack because the archer was sleeping but he wasn't with his dog");
        } else if (spy == true) {
            System.out.println("Annlyn was watching because the archer or knight was awake");
        } else if (signal == true) {
            System.out.println("Annlyn used the sign because Archerius was asleep and the prisoner was awake.");
        } else {
            System.out.println("Annlyn returned to the shelter");
        }

    }

}