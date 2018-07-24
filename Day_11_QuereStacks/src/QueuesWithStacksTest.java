import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueuesWithStacksTest {

    @Test
    void enqueueWithFiveValues() {
        QueueWithStacks test = new QueueWithStacks();
        test.enqueue(8);
        test.enqueue(10);
        test.enqueue(12);
        test.enqueue(14);
        test.enqueue(16);
        String actual = test.toString();
        String expected = "[8, 10, 12, 14, 16]";
        assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    void enqueueEmptyQueue() {
        QueueWithStacks qq = new QueueWithStacks();
        String actual = qq.toString();
        String expected = "[]";
        assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    void enqueueWithOneValue() {
        QueueWithStacks qq = new QueueWithStacks();
        qq.enqueue(10);
        String actual = qq.toString();
        String expected = "[10]";
        assertEquals(expected, actual);
        System.out.println(actual);

    }

    @Test
    void dequeueWithFiveValues() {
        QueueWithStacks test = new QueueWithStacks();
        test.enqueue(8);
        test.enqueue(10);
        test.enqueue(12);
        test.enqueue(14);
        test.enqueue(16);
        int actual = test.dequeue();
        int expected = 8;
        assertEquals(expected,actual);
        System.out.println(actual);

    }

    @Test
    void dequeueEmptyQueue() {
        QueueWithStacks test = new QueueWithStacks();
        Integer actual = test.dequeue();
        Integer expected = null;
        assertEquals(expected,actual);
        System.out.println(actual);

        // System Print out Stack Underflow expected
    }

    @Test
    void dequeueConsecutivePopsWithEnqueue() {
        QueueWithStacks test = new QueueWithStacks();
        test.enqueue(8);
        test.enqueue(10);
        test.enqueue(12);
        test.enqueue(14);
        test.enqueue(16);
        test.dequeue();
        test.dequeue();
        test.enqueue(60);
        test.enqueue(90);
        int actual = test.dequeue();
        int expected = 12;
        assertEquals(expected,actual);
        System.out.println(actual);
    }
}