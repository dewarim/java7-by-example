package de.dewarim.java7.coin;

import java.io.*;
import java.util.UUID;

/**
 * Resources which implement the AutoClosable interface will be closed automatically.
 *
 * If the try-with-resources part throws an exception after read(buffy) failed, it will be suppressed.
 * @see 'http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html#suppressed-exceptions'
 * "You can retrieve these suppressed exceptions by calling the Throwable.getSuppressed method
 * from the exception thrown by the try block."
 * The advantage of this is: if read(buffy) fails, the resulting exception will not be replaced by a failing
 * file.close() in the try-with-resources block.
 *
 * @see 'http://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html'
 */
public class TryWithResources {

    public void openMissingFile() {
        File doesNotExist = new File(UUID.randomUUID().toString());
        try (

                InputStream garbageIn = new FileInputStream(doesNotExist);
                OutputStream garbageOut = new ByteArrayOutputStream(1);
        ) {
            byte[] buffy = new byte[1];
            while (garbageIn.read(buffy) > 0) {
                garbageOut.write(buffy);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Something went wrong, but do not worry: all streams were closed properly.");
        } finally {
            System.out.println("Finished with openMissingFile example.");
            /*
             * Java 6 code would have to get busy here with closing still open files or database connections:
             * For example with:
             * try{
             *  if(garbageIn != null){
             *  garbageIn.close();
             *  }
             * }
             * catch(IOException whatever){
             *  // nothing to do really.
             * }
             */
        }
    }

}
