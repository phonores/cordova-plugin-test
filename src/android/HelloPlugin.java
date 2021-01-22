package org.apache.cordova.plugin;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HelloPlugin extends CordovaPlugin {
    public static final String ACTION_HELLO = "sayHello";

    @Override
    public boolean execute (String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (ACTION_HELLO.equals(action)) {
            JSONObject arg = args.getJSONObject(0);
            String msg = arg.getString("name");
            callbackContext.success("Hello " + msg);
            return true;
        }
        callbackContext.error("Invalid action");
        return false;
    }
}