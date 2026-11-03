package com.aspose.slides.internal.b9;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class h0 {
   private byte n5;
   private byte l6;
   private byte k5;
   private byte u3;

   public h0(long var1) {
      this.n5((byte)(var1 & 4294967295L & 255L & 4294967295L));
      this.l6((byte)0);
      this.k5((byte)((var1 & 4294967295L & 16711680L & 4294967295L) >> 16 & 4294967295L));
      this.u3((byte)((var1 & 4278190080L & 4294967295L) >> 24));
   }

   public final long n5() {
      return (this.l6() & 0xFF | (this.k5() & 255) << 8 | (this.u3() & 255) << 16 | (this.a6() & 0xFF & 4294967295L) << 24) & 4294967295L;
   }

   public final byte l6() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte k5() {
      return this.l6;
   }

   public final void l6(byte var1) {
      if ((var1 & 255) != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final byte u3() {
      return this.k5;
   }

   public final void k5(byte var1) {
      this.k5 = var1;
   }

   public final byte a6() {
      return this.u3;
   }

   public final void u3(byte var1) {
      this.u3 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "Data: {0}, BlendOperation: {1}, BlendFlags: {2}, SrcConstantAlpha: {3}, AlphaFormat: {4}",
         this.n5(),
         this.l6(),
         this.k5(),
         this.u3(),
         com.aspose.slides.ms.System.s3.n5(h0$n5.class, this.a6())
      );
   }

   protected final boolean n5(h0 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
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
      int var1 = com.aspose.slides.ms.System.e2.n5(this.n5);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.k5);
      return var1 * 397 ^ this.u3 & 0xFF;
   }
}
