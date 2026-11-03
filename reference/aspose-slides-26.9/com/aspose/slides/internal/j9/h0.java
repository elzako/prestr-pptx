package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.h2.t2$n5;
import com.aspose.slides.internal.p3.i1;
import com.aspose.slides.internal.p3.j4;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.q0;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.z7;
import com.aspose.slides.internal.u6.m3;
import com.aspose.slides.internal.u6.y1;
import com.aspose.slides.internal.u6.y2;
import com.aspose.slides.internal.u6.z1;
import com.aspose.slides.ms.System.q1;

public class h0 {
   private int n5;
   private int l6 = 0;
   private com.aspose.slides.internal.u6.a6 k5 = null;
   private t1 u3;
   private int a6;
   private int u9;
   private List<Integer> h0 = new List<>();
   private int[] c8;
   private boolean[] t2;
   private l6[] s7;
   private l6[] x8;
   private int n3 = 0;
   private com.aspose.slides.internal.h2.t2 y4;
   private List<com.aspose.slides.internal.a0.t2> e2;
   private t2 t9;

   public h0(t2 var1, t1 var2) {
      this.t9 = var1;
      this.u3 = var2;
      this.n5 = var1.k5().n5();
      this.c8 = new int[this.n5];
      this.t2 = new boolean[this.n5];
      this.s7 = new l6[this.n5];
      this.x8 = new l6[this.n5];
      this.a6 = -1;
      this.u9 = -1;
   }

   public final void n5(y2 var1) {
      com.aspose.slides.internal.h2.t2 var2 = var1.x9();
      if (var2.a6()) {
         this.y4 = var2;
         if (this.e2 == null) {
            this.e2 = new List<>();
         }
      }

      this.n3 = this.l6;
   }

   public final void n5(boolean var1, boolean var2) {
      this.l6(var1, var2);
      if (this.y4 != null) {
         y4 var3 = this.t9.n5();
         com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3<>(this.e2);

         while (var4.l6()) {
            com.aspose.slides.internal.a0.t2 var5 = (com.aspose.slides.internal.a0.t2)var4.k5();
            p6.n5(var5, this.y4, var3, -var5.y1(), this.n3 - var5.d5(), var3.c8(), this.l6 - this.n3);
         }

         this.y4 = null;
         this.e2.clear();
      }
   }

   public final int n5() {
      return this.l6;
   }

   public final void n5(s7 var1) {
      if (this.k5 == null) {
         this.k5 = var1.n5();
      } else {
         com.aspose.slides.internal.u6.a6 var2 = var1.h0();
         if (var2.n5() > this.k5.n5()) {
            this.l6(false, false);
            this.k5 = var2;
         }
      }

      if (this.a6 < 0) {
         this.a6 = this.k5.n5();
         if (this.u9 < 0) {
            this.u9 = this.a6;
         }
      }

      com.aspose.slides.internal.r4.u3 var5 = new com.aspose.slides.internal.r4.u3<>(var1.n5);

      while (var5.l6()) {
         l6 var3 = (l6)var5.k5();
         int var4 = var3.n5.m1();
         if (this.s7[var4] == null) {
            this.s7[var4] = var3;
            this.c8[var4] = var3.n5(this.t2[var4]);
         } else {
            this.c8[var4] = this.c8[var4] + var3.k5();
         }

         this.c8[var4] = this.c8[var4] + var3.u3();
         this.x8[var4] = var3;
      }
   }

   private void l6(boolean var1, boolean var2) {
      this.n5(this.k5.n5(), this.l6);
      boolean var3 = true;
      boolean var4 = true;
      int var5 = 0;

      for (int var6 = 0; var6 < this.n5; var6++) {
         com.aspose.slides.internal.u6.c8 var7 = this.k5.n5(var6);
         if (!var7.c8()) {
            if (var7.s7() == 0 && (var1 || var7.a6()) && this.s7[var6] != null) {
               int var8 = this.c8[var6];
               var8 += this.x8[var6].a6();
               var8 += this.x8[var6].l6(var1);
               int var9 = this.n5(q1.n5(this.s7[var6].n5.z3(), this.a6));
               var5 = q1.n5(var5, var9 + var8 - this.l6);
            }

            if (this.s7[var6] != null && !this.s7[var6].n5()) {
               var3 = false;
            }

            if (this.x8[var6] != null && !this.x8[var6].l6()) {
               var4 = false;
            }
         }
      }

      com.aspose.slides.internal.a0.t2 var15 = new com.aspose.slides.internal.a0.t2();
      y4 var16 = this.t9.n5();
      y1 var19 = this.k5.k5();
      if (var19 != null) {
         p6.n5(var15, var19.y1());
      }

      com.aspose.slides.internal.a0.t2 var20 = var16.t2;
      var20.n5(var15);
      var16.t2 = var15;
      var15.l6(var16.c8());

      for (int var10 = 0; var10 < this.n5; var10++) {
         com.aspose.slides.internal.u6.c8 var11 = this.k5.n5(var10);
         if (var11.c8() && !this.t9.l6()) {
            byte var21;
            if (var3) {
               if (this.t2[var10]) {
                  var21 = 1;
               } else {
                  var21 = 0;
               }
            } else {
               var21 = 2;
            }

            byte var22;
            if (var4) {
               if (var1) {
                  var22 = 1;
               } else {
                  var22 = 0;
               }
            } else {
               var22 = 2;
            }

            this.n5((com.aspose.slides.internal.u6.u9)var11, this.k5.n5(), var10, var5, var21, var22, var2);
            this.t2[var10] = false;
         } else if (var11.s7() == 0 && (var1 || var11.a6()) && this.s7[var10] != null) {
            byte var12;
            if (this.s7[var10].n5()) {
               if (this.t2[var10]) {
                  var12 = 1;
               } else {
                  var12 = 0;
               }
            } else {
               var12 = 2;
            }

            byte var13;
            if (this.x8[var10].l6()) {
               if (var1) {
                  var13 = 1;
               } else {
                  var13 = 0;
               }
            } else {
               var13 = 2;
            }

            this.n5(this.s7[var10].n5, this.s7[var10].l6, this.x8[var10].k5, var5, var12, var13, var2);
            this.s7[var10] = null;

            for (int var14 = var10; var14 < var10 + var11.u9().z7(); var14++) {
               this.t2[var14] = false;
            }
         }
      }

      var15.k5(var5);
      var15.t2(2);
      var16.t2 = var20;
      this.l6 += var5;
      if (var1) {
         this.k5 = null;
         this.a6 = -1;
         this.h0.clear();
         this.u9 = Integer.MAX_VALUE;
      }
   }

   private static int n5(com.aspose.slides.internal.u6.y4 var0, int var1, int var2) {
      if (var1 > var2) {
         return 0;
      }

      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3<>(var0.t9(), var1);
      boolean var4 = false;

      while (var3.u9() <= var2 && !var4) {
         var4 = ((i1)var3.k5()).e2();
      }

      int var5 = 0;
      if (((i1)var3.a6()).e2()) {
         while (var3.u9() < var2) {
            i1 var6 = (i1)var3.k5();
            if (var6.e2() || var6.x_()) {
               var5 += var6.z1();
            }
         }

         var5 += com.aspose.slides.internal.j9.n5.n5((i1)var3.k5());
      }

      return var5;
   }

   private void n5(com.aspose.slides.internal.u6.y4 var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      int var8 = this.k5.n5();
      int var9;
      int var10;
      if (var1.z3() >= this.a6) {
         var9 = var1.z3();
         if (var9 < var8) {
            var10 = this.n5(var9 + 1) - this.n5(var9);
         } else {
            var10 = var4;
         }
      } else {
         var9 = this.a6;
         var10 = 0;
      }

      int[] var11 = null;
      if (!this.t9.n5().y1().s0() && var1.m3()) {
         var11 = new int[var8 - var9 + 1];
         int var12 = this.n5(var9);

         for (int var13 = 0; var13 < var8 - var9; var13++) {
            int var14 = this.n5(var9 + var13 + 1);
            var11[var13] = var14 - var12;
            var12 = var14;
         }

         var11[var8 - var9] = var4;
      }

      int var16 = this.n5(var9);
      int var17 = var4 + this.l6 - var16;
      c8 var18 = var1.e2();
      var18.h0(this.t9.n5(var1));
      var18.u9(var16);
      var18.c8(n5(var1, var2, var3));
      var18.t2(var17);
      int var15 = q0.k5(var1.t9(), var2);
      if (var3 >= 0) {
         j4.n5(var1.t9(), var2, var3, var15);
      }

      var18.n5(new z7<>(var1.t9(), var2, var3 + 1), this.u3, var11, var9 - var1.z3(), var8 - var1.z3(), var5, var6, var9 == this.u9, var7, this, var10);
   }

   private void n5(com.aspose.slides.internal.u6.u9 var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      t2$n5 var8 = var1.n5(var5);
      t2$n5 var9 = var1.l6(var6);
      t2$n5 var10 = var1.x8();
      t2$n5 var11 = var1.n3();
      if (var8.u3() != 0 || var9.u3() != 0 || var10.u3() != 0 || var11.u3() != 0) {
         y4 var12 = this.t9.n5();
         z1 var13 = var12.y1();
         m3 var14 = this.t9.k5().n5(var3 + 1);
         boolean var15 = var2 == this.u9;
         boolean var16 = var3 == 0;
         boolean var17 = var3 == var13.v4() - 1;
         int var18 = var14.i1().l6(var12);
         var18 -= (var10.u3() + var11.u3()) / 2;
         int var19 = var4;
         var19 -= (var8.u3() + var9.u3()) / 2;
         com.aspose.slides.internal.a0.t2 var20 = new com.aspose.slides.internal.a0.t2();
         var20.t2(2);
         var20.n5(31, true);
         var20.l6(var18);
         var20.k5(var19);
         var20.n5(this.t9.n5(var3) + var10.u3() / 2, false, false);
         var20.l6(this.n5(var2) - var8.u3() / 2, false, false);
         boolean[] var21 = new boolean[]{var15, var7, var16, var17};
         p6.n5(var20, var8, var9, var10, var11, var21);
         var12.l6(var20);
      }
   }

   public final void n5(com.aspose.slides.internal.a0.t2 var1) {
      this.t9.n5().n5(var1);
      this.e2.addItem(var1);
   }

   private void n5(int var1, int var2) {
      for (int var3 = this.h0.size(); var3 <= var1 - this.a6; var3++) {
         this.h0.addItem(var2);
      }
   }

   private int n5(int var1) {
      return this.h0.get_Item(var1 - this.a6);
   }

   public final void l6() {
      for (int var1 = 0; var1 < this.t2.length; var1++) {
         this.t2[var1] = true;
      }
   }

   public final void k5() {
      for (int var1 = 0; var1 < this.t2.length; var1++) {
         this.t2[var1] = false;
      }
   }
}
