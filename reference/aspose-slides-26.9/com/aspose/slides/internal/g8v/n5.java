package com.aspose.slides.internal.g8v;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.exceptions.ArgumentNullException;

public class n5 {
   static ArrayList n5;
   static final Object l6 = new Object();
   static p8 k5 = null;

   static void n5() {
      synchronized (l6) {
         if (n5 == null) {
            n5 = new ArrayList();
            n5.add(new h2());
            n5.add(new e2());
            n5.add(new k5());
         }
      }
   }

   public static l6 n5(String var0, b5 var1, f2 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("request");
      } else if (var2 == null) {
         throw new ArgumentNullException("credentials");
      } else if (var0 == null) {
         throw new ArgumentNullException("challenge");
      } else {
         return l6(var0, var1, var2);
      }
   }

   static l6 l6(String var0, b5 var1, f2 var2) {
      n5();
      synchronized (n5) {
         for (Object recoveredElement$var5$958 : n5) {
            d5 var5 = (d5)recoveredElement$var5$958;
            l6 var6 = var5.n5(var0, var1, var2);
            if (var6 != null) {
               var6.n5(var5);
               return var6;
            }
         }

         return null;
      }
   }

   public static l6 n5(b5 var0, f2 var1) {
      if (var0 == null) {
         throw new ArgumentNullException("request");
      }

      if (var1 == null) {
         return null;
      }

      n5();
      synchronized (n5) {
         for (Object recoveredElement$var4$1415 : n5) {
            d5 var4 = (d5)recoveredElement$var4$1415;
            l6 var5 = var4.l6(var0, var1);
            if (var5 != null) {
               var5.n5(var4);
               return var5;
            }
         }

         return null;
      }
   }
}
