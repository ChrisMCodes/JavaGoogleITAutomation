/**
 * “If you have an apple and I have an apple and we exchange these apples, then 
 * you and I will still each have one apple. But if you have an idea and I have 
 * an idea and we exchange these ideas, then each of us will have two ideas.”
 * George Bernard Shaw
 * 
 *  */ 


public class appleIdeas{

    int apples = 0;
    int ideas = 0;

    public static void main(String[] args){

        // Defines new person!
        appleIdeas johanna = new appleIdeas();
        johanna.apples = 1;
        johanna.ideas = 1;

        // Defines another new person!
        appleIdeas martin = new appleIdeas();
        martin.apples = 2;
        martin.ideas = 1;
    

        // Now I'll make Johanna and Martin exchange apples:
        int new_j = martin.apples;
        int new_m = johanna.apples;
        johanna.apples = new_j;
        martin.apples = new_m;

        System.out.println("Johanna has " + johanna.apples + " apples and Martin has " + martin.apples + " apples.");

        // They should have just switched them, rendering the same total number of apples
        // Now they'll exchange ideas, each picking up a new idea in the process
        johanna.ideas = johanna.ideas + martin.ideas;
        martin.ideas = johanna.ideas;

        System.out.println("Johanna has " + johanna.ideas + " ideas and martin has " + martin.ideas + " ideas.");
        
    }

}