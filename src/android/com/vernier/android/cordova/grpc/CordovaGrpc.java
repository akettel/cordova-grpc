/**
 */
package com.vernier.android.cordova.grpc;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;

import java.util.Date;

public class CordovaGrpc extends CordovaPlugin {
  private static final String TAG = "CordovaGrpc";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);

    Log.d(TAG, "Initializing Grpc Cordova Plugin");
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    if(action.equals("startServer")) {
      int port = args.getInt(0);
      // Echo back the first argument
      Log.d(TAG, "startServer called with port " + port);
    } else if(action.equals("getPort")) {
      // An example of returning data back to the web layer
      Log.d(TAG, "getPort ");
	final PluginResult result = new PluginResult(PluginResult.Status.OK, (new Integer(666)));
      callbackContext.sendPluginResult(result);
    } else if (action.equals("stopServer")) {
	Log.d(TAG, "stopServer");
    }
    return true;
  }

}
