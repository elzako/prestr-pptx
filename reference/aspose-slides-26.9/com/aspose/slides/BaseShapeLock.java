package com.aspose.slides;

public class BaseShapeLock implements IBaseShapeLock {
   private int n5;
   private int l6 = 65535;
   private c7 k5 = new c7();
   private v9 u3 = new v9();

   BaseShapeLock() {
   }

   BaseShapeLock(int sign) {
      this.l6 = sign;
   }

   c7 n5() {
      return this.k5;
   }

   v9 l6() {
      return this.u3;
   }

   @Override
   public boolean getNoLocks() {
      return com.aspose.slides.internal.v6g.k5.k5(this.n5, 8) == 0;
   }

   static int n5(byte... var0) {
      int var1 = 0;

      for (byte var5 : var0) {
         var1 = com.aspose.slides.internal.v6g.k5.k5(
            com.aspose.slides.internal.v6g.k5.u3(var1, 8) | com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.k5(1 << var5, 9), 8), 9
         );
      }

      return var1;
   }

   boolean n5(byte var1) {
      return (com.aspose.slides.internal.v6g.k5.u3(this.n5, 8) & 1 << var1) != 0;
   }

   void n5(byte var1, boolean var2) {
      int var3 = com.aspose.slides.internal.v6g.k5.k5(1 << var1, 9);
      if (var2) {
         this.n5 = com.aspose.slides.internal.v6g.k5.k5(com.aspose.slides.internal.v6g.k5.u3(this.n5, 8) | com.aspose.slides.internal.v6g.k5.u3(var3, 8), 9);
      } else {
         this.n5 = com.aspose.slides.internal.v6g.k5.k5(
            com.aspose.slides.internal.v6g.k5.u3(this.n5, 8)
               & com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.k5(~com.aspose.slides.internal.v6g.k5.u3(var3, 8), 9), 8),
            9
         );
      }
   }
}
