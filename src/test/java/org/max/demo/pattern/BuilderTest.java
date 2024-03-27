package org.max.demo.pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.max.demo.pattern.builder.SimpleExample;
import org.max.demo.pattern.builder.TestObjectExample;
import org.max.demo.pattern.builder.TestObjectExampleBuilder;

import java.time.LocalDateTime;

/**
 * Тест для демонстрации работы паттерна Строитель
 */
public class BuilderTest {

    @Test
    void testWithoutBuilder() {
        //given
        SimpleExample simpleExample = new SimpleExample("value1", "value2", "value3");
        //when
        simpleExample.setAttribute8("value4");
        //then
        Assertions.assertNull(simpleExample.getAttribute2());
        Assertions.assertNotNull(simpleExample.getAttribute1());
        Assertions.assertTrue(simpleExample.getAttribute8().contains("value"));
    }

    @Test
    void testBuilder() {
        //given
        TestObjectExampleBuilder testObjectExampleBuilder = new TestObjectExampleBuilder();
        //when
        TestObjectExample example = testObjectExampleBuilder
                .setBooleanAttr(true)
                .setStringAttr("TEST")
                .setLocalDateTimeAttr(LocalDateTime.now())
                .build();
        //then
        Assertions.assertNull(example.getRandomAttr());
        Assertions.assertTrue(example.getBooleanAttr());
        Assertions.assertEquals("TEST", example.getStringAttr());
    }
}
