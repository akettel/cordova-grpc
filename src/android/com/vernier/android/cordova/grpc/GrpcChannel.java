package com.vernier.android.cordova.grpc;
/**
 * Created by sorenoid on 11/17/16.
 */

public class GrpcChannel {

    public native int startServer();

    static {
        System.loadLibrary("grpcchannel");
    }
}
