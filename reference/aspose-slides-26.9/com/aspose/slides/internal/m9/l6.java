package com.aspose.slides.internal.m9;

import com.aspose.slides.ms.System.q1;

public abstract class l6 {
   public n5 n5;
   private int l6;
   private int k5 = Integer.MAX_VALUE;

   protected l6(n5 var1) {
      if (var1.n5() == 0) {
      }

      this.n5 = var1;
   }

   protected l6(l6 var1, int var2, int var3) {
      this(var1.n5);
      this.n5(var1.l6 + var2, var3);
   }

   protected l6(l6 var1, int var2) {
      this(var1.n5);
      this.n5(var1.l6 + var2, var1.k5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : var1.k5 - var2);
   }

   public final boolean n5(int var1, int var2) {
      if (var1 + var2 <= this.l6() && var1 >= 0 && var2 >= 0) {
         this.l6 += var1;
         this.k5 = var2;
         return true;
      } else {
         return false;
      }
   }

   public final int n5() {
      return q1.l6(this.n5.n5() - this.l6, this.k5);
   }

   public final int l6() {
      return q1.l6(this.n5.l6() - this.l6, this.k5);
   }

   protected final int n5(int var1) {
      return var1 + this.l6;
   }

   protected final int l6(int var1, int var2) {
      return q1.l6(var2, this.k5 - var1);
   }
}
