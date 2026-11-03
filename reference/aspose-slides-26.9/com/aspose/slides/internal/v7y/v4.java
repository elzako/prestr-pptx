package com.aspose.slides.internal.v7y;

public final class v4 extends u5 {
   private j9 u3;

   public v4(j9 var1, j9 var2) {
      super(var1);
      this.u3 = var2;
   }

   private v4(v4 var1) {
      super(var1);
      this.u3 = n5(var1.u3);
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      super.n5(var1);
      this.u3.n5(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      super.n5(var1);

      while (this.n5.h0() != null) {
         this.u3.n5((com.aspose.slides.internal.x6s.h0)this.n5);

         com.aspose.slides.internal.x6s.a6 var2;
         while ((var2 = this.u3.h0()) != null) {
            this.n5(this.l6, var2);
         }
      }

      return this;
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      com.aspose.slides.internal.x6s.a6 var2 = this.u3.n5(var1);
      if (var2 == null) {
         return null;
      }

      var2 = this.n5.n5(var2);
      if (var2 == null) {
         return null;
      }

      this.n5(new r8(var2.n5(), true));

      for (com.aspose.slides.internal.x6s.a6 var3 = this.h0(); var3 != null; var3 = this.h0()) {
         if (var3.l6(var1)) {
            return var2;
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new v4(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
