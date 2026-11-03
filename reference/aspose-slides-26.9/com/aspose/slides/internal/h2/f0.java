package com.aspose.slides.internal.h2;

import com.aspose.slides.ms.System.d1;

public class f0 extends b3 {
   private a5 n5;
   private a5 l6;

   @Override
   public void n5(int var1, a5 var2, boolean var3) {
      if (var1 == 4096) {
         this.u3(var2, var3);
      } else if (var1 == 1024) {
         this.a6(var2, var3);
      } else {
         super.n5(var1, var2, var3);
      }
   }

   @Override
   public a5 n5(int var1) {
      if (var1 == 4096) {
         return this.e2();
      } else {
         return var1 == 1024 ? this.q0() : super.n5(var1);
      }
   }

   public final void u3(a5 var1, boolean var2) {
      this.n5 = var1;
   }

   public final void a6(a5 var1, boolean var2) {
      this.l6 = var1;
   }

   public final a5 e2() {
      return this.n5;
   }

   public final a5 q0() {
      return this.l6;
   }

   public final boolean z3() {
      return this.l6.a6() == 32;
   }

   @Override
   public String toString() {
      return d1.n5(new Object[]{
         "Space[",
         "min:",
         this.l6(null).g_(),
         ", max:",
         this.k5(null).g_(),
         ", opt:",
         this.u3(null).g_(),
         ", precedence:",
         this.n5.g_(),
         ", conditionality:",
         this.l6.g_(),
         "]"
      });
   }

   @Override
   public f0 z1() {
      return this;
   }

   @Override
   public b3 k_() {
      return this;
   }

   @Override
   public Object g_() {
      return this;
   }
}
