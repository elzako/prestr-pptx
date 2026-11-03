package com.aspose.slides.internal.i0;

public class v0 extends l6 {
   private long n5;
   private long l6;
   private byte[] k5;

   public final long u3() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long a6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final byte[] h0() {
      return this.k5;
   }

   public final void n5(byte[] var1) {
      this.k5 = var1;
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      return this.l6().u3();
   }

   @Override
   public com.aspose.slides.internal.l5.c8 l6() {
      com.aspose.slides.internal.l5.c8 var1 = null;
      com.aspose.slides.internal.z0k.e2 var2 = new com.aspose.slides.internal.z0k.e2(this.h0());

      try {
         var1 = com.aspose.slides.internal.y6.l6.n5(var2);
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }

      return var1;
   }

   @Override
   public byte[] k5() {
      return this.h0();
   }

   protected final boolean n5(v0 var1) {
      return this.n5 == var1.n5 && this.l6 == var1.l6 && com.aspose.slides.internal.y6.c8.n5(this.h0(), var1.h0());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else if (com.aspose.slides.ms.System.j8.l6(this, obj)) {
         return true;
      } else {
         return com.aspose.slides.ms.System.j8.n5(obj) != com.aspose.slides.ms.System.j8.n5(this) ? false : this.n5((v0)obj);
      }
   }

   @Override
   public int hashCode() {
      int var1 = (int)this.n5;
      var1 = var1 * 397 ^ (int)this.l6;
      return var1 * 397 ^ (this.h0() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.h0())).hashCode() : 0);
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "[Type: {0}, MetafileDataSize: {1}]", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.z8.class, this.n5), this.l6
      );
   }

   @Override
   public int u9() {
      int var1 = 8;
      if (this.h0() != null) {
         var1 += this.h0().length;
      }

      return var1;
   }
}
