package com.aspose.slides.internal.t5;

import com.aspose.slides.ms.System.j8;

public class t9 extends q0 {
   private byte n5;
   private byte l6;
   private byte k5;
   private byte u3;
   private int a6;

   public t9() {
   }

   public t9(int var1) {
      this.a6 = var1;
      this.l6 = (byte)(var1 & 0xFF);
      this.k5 = (byte)(var1 >> 8 & 0xFF);
      this.u3 = (byte)(var1 >> 16 & 0xFF);
   }

   public final byte n5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte l6() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
      short var2 = -256;
      this.a6 &= -256;
      this.a6 |= var1 & 255;
   }

   public final byte k5() {
      return this.k5;
   }

   public final void k5(byte var1) {
      this.k5 = var1;
      int var2 = -65281;
      this.a6 &= -65281;
      this.a6 |= (var1 & 255) << 8;
   }

   public final byte u3() {
      return this.u3;
   }

   public final void u3(byte var1) {
      this.u3 = var1;
      int var2 = -16711681;
      this.a6 &= -16711681;
      this.a6 |= (var1 & 255) << 16;
   }

   public final int u9() {
      return this.a6;
   }

   protected final boolean n5(t9 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3 && this.a6 == var1.a6;
   }

   @Override
   public boolean equals(Object obj) {
      if (j8.l6(null, obj)) {
         return false;
      } else if (j8.l6(this, obj)) {
         return true;
      } else {
         return j8.n5(obj) != j8.n5(this) ? false : this.n5((t9)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = com.aspose.slides.ms.System.e2.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.k5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.u3);
      return var1 * 397 ^ this.a6;
   }
}
