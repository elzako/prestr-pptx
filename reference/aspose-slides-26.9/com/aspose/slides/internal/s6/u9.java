package com.aspose.slides.internal.s6;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class u9 {
   private List<c4> n5 = new List<>();

   public u9(u3 var1, float var2, float var3, boolean var4, s0[] var5, boolean[] var6, int var7) {
      if (var5 == null) {
         throw new ArgumentNullException("bevelAnchorPoints");
      }

      if (var5.length < 2) {
         throw new ArgumentException("The size of the point array must be greater than 1");
      }

      if (var6 == null) {
         var6 = new boolean[var5.length];
      }

      if (var6.length != var5.length) {
         throw new ArgumentException("The size of the anchorPoints[] and bevelSoothingFlags[] array must be the same");
      }

      var5[0].n5(0.0F);
      var5[0].l6(0.0F);
      var5[var5.length - 1].n5(1.0F);
      int[] var8;
      int[] var9;
      if (var4) {
         var8 = new int[]{1, 2, 0, 2, 1, 3};
         var9 = new int[]{1, 2};
      } else {
         var8 = new int[]{0, 2, 1, 3, 1, 2};
         var9 = new int[]{2, 1};
         var3 = -var3;
      }

      int var10 = var5.length - 1;
      s0 var11 = var1.k5().l6().a6();
      s0 var12 = var1.k5().k5().a6();
      s0 var13 = s0.l6(var12, var11).a6();
      IGenericEnumerator var14 = var1.iterator();

      try {
         while (var14.hasNext()) {
            l6 var15 = (l6)var14.next();
            List var16 = var15.l6();
            byte var17 = 0;
            byte var18 = 0;

            for (int var19 = 0; var19 < var16.size(); var19++) {
               k5 var20 = (k5)var16.get_Item(var19);
               k5 var21 = (k5)var16.get_Item((var19 + 1) % var16.size());
               var18 += var20.c8() != var21.c8() ? var10 * 4 : var10 * 4 - 1;
               var17 += var20.c8() != var21.c8() ? var10 * 2 * 3 : var10 * 2 * 3 - 3;
            }

            v3[] var39 = (v3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var18));
            v3[] var40 = (v3[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(v3.class), var18));
            s0[] var41 = (s0[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(s0.class), var18));
            int[] var22 = new int[var17];
            byte var23 = 0;
            int var24 = 0;

            for (int var25 = 0; var25 < var16.size(); var25++) {
               k5 var26 = (k5)var16.get_Item(var25);
               k5 var27 = (k5)var16.get_Item((var25 + 1) % var16.size());

               for (int var28 = 0; var28 < var10; var28++) {
                  if (var28 >= var10 - 1 && var26.c8() == var27.c8()) {
                     var22[var24++] = var23 + var8[0];
                     var22[var24++] = var23 + var8[1];
                     var22[var24++] = var23 + var8[2];
                     s0 var52 = var26.n5(var5[var28].n5()).a6();
                     s0 var53 = var27.n5(var5[var28].n5()).a6();
                     s0 var54 = var26.n5(var5[var28 + 1].n5()).a6();
                     float var55 = var2 + w2.n5(0.0F, var3, var5[var28].l6());
                     float var56 = var2 + w2.n5(0.0F, var3, var5[var28 + 1].l6());
                     var39[var23 + 0] = new v3(var52.n5(), var52.l6(), var55);
                     var39[var23 + 1] = new v3(var53.n5(), var53.l6(), var55);
                     var39[var23 + 2] = new v3(var54.n5(), var54.l6(), var56);
                     v3 var57 = v3.u3(v3.l6(var39[var23 + var9[0]], var39[var23 + 0]).h0(), v3.l6(var39[var23 + var9[1]], var39[var23 + 0]).h0()).u9().h0();
                     var57.l6(var40[var23 + 0]);
                     var57.l6(var40[var23 + 1]);
                     var57.l6(var40[var23 + 2]);
                     var23 += 3;
                  } else {
                     var22[var24++] = var23 + var8[0];
                     var22[var24++] = var23 + var8[1];
                     var22[var24++] = var23 + var8[2];
                     var22[var24++] = var23 + var8[3];
                     var22[var24++] = var23 + var8[4];
                     var22[var24++] = var23 + var8[5];
                     s0 var29 = var26.n5(var5[var28].n5()).a6();
                     s0 var30 = var27.n5(var5[var28].n5()).a6();
                     s0 var31 = var26.n5(var5[var28 + 1].n5()).a6();
                     s0 var32 = var27.n5(var5[var28 + 1].n5()).a6();
                     float var33 = var2 + w2.n5(0.0F, var3, var5[var28].l6());
                     float var34 = var2 + w2.n5(0.0F, var3, var5[var28 + 1].l6());
                     var39[var23 + 0] = new v3(var29.n5(), var29.l6(), var33);
                     var39[var23 + 1] = new v3(var30.n5(), var30.l6(), var33);
                     var39[var23 + 2] = new v3(var31.n5(), var31.l6(), var34);
                     var39[var23 + 3] = new v3(var32.n5(), var32.l6(), var34);
                     v3 var35 = v3.u3(v3.l6(var39[var23 + var9[0]], var39[var23 + 0]).h0(), v3.l6(var39[var23 + var9[1]], var39[var23 + 0]).h0()).u9().h0();
                     var35.l6(var40[var23 + 0]);
                     var35.l6(var40[var23 + 1]);
                     var35.l6(var40[var23 + 2]);
                     var35.l6(var40[var23 + 3]);
                     var23 += 4;
                  }
               }
            }

            for (int var49 = 0; var49 < var18; var49++) {
               v3 var51 = var39[var49].h0();
               var41[var49].n5(var13.n5() > 0.0F ? (var51.n5() - var11.n5()) / var13.n5() : 0.0F);
               var41[var49].l6(var13.l6() > 0.0F ? (var12.l6() - var51.l6()) / var13.l6() : 0.0F);
            }

            this.n5(var15, var10, var6, var40, var4);
            this.n5(var15, var10, var7, var40);
            c4 var50 = new c4(2);
            var50.n5(var39);
            var50.n5(var22);
            var50.l6(var40);
            var50.n5(var41);
            this.n5.addItem(var50);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }
   }

   public final List<c4> n5() {
      return this.n5;
   }

   private void n5(l6 var1, int var2, boolean[] var3, v3[] var4, boolean var5) {
      List var6 = var1.l6();
      v3 var7 = new v3(0.0F, 0.0F, var5 ? 1.0F : -1.0F);
      int var8 = 0;

      for (int var9 = 0; var9 < var6.size(); var9++) {
         int var10 = (var9 + 1) % var6.size();
         k5 var11 = (k5)var6.get_Item(var9);
         k5 var12 = (k5)var6.get_Item(var10);
         boolean var13 = var11.c8() == var12.c8();
         int var14 = !var13 ? var2 * 4 : var2 * 4 - 1;

         for (int var15 = 0; var15 < var2 - 1; var15++) {
            int var16 = var8 + 2 + var15 * 4;
            if (var3[var15 + 1]) {
               v3 var17 = v3.n5(v3.n5(v3.n5(var4[var16], var4[var16 + 1]), var4[var16 + 2]), var4[var16 + 3]).u9().h0();
               var17.l6(var4[var16 + 0]);
               var17.l6(var4[var16 + 1]);
               var17.l6(var4[var16 + 2]);
               var17.l6(var4[var16 + 3]);
            }
         }

         if (var3[0]) {
            v3 var18 = new v3(var12.l6().l6() - var11.l6().l6(), var11.l6().n5() - var12.l6().n5(), 0.0F).u9().h0();
            var18.l6(var4[var8 + 0]);
            var18.l6(var4[var8 + 1]);
         }

         if (var3[var2]) {
            int var19 = var8 + 2 + (var2 - 1) * 4;
            var7.l6(var4[var19]);
            if (!var13) {
               var7.l6(var4[var19 + 1]);
            }
         }

         var8 += var14;
      }
   }

   private void n5(l6 var1, int var2, int var3, v3[] var4) {
      if (var3 != -1) {
         List var5 = var1.l6();
         boolean[] var6 = this.n5(var1, var3);
         int var7 = 0;

         for (int var8 = 0; var8 < var5.size(); var8++) {
            int var9 = (var8 + 1) % var5.size();
            k5 var10 = (k5)var5.get_Item(var8);
            k5 var11 = (k5)var5.get_Item(var9);
            boolean var12 = var10.c8() == var11.c8();
            int var13 = !var12 ? var2 * 4 : var2 * 4 - 1;
            if (var6[var9]) {
               for (int var14 = 0; var14 < var2; var14++) {
                  int var15 = var7 + var14 * 4;
                  v3 var16 = v3.n5(var4[var15 + 1], var4[(var15 + 0 + var13) % var4.length]).u9().h0();
                  var16.l6(var4[var15 + 1]);
                  var16.l6(var4[(var15 + 0 + var13) % var4.length]);
                  if (var14 != var2 - 1) {
                     v3 var17 = v3.n5(var4[var15 + 3], var4[(var15 + 2 + var13) % var4.length]).u9().h0();
                     var17.l6(var4[var15 + 3]);
                     var17.l6(var4[(var15 + 2 + var13) % var4.length]);
                  }
               }

               int var25 = var7 + (var2 - 1) * 4;
               v3 var27 = var4[var25 + 2].h0();
               if (!var12) {
                  var10.c8().n5(v3.n5(var10.c8().h0(), var27).h0());
                  var11.c8().n5(v3.n5(var11.c8().h0(), var27).h0());
               } else {
                  var10.c8().n5(v3.n5(var10.c8().h0(), var27).h0());
               }
            }

            var7 += var13;
         }

         var7 = 0;

         for (int var19 = 0; var19 < var5.size(); var19++) {
            int var20 = (var19 + 1) % var5.size();
            k5 var21 = (k5)var5.get_Item(var19);
            k5 var22 = (k5)var5.get_Item(var20);
            boolean var23 = var21.c8() == var22.c8();
            int var24 = !var23 ? var2 * 4 : var2 * 4 - 1;
            if (var6[var20]) {
               int var26 = var7 + (var2 - 1) * 4;
               if (!var23) {
                  var21.c8().h0().u9().l6(var4[var26 + 2]);
                  var22.c8().h0().u9().l6(var4[var26 + 3]);
               } else {
                  var21.c8().h0().u9().l6(var4[var26 + 2]);
               }
            }

            var7 += var24;
         }
      }
   }

   private boolean[] n5(l6 var1, int var2) {
      List var3 = var1.l6();
      int var4 = var3.size();
      boolean[] var5 = new boolean[var4];
      if (var2 == -1) {
         return var5;
      }

      if (var2 == 2) {
         for (int var12 = 0; var12 < var3.size(); var12++) {
            var5[var12] = true;
         }

         return var5;
      } else {
         switch (var2) {
            case 0:
               if (!var1.u3().k5()) {
                  for (int var10 = 0; var10 < var3.size(); var10++) {
                     int var13 = (var10 + 1) % var4;
                     var5[var10] = ((k5)var3.get_Item(var10)).u3() == 2 && ((k5)var3.get_Item(var13)).u3() == 2;
                  }
               } else {
                  for (int var11 = 0; var11 < var3.size(); var11++) {
                     int var14 = (var11 + 1) % var4;
                     var5[var14] = ((k5)var3.get_Item(var11)).u3() == 2 && ((k5)var3.get_Item(var14)).u3() == 2;
                  }
               }
               break;
            case 1:
               for (int var6 = 0; var6 < var4; var6++) {
                  int var7 = (var6 + 1) % var4;
                  int var8 = (var6 + 2) % var4;
                  float var9 = s0.k5(
                     s0.l6(((k5)var3.get_Item(var7)).l6(), ((k5)var3.get_Item(var6)).l6()).a6(),
                     s0.l6(((k5)var3.get_Item(var8)).l6(), ((k5)var3.get_Item(var7)).l6()).a6()
                  );
                  var5[var7] = var9 > 0.7071068F;
               }
         }

         return var5;
      }
   }
}
