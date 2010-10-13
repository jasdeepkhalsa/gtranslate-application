/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.google.UI;

import java.io.BufferedInputStream.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 *
 * @author Johnny
 */
public class test {
    
     public static void main(String[] args) throws FileNotFoundException, IOException {
         File file = new File("input.txt");
        FileInputStream f = new FileInputStream( file );
        FileChannel ch = f.getChannel( );
        ByteBuffer bb = ByteBuffer.allocateDirect( 1024);
        byte[] barray = new byte[1024];
        long checkSum = 0L;
        int nRead, nGet;
        while ( (nRead=ch.read( bb )) != -1 )
        {
            if ( nRead == 0 )
                continue;
            bb.position( 0 );
            bb.limit( nRead );
            while( bb.hasRemaining( ) )
            {
                nGet = Math.min( bb.remaining( ),1024 );
                bb.get( barray, 0, nGet );
                for ( int i=0; i<nGet; i++ )
                {
                    checkSum += barray[i];
                    System.out.print( (char) barray[i]);
                }
            }
            bb.clear( );
        }
    }

}
