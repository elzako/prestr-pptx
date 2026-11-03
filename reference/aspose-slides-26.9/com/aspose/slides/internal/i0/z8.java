package com.aspose.slides.internal.i0;

public final class z8 extends l6 {
   private byte[] n5;

   public final byte[] u3() {
      return this.n5;
   }

   public final void n5(byte[] var1) {
      this.n5 = var1;
   }

   @Override
   public com.aspose.slides.internal.o9b.l6 n5() {
      return (com.aspose.slides.internal.o9b.l6)com.aspose.slides.internal.o9b.t4.n5(new com.aspose.slides.internal.z0k.e2(this.u3()));
   }

   @Override
   public com.aspose.slides.internal.l5.c8 l6() {
      return new com.aspose.slides.internal.l5.u3(this.n5());
   }

   @Override
   public byte[] k5() {
      return this.u3();
   }

   private boolean n5(z8 var1) {
      return com.aspose.slides.internal.y6.c8.n5(this.u3(), var1.u3());
   }

   @Override
   public boolean equals(Object obj) {
      if (com.aspose.slides.ms.System.j8.l6(null, obj)) {
         return false;
      } else {
         return com.aspose.slides.ms.System.j8.l6(this, obj) ? true : com.aspose.slides.internal.v6g.k5.l6(obj, z8.class) && this.n5((z8)obj);
      }
   }

   @Override
   public int hashCode() {
      return this.u3() != null ? com.aspose.slides.ms.System.u3.n5((Object)(this.u3())).hashCode() : 0;
   }

   @Override
   public int u9() {
      return this.u3() != null ? this.u3().length : 0;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("CompressedImageData: {0}", new Object[]{this.u3()});
   }
}
