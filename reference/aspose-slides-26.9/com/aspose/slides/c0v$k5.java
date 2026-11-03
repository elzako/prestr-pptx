package com.aspose.slides;

class c0v$k5 extends c0v$n5 {
   private c0v$k5() {
      super((com.aspose.slides.c0v$1) null);
   }

   @Override
   c0v n5(com.aspose.slides.internal.o9b.l6 var1) {
      int var2 = var1.e2();
      int var3 = var1.h0();
      c0v var4 = new c0v(var2, var3);
      boolean var5 = com.aspose.slides.internal.o9b.t4.k5(var1.s7());
      if (!var5) {
         var4.c8();
      }

      byte var6 = 0;

      for (int var7 = 0; var7 < var3; var7++) {
         for (int var8 = 0; var8 < var2; var8++) {
            com.aspose.slides.internal.o9b.c8 var9 = var1.l6(var8, var7).o8();
            c0v.n5(var4)[var6] = var9.y4();
            c0v.n5(var4)[var6 + 1] = var9.n3();
            c0v.n5(var4)[var6 + 2] = var9.x8();
            c0v.n5(var4)[var6 + 3] = var5 ? var9.s7() : -1;
            var6 += 4;
         }
      }

      return var4;
   }

   @Override
   com.aspose.slides.internal.o9b.l6 n5(c0v var1) {
      int var2 = c0v.l6(var1);
      int var3 = c0v.k5(var1);
      var1.u9();
      com.aspose.slides.internal.o9b.l6 var4 = new com.aspose.slides.internal.o9b.l6(var2, var3, var1.n5() ? 2498570 : 139273);
      byte var5 = 0;
      if (var1.n5()) {
         for (int var6 = 0; var6 < var3; var6++) {
            for (int var7 = 0; var7 < var2; var7++) {
               var4.n5(
                  var7,
                  var6,
                  com.aspose.slides.internal.o9b.c8.n5(
                        c0v.n5(var1)[var5 + 3] & 255, c0v.n5(var1)[var5 + 2] & 255, c0v.n5(var1)[var5 + 1] & 255, c0v.n5(var1)[var5] & 255
                     )
                     .o8()
               );
               var5 += 4;
            }
         }
      } else {
         for (int var8 = 0; var8 < var3; var8++) {
            for (int var9 = 0; var9 < var2; var9++) {
               var4.n5(
                  var9, var8, com.aspose.slides.internal.o9b.c8.n5(c0v.n5(var1)[var5 + 2] & 255, c0v.n5(var1)[var5 + 1] & 255, c0v.n5(var1)[var5] & 255).o8()
               );
               var5 += 4;
            }
         }
      }

      return var4;
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/c0v$1;)V -> ()V
   c0v$k5(com.aspose.slides.c0v$1 recoveredArg0) {
      this();
   }
}
