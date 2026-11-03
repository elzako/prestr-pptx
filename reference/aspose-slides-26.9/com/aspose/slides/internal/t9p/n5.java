package com.aspose.slides.internal.t9p;

import com.aspose.slides.internal.p4l.q0;
import com.aspose.slides.internal.p4l.z3;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.y8;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map.Entry;

public final class n5 {
   private static boolean[][] n5 = new boolean[][]{
      {true, false, false, true, true, true, true},
      {false, true, true, true, true, true, true},
      {false, false, true, true, true, true, true},
      {false, false, false, true, true, true, true},
      {false, false, false, false, true, true, true},
      {false, false, false, false, false, true, false},
      {false, false, false, false, false, true, true}
   };
   private static final HashMap<Class, Class> l6 = new HashMap<>();
   private static final HashMap<Class, Class> k5 = new HashMap<>();

   public static boolean n5(Constructor var0, Object... var1) {
      Class[] var2 = var0.getParameterTypes();
      if (var1.length != var2.length) {
         return false;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (var1[var3] == null) {
            return !var2[var3].isPrimitive();
         }

         if (!n5(var1[var3].getClass(), var2[var3])) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(q0 var0, y8... var1) {
      z3[] var2 = var0.a6();
      if (var1.length != var2.length) {
         return false;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (!k5(var1[var3].z1(), var2[var3].n5().z1())) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(Method var0, Class<?>... var1) {
      Class[] var2 = var0.getParameterTypes();
      if (var1.length != var2.length) {
         return false;
      }

      for (int var3 = 0; var3 < var1.length; var3++) {
         if (!k5(var1[var3], var2[var3])) {
            return false;
         }
      }

      return true;
   }

   public static boolean n5(Class<?> var0, Class<?> var1) {
      return var1.isAssignableFrom(var0)
         || var0.isPrimitive() && var1.isAssignableFrom(n5(var0))
         || var1.isPrimitive() && u3(var0, var1)
         || var1.isArray() && com.aspose.slides.ms.System.u3.class.isAssignableFrom(var0)
         || var0.isArray() && com.aspose.slides.ms.System.u3.class.isAssignableFrom(var1)
         || l6(var0, var1);
   }

   private static byte k5(Class<?> var0) {
      if (var0.equals(char.class)) {
         return 0;
      } else if (var0.equals(byte.class)) {
         return 1;
      } else if (var0.equals(short.class)) {
         return 2;
      } else if (var0.equals(int.class)) {
         return 3;
      } else if (var0.equals(long.class)) {
         return 4;
      } else if (var0.equals(double.class)) {
         return 5;
      } else {
         return (byte)(var0.equals(float.class) ? 6 : -1);
      }
   }

   public static boolean l6(Class<?> var0, Class<?> var1) {
      if (!var1.isPrimitive()) {
         return var1.equals(var0);
      }

      if (!var0.isPrimitive()) {
         var0 = l6(var0);
      }

      if (var0 == null) {
         return false;
      }

      byte var2 = k5(var1);
      byte var3 = k5(var0);
      return var2 != -1 && var3 != -1 ? n5[var3][var2] : false;
   }

   public static boolean k5(Class<?> var0, Class<?> var1) {
      return j8.n5(var0, var1);
   }

   public static Class n5(Class<?> var0) {
      return l6.get(var0);
   }

   public static Class l6(Class<?> var0) {
      return k5.get(var0);
   }

   public static boolean u3(Class<?> var0, Class<?> var1) {
      return j8.n5(var0, n5(var1));
   }

   static {
      l6.put(byte.class, Byte.class);
      l6.put(short.class, Short.class);
      l6.put(int.class, Integer.class);
      l6.put(long.class, Long.class);
      l6.put(float.class, Float.class);
      l6.put(double.class, Double.class);
      l6.put(boolean.class, Boolean.class);
      l6.put(char.class, Character.class);
      l6.put(void.class, Void.class);

      for (Entry var1 : l6.entrySet()) {
         k5.put((Class)var1.getValue(), (Class)var1.getKey());
      }
   }
}
