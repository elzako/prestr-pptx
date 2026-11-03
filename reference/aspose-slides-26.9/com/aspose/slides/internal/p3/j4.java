package com.aspose.slides.internal.p3;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.q1;

public class j4 {
   private s4[] n5;
   private z1 l6;
   private s4[] k5;
   private s4[] u3;
   private com.aspose.slides.internal.v8.u9[] a6;
   private com.aspose.slides.internal.v8.u9[] u9;
   private com.aspose.slides.internal.v8.u9[] h0;
   private boolean c8;
   private boolean t2;

   private j4(List<v0> var1, z1 var2, List<v0> var3, boolean var4, boolean var5) {
      this.c8 = var4;
      this.t2 = var5;
      int var6 = 0;
      if (var1 != null) {
         var6 += var1.size();
      }

      if (var3 != null) {
         var6 += var3.size();
      }

      this.u3 = new s4[var6];
      this.h0 = new com.aspose.slides.internal.v8.u9[var6];
      int var7 = 0;
      if (var1 != null) {
         for (com.aspose.slides.internal.r4.u3 var8 = new com.aspose.slides.internal.r4.u3(var1); var8.l6(); var7++) {
            this.u3[var7] = (s4)var8.k5();
            this.h0[var7] = this.u3[var7].s7();
         }
      }

      if (var3 != null) {
         for (com.aspose.slides.internal.r4.u3 var11 = new com.aspose.slides.internal.r4.u3(var3); var11.l6(); var7++) {
            this.u3[var7] = (s4)var11.k5();
            this.h0[var7] = this.u3[var7].s7();
         }
      }

      if (var2 != null) {
         if (var2.x8() != null) {
            var1.insertRange(0, var2.x8().convertAll(new j4$1(this)));
         }

         if (var2.s7() != null) {
            var3.insertRange(0, var2.s7().convertAll(new j4$2(this)));
         }
      }

      if (var1 != null) {
         this.n5 = new s4[var1.size()];
         this.a6 = new com.aspose.slides.internal.v8.u9[this.n5.length];

         for (int var9 = 0; var9 < this.n5.length; var9++) {
            this.n5[var9] = com.aspose.slides.internal.v6g.k5.n5(var1.get_Item(var9), s4.class);
            this.a6[var9] = this.n5[var9].s7();
         }
      }

      this.l6 = var2;
      if (var3 != null) {
         this.k5 = new s4[var3.size()];
         this.u9 = new com.aspose.slides.internal.v8.u9[this.k5.length];

         for (int var10 = 0; var10 < this.k5.length; var10++) {
            this.k5[var10] = com.aspose.slides.internal.v6g.k5.n5(var3.get_Item(var10), s4.class);
            this.u9[var10] = this.k5[var10].s7();
         }
      }

      this.k5();
   }

   private static void n5(d1[] var0, com.aspose.slides.internal.v8.u9[] var1, boolean var2) {
      for (int var3 = 0; var3 < var0.length; var3++) {
         int var4;
         if (var2) {
            var4 = var0.length - 1 - var3;
         } else {
            var4 = var3;
         }

         if (com.aspose.slides.internal.v6g.k5.l6(var0[var4], t9.class)) {
            t9 var5 = (t9)var0[var4];
            if (var5.a6() && !var5.n3() && !var5.t9()) {
               var1[var4] = null;
            }
         }
      }
   }

   private static void l6(d1[] var0, com.aspose.slides.internal.v8.u9[] var1, boolean var2) {
      for (int var3 = 0; var3 < var0.length; var3++) {
         int var4;
         if (var2) {
            var4 = var0.length - 1 - var3;
         } else {
            var4 = var3;
         }

         if (var1[var4] != null) {
            if (com.aspose.slides.internal.v6g.k5.l6(var0[var4], t9.class) || !var0[var4].a6()) {
               break;
            }

            var1[var4] = null;
         }
      }
   }

   private static void n5(d1[] var0, com.aspose.slides.internal.v8.u9[] var1, int var2, int var3) {
      boolean var4 = false;
      int var5 = 0;

      for (int var6 = var2; var6 <= var3; var6++) {
         if (var1[var6] != null) {
            var5++;
            g7 var7 = (g7)var0[var6];
            if (var7.h0()) {
               var4 = true;
               break;
            }
         }
      }

      if (var5 != 0) {
         if (var4) {
            for (int var15 = var2; var15 <= var3; var15++) {
               if (var1[var15] != null) {
                  g7 var20 = (g7)var0[var15];
                  if (!var20.h0()) {
                     var1[var15] = null;
                  }
               }
            }
         } else {
            int var14 = Integer.MIN_VALUE;

            for (int var8 = var2; var8 <= var3; var8++) {
               if (var1[var8] != null) {
                  g7 var16 = (g7)var0[var8];
                  var14 = q1.n5(var14, var16.t2());
               }
            }

            var5 = 0;
            int var21 = Integer.MIN_VALUE;

            for (int var9 = var2; var9 <= var3; var9++) {
               if (var1[var9] != null) {
                  g7 var17 = (g7)var0[var9];
                  if (var17.t2() != var14) {
                     var1[var9] = null;
                  } else {
                     var21 = q1.n5(var21, var17.s7().l6());
                     var5++;
                  }
               }
            }

            if (var5 > 1) {
               var5 = 0;

               for (int var22 = var2; var22 <= var3; var22++) {
                  if (var1[var22] != null) {
                     g7 var18 = (g7)var0[var22];
                     if (var18.s7().l6() < var21) {
                        var1[var22] = null;
                     } else {
                        var5++;
                     }
                  }
               }

               if (var5 > 1) {
                  int var23 = Integer.MIN_VALUE;
                  int var10 = Integer.MAX_VALUE;

                  for (int var11 = var2; var11 <= var3; var11++) {
                     if (var1[var11] != null) {
                        g7 var19 = (g7)var0[var11];
                        var23 = q1.n5(var23, var19.s7().n5());
                        var10 = q1.l6(var10, var19.s7().k5());
                        if (var5 > 1) {
                           var1[var11] = null;
                           var5--;
                        } else {
                           var1[var11] = com.aspose.slides.internal.v8.u9.n5(var23, var1[var11].l6(), var10);
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private static void n5(d1[] var0, com.aspose.slides.internal.v8.u9[] var1) {
      int var2 = 0;

      for (int var3 = var2; var3 < var0.length; var2 = ++var3) {
         if (com.aspose.slides.internal.v6g.k5.l6(var0[var3], g7.class)) {
            while (var3 < var0.length && (var0[var3] == null || com.aspose.slides.internal.v6g.k5.l6(var0[var3], g7.class))) {
               var3++;
            }

            n5(var0, var1, var2, var3 - 1);
         }
      }
   }

   private boolean n5() {
      return this.n5 != null && this.n5.length > 0;
   }

   private boolean l6() {
      return this.k5 != null && this.k5.length > 0;
   }

   private void k5() {
      if (this.l6 != null) {
         if (this.n5()) {
            n5(this.n5, this.a6, true);
            l6(this.n5, this.a6, true);
            n5(this.n5, this.a6);
         }

         if (this.l6()) {
            n5(this.k5, this.u9, false);
            l6(this.k5, this.u9, false);
            n5(this.k5, this.u9);
         }

         if (this.u3 != null) {
            n5(this.u3, this.h0);
         }
      } else {
         if (this.c8) {
            n5(this.k5, this.u9, false);
            l6(this.k5, this.u9, false);
         }

         if (this.t2) {
            n5(this.n5, this.a6, true);
            l6(this.n5, this.a6, true);
         }

         if (this.n5()) {
            s4[] var1 = this.k5;
            com.aspose.slides.internal.v8.u9[] var2 = this.u9;
            this.k5 = this.n5;
            this.u9 = this.a6;
            this.n5 = var1;
            this.a6 = var2;
            if (this.n5()) {
               throw new InvalidOperationException(com.aspose.slides.ms.System.d1.n5(new String[]{"Didn't expect more than one parts in a", "no-break condition."}));
            }
         }

         n5(this.k5, this.u9);
      }
   }

   private static com.aspose.slides.internal.v8.u9 n5(com.aspose.slides.internal.v8.u9[] var0) {
      com.aspose.slides.internal.v8.u9 var1 = com.aspose.slides.internal.v8.u9.n5;

      for (int var2 = 0; var2 < var0.length; var2++) {
         if (var0[var2] != null) {
            var1 = var1.n5(var0[var2]);
         }
      }

      return var1;
   }

   private void n5(com.aspose.slides.internal.r4.h0<com.aspose.slides.internal.r4.u9> var1) {
      com.aspose.slides.internal.v8.u9 var2 = n5(this.a6);
      com.aspose.slides.internal.v8.u9 var3 = n5(this.u9);
      boolean var4 = false;
      if (this.l6 != null) {
         if (var2.u9()) {
            var1.l6(new o0(0, 1000, false, null, true));
            var1.l6(new e5(var2, null, true));
            if (this.l6.c8()) {
               var1.l6(new f2(0, null, true));
            }
         }

         var1.l6(new o0(this.l6.u9(), this.l6.h0(), false, this.l6.t2(), new j4$n5(this, this.l6), false));
         if (this.l6.h0() <= -1000) {
            return;
         }

         com.aspose.slides.internal.v8.u9 var5 = n5(this.h0);
         com.aspose.slides.internal.v8.u9 var6 = var2.n5(var3);
         int var7 = var5.l6() - var6.l6();
         int var8 = var5.a6() - var6.a6();
         int var9 = var5.u3() - var6.u3();
         if (var7 != 0 || var8 != 0 || var9 != 0) {
            var1.l6(new e5(var7, var8, var9, null, true));
         }
      } else if (var2.u9()) {
         throw new InvalidOperationException("spaceBeforeBreak should be 0 in this case");
      }

      j4$l6 var10 = null;
      if (this.l6 == null) {
         var10 = new j4$l6(this);
      }

      if (var3.u9() || var10 != null) {
         var1.l6(new f2(0, var10, true));
      }

      if (var3.u9()) {
         var1.l6(new o0(0, 1000, false, null, true));
         var1.l6(new e5(var3, null, true));
         var4 = true;
      }

      if (this.t2 && var4) {
         var1.l6(new f2(0, null, true));
      }
   }

   public static void n5(List<com.aspose.slides.internal.r4.u9> var0) {
      boolean var1 = true;
      boolean var2 = false;
      boolean var3 = false;
      List var4 = new List();
      List var5 = new List();

      for (com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3(var0); var6.l6(); var1 = false) {
         v0 var7 = (v0)var6.k5();
         if (var7.m1()) {
            z1 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, z1.class);
            var4.clear();
            var5.clear();
            List var9;
            if (var8 != null) {
               var9 = var5;
            } else {
               var9 = var4;
               var9.addItem(var7);
            }

            var6.n5();
            var2 = true;
            var3 = true;

            while (var6.l6()) {
               var7 = ((com.aspose.slides.internal.r4.u9)var6.k5()).n5();
               if (com.aspose.slides.internal.v6g.k5.l6(var7, z1.class) && var8 != null) {
                  var3 = false;
                  var2 = false;
                  break;
               }

               if (var9 == var4 && com.aspose.slides.internal.v6g.k5.l6(var7, z1.class)) {
                  var8 = (z1)var7;
                  var6.n5();
                  var9 = var5;
               } else {
                  if (!var7.m1()) {
                     var2 = false;
                     break;
                  }

                  var9.addItem(var7);
                  var6.n5();
               }
            }

            if (var8 == null && var5.size() == 0 && !var2) {
               List var10 = var5;
               var5 = var4;
               var4 = var10;
            }

            j4 var14 = new j4(var4, var8, var5, var1, var2);
            if (!var2) {
               var6.a6();
            }

            var14.n5(var6);
            if (!var2 && var3) {
               var6.k5();
            }
         }
      }
   }

   public static void n5(List<com.aspose.slides.internal.r4.u9> var0, int var1, int var2, int var3) {
      i1 var4 = null;
      if (var3 > 0) {
         var4 = (i1)((com.aspose.slides.internal.r4.u9)var0.get_Item(var3)).n5();
      }

      j4$n5 var5 = null;
      j4$n5 var6 = null;
      if (var4 != null && var4.y_()) {
         j8 var7 = var4.k7();
         if (com.aspose.slides.internal.v6g.k5.l6(var7, j4$n5.class)) {
            var5 = (j4$n5)var7;
            var5.n5(true, v3.n5);
         }
      }

      var4 = (i1)var0.get_Item(var2);
      if (var4 != null && var4.y_()) {
         j8 var11 = var4.k7();
         if (com.aspose.slides.internal.v6g.k5.l6(var11, j4$n5.class)) {
            var6 = (j4$n5)var11;
            var6.n5(true, v3.l6);
         }
      }

      for (int var12 = var1; var12 <= var2; var12++) {
         j8 var8 = ((i1)var0.get_Item(var12)).k7();
         if (com.aspose.slides.internal.v6g.k5.l6(var8, j4$l6.class)) {
            ((j4$l6)var8).n5();
         } else if (com.aspose.slides.internal.v6g.k5.l6(var8, j4$n5.class)) {
            j4$n5 var9 = (j4$n5)var8;
            if (var9 != var5 && var9 != var6) {
               var9.n5(false, null);
            }
         }
      }
   }

   // $VF: synthetic method
   static s4[] n5(j4 var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v8.u9[] l6(j4 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static s4[] k5(j4 var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v8.u9[] u3(j4 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static s4[] a6(j4 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v8.u9[] u9(j4 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static z1 h0(j4 var0) {
      return var0.l6;
   }
}
