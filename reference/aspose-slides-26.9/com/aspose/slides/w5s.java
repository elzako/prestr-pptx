package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;

class w5s {
   private static final com.aspose.slides.internal.v6g.u9 n5 = new com.aspose.slides.internal.v6g.u9("strRef", "rich", "txData");

   public static void n5(IOverridableText var0, com.aspose.slides.internal.k4y.e8j var1, com.aspose.slides.internal.k4y.j3z var2, t5w var3) {
      if (var1 != null || var2 != null) {
         String var4 = var1 == null ? "txData" : var1.n5().n5();
         switch (n5.n5(var4)) {
            case 0:
               n5(var0, (com.aspose.slides.internal.k4y.c9q)var1.n5().l6());
               break;
            case 1:
               n5(var0, (com.aspose.slides.internal.k4y.j3z)var1.n5().l6(), var3);
               break;
            case 2:
               n5(var0, var2, var3);
               break;
            default:
               throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var4, "\""}));
         }

         y4k.n5(var0.getTextFormat(), var2, var3);
      }
   }

   public static void n5(IOverridableText var0, com.aspose.slides.internal.k4y.k2s var1, com.aspose.slides.internal.k4y.j3z var2, t5w var3) {
      if (var1 != null || var2 != null) {
         if (var1 != null) {
            switch (n5.n5(var1.n5().n5())) {
               case 0:
                  if (var2 != null) {
                     n5(var0, var2, var3);
                  }

                  n5(var0, (com.aspose.slides.internal.k4y.c9q)var1.n5().l6());
                  break;
               case 1:
                  n5(var0, (com.aspose.slides.internal.k4y.j3z)var1.n5().l6(), var3);
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown element \"", var1.n5().n5(), "\""}));
            }
         }

         y4k.n5(var0.getTextFormat(), var2, var3);
      }
   }

   public static void n5(
      IOverridableText var0,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.k2s> var1,
      com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.j3z> var2,
      g6c var3
   ) {
      ITextFrame var4 = var0.getTextFrameForOverriding();
      if (var4 != null && var4.getParagraphs().getCount() != 0) {
         com.aspose.slides.internal.k4y.k2s var5 = (com.aspose.slides.internal.k4y.k2s)var1.invoke();
         com.aspose.slides.internal.k4y.j3z var6 = (com.aspose.slides.internal.k4y.j3z)var5.n5("rich").l6();
         o4z.n5(var4, var6, var3);
      }

      y4k.n5(var0.getTextFormat(), var2, var3, var0);
   }

   static boolean n5(ITextFrame var0) {
      return var0 != null && var0.getParagraphs().getCount() != 0;
   }

   private static void n5(IOverridableText var0, com.aspose.slides.internal.k4y.c9q var1) {
      if (var1 != null && var1.k5() != null && (var1.k5().k5().n5() & 4294967295L) > 0L) {
         com.aspose.slides.internal.k4y.l6j[] var2 = var1.k5().u3();
         if (var2 == null) {
            return;
         }

         String var3 = var2.length > 0 ? var2[0].l6() : "";
         if (var0.getTextFrameForOverriding() != null) {
            var0.getTextFrameForOverriding().setText(var3);
         } else {
            var0.addTextFrameForOverriding(var3);
         }
      }
   }

   private static void n5(IOverridableText var0, com.aspose.slides.internal.k4y.j3z var1, t5w var2) {
      if (var0.getTextFrameForOverriding() == null) {
         var0.addTextFrameForOverriding("");
         var0.getTextFrameForOverriding().getParagraphs().clear();
      }

      o4z.n5(var0.getTextFrameForOverriding(), var1, var2);
   }
}
