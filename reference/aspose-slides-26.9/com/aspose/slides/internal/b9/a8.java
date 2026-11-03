package com.aspose.slides.internal.b9;

public class a8 {
   private long n5;
   private int l6;
   private byte k5;
   private byte u3;

   public a8(long var1) {
      this.n5(var1);
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
      this.l6 = (int)(this.n5 & 4294967295L & 65535L & 4294967295L & 65535L);
      this.k5 = (byte)((this.n5 & 4294967295L & 16711680L & 4294967295L) >> 16 & 4294967295L);
      this.u3 = (byte)((this.n5 & 4278190080L & 4294967295L) >> 24 & 4294967295L);
   }

   protected final boolean n5(a8 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && this.k5 == var1.k5 && this.u3 == var1.u3;
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((a8)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.c3.n5(this.l6);
      var1 = var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.k5);
      return var1 * 397 ^ com.aspose.slides.ms.System.e2.n5(this.u3);
   }
}
