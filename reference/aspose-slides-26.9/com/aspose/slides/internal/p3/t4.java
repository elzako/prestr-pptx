package com.aspose.slides.internal.p3;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.ms.System.q1;

public abstract class t4 {
   protected int n5 = 50;
   protected int l6 = 50;
   protected int k5;
   private double q0;
   protected v4 u3;
   protected int a6 = -1;
   private boolean z3 = false;
   protected boolean u9 = false;
   private t4$k5 m1;
   private t4$k5 k7;
   private t4$k5 m3;
   protected int h0;
   protected int c8;
   protected boolean t2;
   protected t4$k5[] s7;
   protected int x8;
   private int z8 = 0;
   protected int n3 = 0;
   public int y4;
   protected int e2 = 0;
   public int t9 = 0;
   protected t4$n5 z1;
   private boolean j5 = true;
   private t4$k5 w1;
   protected int t4 = 0;

   public t4(int var1, int var2, boolean var3, boolean var4, int var5) {
      this.h0 = var1;
      this.c8 = var2;
      this.t2 = var3;
      this.j5 = var4;
      this.z1 = new t4$n5();
      this.k5 = var5;
   }

   public final int n5() {
      return this.z8;
   }

   public final void n5(int var1) {
      this.z8 = var1;
   }

   protected final int l6() {
      return 5;
   }

   protected final boolean k5() {
      return this.j5;
   }

   public abstract void n5(int var1, double var2);

   public abstract void n5(t4$k5 var1, v4 var2, int var3);

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final int n5(v4 var1, double var2, boolean var4, int var5) {
      return this.n5(var1, 0, var2, var4, var5);
   }

   public final int n5(v4 var1, int var2, double var3, boolean var5, int var6) {
      this.u3 = var1;
      this.q0 = var3;
      this.z3 = var5;
      this.u9();
      boolean var7 = false;
      int var8 = var2;
      if (this.h0 != 23) {
         var8 = var1.l6(var2);
      }

      var8 = var8 < 0 ? 0 : var8;
      this.n5(0, this.n5(var8, 0, 1, 0, 0, 0, 0.0, 0, 0, 0, 0.0, null));
      t4$k5 var9 = this.a6(0);

      for (int var10 = var2; var10 < var1.size(); var10++) {
         try {
            var7 = this.n5(var10, var7, var6).e2();
         } catch (v8 var13) {
            int var12 = var10;

            while (var12 >= 0 && !com.aspose.slides.internal.v6g.k5.l6(var1.get_Item(var12), f2.class)) {
               var12--;
            }

            var1.insertItem(var12, new e5(0, 1000, 0, null, true));
            var1.insertItem(var12, new com.aspose.slides.internal.x9.c4(0, null, null, true));
            var10 = var12 - 1;
            continue;
         }

         if (this.x8 == 0) {
            if (this.u3() != 0) {
               return this.a6();
            }

            if (!var5) {
               return 0;
            }

            if (this.m3 != null && this.m3 != var9) {
               this.c8();
            }

            if (this.k7 != null && var9.n5 != this.k7.n5) {
               var9 = this.k7;
               this.w1 = null;
            } else {
               var9 = this.t2();
            }

            var10 = this.n5(var9, var10);
         }
      }

      this.s7();
      int var15 = this.n3();

      for (int var11 = this.n5(); var11 < this.n3; var11++) {
         for (t4$k5 var16 = this.a6(var11); var16 != null; var16 = var16.y4) {
            this.n5(var16.l6, var16.x8);
            this.l6(var16, var1, var16.l6);
         }
      }

      this.s7 = null;
      this.k5(var15);
      return var15;
   }

   protected void k5(int var1) {
   }

   public int u3() {
      return 0;
   }

   protected int a6() {
      throw new InvalidOperationException();
   }

   protected t4$k5 n5(t4$k5 var1) {
      if (var1.n3.n3 == null) {
         v0 var2 = (v0)this.u3.get_Item(0);
         if (!var2.y_()) {
            this.u3.insertItem(0, o0.n5);
         }
      }

      return this.n5(var1.n3.n5, var1.n3.l6 + 1, 1, 0, 0, 0, 0.0, 0, 0, 0, 0.0, var1.n3);
   }

   protected void u9() {
      this.y4 = 0;
      this.e2 = 0;
      this.t9 = 0;
      this.k7 = null;
      this.m1 = null;
      this.n5(0);
      this.n3 = 0;
      this.s7 = new t4$k5[20];
   }

   public t4$k5 n5(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9, int var10, int var11, double var12, t4$k5 var14) {
      return new t4$k5(var1, var2, var3, var4, var5, var6, var7, var9, var10, var11, var12, var14);
   }

   protected t4$k5 n5(int var1, int var2, int var3, int var4, int var5, int var6) {
      return new t4$k5(
         var1, var2, var3, var4, var5, var6, this.z1.u3(var3), this.z1.a6(var3), this.z1.u9(var3), this.z1.h0(var3), this.z1.l6(var3), this.z1.k5(var3)
      );
   }

   protected final t4$k5 h0() {
      return this.k7;
   }

   protected final i1 n5(int var1, boolean var2, int var3) {
      i1 var4 = this.u3(var1);
      if (var4.e2()) {
         this.n5((f2)var4);
      } else if (var4.x_()) {
         this.n5((e5)var4, var1, var2, var3);
      } else {
         if (!var4.y_()) {
            throw new ArgumentException("Unknown KnuthElement type: expecting KnuthBox, KnuthGlue or KnuthPenalty");
         }

         this.n5((o0)var4, var1, var3);
      }

      return var4;
   }

   protected void n5(f2 var1) {
      this.y4 = this.y4 + var1.z1();
   }

   protected final void n5(e5 var1, int var2, boolean var3, int var4) {
      if (var3 && var4 != 2) {
         this.n5(var1, var2);
      }

      this.y4 = this.y4 + var1.z1();
      this.e2 = this.e2 + var1.q0();
      this.t9 = this.t9 + var1.z3();
   }

   protected void n5(o0 var1, int var2, int var3) {
      if (var1.t4() < 1000 && (var3 != 1 || !var1.h0()) && (var3 != 2 || var1.c8())) {
         this.n5(var1, var2);
      }
   }

   protected final void c8() {
      if (this.m3.h0 > 0.0) {
         this.k7 = this.m3;
      } else {
         this.m1 = this.m3;
      }
   }

   protected final t4$k5 t2() {
      t4$k5 var2;
      if (this.k5()) {
         if (this.w1 == null) {
            this.w1 = this.m1;
         }

         t4$k5 var1 = this.n5(this.m1);
         var2 = var1;
         var1.e2 = this.m1.n3.e2 + 1;
         if (var1.e2 > this.l6()) {
            while (var2.e2 > 0 && var2.n3 != null) {
               var2 = var2.n3;
               this.m3 = var2.n3;
            }

            var2 = this.w1;
            this.w1 = null;
            this.n5(var2.l6);
            this.n3 = var2.l6;
         }
      } else {
         var2 = this.m1;
      }

      return var2;
   }

   protected int n5(t4$k5 var1, int var2) {
      var1.x8 = 0.0;
      this.n5(var1.l6, var1);
      this.n5(var1.l6);
      this.n3 = this.n5() + 1;
      this.y4 = var1.u3;
      this.e2 = var1.a6;
      this.t9 = var1.u9;
      this.k7 = null;
      this.m1 = null;
      int var3 = var1.n5;

      while (var3 + 1 < this.u3.size() && !this.u3(var3 + 1).e2()) {
         var3++;
      }

      return var3;
   }

   protected void n5(i1 var1, int var2) {
      this.m3 = null;
      this.m1 = null;

      for (int var3 = this.n5(); var3 < this.n3; var3++) {
         for (t4$k5 var4 = this.a6(var3); var4 != null; var4 = var4.y4) {
            if (var4.n5 != var2) {
               boolean var5 = false;
               boolean[] var6 = new boolean[]{false};
               int var7 = this.n5(var4, var1, var2, var3, var6);
               var5 = var6[0];
               this.n5(var2, var5, var7, var3);
               if (!this.n5(var1, this.n3, var7)) {
                  break;
               }

               double var8 = this.k5(var4, var7);
               int var10 = this.t9 - var4.u9;
               int var11 = this.e2 - var4.a6;
               if (var8 < -1.0 || var1.c8()) {
                  this.l6(var4, var3);
               }

               int var12 = t4$l6.n5(var8);
               double var13 = this.n5(var4, var1, var12, var8);
               if (var8 >= -1.0 && var8 <= this.q0) {
                  this.n5(var4, var7, var8, var13, var12, var10, var11);
               }

               if (this.z3 && (var8 <= -1.0 || var8 > this.q0)) {
                  this.n5(var4, var3, var2, var7, var8, var13, var12, var10, var11);
               }
            }
         }

         this.n5(var3, var2);
      }
   }

   protected void n5(int var1, boolean var2, int var3, int var4) {
   }

   protected boolean n5(i1 var1, int var2, int var3) {
      return !var1.y_() || var1.t4() < 1000;
   }

   protected final void n5(t4$k5 var1, int var2, int var3, int var4, double var5, double var7, int var9, int var10, int var11) {
      int var12 = this.y4;
      int var13 = this.e2;
      int var14 = this.t9;

      for (int var15 = var3; var15 < this.u3.size(); var15++) {
         i1 var16 = this.u3(var15);
         if (var16.e2()) {
            break;
         }

         if (var16.x_()) {
            var12 += var16.z1();
            var13 += var16.q0();
            var14 += var16.z3();
         } else if (var16.c8() && var15 != var3) {
            break;
         }
      }

      if (var5 <= -1.0) {
         if (this.m1 == null || var7 < this.m1.x8) {
            this.m1 = this.n5(var3, var2 + 1, var9, var12, var13, var14, var5, var10, var11, var4, var7, var1);
         }
      } else if (this.k7 == null || var7 <= this.k7.x8) {
         if (this.u9) {
            this.z1.n5(var7, var1, var5, var10, var11, var4, var9);
         }

         this.k7 = this.n5(var3, var2 + 1, var9, var12, var13, var14, var5, var10, var11, var4, var7, var1);
      }
   }

   protected final void n5(t4$k5 var1, int var2, double var3, double var5, int var7, int var8, int var9) {
      if (var5 < this.z1.l6(var7)) {
         this.z1.n5(var5, var1, var3, var8, var9, var2, var7);
         this.k7 = null;
      }
   }

   protected final void l6(t4$k5 var1, int var2) {
      this.l6(var2, var1);
      this.m3 = this.n5(this.m3, var1);
   }

   private void n5(int var1, int var2) {
      if (this.z1.n5()) {
         this.t4 = var1;
         int var3 = this.y4;
         int var4 = this.e2;
         int var5 = this.t9;

         for (int var6 = var2; var6 < this.u3.size(); var6++) {
            i1 var7 = this.u3(var6);
            if (var7.e2()) {
               break;
            }

            if (var7.x_()) {
               var3 += var7.z1();
               var4 += var7.q0();
               var5 += var7.z3();
            } else if (var7.c8() && var6 != var2) {
               break;
            }
         }

         double var8 = this.z1.l6() + this.l6;

         for (int var10 = 0; var10 <= 3; var10++) {
            if (this.z1.n5(var10) && this.z1.l6(var10) <= var8) {
               t4$k5 var11 = this.n5(var2, var1 + 1, var10, var3, var4, var5);
               this.n5(var1 + 1, var11);
            }
         }

         this.z1.k5();
      }
   }

   protected int n5(t4$k5 var1, i1 var2, int var3, int var4, boolean[] var5) {
      int var6 = this.y4 - var1.u3;
      if (var2.y_()) {
         var6 += var2.z1();
      }

      return this.n5(var4, var3, var5) - var6;
   }

   protected double k5(t4$k5 var1, int var2) {
      if (var2 > 0) {
         int var4 = this.e2 - var1.a6;
         return var4 > 0 ? (double)var2 / var4 : 1000.0;
      } else if (var2 < 0) {
         int var3 = this.t9 - var1.u9;
         return var3 > 0 ? (double)var2 / var3 : -1000.0;
      } else {
         return 0.0;
      }
   }

   protected double n5(t4$k5 var1, i1 var2, int var3, double var4) {
      double var6 = 0.0;
      double var8 = q1.n5(var4);
      var8 = 1.0 + 100.0 * var8 * var8 * var8;
      if (var2.y_()) {
         double var10 = var2.t4();
         if (var10 >= 0.0) {
            var8 += var10;
            var6 = var8 * var8;
         } else if (!var2.c8()) {
            var6 = var8 * var8 - var10 * var10;
         } else {
            var6 = var8 * var8;
         }
      } else {
         var6 = var8 * var8;
      }

      if (var2.y_() && ((o0)var2).h0() && this.u3(var1.n5).y_() && ((o0)this.u3(var1.n5)).h0()) {
         var6 += this.n5;
         int var12 = 2;

         for (t4$k5 var13 = var1.n3; var13 != null && var12 <= this.k5; var13 = var13.n3) {
            i1 var14 = this.u3(var13.n5);
            if (!var14.y_() || !((o0)var14).h0()) {
               break;
            }

            var12++;
         }

         if (this.k5 >= 1 && var12 > this.k5) {
            var6 += Double.POSITIVE_INFINITY;
         }
      }

      if (q1.n5(var3 - var1.k5) > 1) {
         var6 += this.l6;
      }

      return var6 + var1.x8;
   }

   protected void s7() {
   }

   public final i1 u3(int var1) {
      return (i1)this.u3.get_Item(var1);
   }

   protected t4$k5 n5(t4$k5 var1, t4$k5 var2) {
      if (var1 == null || var2.n5 > var1.n5) {
         return var2;
      } else {
         return var2.n5 == var1.n5 && var2.x8 < var1.x8 ? var2 : var1;
      }
   }

   public void n5(int var1, t4$k5 var2) {
      int var3 = var1 * 2;
      if (var3 >= this.s7.length) {
         t4$k5[] var4 = this.s7;
         this.s7 = new t4$k5[var3 + var3];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.s7)), 0, var4.length);
      }

      var2.y4 = null;
      if (this.s7[var3 + 1] != null) {
         this.s7[var3 + 1].y4 = var2;
      } else {
         this.s7[var3] = var2;
         this.n3 = var1 + 1;
      }

      this.s7[var3 + 1] = var2;
      this.x8++;
   }

   public final void l6(int var1, t4$k5 var2) {
      int var3 = var1 * 2;
      t4$k5 var4 = this.a6(var1);
      if (var4 != var2) {
         t4$k5 var5 = null;

         while (var4 != var2) {
            var5 = var4;
            var4 = var4.y4;
         }

         var5.y4 = var4.y4;
         if (var5.y4 == null) {
            this.s7[var3 + 1] = var5;
         }
      } else {
         this.s7[var3] = var2.y4;
         if (var2.y4 == null) {
            this.s7[var3 + 1] = null;
         }

         while (this.n5() < this.n3 && this.a6(this.n5()) == null) {
            this.n5(this.n5() + 1);
         }
      }

      this.x8--;
   }

   protected final t4$k5 a6(int var1) {
      return this.s7[var1 * 2];
   }

   protected int n5(int var1, int var2, boolean[] var3) {
      return this.a6;
   }

   public int x8() {
      return this.a6;
   }

   protected abstract int n3();

   protected final void l6(t4$k5 var1, v4 var2, int var3) {
      t4$k5 var4 = var1;

      for (int var5 = var1.l6; var5 > 0; var5--) {
         this.n5(var4, var2, var3);
         var4 = var4.n3;
      }
   }

   public final int y4() {
      return this.h0;
   }

   public final int e2() {
      return this.c8;
   }
}
