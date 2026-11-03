package com.aspose.slides.internal.x0;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.x9;

public class v4 extends com.aspose.slides.internal.r5.y4 {
   private com.aspose.slides.internal.x4g.m1 n5;

   @Override
   public void n5(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.o9b.z1 var3 = var2.n5();
      this.n5 = var3.m1();
      if (var2.a6) {
         if (o5.n5(var2.p3().t2(), null)) {
            var3.u9(3);
         }

         if (o5.n5(var2.p3().u9(), null)) {
            var3.l6(0);
         }

         if (o5.n5(var2.p3().h0(), null)) {
            var3.k5(3);
         }

         if (o5.n5(var2.p3().c8(), null)) {
            var3.a6(0);
         }
      }
   }

   @Override
   public void l6(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      var2.<com.aspose.slides.internal.o9b.z1>n5().l6(this.n5);
   }

   @Override
   public void n5(s9 var1, com.aspose.slides.internal.r5.a6 var2, com.aspose.slides.internal.r6.u9 var3) {
      com.aspose.slides.internal.o9b.z1 var4 = var3.n5();
      boolean var5 = com.aspose.slides.internal.n2d.y4.n5(var4, var3.v0(), var3.x9(), var3.u9);
      if (var3.u9) {
         com.aspose.slides.internal.o9b.a0 var6 = var3.h2().l6();
         com.aspose.slides.internal.x4g.m1 var7 = var3.x9();
         var7.h0();
         var6.l6(var7);
         com.aspose.slides.internal.n2d.y4.n5(var4, var6);
         var3.u9 = var5;
      }

      if (var3.y2() != 11) {
         if (var3.y2() != 13 && (var3.c8() != null || var3.t2() != null) && var2.h0(var1, var3)) {
            if (var3.z7() == null) {
               throw new NotSupportedException("Unable to apply ROP2. RasterImage is null");
            }

            this.n5(var1, var2, var4, var3);
         } else {
            var2.u9(var1, var3);
         }
      }
   }

   private void n5(s9 var1, com.aspose.slides.internal.r5.a6 var2, com.aspose.slides.internal.o9b.z1 var3, com.aspose.slides.internal.r6.u9 var4) {
      int var5 = var4.z7().e2();
      int var6 = var4.z7().h0();
      com.aspose.slides.internal.x4g.x8 var7 = var3.l6();

      try {
         com.aspose.slides.internal.o9b.l6 var8 = new com.aspose.slides.internal.o9b.l6(var5, var6);

         try {
            com.aspose.slides.internal.o9b.z1 var9 = com.aspose.slides.internal.o9b.z1.n5(var8);

            try {
               var9.l6(var4.v0().l6());
               var9.l6(var3.m1());
               com.aspose.slides.internal.o9b.z1 var10 = var4.n5();
               var4.n5(var9);
               var2.u9(var1, var4);
               var4.n5(var10);
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }

            com.aspose.slides.internal.j9e.n5 var38 = var8.n5(new com.aspose.slides.internal.o9b.y2(0, 0, var5, var6), 1, 2498570);
            com.aspose.slides.internal.j9e.n5 var11 = var4.z7().n5(new com.aspose.slides.internal.o9b.y2(0, 0, var5, var6), 3, 2498570);
            x9 var12 = var38.u3();
            x9 var13 = var11.u3();
            int var14 = var5 * var6;
            int[] var15 = new int[var14];
            int[] var16 = new int[var14];
            com.aspose.slides.internal.e3m.n5.n5(var12, var15, 0, var14);
            com.aspose.slides.internal.e3m.n5.n5(var13, var16, 0, var14);
            int var17 = var4.p3().k5().h0();

            for (int var18 = 0; var18 < var6; var18++) {
               for (int var19 = 0; var19 < var5; var19++) {
                  int var20 = var18 * var5 + var19;
                  int var21 = var15[var20];
                  int var22 = var16[var20];
                  int var23 = n5(var21, var22, var4.y2(), var17);
                  var16[var20] = var23;
               }
            }

            com.aspose.slides.internal.e3m.n5.n5(var16, 0, var13, var14);
            var8.n5(var38);
            var4.z7().n5(var11);
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      } finally {
         var3.n5(var7);
      }
   }

   public static int n5(int var0, int var1, int var2, int var3) {
      if (var0 != 0 && var2 != 11) {
         var1 = var1 == 0 ? (var3 != 0 ? var3 : 854796) : var1;
         long var4 = var0 & 4294967295L;
         switch (var2) {
            case 1:
               var4 = 4278190080L;
               break;
            case 2:
               var4 = (~(var1 | var0) | 0xFF000000) & 4294967295L;
               break;
            case 3:
               var4 = (var1 & ~var0 | 0xFF000000) & 4294967295L;
               break;
            case 4:
               var4 = (~var0 | 0xFF000000) & 4294967295L;
               break;
            case 5:
               var4 = (~var1 & var0 | 0xFF000000) & 4294967295L;
               break;
            case 6:
               var4 = (~var1 | 0xFF000000) & 4294967295L;
               break;
            case 7:
               var4 = (var1 ^ var0 | 0xFF000000) & 4294967295L;
               break;
            case 8:
               var4 = (~(var1 & var0) | 0xFF000000) & 4294967295L;
               break;
            case 9:
               var4 = (var1 & var0 | 0xFF000000) & 4294967295L;
               break;
            case 10:
               var4 = (~(var1 ^ var0) | 0xFF000000) & 4294967295L;
               break;
            case 11:
               var4 = var1 & 4294967295L;
               break;
            case 12:
               var4 = (var1 | ~var0 | 0xFF000000) & 4294967295L;
               break;
            case 13:
               var4 = var0 & 4294967295L;
               break;
            case 14:
               var4 = (~var1 | var0 | 0xFF000000) & 4294967295L;
               break;
            case 15:
               var4 = (var1 | var0 | 0xFF000000) & 4294967295L;
               break;
            case 16:
               var4 = 4294967295L;
         }

         return (int)var4;
      } else {
         return var1;
      }
   }
}
