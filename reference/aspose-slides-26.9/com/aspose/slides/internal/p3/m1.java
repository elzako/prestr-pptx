package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public class m1 {
   private k7 n5;
   private com.aspose.slides.internal.x9.a0 l6 = null;

   public final k7 n5() {
      return this.n5;
   }

   public final void n5(k7 var1) {
      this.n5 = var1;
   }

   public int l6() {
      return this.l6.t9();
   }

   public int k5() {
      return this.l6.z1();
   }

   public t1 u3() {
      return this.l6.q0;
   }

   public int a6() {
      return this.l6.y4();
   }

   public m1(com.aspose.slides.internal.x9.a0 var1) {
      this.l6 = var1;
      this.n5 = var1.t4();
   }

   protected m1() {
   }

   public final m3 n5(int var1, int var2, int var3) {
      int var4 = var3;
      int var5 = 0;
      List var6 = this.n5.s7();
      if (var6 == null) {
         return new m3(var5, var4);
      }

      int var7 = var1 * this.l6();
      int var8 = this.n5.h0();
      List var9 = new List();
      List var10 = new List();
      int var11 = 0;
      com.aspose.slides.internal.o9b.y2 var12 = new com.aspose.slides.internal.o9b.y2(0, var1 * this.l6(), var8, (var1 + 1) * this.l6());

      for (int var13 = 0; var13 < var6.size(); var13++) {
         com.aspose.slides.internal.x9.t9 var14 = (com.aspose.slides.internal.x9.t9)var6.get_Item(var13);
         if (var14.d2() == null) {
            var14.t4();
            var14.d2().n5(var14);
            var14.n5(this.n5.n5());
            if (com.aspose.slides.internal.v6g.k5.l6(this.n5.n5(), com.aspose.slides.internal.j9.y4.class)) {
               var14.d2().u3(true);
            }
         }

         z3 var15 = var14.d2();
         if (var15.s0() < var2 && (var15.x9() == null || var15.x9() == this.n5.n5().y4())) {
            if (var15.n1() && this.n5.k5() != null && this.n5.k5().a0()) {
               var15.h0(var3);
            } else {
               int var16 = 0;
               if (var15.z6()) {
                  if (var15.j4().n5() > var7) {
                     n5(var15, var10, var9);
                  }
               } else {
                  int[] var17 = new int[]{var5};
                  n5(var1, var9, var12.n3(), var17, true);
                  var5 = var17[0];
                  int[] var18 = new int[]{var4};
                  n5(var1, var10, var12.n3(), var18, false);
                  var4 = var18[0];
                  var15.n5(var1, var2, var4 - var5, this);
                  var15.l6((Object)null);
                  if (var15.i1() == null) {
                     var15.n5(this.n5.n5().y4());
                  }

                  if (var15.s0() > 0) {
                     var15.y4(var1);
                  }

                  var16 = var15.e9();
                  var15.u9(this.l6());
                  m1$n5 var19 = new m1$n5(var9);
                  m1$n5 var20 = new m1$n5(var10);
                  z3 var21 = var19.n5() ? (z3)var19.l6() : null;
                  z3 var22 = var20.n5() ? (z3)var20.l6() : null;

                  while (true) {
                     int var23 = var21 != null ? var21.j4().u9() : 0;
                     int var24 = var22 != null ? var22.j8() : 0;
                     int var25 = var23 + var24;
                     if (var25 <= 0 || var25 <= (this.n5.u9() ? var8 : var3) - var16) {
                        if (var15.j3()) {
                           var15.c8(var23);
                        } else if (var15.n1()) {
                           var15.c8(var24 > 0 ? var24 - var16 : var3 - var16);
                        }

                        var15.t2(var11);
                        if (var15.t2 == -1) {
                           var15.t2 = var1;
                        }

                        n5(var15, var10, var9);
                        if (this.n5.l6() == null && !var15.i9()) {
                           var15.t2(var15.w2() - this.k5() / 2);
                        } else {
                           var15.t2(var15.w2() + this.k5() / 2);
                        }
                        break;
                     }

                     int var26 = var21 != null ? var21.j4().n5() : 0;
                     int var27 = var22 != null ? var22.j4().n5() : 0;
                     if ((var22 == null || var26 < var27) && var21 != null) {
                        int[] var34 = new int[]{var11};
                        var21 = n5(var19, var21, var26, var34);
                        var11 = var34[0];
                     } else {
                        int[] var28 = new int[]{var11};
                        var22 = n5(var20, var22, var27, var28);
                        var11 = var28[0];
                     }
                  }
               }
            }
         }
      }

      int[] var31 = new int[]{var5};
      n5(var1, var9, var12.n3(), var31, true);
      var5 = var31[0];
      int[] var32 = new int[]{var4};
      n5(var1, var10, var12.n3(), var32, false);
      var4 = var32[0];
      return new m3(var5, var4);
   }

   private static void n5(z3 var0, List<z3> var1, List<z3> var2) {
      if (var0.o5() > 0) {
         if (var0.n1()) {
            var1.addItem(var0);
         } else if (var0.j3()) {
            var2.addItem(var0);
         }
      }
   }

   private static int n5(int var0, List<z3> var1, com.aspose.slides.internal.o9b.y2 var2, int[] var3, boolean var4) {
      List$Enumerator var5 = var1.iterator();

      try {
         while (var5.hasNext()) {
            z3 var6 = (z3)var5.next();
            if (var2.k5(var6.j4().n3())) {
               var3[0] = var4 ? q1.n5(var3[0], var6.j4().u9()) : q1.l6(var3[0], var6.j4().u3());
               if (var6.t2 == -1) {
                  var6.t2 = var0;
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var5, IDisposable.class)) {
            var5.dispose();
         }
      }

      return var3[0];
   }

   private static z3 n5(m1$n5<z3> var0, z3 var1, int var2, int[] var3) {
      var3[0] = var1.j4().n5();

      while (var0.n5()) {
         var1 = (z3)var0.l6();
         if (var1.j4().n5() > var2) {
            var3[0] += var2;
            return var1;
         }
      }

      return null;
   }
}
