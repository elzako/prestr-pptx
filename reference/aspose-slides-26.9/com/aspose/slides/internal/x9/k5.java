package com.aspose.slides.internal.x9;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.q1;

public class k5 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private i1 h0;
   private i1 c8;
   private k5 t2;

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public k5(int var1, com.aspose.slides.internal.f2.k5 var2, int var3, com.aspose.slides.internal.f2.k5 var4, int var5, k5 var6) {
      this(var1, 0, var1, var1, var2, var3, var4, var5, var6);
   }

   public k5(
      com.aspose.slides.internal.v0.u3 var1,
      int var2,
      com.aspose.slides.internal.f2.k5 var3,
      int var4,
      com.aspose.slides.internal.f2.k5 var5,
      int var6,
      k5 var7
   ) {
      this(var1.a6(), var1.u9(), var2, var1.x8(), var3, var4, var5, var6, var7);
   }

   private k5(int var1, int var2, int var3, int var4, com.aspose.slides.internal.f2.k5 var5, int var6, com.aspose.slides.internal.f2.k5 var7, int var8, k5 var9) {
      this.n5 = var1 - var2;
      this.l6 = var3;
      this.u9 = var4;
      this.t2 = var9;
      int var10;
      if (var9 != null) {
         this.h0 = var9.t2();
         this.l6(var6, var9.s7());
         var10 = var9.s7();
      } else {
         var10 = 6;
         this.h0 = new i1(var1, var2, var4, var10, com.aspose.slides.internal.v8.n3.n5);
         this.l6(var6, 6);
      }

      this.l6(var7);
      boolean var11 = false;
      if (this.u3 != 0) {
         var11 = true;
      }

      switch (var8) {
         case 9:
            var11 = this.u3 != 0;
         case 87:
         case 157:
            break;
         case 116:
            var11 = true;
            break;
         default:
            var11 = true;
            var10 = var8;
      }

      this.c8 = new i1(var1, var2, var4, var10, this.h0.l6());
      if (var11) {
         this.h0 = new i1(var1, var2, var4, var10, this.h0.l6());
      }

      this.n5(var5);
   }

   public k5(com.aspose.slides.internal.v0.u3 var1, int var2, com.aspose.slides.internal.v8.n3 var3) {
      this.n5 = var1.a6() - var1.u9();
      this.l6 = var2;
      this.u9 = var1.x8();
      this.h0 = new i1(var1.a6(), var1.u9(), var1.x8(), 6, var3);
      this.c8 = this.h0;
      this.a6 = this.s7();
      this.k5 = var1.a6();
      this.u3 = 0;
   }

   public final int n5() {
      return this.u3;
   }

   public final int l6() {
      return this.a6;
   }

   private void l6(int var1, int var2) {
      switch (var1) {
         case 4:
         case 6:
         case 14:
         case 24:
         case 56:
         case 59:
         case 82:
         case 84:
         case 141:
         case 142:
            this.a6 = var1;
            break;
         case 9:
         case 12:
            this.a6 = var2;
            break;
         default:
            throw new ArgumentException(a3.l6(var1));
      }
   }

   private void n5(com.aspose.slides.internal.f2.k5 var1) {
      int var2 = this.c8.n5(14);
      switch (var1.a6()) {
         case 4:
         case 6:
         case 14:
         case 24:
         case 56:
         case 59:
         case 82:
         case 84:
         case 141:
         case 142:
            this.k5 = var2 - this.c8.n5(var1.a6());
            break;
         case 9:
            this.k5 = var2 - this.c8.n5(this.a6);
            break;
         case 12:
            this.k5 = var2;
            break;
         default:
            this.k5 = var2 + var1.l6(new com.aspose.slides.internal.f2.t2(null, 12, this.l6));
      }
   }

   private i1 t2() {
      return this.h0;
   }

   private int s7() {
      return this.c8.n5();
   }

   private void l6(com.aspose.slides.internal.f2.k5 var1) {
      this.u3 = 0;
      switch (var1.a6()) {
         case 0:
            this.u3 = var1.l6(new com.aspose.slides.internal.f2.t2(null, 0, this.t2.e2()));
         case 12:
            break;
         case 137:
            this.u3 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(-(this.u9 / 2) + this.t2.k5(6)), 14);
            break;
         case 138:
            this.u3 = com.aspose.slides.internal.v6g.k5.u3(q1.u3(this.t2.t9() + this.t2.k5(6)), 14);
            break;
         default:
            throw new ArgumentException(a3.l6(var1.a6()));
      }
   }

   private int x8() {
      return this.t2 == null ? 0 : this.t2.t2().n5(this.a6) - this.h0.l6(this.t2.s7()).n5(this.a6) - this.h0.n5(this.t2.s7()) + this.u3;
   }

   private int n3() {
      int var1 = 0;
      if (this.t2 != null) {
         var1 = this.x8() + this.t2.n3();
      }

      return var1;
   }

   public final int k5() {
      return this.l6(this.a6);
   }

   private int l6(int var1) {
      int var2 = this.u3;
      if (this.t2 != null) {
         var2 = this.t2.n3() + this.t2.t2().n5(var1) + this.u3;
      }

      return var2;
   }

   private int k5(int var1) {
      int var2 = this.k5() - this.n3();
      return var2 + this.c8.l6(this.a6).n5(var1);
   }

   private int y4() {
      return this.k5() + this.a6();
   }

   public final int u3() {
      return this.n5;
   }

   private int e2() {
      return this.l6;
   }

   public final int a6() {
      return this.k5;
   }

   public final int u9() {
      return this.u3() - this.k5;
   }

   private int t9() {
      return this.u9;
   }

   public final void n5(int var1, int var2) {
      this.n5 = var1;
      this.k5 = var2;
      this.h0.n5(this.k5, this.k5 - this.n5);
   }

   public final int h0() {
      int var1 = 0;
      if (this.t2 != null) {
         var1 = this.t2.y4() - this.y4();
      } else {
         var1 = this.a6() - this.h0.n5(142);
      }

      return var1;
   }

   public final boolean c8() {
      return this.t2 == null || this.h0 == this.t2.t2() && this.t2.c8();
   }

   @Override
   public String toString() {
      a5 var1 = new a5(64);
      var1.n5("areaHeight=").k5(this.n5);
      var1.n5(" lineHeight=").k5(this.l6);
      var1.n5(" alignmentPoint=").k5(this.k5);
      var1.n5(" alignmentBaselineID=").k5(this.a6);
      var1.n5(" baselineShift=").k5(this.u3);
      return var1.toString();
   }
}
