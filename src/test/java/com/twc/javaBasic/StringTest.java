package com.twc.javaBasic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringTest {
    //Hint: String https://beginnersbook.com/2013/12/java-strings/
    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void should_be_immutable() {
        String originalString = "The original string";
        String modifiedString = originalString.replace("original", "new");

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        //==比较的是字符串的地址值，用replace方法后返回的是一个新的字符串，原字符串不变
        //前后两个字符串指向不同的地址空间，==返回false，比较内容应用equals
        final boolean areSame = false;
        // --end-->

        assertEquals("The new string", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }

    @SuppressWarnings({"StringEquality", "ConstantConditions"})
    @Test
    void all_modification_method_will_create_new_string() {
        String originalString = "The string with tailing space.     ";
        String modifiedString = originalString.trim();

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        //String.trim返回的是一个新字符串，原字符串不变，==比较的是地址，因此为false
        final boolean areSame = false;
        // --end-->

        assertEquals("The string with tailing space.", modifiedString);
        assertEquals(areSame, originalString == modifiedString);
    }

    @SuppressWarnings("StringEquality")
    @Test
    void will_create_new_string_when_concat() {
        String originalString = "Part one. ";
        String copyOfOriginalString = originalString;
        originalString += "Part two.";

        // TODO:
        //  Please modify the following line to pass the test. It is really easy to pass
        //  the test. But you have to tell why.
        // <--start
        //字符串在java中是存储在常量区中，当连接一个字符串后，
        // 即生成了一个新的字符串，指向新的地址，
        // ==比较字符串地址，因此返回false
        final boolean areSame = false;
        // --end-->

        assertEquals("Part one. Part two.", originalString);
        assertEquals(areSame, originalString == copyOfOriginalString);
    }


    @SuppressWarnings({"unused"})
    @Test
    void should_break_string_into_words() {
        final String sentence = "This is Mike";

        // TODO: Extract words in the sentence.
        // <--Start
        String[] words = sentence.split(" ");
        // --End-->

        assertArrayEquals(new String[] {"This", "is", "Mike"}, words);
    }

}
