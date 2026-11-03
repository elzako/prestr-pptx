package com.aspose.slides.internal.o8x;

import com.aspose.slides.exceptions.ArgumentNullException;

public class u3 extends n5 {
   private h0 u3;
   private String a6;
   private String u9;
   private boolean h0;

   public u3(h0 var1, String var2, String var3, boolean var4) {
      super(var1);
      if (var3 == null) {
         throw new ArgumentNullException("namespaceURI");
      }

      this.a6 = var1.l6().l6(var2);
      this.u9 = var3;
      this.h0 = var4;
      if (var1.k5() != 0) {
         this.u3 = new h0(var1);
         this.u3.w1();
      }
   }

   public u3(u3 var1) {
      super(var1);
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new u3(this);
   }

   @Override
   public boolean l6() {
      if (this.h0) {
         this.h0 = false;
         if (this.n5.u9(this.a6, this.u9)) {
            this.l6++;
            return true;
         }
      }

      if (!this.n5.n5(this.a6, this.u9, this.u3)) {
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
