package com.powermovesdev.alex.boxietwo;

import android.content.Context;

/**
 * Created by alex on 3/8/15.
 */
public class MrVector {
    private static android.support.v4.util.IntSet sVectorResources;

    public MrVector() { /* compiled code */ }

    public static android.graphics.drawable.Drawable inflate(android.content.res.Resources resources, int resId) { /* compiled code */ }

    public static android.graphics.drawable.Drawable inflateCompatOnly(android.content.res.Resources resources, int resId) { /* compiled code */ }

    public static void register(int... resources) { /* compiled code */ }

    public static android.content.Context wrap(android.content.Context context) { /* compiled code */ }

    public static android.graphics.drawable.Drawable lookup(android.content.res.Resources res, int id, int density, boolean ignoreDensity) { /* compiled code */ }

    static class MrResourcesContext extends android.content.ContextWrapper {
        private android.content.res.MrResources mMrResources;

        public MrResourcesContext(android.content.Context base) { /* compiled code */ }

        public android.content.res.Resources getResources() { /* compiled code */ }
    }
}