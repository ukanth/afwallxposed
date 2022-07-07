package com.portgenix.afwallxposed;

/**
 * Created by ukanth on 19/7/16.
 */
public class ShareProfilePreference extends SharePreferenceProvider {

    public ShareProfilePreference() {
        super(new String[] {BuildConfig.APPLICATION_ID + "_preferences", XposedInit.PREFS_NAME});
    }

    //make sure only read access
    @Override
    protected boolean checkAccess(String prefName, String prefKey, boolean write) {
        // Only allow read access
        return !write;
    }
}
