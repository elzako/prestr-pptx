package com.aspose.slides.internal.k0r;

public class x6 {
   private long n5;
   private long l6;

   public x6(long var1, long var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5("OfficeArtIDCL, dgid:{0}, cspidCur:{1}", this.n5, this.l6);
   }

   x6(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = var1.c4();
   }

   final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5);
      var1.n5(this.l6 & 4294967295L);
   }

   int l6() {
      return 8;
   }
}
