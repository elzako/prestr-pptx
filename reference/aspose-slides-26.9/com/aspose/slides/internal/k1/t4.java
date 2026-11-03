package com.aspose.slides.internal.k1;

import com.aspose.slides.ms.System.j8;

public class t4 {
   private byte n5;
   private byte l6;
   private byte k5;

   public t4(byte var1) {
      this.n5(var1);
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
      this.l6 = (byte)((var1 & 255) >> 4);
      this.k5 = (byte)(var1 & 0xFF & 3);
   }

   public final byte l6() {
      return this.l6;
   }

   public final byte k5() {
      return this.k5;
   }

   protected final boolean n5(t4 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((t4)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.e2.n5(this.n5);
      var1 = var1 * 397 ^ this.l6 & 255;
      return var1 * 397 ^ this.k5 & 0xFF;
   }
}
