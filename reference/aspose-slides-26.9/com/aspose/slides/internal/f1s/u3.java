package com.aspose.slides.internal.f1s;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public abstract class u3 extends a0 {
   private final int n5;
   private final int k5;
   private final float[] u3;
   private final float[] a6;

   public u3(com.aspose.slides.internal.z4.c8 var1, int var2, int var3, float[] var4, float[] var5) {
      super(var1);
      this.n5 = var2;
      this.k5 = var3;
      n5(var4, this.t4());
      this.u3 = var4;
      if (var5 != null || this.n5() != 0 && this.n5() != 4) {
         if (var5 != null) {
            n5(var5, this.q0());
         }

         this.a6 = var5;
      } else {
         throw new ArgumentException(d1.n5(new String[]{"Range can't be null for FunctionType ", a3.l6(this.n5())}));
      }
   }

   private static void n5(float[] var0, int var1) {
      if (var0.length % var1 != 0) {
         throw new ArgumentException("Incorrect array dimension.");
      }

      for (int var2 = 0; var2 < var1; var2++) {
         if (var0[var2 * 2] > var0[var2 * 2 + 1]) {
            throw new ArgumentException("Min is greater than Max.");
         }
      }
   }

   @Override
   public void l6(t4 var1) {
      var1.n5("/FunctionType", this.n5());
      var1.n5("/Domain", this.u3);
      if (this.a6 != null) {
         var1.n5("/Range", this.a6);
      }

      super.l6(var1);
   }

   public final float[] l6() {
      return this.u3;
   }

   public final float[] z1() {
      return this.a6;
   }

   public final int t4() {
      return this.n5;
   }

   public final int q0() {
      return this.k5;
   }

   protected abstract int n5();
}
