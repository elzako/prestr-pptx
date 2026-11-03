package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class k0 {
   private v2 n5;

   public k0(v2 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("moniker");
      }

      this.n5 = var1;
   }

   public k0(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5(var1);
   }

   public final com.aspose.slides.ms.System.o0 n5() {
      return this.n5.n5();
   }

   public final v2 l6() {
      return this.n5;
   }

   public final long k5() {
      return 20L + (this.n5.k5() & 4294967295L) & 4294967295L;
   }

   public final void n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.ms.System.o0 var2 = new com.aspose.slides.ms.System.o0(var1.c8(16));
      this.n5 = e7.n5(var2.k5(), var1);
   }

   public final void n5(com.aspose.slides.internal.z0k.l6 var1) {
      byte[] var2 = this.n5().n5();
      var1.n5(var2);
      this.n5.n5(var1);
   }
}
