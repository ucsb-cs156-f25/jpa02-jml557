package edu.ucsb.cs156.spring.hello;

/**
 * A class with static methods to provide information about the developer.
 */

public class Developer {

    // This class is not meant to be instantiated
    // so we make the constructor private

    private Developer() {}
    
    /**
     * Get the name of the developer
     */

    public static String getName() {
        return "Julia L.";
    }

    /**
     * Get the github id of the developer
     * @return github id of the developer
     */

    public static String getGithubId() {
        return "jml557";
    }

    /**
     * Get the developers team
     * @return developers team as a Java object
     */
    
    public static Team getTeam() {
        Team team = new Team("f25-06");
        team.addMember("Julia L.");
        team.addMember("Natalie F.");
        team.addMember("Andrew S.");
        team.addMember("Abhiram A.");
        team.addMember("Austin C.");
        team.addMember("Longjiao C.");
        return team;
    }
}
