package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import org.junit.jupiter.api.Test;

public class DeveloperTest {

    @Test
    public void testPrivateConstructor() throws Exception {
        // this hack is from https://www.timomeinen.de/2013/10/test-for-private-constructor-to-get-full-code-coverage/
        Constructor<Developer> constructor = Developer.class.getDeclaredConstructor();
        assertTrue(Modifier.isPrivate(constructor.getModifiers()),"Constructor is not private");

        constructor.setAccessible(true);
        constructor.newInstance();
    }

    @Test
    public void getName_returns_correct_name() {
        assertEquals("Julia L.", Developer.getName());
    }

    @Test
    public void getGethubId_returns_correct_githubId() {
        assertEquals("jml557", Developer.getGithubId());
    }

    @Test 
    public void getTeam_returns_team_with_correct_name() {
        Team t = Developer.getTeam();
        assertEquals("f25-06", t.getName());
    }

    @Test 
    public void getTeam_returns_team_with_correct_members() {
        Team t = Developer.getTeam();
        assertTrue(t.getMembers().contains("Julia L."), "Team should contain Julia L.");
        assertTrue(t.getMembers().contains("Natalie F."), "Team should contain Natalie F.");
        assertTrue(t.getMembers().contains("Andrew S."), "Team should contain Andrew S.");
        assertTrue(t.getMembers().contains("Abhiram A."), "Team should contain Abhiram A.");
        assertTrue(t.getMembers().contains("Austin C."), "Team should contain Austin C.");
        assertTrue(t.getMembers().contains("Longjiao C."), "Team should contain Longjiao C.");
    }

}
