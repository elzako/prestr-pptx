package com.aspose.slides.internal.b6;

import com.aspose.slides.ms.System.q1;

public class y2 extends z1 {
   @Override
   public void l6(com.aspose.slides.internal.i3.v4 var1, com.aspose.slides.internal.o9b.z1 var2, com.aspose.slides.internal.g1.u9 var3) {
      com.aspose.slides.internal.i3.c4 var4 = (com.aspose.slides.internal.i3.c4)var1;
      if ((var4.n5() & 65535) < var3.h0().length) {
         com.aspose.slides.internal.o9b.a0 var5 = var3.x8(var4.n5());
         if (var5 != null) {
            var2.n5(var5, 1);
            com.aspose.slides.internal.o9b.y2 var6 = new com.aspose.slides.internal.o9b.y2(0, 0, var3.z3().e2(), var3.z3().h0());
            com.aspose.slides.internal.j9e.n5 var7 = var3.z3().n5(var6.n3(), 3, 2498570);
            com.aspose.slides.ms.System.x9 var8 = var7.u3();
            int var9 = 0;

            for (int var10 = 0; var9 < var7.n5(); var10++) {
               int var11 = q1.n5(var7.a6());
               byte[] var12 = new byte[var11];
               com.aspose.slides.internal.e3m.n5.n5(var8, var12, 0, var11);
               byte var13 = 0;

               for (int var14 = 0; var13 < var11; var14++) {
                  if (var2.u9().n5(var14, var10)) {
                     com.aspose.slides.internal.o9b.c8 var15 = com.aspose.slides.internal.o9b.c8.n5(
                           var12[var13 + 3] & 255, var12[var13 + 2] & 255, var12[var13 + 1] & 255, var12[var13] & 255
                        )
                        .o8();
                     com.aspose.slides.internal.o9b.c8 var16 = com.aspose.slides.internal.g1.h0.n5(new com.aspose.slides.internal.y6.n5(var15.o8())).l6().o8();
                     var12[var13] = var16.y4();
                     var12[var13 + 1] = var16.n3();
                     var12[var13 + 2] = var16.x8();
                     var12[var13 + 3] = -1;
                  }

                  var13 += 4;
               }

               com.aspose.slides.internal.e3m.n5.n5(var12, 0, var8, var11);
               var8 = new com.aspose.slides.ms.System.x9(var8.l6() + var11);
               var9++;
            }

            var3.z3().n5(var7);
         }
      }
   }
}
