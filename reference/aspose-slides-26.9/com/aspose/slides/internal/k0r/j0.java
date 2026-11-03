package com.aspose.slides.internal.k0r;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;

public final class j0 extends v2 {
   private final com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private final byte[] l6;

   public j0(com.aspose.slides.ms.System.o0 var1, byte[] var2) {
      if (var2 == null) {
         throw new ArgumentNullException("data");
      }

      var1.k5(this.n5);
      this.l6 = var2;
   }

   @Override
   public com.aspose.slides.ms.System.o0 n5() {
      return this.n5;
   }

   @Override
   public long k5() {
      return 16L + (this.l6.length & 4294967295L) & 4294967295L;
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.n5 var1) {
      throw new NotImplementedException();
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      var1.n5(this.n5.n5());
      var1.n5(this.l6);
   }

   @Override
   public String u3() {
      return "";
   }
}
