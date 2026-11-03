package com.aspose.slides.internal.y4g;

import com.aspose.slides.Collections.Hashtable;
import com.aspose.slides.ms.System.d1;

public class o5 {
   static Hashtable n5 = new Hashtable();
   static final Object l6 = new Object();

   public static void n5(String var0, byte[] var1) {
      synchronized (l6) {
         String var3 = com.aspose.slides.ms.System.x8.n5(var1);
         j8 var4 = (j8)n5.get_Item(var3);
         if (var4 == null) {
            n5.addItem(var3, new j8(var0, var1));
         } else if (d1.a6(var4.n5(), var0)) {
            var4.u3();
         } else {
            var4.dispose();
            n5.removeItem(var3);
            n5.addItem(var3, new j8(var0, var1));
         }
      }
   }

   public static byte[] n5(String var0) {
      synchronized (l6) {
         for (Object recoveredElement$var3$796 : n5.getValues()) {
            j8 var3 = (j8)recoveredElement$var3$796;
            if (d1.a6(var3.n5(), var0) && var3.k5()) {
               var3.u3();
               return var3.l6();
            }
         }

         return null;
      }
   }

   private static j8 n5(v8 var0, boolean var1) {
      if (var0 == null) {
         return null;
      }

      byte[] var2 = var0.t2();
      if (var2 != null && var2.length != 0) {
         String var3 = com.aspose.slides.ms.System.x8.n5(var2);
         j8 var4 = (j8)n5.get_Item(var3);
         if (var4 == null) {
            return null;
         } else if (!d1.a6(var0.n3().n5(), var4.n5())) {
            return null;
         } else if (var1 && !var4.k5()) {
            var4.dispose();
            n5.removeItem(var3);
            return null;
         } else {
            return var4;
         }
      } else {
         return null;
      }
   }

   public static boolean n5(v8 var0) {
      synchronized (l6) {
         j8 var2 = n5(var0, false);
         if (var2 == null) {
            return false;
         }

         var2.n5(var0);
         var2.u3();
         return true;
      }
   }

   public static boolean l6(v8 var0) {
      synchronized (l6) {
         j8 var2 = n5(var0, true);
         if (var2 == null) {
            return false;
         }

         var2.l6(var0);
         var2.u3();
         return true;
      }
   }
}
