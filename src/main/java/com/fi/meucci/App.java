package com.fi.meucci;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClientStr client = new ClientStr();
        client.connetti();
        
        try { client.comunica(); }
        catch (Exception e) { System.out.println(e.getMessage()); }
    }
}
