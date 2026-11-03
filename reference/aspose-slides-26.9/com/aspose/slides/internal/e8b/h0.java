package com.aspose.slides.internal.e8b;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.ms.System.d1;

class h0 {
   private final int n5;
   private final c8[] l6;
   private int k5;
   private int u3;
   private int a6;

   public h0(int var1, int var2) {
      this.l6 = new c8[var2];
      this.u3(var1);
      this.n5 = var2;
   }

   public final int n5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   private void u3(int var1) {
      this.a6 = var1;
   }

   public final c8 k5(int var1) {
      if (var1 >= this.l6.length) {
         throw new IndexOutOfRangeException(d1.n5("Component index {0} exceeeds range", new Object[]{var1}));
      } else {
         return this.l6[var1];
      }
   }

   public final void n5(int var1, double[] var2) {
      if (this.l6[var1] == null) {
         this.l6[var1] = new c8(this.k5(), var1);
      }

      for (int var3 = 0; var3 < this.k5(); var3++) {
         this.l6[var1].n5(var2[var3], var3);
      }
   }
}
