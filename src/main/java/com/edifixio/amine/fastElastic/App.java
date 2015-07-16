package com.edifixio.amine.fastElastic;

import com.edifixio.jsonFastBuild.ArrayBuilder.JsonArrayBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
        System.out.println(
        JsonArrayBuilder.init().begin().end().getJsonElement());
    }
}
