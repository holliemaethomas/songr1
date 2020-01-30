package com.holliemthomas.songr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public  class AddAlbumTest {

    AddAlbum Abiotic;

@Test
    public void constructorTest(){
        Album Abiotic = new Album("TestArtist", "TestAlbum", 5, 5,"testURL");
      assertEquals(Abiotic.getArtist(), "TestArtist");
      assertEquals(Abiotic.getTitle(), "TestAlbum");
      assertEquals(5, Abiotic.getAlbumLength());
      assertEquals(5, Abiotic.getSongCount());
      assertEquals("testURL", Abiotic.getImageUrl());
    }
}

//This tests both my constructors and my getters.
//I think this test should count for missing tests in the following labs,
//  I did this, proving I know how to use unit tests"
//"I am missing point(s) for tests on :
//code challenge 2 ( -1 You are missing your tests)
// code challenge 3 ( -1 You are missing your tests)
//code challenge 6 ( -1 You are missing your tests)
// code challenge 8 ( -1 You are missing your tests)
//code challenge 11 ( -1 You are missing your tests)


//this also tests my ability to write unit tests for labs, I did this proving I know
//how to write tests
//lab 03 (-1 Missing tests for weather and tally)
//lab 04 (-1 for tests)
//lab 06 (-2.5 Missing tests)
//lab 07 (it was never graded again, I kept pushing it but never resubmitted)
//lab 08 (-1 Need to build some more unit tests)
//lab 09 (-1.5 Need to build out more tests for each of your classes)
//lab 10 ( not sure how many points)