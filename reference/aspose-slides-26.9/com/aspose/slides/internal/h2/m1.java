package com.aspose.slides.internal.h2;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.d1;

public class m1 extends z3 {
   private int[][] h0 = (int[][])null;

   public m1(h2 var1) {
      super(var1);
   }

   public final void n5(int[][] var1) {
      if (var1 == null) {
         throw new NullReferenceException();
      }

      for (int var2 = 0; var2 < var1.length; var2++) {
         int[] var3 = var1[var2];
         if (var3 == null || var3.length != 4) {
            throw new ArgumentException(d1.n5(new String[]{"bad sub-array @ [", com.aspose.slides.ms.System.a3.l6(var2), "]"}));
         }
      }

      this.h0 = var1;
   }

   @Override
   public boolean n5(com.aspose.slides.internal.e5.w1 var1) {
      if (super.n5(var1)) {
         return true;
      }

      for (int var2 = 0; var2 < this.h0.length; var2++) {
         int var3 = this.h0[var2][0];
         if (var1.l6(var3) != null) {
            return true;
         }
      }

      return false;
   }

   @Override
   public a5 l6(com.aspose.slides.internal.e5.w1 var1) {
      a5 var2 = super.l6(var1);
      if (var2 == null) {
         var2 = this.n5.n5(var1);
      }

      int var3 = var1.n5(this.h0[0][0], this.h0[0][1], this.h0[0][2], this.h0[0][3]);
      a5 var4 = var1.n5(var3);
      if (var4 != null) {
         this.n5.n5(var2, 3072, var4);
      }

      var3 = var1.n5(this.h0[1][0], this.h0[1][1], this.h0[1][2], this.h0[1][3]);
      var4 = var1.n5(var3);
      if (var4 != null) {
         this.n5.n5(var2, 2560, var4);
      }

      return var2;
   }
}
