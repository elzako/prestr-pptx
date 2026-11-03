package com.aspose.slides.internal.v7y;

public final class h0 extends u5 {
   public h0(j9 var1) {
      super(var1);
   }

   private h0(h0 var1) {
      super(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      Object var2 = super.n5(var1);
      com.aspose.slides.internal.x6s.a6 var3 = var1.k5().n5();
      com.aspose.slides.internal.x6s.a6 var4;
      switch (this.n5(var2)) {
         case 0:
            this.n5(var3, s0.n5((double)(com.aspose.slides.internal.v6g.k5.u3(var2, double.class))));
            break;
         case 1:
            this.n5(var3, (String)var2);
            break;
         case 2:
            this.n5(var3, s0.n5((boolean)(com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class))));
            break;
         case 3:
            while ((var4 = this.n5.h0()) != null) {
               this.n5(var3, var4.c8());
            }
            break;
         case 4:
            this.n5(var3, ((com.aspose.slides.internal.x6s.a6)var2).c8());
      }

      return this;
   }

   private void n5(com.aspose.slides.internal.x6s.a6 var1, String var2) {
      String[] var3 = com.aspose.slides.ms.System.Xml.f4.c4(var2);

      for (int var4 = 0; var4 < var3.length; var4++) {
         if (var1.u3(var3[var4])) {
            this.n5(this.l6, var1);
         }
      }
   }

   @Override
   public com.aspose.slides.internal.x6s.a6 n5(com.aspose.slides.internal.x6s.a6 var1) {
      this.n5(new r8(var1, true));

      com.aspose.slides.internal.x6s.a6 var2;
      while ((var2 = this.h0()) != null) {
         if (var2.l6(var1)) {
            return var1;
         }
      }

      return null;
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new h0(this);
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
