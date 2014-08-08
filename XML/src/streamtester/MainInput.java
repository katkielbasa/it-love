package streamtester;

import java.io.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;

public class MainInput {

    public static void main(String args[])
    {

        try
        {
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer tr = tf.newTransformer(new StreamSource
                (new File(args[1])));

            tr.transform(new StreamSource(new File(args[0])),
            new StreamResult(new File(args[2])));
        }
        catch(Exception ex) {}
    }
}