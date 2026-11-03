package com.aspose.slides;

class c0v$u3 extends c0v$n5 {
   private c0v$u3() {
      super((com.aspose.slides.c0v$1) null);
   }

   @Override
   c0v n5(com.aspose.slides.internal.o9b.l6 var1) {
      int var2 = com.aspose.slides.internal.o9b.t4.k5(var1.s7()) ? 2498570 : 139273;
      int var3 = com.aspose.slides.internal.o9b.t4.n5(var1.s7()) / 8;
      if (var1.s7() != var2 && var3 != 3) {
         var1 = n5(var1, var2);
         var3 = 4;
      }

      com.aspose.slides.internal.j9e.n5 var4 = var1.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var1.e2(), var1.h0()), 1, var1.s7());
      c0v var5 = new c0v(var1.e2(), var1.h0());
      int var6 = var1.e2() * var3;
      int var7 = var4.a6() - var6;
      int var8 = var4.a6() * var4.n5();
      byte[] var9;
      if (var7 == 0) {
         var9 = c0v.n5(var5);
      } else {
         var9 = new byte[var8];
      }

      com.aspose.slides.internal.e3m.n5.n5(var4.u3(), var9, 0, var8);
      var1.n5(var4);
      if (var7 == 0 && var3 == 3) {
         for (int var10 = var9.length - 1; var10 > 0; var10 -= 4) {
            int var11 = (var10 + 1) * var3 / 4 - 1;
            var9[var10] = -1;
            var9[var10 - 1] = var9[var11];
            var9[var10 - 2] = var9[var11 - 1];
            var9[var10 - 3] = var9[var11 - 2];
         }
      }

      if (var7 > 0) {
         int var15 = 0;
         byte var14 = 0;

         for (int var12 = 0; var12 < c0v.k5(var5); var12++) {
            for (int var13 = 0; var13 < c0v.l6(var5); var13++) {
               c0v.n5(var5)[var14] = var9[var15];
               c0v.n5(var5)[var14 + 1] = var9[var15 + 1];
               c0v.n5(var5)[var14 + 2] = var9[var15 + 2];
               if (var3 == 4) {
                  c0v.n5(var5)[var14 + 3] = var9[var15 + 3];
               } else {
                  c0v.n5(var5)[var14 + 3] = -1;
               }

               var14 += 4;
               var15 += var3;
            }

            var15 += var7;
         }
      }

      return var5;
   }

   @Override
   com.aspose.slides.internal.o9b.l6 n5(c0v var1) {
      var1.u9();
      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(c0v.l6(var1), c0v.k5(var1), var1.n5() ? 2498570 : 139273);
      com.aspose.slides.internal.j9e.n5 var3 = var2.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var2.e2(), var2.h0()), 2, var2.s7());
      com.aspose.slides.internal.e3m.n5.n5(c0v.n5(var1), 0, var3.u3(), c0v.n5(var1).length);
      var2.n5(var3);
      return var2;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/c0v$1;)V -> ()V
   c0v$u3(com.aspose.slides.c0v$1 recoveredArg0) {
      this();
   }
}
