//**********************************************************************
// Copyright (c) 2019 Telefonaktiebolaget LM Ericsson, Sweden.
// All rights reserved.
// The Copyright to the computer program(s) herein is the property of
// Telefonaktiebolaget LM Ericsson, Sweden.
// The program(s) may be used and/or copied with the written permission
// from Telefonaktiebolaget LM Ericsson or in accordance with the terms
// and conditions stipulated in the agreement/contract under which the
// program(s) have been supplied.
// **********************************************************************
package org.vijay.koshis.multithreading;

public class WorkerThread implements Runnable
{
    private String command;

    public WorkerThread(String s)
    {
        command = s;
    }

    @Override
    public void run()
    {

        System.out.println(Thread.currentThread().getName() + "Start Command::" + command);
        processCommand();

        System.out.println(Thread.currentThread().getName() + " End.");

    }

    /**
     * 
     */
    private void processCommand()
    {
        try
        {
            Thread.sleep(1000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

    }

}
