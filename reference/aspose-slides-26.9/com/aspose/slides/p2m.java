package com.aspose.slides;

class p2m {
   public static void n5(ITextStyle var0, com.aspose.slides.internal.k4y.i8n var1, t5w var2) {
      if (var1 != null) {
         d4g.n5(var0.getDefaultParagraphFormat(), var1.x8(), var2);
         com.aspose.slides.internal.k4y.y4u[] var3 = new com.aspose.slides.internal.k4y.y4u[]{
            var1.n3(), var1.y4(), var1.e2(), var1.t9(), var1.z1(), var1.t4(), var1.q0(), var1.z3(), var1.m1()
         };

         for (int var4 = 0; var4 < 9; var4++) {
            if (var3[var4] != null) {
               d4g.n5(((TextStyle)var0).l6(var4), var3[var4], var2);
            }
         }
      }
   }

   public static void n5(ITextStyle var0, com.aspose.slides.internal.f3.k5<com.aspose.slides.internal.k4y.i8n> var1, g6c var2) {
      if (var0 != null) {
         com.aspose.slides.internal.k4y.i8n var3 = (com.aspose.slides.internal.k4y.i8n)var1.invoke();
         d4g.n5(var0.getDefaultParagraphFormat(), new p2m$1(var3), var2);
         com.aspose.slides.internal.f3.k5[] var4 = new com.aspose.slides.internal.f3.k5[]{
            new p2m$3(var3),
            new p2m$4(var3),
            new p2m$5(var3),
            new p2m$6(var3),
            new p2m$7(var3),
            new p2m$8(var3),
            new p2m$9(var3),
            new p2m$10(var3),
            new p2m$2(var3)
         };

         for (int var5 = 0; var5 <= 8; var5++) {
            IParagraphFormat var6 = var0.getLevel(var5);
            if (var6 != null) {
               d4g.n5(var6, var4[var5], var2);
            }
         }
      }
   }
}
