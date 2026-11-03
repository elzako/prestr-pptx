package com.aspose.slides.internal.x9;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

class e5$k5 {
   private com.aspose.slides.internal.v8.u9 n5;
   private int l6;
   private t1 k5;
   private int u3;
   private int a6;
   private boolean u9;
   private com.aspose.slides.internal.v0.u3 h0;
   private com.aspose.slides.internal.d2.t9 c8;
   private int t2;
   private e5$n5 s7;
   private a5 x8;
   private int[] n3;
   private int y4;
   private int[] e2;
   private int t9;
   private int z1;
   private int[][] t4;
   private int q0;
   private e5 z3;

   public e5$k5(com.aspose.slides.internal.v8.u9 var1, int var2, t1 var3, int var4, int var5, boolean var6, com.aspose.slides.internal.v0.u3 var7, e5 var8) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = var7;
      this.z3 = var8;
   }

   public final com.aspose.slides.internal.d2.t9 n5() {
      this.l6();
      this.k5();
      this.u3();
      this.a6();
      this.u9();
      this.h0();
      this.c8();
      p6.n5(this.c8, this.h0);
      this.c8.n5(7, e5.n5(this.z3).y2().o8());
      p6.n5(this.c8, e5.n5(this.z3).s3());
      p6.n5(this.c8, e5.n5(this.z3).z7());
      this.c8.n5(52, e5.n5(this.z3).p8());
      this.c8.n5(54, e5.n5(this.z3).f2());
      this.c8.n5(53, e5.n5(this.z3).i1());
      return this.c8;
   }

   private void l6() {
      if (this.k5.z8() == 0.0) {
         this.c8 = new com.aspose.slides.internal.d2.t9();
      } else {
         this.c8 = new com.aspose.slides.internal.d2.t9(this.n5.a6(), this.n5.u3(), this.l6);
      }
   }

   private void k5() {
      this.c8.l6(this.n5.l6() + this.l6);
   }

   private void u3() {
      this.t2 = this.h0.a6() - this.h0.u9();
   }

   private void a6() {
      this.c8.k5(this.t2);
   }

   private void u9() {
      this.c8.n3(this.h0.a6());
   }

   private void h0() {
      if (this.t2 == this.z3.t2.u3()) {
         this.c8.t9(0);
      } else {
         this.c8.t9(this.z3.t2.h0());
      }
   }

   private void c8() {
      int var1 = -1;
      int var2 = 0;

      for (int var3 = this.u3; var3 <= this.a6; var3++) {
         this.s7 = this.z3.k5(var3);
         if (this.s7.c8) {
            this.x8();
         } else {
            if (var1 == -1) {
               var1 = var3;
               var2 = 0;
            }

            var2 += this.s7.n5();
            if (this.n5(var3)) {
               this.n5(var1, var3, var2);
               var1 = -1;
            }
         }
      }
   }

   private boolean n5(int var1) {
      return var1 == this.a6 || this.z3.k5(var1 + 1).c8;
   }

   private void n5(int var1, int var2, int var3) {
      byte var4 = 0;
      boolean var5 = false;
      if (this.k5(var2)) {
         var3++;
      }

      this.l6(var3);

      for (int var6 = var1; var6 <= var2; var6++) {
         e5$n5 var7 = this.z3.k5(var6);
         this.n5(var7);
         this.l6(var7);
         if (this.k5(var7)) {
            var5 = true;
         }
      }

      if (this.k5(var2)) {
         this.s7();
      }

      if (!var5) {
         this.t4 = (int[][])null;
      }

      this.c8.n5(this.x8.toString(), this.z1, this.n3, this.t2(), this.t4, var4);
   }

   private int[] t2() {
      if (this.e2 == null) {
         return null;
      }

      boolean var1 = true;
      int var2 = 0;

      for (int var3 = this.t9; var2 < var3; var2++) {
         if (this.e2[var2] >= 0) {
            var1 = false;
            break;
         }
      }

      return var1 ? null : this.e2;
   }

   private void l6(int var1) {
      this.x8 = new a5(var1);
      this.n3 = new int[var1];
      this.y4 = 0;
      this.e2 = new int[var1];
      this.t9 = 0;

      for (int var2 = 0; var2 < this.e2.length; var2++) {
         this.e2[var2] = -1;
      }

      this.t4 = new int[var1][];

      for (int var3 = 0; var3 < var1; var3++) {
         this.t4[var3] = new int[4];
      }

      this.q0 = 0;
      this.z1 = 0;
   }

   private boolean k5(int var1) {
      return this.u9 && var1 == this.a6 && this.s7.h0;
   }

   private void s7() {
      this.x8.n5(e5.n5(this.z3).c4().n5(this.h0));
   }

   private void n5(e5$n5 var1) {
      int var2 = var1.n5;
      int var3 = var1.l6;
      if (e5.n5(this.z3).k5(var2, var3)) {
         this.x8.n5(e5.n5(this.z3).u3(var2, var3));
         this.n5(e5.n5(this.z3).u9(var2, var3));
      } else {
         for (int var4 = var2; var4 < var3; var4++) {
            this.x8.n5(e5.n5(this.z3).u3(var4));
         }

         this.n5(e5.n5(this.z3).l6(var2, var3));
      }

      this.z1 = this.z1 + var1.u9.l6();
   }

   private void n5(int[] var1) {
      int var2 = var1 != null ? var1.length : 0;
      if (var2 > 0) {
         int var3 = this.t9 + var2;
         if (var3 > this.e2.length) {
            throw new InvalidOperationException(
               d1.n5("word levels array too short: expect at least ", a3.l6(var3), " entries, but has only ", a3.l6(this.e2.length), " entries")
            );
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.e2)), this.t9, var2);
      }

      this.t9 += var2;
   }

   private void l6(e5$n5 var1) {
      int var2 = var1.a6;
      int var3 = var1.n5();
      int var4 = this.c8.k7();

      for (int var5 = 0; var5 < var3; var5++) {
         int var6 = this.y4 + var5;
         if (var6 > 0) {
            int var7 = var1.n5 + var5;
            com.aspose.slides.internal.v8.u9 var8 = var7 < e5.l6(this.z3).length ? e5.l6(this.z3)[var7] : null;
            this.n3[var6] = var8 == null ? 0 : var8.l6();
         }

         if (var2 > 0) {
            this.n3[var6] = this.n3[var6] + var4;
            var2--;
         }
      }

      this.y4 += var3;
   }

   private boolean k5(e5$n5 var1) {
      boolean var2 = false;
      int[][] var3 = var1.n3;
      int var4 = var3 != null ? var3.length : 0;
      int var5 = var1.n5();
      if (var4 > 0) {
         int var6 = this.q0 + var4;
         if (var6 > this.t4.length) {
            throw new InvalidOperationException(
               d1.n5("gpos adjustments array too short: expect at least ", a3.l6(var6), " entries, but has only ", a3.l6(this.t4.length), " entries")
            );
         }

         int var7 = 0;
         int var8 = 0;

         while (var7 < var5) {
            if (var7 < var4) {
               int[] var9 = this.t4[this.q0 + var7];
               int[] var10 = var3[var8++];

               for (int var11 = 0; var11 < 4; var11++) {
                  int var12 = var10[var11];
                  if (var12 != 0) {
                     var9[var11] += var12;
                     var2 = true;
                  }
               }
            }

            var7++;
         }
      }

      this.q0 += var5;
      return var2;
   }

   private void x8() {
      byte var1 = 0;
      int var2 = 0;

      for (int var3 = this.s7.n5; var3 < this.s7.l6; var3++) {
         char var4 = e5.n5(this.z3).u3(var3);
         if (com.aspose.slides.internal.v3.l6.k5(var4)) {
            var2++;
         }
      }

      int var8 = this.s7.l6 - this.s7.n5 - var2;
      int var9 = this.s7.u9.l6() / (var8 > 0 ? var8 : 1);

      for (int var5 = this.s7.n5; var5 < this.s7.l6; var5++) {
         char var6 = e5.n5(this.z3).u3(var5);
         int var7 = e5.n5(this.z3).l6(var5);
         if (!com.aspose.slides.internal.v3.l6.k5(var6)) {
            this.c8.n5(var6, var9, com.aspose.slides.internal.v3.l6.u9(var6), var1, var7);
         }
      }
   }
}
