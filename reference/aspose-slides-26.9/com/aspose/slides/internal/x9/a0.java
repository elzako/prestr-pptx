package com.aspose.slides.internal.x9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.t4$k5;
import com.aspose.slides.internal.p3.v4;
import com.aspose.slides.internal.p3.v8;
import com.aspose.slides.ms.System.IDisposable;

public class a0 extends com.aspose.slides.internal.p3.t4 {
   private final d2 z3;
   private final int m1;
   private int k7;
   private int m3;
   private final int z8;
   private final int j5;
   private final int w1;
   private final int r4;
   private final com.aspose.slides.internal.p3.k7 c4;
   private final com.aspose.slides.internal.p3.m1 y2;
   public t1 q0;
   private int y1 = -1;

   public final int t9() {
      return this.j5;
   }

   public final int z1() {
      return this.r4;
   }

   public final com.aspose.slides.internal.p3.k7 t4() {
      return this.c4;
   }

   public a0(
      int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, int var10, d2 var11, com.aspose.slides.internal.p3.k7 var12
   ) {
      super(var2, var3, var9, false, var10);
      this.m1 = var1;
      this.z8 = var4;
      this.j5 = var6;
      this.w1 = var7;
      this.r4 = var8;
      this.z3 = var11;
      this.k7 = -1;
      this.c4 = var12;
      this.y2 = new com.aspose.slides.internal.p3.m1(this);
   }

   @Override
   public void n5(int var1, double var2) {
      this.z3.z1.n5(var1, var2);
   }

   @Override
   protected void n5(int var1, boolean var2, int var3, int var4) {
      if (this.z3.n3 != 93 && var2 && var3 < 0 && var4 != this.y1) {
         if (this.y1 == -1 && var4 == 0) {
            for (int var5 = var1; var5 >= 0; var5--) {
               c4 var6 = com.aspose.slides.internal.v6g.k5.n5(this.u3.get_Item(var5), c4.class);
               if (var6 != null) {
                  com.aspose.slides.internal.p3.y2 var7 = var6.m3();
                  k7 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, k7.class);
                  if (var8 == null && !com.aspose.slides.internal.v6g.k5.l6(var7, e5.class) || var8 != null && var8.a0() == 93) {
                     this.z3.z3 = true;
                     break;
                  }
               }
            }
         }

         if (this.z3.z3) {
            this.y1 = var4;
            throw new v8();
         }
      }
   }

   @Override
   protected int n5(int var1, int var2, boolean[] var3) {
      com.aspose.slides.internal.p3.m3 var4 = this.y2.n5(var1, var2, this.a6);
      if (var4.l6() == this.a6 && var4.n5() == 0) {
         return this.a6;
      }

      var3[0] = true;
      return var4.l6() - var4.n5();
   }

   @Override
   protected void k5(int var1) {
      List var2 = this.c4.s7();
      if (var2 != null) {
         List$Enumerator var3 = var2.iterator();

         try {
            while (var3.hasNext()) {
               t9 var4 = (t9)var3.next();
               if (var4.d2().z6()) {
                  var4.d2().n5(var1, this.j5, this.y1, this.c4);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
               var3.dispose();
            }
         }
      }
   }

   @Override
   public void n5(t4$k5 var1, v4 var2, int var3) {
      int var4 = var1.s7;
      int var5 = var1.l6 < var3 ? this.h0 : this.c8;
      int var6;
      int var7;
      switch (var5) {
         case 23:
            var6 = var4 / 2;
            var7 = var6;
            break;
         case 39:
            var6 = var4 > 0 ? var4 : 0;
            var7 = 0;
            break;
         case 70:
            var6 = 0;
            var7 = 0;
            break;
         case 135:
            var6 = 0;
            var7 = var4 > 0 ? var4 : 0;
            break;
         default:
            var6 = 0;
            var7 = 0;
      }

      var6 += var1.l6 == 1 && this.t2 && this.z3.s7 ? this.z8 : 0;
      double var8 = var5 != 70 && (var4 >= 0 || -var4 > var1.c8) ? 0.0 : var1.h0;
      if (this.k7 == -1) {
         this.k7 = 0;
         this.m3 = 0;
      }

      if (this.m3 == this.z3.z1.n5(this.k7)) {
         this.k7++;
         this.m3 = 0;
      }

      this.z3
         .z1
         .n5(
            this.n5(var2, var1.l6 > 1 ? var1.n3.n5 + 1 : 0, var1.n5, var1.c8 - (this.m3 > 0 ? 0 : ((d2$l6)var2).u3.u3()), var1.t2, var4, var8, var6, var7),
            this.k7
         );
      this.m3++;
   }

   public final void q0() {
      this.k7 = -1;
   }

   private d2$n5 n5(v4 var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9, int var10) {
      int var11 = (this.j5 - this.w1 - this.r4) / 2;
      int var12 = this.j5 - this.w1 - this.r4 - var11;
      int var13 = this.w1;
      int var14 = this.r4;
      boolean var15 = var6 == this.z3.t4;
      boolean var16 = this.j5 >= var13 && this.z3.t2.x9() != 76;
      if (this.z3.t2.x9() != 52) {
         com.aspose.slides.internal.r4.u3 var17 = new com.aspose.slides.internal.r4.u3<>(var1, var2);
         k5 var18 = null;
         int var19 = 0;

         for (int var20 = var2; var20 <= var3; var20++) {
            com.aspose.slides.internal.p3.i1 var21 = (com.aspose.slides.internal.p3.i1)var17.k5();
            if (com.aspose.slides.internal.v6g.k5.l6(var21, c4.class)) {
               k5 var22 = ((c4)var21).t2();
               if (var22 != null && var18 != var22) {
                  if (!var22.c8() || var22.l6() != 14 && var22.l6() != 4) {
                     if (this.z3.t2.j3() == 30 || var22.n5() == 0) {
                        int var23 = var22.k5();
                        if (var16) {
                           if (var23 + var22.a6() > 0) {
                              var13 = var23 + var22.a6();
                           }

                           if (var22.u9() - var23 > 0) {
                              var14 = var22.u9() - var23;
                           }

                           var16 = false;
                        }

                        if (var23 + var22.a6() > var13) {
                           var13 = var23 + var22.a6();
                        }

                        if (var22.u9() - var23 > var14) {
                           var14 = var22.u9() - var23;
                        }
                     }
                  } else if (var22.u3() > var19) {
                     var19 = var22.u3();
                  }

                  var18 = var22;
               }

               if (var15 && (!var21.t9() || var22 != null && var22.u3() > 0)) {
                  var15 = false;
               }
            }
         }

         if (var14 < var19 - var13) {
            var14 = var19 - var13;
         }
      }

      this.z3.q0 = var13 + var14;
      return var15
         ? new d2$n5(this.z3, this.z3.y4.indexOf(var1), var2, var3, var4, var5, var6, var7, 0.0, var9, var10, 0, this.z3.t4, 0, 0, 0)
         : new d2$n5(this.z3, this.z3.y4.indexOf(var1), var2, var3, var4, var5, var6, var7, 0.0, var9, var10, var13 + var14, this.z3.t4, var11, var12, var13);
   }

   @Override
   protected int n3() {
      t4$k5 var1 = null;
      if (this.m1 == 70) {
         for (int var2 = this.n5(); var2 < this.n3; var2++) {
            for (t4$k5 var3 = this.a6(var2); var3 != null; var3 = var3.y4) {
               var1 = this.n5(var1, var3);
            }
         }

         for (int var4 = this.n5(); var4 < this.n3; var4++) {
            for (t4$k5 var6 = this.a6(var4); var6 != null; var6 = var6.y4) {
               if (var6.l6 != var1.l6 && var6.x8 > 1.0E7) {
                  this.l6(var4, var6);
               }
            }
         }
      } else {
         for (int var5 = this.n5(); var5 < this.n3; var5++) {
            for (t4$k5 var7 = this.a6(var5); var7 != null; var7 = var7.y4) {
               var1 = this.n5(var1, var7);
               if (var7 != var1) {
                  this.l6(var5, var7);
               }
            }
         }
      }

      return var1.l6;
   }
}
