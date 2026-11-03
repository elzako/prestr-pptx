package com.aspose.slides.internal.g2;

public class y4 extends com.aspose.slides.internal.o6.l6 {
   @Override
   public boolean l6(com.aspose.slides.internal.i3.v4[] var1, com.aspose.slides.internal.z0k.t4 var2) {
      com.aspose.slides.internal.i3.e2 var3 = new com.aspose.slides.internal.i3.e2(var1[0]);
      com.aspose.slides.internal.z0k.n5 var4 = new com.aspose.slides.internal.z0k.n5(var2);
      int var5 = var4.r4();
      if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.k5.class), var5)) {
         var3.n5((var5 & 65535) != 3 ? 6 : 3);
         int var6 = var4.r4();
         if (com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o4.u9.class), var6)) {
            var3.l6(var3.n5() == 3 ? 0 : var6 & 65535);
            int var7 = (int)var4.x8().getPosition();
            com.aspose.slides.internal.k1.t2 var8 = this.n5(var4, var7, (int)(((var3.e2() & 4294967295L) * 2L & 4294967295L) - 10L));
            if (var8 != null && var4.x8().getPosition() <= ((var3.z1() & 4294967295L) + ((var3.e2() & 4294967295L) * 2L & 4294967295L) & 4294967295L)) {
               var3.n5(var8);
            } else {
               var4.x8().seek(var7, 0);
               var3.n5(new com.aspose.slides.internal.s8.n5().n5(var4));
            }

            var1[0] = var3;
            return true;
         } else {
            com.aspose.slides.internal.f8y.n5.u3("Invalid ColorUsage for WmfDibCreatePatternBrush");
            return false;
         }
      } else {
         com.aspose.slides.internal.f8y.n5.u3("Invalid Style for WmfDibCreatePatternBrush");
         return false;
      }
   }

   private com.aspose.slides.internal.k1.t2 n5(com.aspose.slides.internal.z0k.n5 var1, int var2, int var3) {
      try {
         return (com.aspose.slides.internal.k1.t2)new com.aspose.slides.internal.s8.u9(var2, var3).l6(var1);
      } catch (RuntimeException var5) {
         var1.x8().seek(var2, 0);
         return null;
      }
   }
}
