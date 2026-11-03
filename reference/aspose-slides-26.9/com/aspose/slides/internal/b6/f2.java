package com.aspose.slides.internal.b6;

public class f2 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.p8 var4 = (com.aspose.slides.internal.i3.p8)var1;
      long var5 = var4.n5();
      com.aspose.slides.internal.o9b.y1 var7 = new com.aspose.slides.internal.o9b.y1(var4.u9(), var4.u3(), var4.k5(), var4.l6());
      if (var3.c8() != null) {
         if (var5 != 170L) {
            if (var5 == 240L) {
               com.aspose.slides.internal.x4g.x8 var20 = var2.l6();
               var2.a6(1);
               var2.k5(7);
               var2.l6(var3.c8(), var7.y4());
               var2.n5(var20);
            } else if (var5 != 204L) {
               com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var4.k5(), var4.l6());
               com.aspose.slides.internal.o9b.z1 var10 = com.aspose.slides.internal.o9b.z1.n5(var9);

               try {
                  var10.n5(var3.c8(), 0, 0, var4.k5(), var4.l6());
               } finally {
                  if (var10 != null) {
                     var10.dispose();
                  }
               }

               com.aspose.slides.internal.o9b.l6 var11 = new com.aspose.slides.internal.o9b.l6(var4.k5(), var4.k5());
               com.aspose.slides.internal.o9b.z1 var12 = com.aspose.slides.internal.o9b.z1.n5(var11);

               try {
                  var12.a6(1);
                  var12.k5(7);
                  var12.n5(var3.z3(), new com.aspose.slides.internal.o9b.y2(0, 0, var4.k5(), var4.k5()));
               } finally {
                  if (var12 != null) {
                     var12.dispose();
                  }
               }

               com.aspose.slides.internal.o9b.l6 var13 = com.aspose.slides.internal.g1.h0.n5(var9, var9, var11, var5, var3);
               com.aspose.slides.internal.x4g.x8 var8 = var2.l6();
               var2.a6(1);
               var2.k5(7);
               var2.n5(var13, var7.y4());
               var2.n5(var8);
            }
         }
      }
   }
}
