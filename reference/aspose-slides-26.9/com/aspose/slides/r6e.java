package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;

class r6e {
   private static final Dictionary<Long, com.aspose.slides.ms.System.o0> n5 = new Dictionary<>();
   private static final Object l6 = new Object();

   public static void n5(com.aspose.slides.ms.System.o0 var0) {
      long var1 = com.aspose.slides.internal.r5t.t2.n5().c8();
      synchronized (l6) {
         if (!n5.containsKey(var1)) {
            n5.addItem(var1, var0.k5());
         }
      }
   }

   public static double n5(com.aspose.slides.ms.System.o0 var0, com.aspose.slides.internal.z0k.t4 var1) {
      double var2 = n5(var1);
      if (l6(var0.k5())) {
         com.aspose.slides.internal.n8e.e5.n5().n5(var2);
      }

      return var2;
   }

   public static void n5(com.aspose.slides.ms.System.o0 var0, String var1) {
      if (l6(var0.k5())) {
         com.aspose.slides.internal.n8e.e5.n5().n5(n5(var1));
      }
   }

   public static void n5(com.aspose.slides.ms.System.o0 var0, com.aspose.slides.internal.o9b.l6 var1) {
      if (l6(var0.k5())) {
         com.aspose.slides.internal.n8e.e5.n5().n5(n5(var1));
      }
   }

   public static boolean l6(com.aspose.slides.ms.System.o0 var0) {
      long var1 = com.aspose.slides.internal.r5t.t2.n5().c8();
      boolean var3 = false;
      synchronized (l6) {
         com.aspose.slides.ms.System.o0 var5 = new com.aspose.slides.ms.System.o0();
         com.aspose.slides.ms.System.o0[] var6 = new com.aspose.slides.ms.System.o0[]{var5};
         boolean var7 = n5.tryGetValue(var1, var6) && com.aspose.slides.ms.System.o0.n5(var6[0], var0);
         var6[0].k5(var5);
         if (var7) {
            n5.removeItemByKey(var1);
            var3 = true;
         }

         return var3;
      }
   }

   private static double n5(com.aspose.slides.internal.z0k.t4 var0) {
      if (var0 == null) {
         return 0.0;
      }

      com.aspose.slides.internal.z0k.t4 var1 = com.aspose.slides.internal.n8e.z3.n5(var0);
      double var2 = var1.getLength() / 1048576.0;
      if (var1 != var0) {
         var1.dispose();
      }

      return var2;
   }

   private static double n5(String var0) {
      return var0 != null ? var0.length() / 1048576.0 : 0.0;
   }

   private static double n5(com.aspose.slides.internal.o9b.l6 var0) {
      return var0 != null ? var0.e2() * var0.h0() * 32 / 1048576.0 : 0.0;
   }
}
