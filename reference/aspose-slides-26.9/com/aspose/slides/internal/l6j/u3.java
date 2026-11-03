package com.aspose.slides.internal.l6j;

import com.aspose.slides.exceptions.ArgumentNullException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

class u3 {
   private static final HashMap<Integer, WeakReference<Object>> n5 = new HashMap<>();
   private static final Object l6 = new Object();
   private static int k5 = 0;
   private static BigInteger u3 = BigInteger.ZERO;
   private static long a6 = 0L;

   private static boolean n5() {
      return n5.size() > 100 && System.currentTimeMillis() - a6 > 100L;
   }

   private static void l6() {
      ArrayList var0 = new ArrayList();

      for (Entry var2 : n5.entrySet()) {
         if (((WeakReference)var2.getValue()).get() == null) {
            var0.add(var2.getKey());
         }
      }

      for (Object recoveredElement$var4$858 : var0) {
         Integer var4 = (Integer)recoveredElement$var4$858;
         n5.remove(var4);
      }

      a6 = System.currentTimeMillis();
   }

   private static Integer n5(WeakReference<Object> var0) {
      synchronized (l6) {
         if (n5()) {
            l6();
         }

         Integer var2;
         do {
            var2 = k5();
         } while (n5.containsKey(var2));

         n5.put(var2, var0);
         u3 = u3.add(BigInteger.ONE);
         return var2;
      }
   }

   private static int k5() {
      if (k5 == Integer.MAX_VALUE) {
         k5 = 0;
      } else {
         k5++;
      }

      return k5;
   }

   public static int n5(Object var0) {
      if (var0 == null) {
         throw new ArgumentNullException("data");
      } else {
         return n5(new WeakReference<>(var0));
      }
   }

   public static Object n5(int var0) {
      synchronized (l6) {
         WeakReference var2 = n5.get(var0);
         if (var2 == null) {
            return null;
         }

         Object var3 = var2.get();
         if (var3 == null) {
            n5.remove(var0);
         }

         return var3;
      }
   }

   public static void n5(Integer var0) {
      synchronized (l6) {
         n5.remove(var0);
      }
   }
}
