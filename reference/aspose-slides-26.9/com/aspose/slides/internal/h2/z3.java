package com.aspose.slides.internal.h2;

public class z3 {
   protected h2 n5;
   protected int l6;
   protected int k5;
   protected int u3;
   protected int a6;
   protected boolean u9;
   private boolean h0;

   public z3(h2 var1) {
      this.n5 = var1;
      var1.n5(this);
   }

   public final void n5(int var1, int var2, int var3, int var4) {
      this.l6 = var1;
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final void l6(boolean var1) {
      this.h0 = var1;
   }

   public boolean n5(com.aspose.slides.internal.e5.w1 var1) {
      if (!this.h0) {
         return false;
      }

      com.aspose.slides.internal.e5.w1 var2 = this.k5(var1);
      if (var2 != null) {
         int var3 = var2.n5(this.l6, this.k5, this.u3, this.a6);
         if (var2.l6(var3) != null) {
            return true;
         }
      }

      return false;
   }

   public a5 l6(com.aspose.slides.internal.e5.w1 var1) {
      com.aspose.slides.internal.e5.w1 var2 = this.k5(var1);
      if (var2 == null) {
         return null;
      }

      int var3 = var2.n5(this.l6, this.k5, this.u3, this.a6);
      a5 var4 = var1.n5(var3);
      if (var4 != null) {
         com.aspose.slides.internal.e5.t9 var5 = var1.l6();
         var4 = this.n5.l6(var4, var1, var5);
      }

      return var4;
   }

   protected final com.aspose.slides.internal.e5.w1 k5(com.aspose.slides.internal.e5.w1 var1) {
      return this.u9 ? var1.k5() : var1;
   }
}
