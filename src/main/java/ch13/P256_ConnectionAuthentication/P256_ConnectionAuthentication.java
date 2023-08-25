package ch13.P256_ConnectionAuthentication;

import java.io.IOException;

public class P256_ConnectionAuthentication {

    public static void main(String[] args) throws IOException, InterruptedException {

        ViaBody vb = new ViaBody();
        vb.bodyExample();
        
        ViaHeaderBearer vhb = new ViaHeaderBearer();
        vhb.bearerExample();
    }

}
