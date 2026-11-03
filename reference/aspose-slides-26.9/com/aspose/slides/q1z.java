package com.aspose.slides;

class q1z extends x3 {
   private long n5 = 4294967295L;
   private final PVIObject l6;

   public q1z(PVIObject var1) {
      this.l6 = var1;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      if ((this.n5 & 4294967295L) != (var1 & 4294967295L)) {
         this.n5 = var1;
         this.l6();
      }
   }

   private void l6() {
      if (this.l6 != null) {
         this.l6.k7();
      }
   }
}
