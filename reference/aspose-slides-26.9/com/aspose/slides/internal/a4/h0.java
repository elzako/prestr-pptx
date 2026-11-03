package com.aspose.slides.internal.a4;

import com.aspose.slides.exceptions.InvalidDataException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class h0 extends m1 {
   private com.aspose.slides.internal.i0.a6 n5;
   private float l6;
   private float k5;

   public h0() {
      this.l6((short)16402);
   }

   public h0(b3 var1) {
      super(var1);
   }

   @Override
   public int H_() {
      byte var1 = 0;
      if (this.k5()) {
         var1 = 16;
      } else {
         var1 = 24;
      }

      return var1;
   }

   @Override
   public void n5(int var1) {
      if (!this.k5() && var1 == 24) {
         super.l6(var1);
      } else {
         if (!this.k5() || var1 != 16) {
            throw new InvalidDataException("Invalid value");
         }

         super.l6(var1);
      }
   }

   public final boolean k5() {
      return this.u9(14);
   }

   public final byte u3() {
      return this.m3();
   }

   @Override
   public int h0() {
      byte var1 = 0;
      if (!this.k5()) {
         var1 = 36;
      } else {
         var1 = 28;
      }

      return var1;
   }

   @Override
   public void l6(int var1) {
      if (!this.k5() && var1 == 36) {
         super.l6(var1);
      } else {
         if (!this.k5() || var1 != 28) {
            throw new InvalidDataException("Invalid value");
         }

         super.l6(var1);
      }
   }

   public final float c8() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public final float t2() {
      return this.k5;
   }

   public final void l6(float var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.i0.a6 s7() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.i0.a6 var1) {
      this.n5 = var1;
   }

   @Override
   public String toString() {
      return d1.n5("{0}, RectangleData: {1}, StartAngle: {2}, SweepAngle: {3}", super.toString(), this.n5, this.l6, this.k5);
   }

   protected final boolean n5(h0 var1) {
      return com.aspose.slides.ms.System.j8.n5(this.n5, var1.n5) && n1.l6(this.l6, var1.l6) && n1.l6(this.k5, var1.k5);
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((h0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = this.n5 != null ? this.n5.hashCode() : 0;
      var1 = var1 * 397 ^ n1.n5(this.l6);
      return var1 * 397 ^ n1.n5(this.k5);
   }

   @Override
   public int u9() {
      return 8 + this.n5.u9();
   }
}
