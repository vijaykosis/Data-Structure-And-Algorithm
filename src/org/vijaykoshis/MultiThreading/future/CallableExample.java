package org.vijaykoshis.MultiThreading.future;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableExample
{
    public static void main(String[] args)
    {
        ExecutorService service = Executors.newFixedThreadPool(10);

        List<Future<Integer>> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++)
        {

            Integer num = random.nextInt(10);
            FactorialCalculator fact = new FactorialCalculator(num);
            Future<Integer> fut = service.submit(fact);
            list.add(fut);

        }

        list.forEach(x ->
        {
            try
            {
                System.out.println("Future result is - " + " - " + x.get() + "; And Task done is " + x.isDone());
            }
            catch (InterruptedException | ExecutionException e)
            {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        service.shutdown();

    }
}
