package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;
    Team team_same;
    Team team_diff_name;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");   
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   @Test 
   public void toString_returns_correct_string() {
    assertEquals("Team(name=test-team, members=[])", team.toString());
   }

   @Test 
   public void equals_same_object() {
    assertEquals(true, team.equals(team));
   }

   @Test 
   public void equals_different_class() {
    String s = "wassup";
    assertEquals(false, team.equals(s));
   }

   @Test 
   public void equals_members() {
    team_same = new Team("test-team");
    assertTrue(team.equals(team_same), "teams should be equal");
    team_same.addMember("person");
    assertTrue(!(team.equals(team_same)), "teams contain different members");

    team_diff_name = new Team("test_dream");
    assertTrue(!(team.equals(team_diff_name)), "teams have different names");
   }

   @Test 
   public void hash_code_is_good() {
    team_same = new Team("test-team");
    int actual = team.hashCode();
    int expected = -1226298695;

    assertEquals(actual, expected);
    assertEquals(team_same.hashCode(), team.hashCode());
   }

}
