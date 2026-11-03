package com.aspose.slides.internal.a0;

import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.ms.System.o5;

public class x8 extends t2 {
   private boolean t4 = false;
   private e2 q0;
   private o5<com.aspose.slides.internal.o9b.y1> z3 = new o5<>();
   private int m1 = 0;
   public com.aspose.slides.internal.p3.t2 n3 = null;
   public int y4 = 0;
   public int e2 = 0;
   public int t9 = 0;
   public int z1 = 0;

   public final int f2() {
      return this.m1;
   }

   public final void n3(int var1) {
      this.m1 = var1;
   }

   public x8() {
      this(false, null);
   }

   public x8(boolean var1, com.aspose.slides.internal.p3.t2 var2) {
      this.c8 = var1;
      this.n3 = var2;
   }

   public final void n5(e2 var1) {
      this.q0 = var1;
   }

   public final e2 i1() {
      return this.q0;
   }

   public final void k5(boolean var1) {
      this.t4 = var1;
      if (!this.t4) {
         this.z3 = new o5<>();
      }
   }

   public final boolean e5() {
      return this.t4;
   }

   public final boolean b3() {
      return this.n3.d2();
   }

   public final void n5(com.aspose.slides.internal.o9b.y1 var1) {
      this.z3 = new o5<>(var1.y4());
   }

   public final com.aspose.slides.internal.o9b.y1 o0() {
      if (this.t4) {
         if (o5.n5(this.z3, null)) {
            this.z3 = new o5<>(new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.l6() + this.n3() + this.y4(), this.e_() + this.c8() + this.x8()));
         }

         return this.z3.n5();
      } else {
         return com.aspose.slides.internal.o9b.y1.n5;
      }
   }

   @Override
   public p8 n5(boolean var1) {
      p8 var2 = new p8();
      if (this.w1().a6() != 9) {
         var2 = new p8(this.l6(), !var1 ? this.a6() : this.e_());
      } else {
         this.n5(this.x8, var1).k5(var2);
      }

      if (var1) {
         return var2;
      }

      var2.n5(var2.l6() + this.c8());
      var2.n5(var2.l6() + this.x8());
      return var2;
   }
}
