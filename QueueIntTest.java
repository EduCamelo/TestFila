import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class QueueIntTest {
    
    @Test
    public void HeadTeste(){
        Random random = new Random();
        int a = random.nextInt(0, 100000);
        QueueInt x = new QueueInt();
        x.enqueue(a);
        Assert.assertEquals(x.head(), a);
    }

    @Test
    public void EnqueueTest(){
        Random random = new Random();
        int a[] = new int[10];
        QueueInt x = new QueueInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(0, 100000000);
            x.enqueue(a[i]);
        }
        Assert.assertEquals(x.head(), a[0]);
    }

    @Test
    public void isFullTest(){
        Random random = new Random();
        int a[] = new int[10];
        QueueInt x = new QueueInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(0, 100000000);
            x.enqueue(a[i]);
        }
        Assert.assertTrue(x.isFull());
    }

    @Test
    public void isEmptyTest(){
        Random random = new Random();
        int a[] = new int[10];
        QueueInt x = new QueueInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(0, 100000000);
            x.enqueue(a[i]);
        }
        Assert.assertFalse(x.isEmpty());
    }

    @Test
    public void DequeueTest(){
        Random random = new Random();
        int a[] = new int[10];
        QueueInt x = new QueueInt();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(0, 100000000);
            x.enqueue(a[i]);
        }
        x.dequeue();
        Assert.assertEquals(x.head(), a[1]);
    }

}
