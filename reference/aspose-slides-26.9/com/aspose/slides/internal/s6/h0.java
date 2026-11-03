package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class h0 {
   private float n5;
   private float l6;
   private s0[] k5;
   private boolean[] u3;

   public h0(float var1, float var2, s0[] var3, boolean[] var4) {
      this.n5(var1);
      this.l6(var2);
      this.k5 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5((Object)(var3)).deepClone(), s0[].class);
      this.u3 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.ms.System.u3.n5(var4).deepClone(), boolean[].class);
   }

   final boolean n5(f2 var1, float var2, boolean var3, int var4, y2 var5) {
      s0 var6 = var1.l6().a6();
      s0 var7 = var1.k5().a6();
      s0 var8 = s0.l6(var7, var6).a6();
      boolean var9 = false;
      v3 var10 = new v3(0.0F, 0.0F, var3 ? 1.0F : -1.0F);
      float var11 = var2 + this.k5[this.k5.length - 1].l6() * (var3 ? this.l6() : -this.l6());
      int[] var12 = var3 ? new int[]{2, 1, 0} : new int[]{0, 1, 2};
      List$Enumerator var13 = var1.u3().iterator();

      try {
         while (var13.hasNext()) {
            p8 var14 = (p8)var13.next();
            u3 var15 = new u3(var14, this.n5());
            if (!var15.u3()) {
               u9 var16 = new u9(var15, var2, this.l6(), var3, this.k5, this.u3, var4);
               List var17 = var16.n5();
               List$Enumerator var18 = var17.iterator();

               try {
                  while (var18.hasNext()) {
                     c4 var19 = (c4)var18.next();
                     var5.n5(var19);
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var18, IDisposable.class)) {
                     var18.dispose();
                  }
               }

               var9 |= var17.size() > 0;

               y4 var45;
               try {
                  com.aspose.slides.internal.x4g.s7 var20 = new com.aspose.slides.internal.x4g.s7();
                  IGenericEnumerator var21 = var15.iterator();

                  try {
                     while (var21.hasNext()) {
                        l6 var22 = (l6)var21.next();
                        List var23 = var22.k5();

                        for (int var24 = 0; var24 < var23.size() - 1; var24++) {
                           s0 var25 = ((a6)var23.get_Item(var24)).l6().k5().a6();
                           s0 var26 = ((a6)var23.get_Item(var24 + 1)).l6().k5().a6();
                           var20.l6(var25.n5(), var25.l6(), var26.n5(), var26.l6());
                        }

                        var20.n3();
                     }
                  } finally {
                     if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
                        var21.dispose();
                     }
                  }

                  p3 var48 = new p3(var20);
                  x8 var50 = new x8(var48);
                  var45 = var50.n5();
               } catch (RuntimeException var42) {
                  continue;
               }

               if (var45 != null && this.n5(var45, var14)) {
                  for (int var46 = 0; var46 < var45.n5(); var46++) {
                     n3 var47 = var45.n5(var46);
                     int[] var49 = new int[var47.u3().n5() * 3];
                     v3[] var51 = (v3[])com.aspose.slides.ms.System.u3.n5(
                        com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var47.n5().n5())
                     );
                     v3[] var52 = (v3[])com.aspose.slides.ms.System.u3.n5(
                        com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var47.n5().n5())
                     );
                     s0[] var53 = (s0[])com.aspose.slides.ms.System.u3.n5(
                        com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s0.class), var47.n5().n5())
                     );

                     for (int var54 = 0; var54 < var47.n5().n5(); var54++) {
                        j4 var27 = var47.n5().l6(var54);
                        var51[var54] = new v3((float)var27.n5(), (float)var27.l6(), var11);
                        var10.l6(var52[var54]);
                        var53[var54].n5(var8.n5() > 0.0F ? ((float)var27.n5() - var6.n5()) / var8.n5() : 0.0F);
                        var53[var54].l6(var8.l6() > 0.0F ? (var7.l6() - (float)var27.l6()) / var8.l6() : 0.0F);
                     }

                     int var55 = 0;

                     for (int var57 = 0; var55 < var47.u3().n5(); var57 += 3) {
                        var49[var57] = var47.n5().k5(var47.u3().l6(var55).n5()[var12[0]]);
                        var49[var57 + 1] = var47.n5().k5(var47.u3().l6(var55).n5()[var12[1]]);
                        var49[var57 + 2] = var47.n5().k5(var47.u3().l6(var55).n5()[var12[2]]);
                        var55++;
                     }

                     c4 var56 = new c4(2);
                     var56.n5(var51);
                     var56.n5(var49);
                     var56.l6(var52);
                     var56.n5(var53);
                     var5.n5(var56);
                  }
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
            var13.dispose();
         }
      }

      return var9;
   }

   private boolean n5(y4 var1, p8 var2) {
      for (int var3 = 0; var3 < var1.n5(); var3++) {
         n3 var4 = var1.n5(var3);
         int var5 = 0;

         for (int var6 = 0; var5 < var4.u3().n5(); var6 += 3) {
            j4 var7 = var4.u3().l6(var5).n5()[0];
            j4 var8 = var4.u3().l6(var5).n5()[1];
            j4 var9 = var4.u3().l6(var5).n5()[2];
            s0 var10 = new s0((float)(var7.n5() + var8.n5() + var9.n5()) / 3.0F, (float)(var7.l6() + var8.l6() + var9.l6()) / 3.0F);
            List$Enumerator var11 = var2.x8().iterator();

            try {
               while (var11.hasNext()) {
                  p8 var12 = (p8)var11.next();
                  if (var12.n5(var10.a6())) {
                     return false;
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var11, IDisposable.class)) {
                  var11.dispose();
               }
            }

            var5++;
         }
      }

      return true;
   }

   final float n5() {
      return this.n5;
   }

   private void n5(float var1) {
      this.n5 = var1;
   }

   final float l6() {
      return this.l6;
   }

   private void l6(float var1) {
      this.l6 = var1;
   }
}
