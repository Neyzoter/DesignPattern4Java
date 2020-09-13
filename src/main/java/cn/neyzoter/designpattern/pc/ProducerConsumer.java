package cn.neyzoter.designpattern.pc;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 * 生产者消费者模式
 * @author neyzoter
 */
public class ProducerConsumer<T> {
    public final Queue<T> que;
    // 可以生产的个数
    private final Semaphore canProduce;
    // 可以消费的个数
    private final Semaphore canConsume;
    // 可以消费信号
    private final Object canConsumeSig;
    // 可以生产信号
    private final Object canProduceSig;
    public ProducerConsumer(int cap) {
        que = new LinkedList<>();
        canProduce = new Semaphore(cap);
        canConsume = new Semaphore(cap);
        canConsume.tryAcquire(cap);
        canConsumeSig = new Object();
        canProduceSig = new Object();
    }

    /**
     * 消费
     * @return 消费元素
     */
    public T consume() {
        while (!canConsume.tryAcquire()) {
            try {
                canConsumeSig.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        synchronized (que) {
            T res = que.poll();
            canProduceSig.notifyAll();
            canProduce.release();
            return res;
        }
    }

    /**
     * 生产
     * @param t 生产的对象
     */
    public void produce(T t) {
        while (!canProduce.tryAcquire()) {
            try {
                canProduceSig.wait();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        synchronized (que) {
            que.add(t);
            canConsume.release();
            canConsumeSig.notifyAll();
        }
    }
}
