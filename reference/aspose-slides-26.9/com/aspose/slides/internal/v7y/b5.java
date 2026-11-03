package com.aspose.slides.internal.v7y;

public final class b5 extends v3 {
   private j9 n5;
   private j9 l6;
   private boolean u3;

   public b5(int var1, j9 var2, j9 var3) {
      if (var2.u9() != 2) {
         var2 = new u8(8, var2);
      }

      if (var3.u9() != 2) {
         var3 = new u8(8, var3);
      }

      this.n5 = var2;
      this.l6 = var3;
      this.u3 = var1 == 1;
   }

   private b5(b5 var1) {
      super(var1);
      this.n5 = n5(var1.n5);
      this.l6 = n5(var1.l6);
      this.u3 = var1.u3;
   }

   @Override
   public void n5(com.aspose.slides.internal.k4s.h0 var1) {
      this.n5.n5(var1);
      this.l6.n5(var1);
   }

   @Override
   public Object n5(com.aspose.slides.internal.x6s.h0 var1) {
      Object var2 = this.n5.n5(var1);
      return com.aspose.slides.internal.v6g.k5.u3(var2, boolean.class) == this.u3 ? var2 : this.l6.n5(var1);
   }

   @Override
   public com.aspose.slides.internal.x6s.h0 n5() {
      return new b5(this);
   }

   @Override
   public int u9() {
      return 2;
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   public com.aspose.slides.internal.x6s.h0 deepClone() {
      return this.n5();
   }

}
