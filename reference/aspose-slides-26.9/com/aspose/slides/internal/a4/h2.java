package com.aspose.slides.internal.a4;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class h2 extends f2 {
   private com.aspose.slides.internal.u2.n5 n5 = new com.aspose.slides.internal.u2.n5();
   private long l6;
   private byte[] k5;
   private com.aspose.slides.internal.i0.v4 u3;

   public h2(b3 var1) {
      super(var1);
   }

   @Override
   public short G_() {
      return super.G_();
   }

   @Override
   public void n5(short var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      super.n5(var1);
   }

   public final com.aspose.slides.internal.u2.n5 k5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.internal.u2.n5 var1) {
      if (!com.aspose.slides.internal.g8.z1.n5(var1.toString())) {
         throw new ArgumentOutOfRangeException("value");
      }

      var1.l6(this.n5);
   }

   public final long u3() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final byte[] c8() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   public final com.aspose.slides.internal.i0.v4 t2() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.i0.v4 var1) {
      this.u3 = var1;
   }

   protected final boolean n5(h2 var1) {
      return super.n5(var1)
         && this.n5.n5(var1.n5.a6())
         && this.u3() == var1.u3()
         && com.aspose.slides.internal.y6.c8.n5(this.c8(), var1.c8())
         && com.aspose.slides.ms.System.j8.n5(this.t2(), var1.t2());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((h2)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = super.hashCode();
      var1 = var1 * 397 ^ this.n5.hashCode();
      var1 = var1 * 397 ^ (int)this.u3();
      var1 = var1 * 397 ^ (this.c8() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.c8())).hashCode() : 0);
      return var1 * 397 ^ (this.t2() != null ? this.t2().hashCode() : 0);
   }
}
