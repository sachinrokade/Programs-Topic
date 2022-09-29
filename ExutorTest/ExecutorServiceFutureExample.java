package com.example.thread;

import java.util.concurrent.*;

public class ExecutorServiceFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i=0;i<=5;i++){
            executorService.submit(new TestRun(i));
            Future<Integer> result= executorService.submit(new TestCall(i));
            if(result.get()==24)
                result.cancel(true);

            System.out.println("Callable end "+result.get());

        }

    }
}

class TestCall implements Callable<Integer> {

    private final int number;

    public TestCall(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {

        int result = 1;

        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }

        System.out.printf("Callable Factorial of %d is :: %d\n", number, result);
        return result;
    }
}
class TestRun implements Runnable {

    private Integer number=0;

    public TestRun(Integer number) {
        this.number = number;
    }

    @Override
    public void run()   {

        int result = 1;

        if ((number == 0) || (number == 1)) {
            result = 1;
        } else {
            for (int i = 2; i <= number; i++) {
                result *= i;
                try {
                    TimeUnit.MILLISECONDS.sleep(20);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.printf("Runnable Factorial of %d is :: %d\n", number, result);

    }
}