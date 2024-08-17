package com.sangjin.myselectshop.practice;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestOfTest {
    @BeforeEach
    void setUp() {
        System.out.println("각각의 테스트 코드가 실행되기 전에 수행");
    }
    @AfterEach
    void tearDown() {
        System.out.println("각각의 테스트 코드가 실행된 후에 수행\n");
    }
    @BeforeAll
    static void beforeAll() {
        System.out.println("모든 테스트 코드가 실행되기 전에 초초로 수행\n");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("모든 테스트 코드가 수행된 후 마지막으로 수행");
    }

    @Test
    @DisplayName("네이밍.")
    void test0() {
        System.out.println("테스트의 수행 내용들을 빠르게 파악할 수 있습니다.");
    }

    @Nested
    @DisplayName("그룹-순서보장안함")
    class Test1 {
        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Test
        @DisplayName("Test1 - test2()")
        void test2() {
            System.out.println("Test1.test2");
        }
    }

    @Nested
    @DisplayName("Test2 다른 주제")
    class Test2 {
        @Test
        @DisplayName("Test2 - test1()")
        void test1() {
            System.out.println("Test2.test1");
        }

        @Test
        @DisplayName("Test2 - test2()")
        void test2() {
            System.out.println("Test2.test2");
        }
    }

    @Nested
    @DisplayName("그룹내Order-순서보장")
    @TestMethodOrder(MethodOrderer.OrderAnnotation.class)
    class Test3 {

        @Order(1)
        @Test
        @DisplayName("Test1 클래스")
        void test() {
            System.out.println("\nTest1 클래스");
        }

        @Order(3)
        @Test
        @DisplayName("Test1 - test1()")
        void test1() {
            System.out.println("Test1.test1");
        }

        @Order(2)
        @Test
        @DisplayName("Test1 - test2()")
        void test2() {
            System.out.println("Test1.test2");
        }
    }

    @RepeatedTest(value = 5, name = "반복 테스트 {currentRepetition} / {totalRepetitions}")
    void repeatTest(RepetitionInfo info) {
        System.out.println("테스트 반복 : " + info.getCurrentRepetition() + " / " + info.getTotalRepetitions());
    }

    @DisplayName("파라미터값")
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    void parameterTest(int num) {
        System.out.println("5 * num = " + 5 * num);
    }


}
