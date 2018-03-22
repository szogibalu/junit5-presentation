package com.szogibalu;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import com.szogibalu.annotations.MeetupTest;

class NewProgrammingModelOne {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    @Test
    @DisplayName("\uD83D\uDCA9\uD83D\uDCA9\uD83D\uDCA9")
    void bestFeature() {
    }

    @Test
    @Disabled
    void disabledTest() {
    }

    @MeetupTest
    void meetupTest() {
    }

}
