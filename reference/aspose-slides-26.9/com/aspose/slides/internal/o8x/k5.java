package com.aspose.slides.internal.o8x;

import com.aspose.slides.exceptions.ArgumentNullException;

public class k5 extends n5 {
   private String u3;
   private String a6;

   public k5(h0 var1, String var2, String var3) {
      super(var1);
      if (var3 == null) {
         throw new ArgumentNullException("namespaceURI");
      }

      this.u3 = var1.l6().l6(var2);
      this.a6 = var3;
   }

   public k5(k5 var1) {
      super(var1);
      this.u3 = var1.u3;
      this.a6 = var1.a6;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new k5(this);
   }

   @Override
   public boolean l6() {
      if (this.l6 == 0) {
         if (!this.n5.k5(this.u3, this.a6)) {
            return false;
         }
      } else if (!this.n5.u3(this.u3, this.a6)) {
         return false;
      }

      this.l6++;
      return true;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
