package com.aspose.slides;

class c0v$l6 extends c0v$n5 {
   private static final c0v$k5 n5 = new c0v$k5(null);

   private c0v$l6() {
      super((com.aspose.slides.c0v$1) null);
   }

   private void n5(c0v$l6$n5[] var1, int var2) {
      var1[0].n5 = com.aspose.slides.ms.System.x8.a6(var1[0].a6, 18);
      var1[0].l6 = com.aspose.slides.ms.System.x8.a6(var1[0].a6, 22);
      var1[0].k5 = var1[0].n5 * var2;
      if (var1[0].k5 % 4 > 0) {
         var1[0].k5 = var1[0].k5 + (4 - var1[0].k5 % 4);
      }

      var1[0].u3 = com.aspose.slides.ms.System.x8.a6(var1[0].a6, 10) + (var1[0].l6 - 1) * var1[0].k5;
   }

   @Override
   c0v n5(com.aspose.slides.internal.o9b.l6 var1) {
      int var2 = com.aspose.slides.internal.o9b.t4.k5(var1.s7()) ? 2498570 : 137224;
      if (var1.s7() != var2) {
         var1 = n5(var1, var2);
      }

      if (var1.s7() == 2498570) {
         c0v var17 = new c0v(var1.e2(), var1.h0());
         c0v$l6$n5 var18 = new c0v$l6$n5();
         com.aspose.slides.internal.z0k.e2 var19 = new com.aspose.slides.internal.z0k.e2();

         try {
            var1.n5(var19, com.aspose.slides.internal.j9e.x8.k5());
            var18.a6 = var19.toArray();
            c0v$l6$n5[] var21 = new c0v$l6$n5[]{var18};
            this.n5(var21, 4);
            var21[0].n5(var18);
            var19.close();
         } finally {
            if (var19 != null) {
               var19.dispose();
            }
         }

         for (int var22 = 0; var22 < var1.h0(); var22++) {
            int var23 = var18.u3 - var18.k5 * var22;
            int var24 = (var22 + 1) * c0v.l6(var17) * 4;

            for (int var25 = var22 * c0v.l6(var17) * 4; var25 < var24; var23 += 4) {
               c0v.n5(var17)[var25] = var18.a6[var23 + 3];
               c0v.n5(var17)[var25 + 1] = var18.a6[var23 + 2];
               c0v.n5(var17)[var25 + 2] = var18.a6[var23 + 1];
               c0v.n5(var17)[var25 + 3] = var18.a6[var23];
               var25 += 4;
            }
         }

         return var17;
      } else {
         c0v var3 = new c0v(var1.e2(), var1.h0());
         var3.c8();
         c0v$l6$n5 var4 = new c0v$l6$n5();
         com.aspose.slides.internal.z0k.e2 var5 = new com.aspose.slides.internal.z0k.e2();

         try {
            var1.n5(var5, com.aspose.slides.internal.j9e.x8.k5());
            var4.a6 = var5.toArray();
            c0v$l6$n5[] var6 = new c0v$l6$n5[]{var4};
            this.n5(var6, 3);
            var6[0].n5(var4);
            var5.close();
         } finally {
            if (var5 != null) {
               var5.dispose();
            }
         }

         for (int var20 = 0; var20 < var1.h0(); var20++) {
            int var7 = var4.u3 - var4.k5 * var20;
            int var8 = (var20 + 1) * c0v.l6(var3) * 4;

            for (int var9 = var20 * c0v.l6(var3) * 4; var9 < var8; var7 += 3) {
               c0v.n5(var3)[var9] = var4.a6[var7 + 2];
               c0v.n5(var3)[var9 + 1] = var4.a6[var7 + 1];
               c0v.n5(var3)[var9 + 2] = var4.a6[var7];
               c0v.n5(var3)[var9 + 3] = -1;
               var9 += 4;
            }
         }

         return var3;
      }
   }

   @Override
   com.aspose.slides.internal.o9b.l6 n5(c0v var1) {
      return n5.n5(var1);
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/c0v$1;)V -> ()V
   c0v$l6(com.aspose.slides.c0v$1 recoveredArg0) {
      this();
   }
}
