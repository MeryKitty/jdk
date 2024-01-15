package java.lang;

import jdk.internal.reflect.CallerSensitive;
import jdk.internal.reflect.Reflection;
import jdk.internal.vm.annotation.ForceInline;
import jdk.internal.vm.annotation.IntrinsicCandidate;

import java.lang.foreign.MemorySegment;

public final class Unsafe {
    @CallerSensitive
    @ForceInline
    public static boolean arrayLoadUnchecked(boolean[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static byte arrayLoadUnchecked(byte[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static short arrayLoadUnchecked(short[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static char arrayLoadUnchecked(char[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static int arrayLoadUnchecked(int[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static long arrayLoadUnchecked(long[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static float arrayLoadUnchecked(float[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static double arrayLoadUnchecked(double[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static <T> T arrayLoadUnchecked(T[] arr, int idx) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        return arrayLoadImpl(arr, idx, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(boolean[] arr, int idx, boolean val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(byte[] arr, int idx, byte val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(short[] arr, int idx, short val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(char[] arr, int idx, char val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(int[] arr, int idx, int val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(long[] arr, int idx, long val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(float[] arr, int idx, float val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static void arrayStoreUnchecked(double[] arr, int idx, double val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    @CallerSensitive
    @ForceInline
    public static <T> void arrayStoreUnchecked(T[] arr, int idx, T val) {
        boolean u = Reflection.getCallerClass().getModule().isUnsafeAccessEnabled();
        arrayStoreImpl(arr, idx, val, u);
    }

    private Unsafe() {}

    private static final String ARR_NULL = "arr must not be null";
    private static final String IDX_OOB = "out-of-bound access";

    @IntrinsicCandidate
    private static boolean arrayLoadImpl(boolean[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static byte arrayLoadImpl(byte[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static short arrayLoadImpl(short[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static char arrayLoadImpl(char[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static int arrayLoadImpl(int[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static long arrayLoadImpl(long[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static float arrayLoadImpl(float[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static double arrayLoadImpl(double[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static <T> T arrayLoadImpl(T[] arr, int idx, boolean unchecked) {
        String methodName = "arrayLoadUnchecked";
        try {
            return arr[idx];
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(boolean[] arr, int idx, boolean val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(byte[] arr, int idx, byte val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(short[] arr, int idx, short val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(char[] arr, int idx, char val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(int[] arr, int idx, int val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(long[] arr, int idx, long val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(float[] arr, int idx, float val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static void arrayStoreImpl(double[] arr, int idx, double val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    @IntrinsicCandidate
    private static <T> void arrayStoreImpl(T[] arr, int idx, T val, boolean unchecked) {
        String methodName = "arrayStoreUnchecked";
        try {
            arr[idx] = val;
        } catch (NullPointerException e) {
            throw accessError(methodName, ARR_NULL);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw accessError(methodName, IDX_OOB);
        }
    }

    private static AssertionError accessError(String methodName, String cause) {
        return new AssertionError("method " + methodName + ": " + cause);
    }
}
