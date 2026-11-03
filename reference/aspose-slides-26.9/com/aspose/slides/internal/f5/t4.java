package com.aspose.slides.internal.f5;

import com.aspose.slides.exceptions.ArgumentException;

public class t4 extends r4 implements com.aspose.slides.internal.j3.t4 {
   private r4 n5;

   public t4(z1 var1) {
      if (var1 == null) {
         throw new ArgumentException();
      }

      super.a6(var1);
   }

   @Override
   public String h0() {
      return this.y4().k5;
   }

   @Override
   public byte n3() {
      return 11;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 l6(boolean var1) {
      com.aspose.slides.internal.j3.t4 var2 = this.y4().t9();
      if (var1) {
      }

      return var2;
   }

   @Override
   public r4 w1() {
      return this.n5;
   }

   @Override
   public void n5(r4 var1) {
      this.n5 = var1;
   }
}
