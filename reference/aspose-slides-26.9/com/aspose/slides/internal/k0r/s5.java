package com.aspose.slides.internal.k0r;

public final class s5 extends v2 {
   private long n5;
   private k0[] l6;

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final k0[] a6() {
      return this.l6;
   }

   public final void n5(k0[] var1) {
      this.l6 = var1;
   }

   @Override
   public com.aspose.slides.ms.System.o0 n5() {
      return e7.k5;
   }

   @Override
   public long k5() {
      if ((this.n5 & 4294967295L) == 0L) {
         return 4L;
      }

      long var1 = 4L;

      for (k0 var6 : this.l6) {
         var1 = (var1 & 4294967295L) + (var6.k5() & 4294967295L) & 4294967295L;
      }

      return var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.c4();
      this.l6 = new k0[(int)(this.n5 & 4294967295L)];

      for (int var2 = 0; var2 < (this.n5 & 4294967295L); var2++) {
         this.l6[var2] = new k0(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.l6());
      if (this.a6() != null) {
         for (k0 var5 : this.a6()) {
            var5.n5(var1);
         }
      }
   }

   @Override
   public String u3() {
      if (this.l6 != null && this.l6.length != 0) {
         com.aspose.slides.internal.l7h.a5 var1 = new com.aspose.slides.internal.l7h.a5();

         for (k0 var5 : this.l6) {
            var1.n5(var5.l6().u3());
         }

         return var1.toString();
      } else {
         return "";
      }
   }
}
