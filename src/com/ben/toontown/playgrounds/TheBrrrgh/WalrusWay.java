package com.ben.toontown.playgrounds.TheBrrrgh;

import com.ben.toontown.playgrounds.Street;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by darwin on 3/26/17.
 */
public class WalrusWay extends Street {
    public WalrusWay(){
        super("Walrus Way");
    }
    public void explore(){
        System.out.printf("[1] Explore Building x%n");
        throw new NotImplementedException();
    }
    public void printCogs(){

    }

}
