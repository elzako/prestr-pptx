package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p3.e5;
import com.aspose.slides.internal.p3.f2;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p8;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.z1;
import com.aspose.slides.ms.System.q1;

public class e2 {
   private t2 l6;
   private com.aspose.slides.internal.u6.a6[] k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private boolean c8;
   public List<n5> n5 = new List<>();
   private List<n5> t2 = new List<>();
   private boolean s7;
   private int x8;
   private boolean n3;
   private int y4;

   public e2(t2 var1) {
      this.l6 = var1;
      this.u3 = var1.n5().y1().v4();
   }

   private void n5(com.aspose.slides.internal.u6.a6[] var1) {
      this.k5 = var1;
      this.u9 = 0;
      this.h0 = 0;
      this.n5.clear();
      this.t2.clear();
      this.s7 = false;
      this.x8 = 0;
      this.n3 = false;
   }

   private void n5() {
      this.a6 = 0;

      for (int var1 = 0; var1 < this.k5.length; var1++) {
         this.a6 = this.a6 + this.k5[var1].u3().l6();
      }
   }

   private int l6() {
      int var1 = 0;
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var2.l6()) {
         n5 var3 = (n5)var2.k5();
         int var4 = var3.l6();
         com.aspose.slides.internal.u6.y4 var5 = var3.n5();

         for (int var6 = this.h0 + 1; var6 < var5.z3() - this.k5[0].n5() + var5.u9().v4(); var6++) {
            var4 -= this.k5[var6].u3().l6();
         }

         var1 = q1.n5(var1, var4);
      }

      for (int var7 = this.h0 + 1; var7 < this.k5.length; var7++) {
         var1 += this.k5[var7].u3().l6();
      }

      return var1;
   }

   private void n5(List<n5> var1, int var2) {
      com.aspose.slides.internal.u6.a6 var3 = this.k5[var2];

      for (int var4 = 0; var4 < this.u3; var4++) {
         com.aspose.slides.internal.u6.c8 var5 = var3.n5(var4);
         if (!var5.c8() && var5.k5()) {
            var1.addItem(new n5((com.aspose.slides.internal.u6.y4)var5, var3, var2, this.u9, this.s7()));
         }
      }
   }

   public final List<com.aspose.slides.internal.r4.u9> n5(t1 var1, com.aspose.slides.internal.u6.a6[] var2, int var3) {
      this.n5(var2);
      this.n5(this.n5, 0);
      this.n5();
      int var4 = 0;
      s7 var5 = null;
      List var6 = new List();
      int var7 = this.k5();

      do {
         int var8 = this.l6();
         int var9 = var7 + var8 - this.a6;
         int var10 = var7 - var4 - q1.n5(0, var9);
         var4 += var10 + q1.n5(0, -var9);
         List var11 = new List();
         List var12 = new List(this.n5.size());
         com.aspose.slides.internal.r4.u3 var13 = new com.aspose.slides.internal.r4.u3<>(this.n5);

         while (var13.l6()) {
            n5 var14 = (n5)var13.k5();
            l6 var15 = var14.h0();
            var12.addItem(var15);
            var14.n5(var11);
         }

         s7 var21 = new s7(this.s7(), var12, this.k5[this.h0]);
         if (this.s7) {
            var21.n5(this.k5[this.h0 + 1]);
         }

         if (var6.size() == 0) {
            var21.n5(1, true);
         }

         var5 = var21;
         if (var11.size() == 0) {
            var6.addItem(new f2(var10, var21, false));
         } else {
            var6.addItem(new p8(var10, var11, new List<>(), var21, false));
         }

         int var22 = q1.n5(0, var9);
         x8 var23 = new x8(this.s7());
         if (var3 == 0) {
            if (!this.s7().y1().v0()) {
               var22 += this.l6.u3();
               var23.n5 = this.l6.u9();
            }

            if (!this.s7().y1().f0()) {
               var22 += this.l6.a6();
               var23.l6 = this.l6.h0();
            }
         }

         s3 var16 = this.s7().a5();
         int var17 = 0;
         com.aspose.slides.internal.r4.u3 var18 = new com.aspose.slides.internal.r4.u3<>(this.n5);

         while (var18.l6()) {
            n5 var19 = (n5)var18.k5();
            var16 = var16.n5(var19.c8());
            var17 = q1.n5(var17, var19.t2());
         }

         if (!this.c8) {
            var16 = var16.n5(this.k5[this.h0].t2());
         } else if (this.h0 < this.k5.length - 1) {
            var16 = var16.n5(this.k5[this.h0].c8());
            var16 = var16.n5(this.k5[this.h0 + 1].h0());
            this.y4 = com.aspose.slides.internal.v3.n5.n5(this.y4, this.k5[this.h0].x8());
            this.y4 = com.aspose.slides.internal.v3.n5.n5(this.y4, this.k5[this.h0 + 1].s7());
         }

         int var25 = var16.k5();
         if (this.n3) {
            this.n3 = false;
            var25 = 1000;
         }

         int var26 = q1.n5(var25, var17);
         int var27 = var16.l6();
         if (this.y4 != 9) {
            var26 = -1000;
            var27 = this.y4;
         }

         var6.addItem(new z1(var23, var22, var26, var27, var1));
         if (var9 < 0) {
            var6.addItem(new e5(-var9, 0, 0, new j8(null), true));
         }

         var7 = this.u3();
      } while (var7 >= 0);

      var5.n5(2, true);
      return var6;
   }

   private int k5() {
      this.n5(this.n5);
      this.u9();
      int var1 = this.l6(this.x8);
      this.n5(var1);
      return var1;
   }

   private int u3() {
      if (this.c8) {
         if (this.h0 == this.k5.length - 1) {
            return -1;
         }

         this.c8 = false;
         this.c8();
         this.s7 = true;
      }

      if (!this.s7) {
         int var3 = this.a6();
         var3 = this.l6(var3);
         this.n5(var3);
         return var3;
      }

      int var1 = this.a6();
      if (var1 < 0 || var1 >= this.x8 || var1 > this.k5[this.h0].a6().k5()) {
         this.s7 = false;
         var1 = this.x8;
         this.t2();
         this.u9();
         var1 = this.l6(var1);
      }

      this.n5(var1);
      return var1;
   }

   private void n5(List<n5> var1) {
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3(var1);

      while (var2.l6()) {
         n5 var3 = (n5)var2.k5();
         this.x8 = q1.n5(this.x8, var3.k5());
      }
   }

   private int a6() {
      int var1 = Integer.MAX_VALUE;
      boolean var2 = false;
      com.aspose.slides.internal.r4.u3 var3 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var3.l6()) {
         n5 var4 = (n5)var3.k5();
         int var5 = var4.a6();
         if (var5 >= 0) {
            var2 = true;
            var1 = q1.l6(var1, var5);
         }
      }

      return var2 ? var1 : -1;
   }

   private void u9() {
      com.aspose.slides.internal.r4.u3 var1 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var1.l6()) {
         n5 var2 = (n5)var1.k5();
         var2.l6(this.x8);
      }
   }

   private void n5(int var1) {
      this.y4 = 9;
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var2.l6()) {
         n5 var3 = (n5)var2.k5();
         this.y4 = com.aspose.slides.internal.v3.n5.n5(this.y4, var3.u3(var1));
      }
   }

   private int l6(int var1) {
      this.c8 = true;
      com.aspose.slides.internal.r4.u3 var2 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var2.l6()) {
         n5 var3 = (n5)var2.k5();
         if (var3.n5(this.h0)) {
            this.c8 = this.c8 & var3.u9(var1);
         }
      }

      if (this.c8) {
         int var5 = 0;
         com.aspose.slides.internal.r4.u3 var6 = new com.aspose.slides.internal.r4.u3<>(this.n5);

         while (var6.l6()) {
            n5 var4 = (n5)var6.k5();
            if (var4.n5(this.h0)) {
               var5 = q1.n5(var5, var4.u3());
            }
         }

         var6 = new com.aspose.slides.internal.r4.u3<>(this.n5);

         while (var6.l6()) {
            n5 var8 = (n5)var6.k5();
            var8.a6(this.h0);
            if (!var8.n5(this.h0)) {
               var8.k5(var5);
            }
         }

         if (var5 < var1) {
            this.n3 = true;
         }

         var1 = var5;
         this.h0();
      }

      return var1;
   }

   private void h0() {
      if (this.h0 < this.k5.length - 1) {
         this.u9 = this.u9 + this.k5[this.h0].u3().l6();
         this.n5(this.t2, this.h0 + 1);
         this.n5(this.t2);
      }
   }

   private void c8() {
      com.aspose.slides.internal.r4.u3 var1 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var1.l6()) {
         n5 var2 = (n5)var1.k5();
         if (var2.n5(this.h0)) {
            var1.n5();
         }
      }
   }

   private void t2() {
      this.h0++;
      com.aspose.slides.internal.r4.u3 var1 = new com.aspose.slides.internal.r4.u3<>(this.n5);

      while (var1.l6()) {
         n5 var2 = (n5)var1.k5();
         var2.u9();
      }

      this.n5.addRange(this.t2);
      this.t2.clear();
   }

   private y4 s7() {
      return this.l6.n5();
   }
}
