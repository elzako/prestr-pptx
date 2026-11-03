package com.aspose.slides.internal.l9o;

import com.aspose.slides.internal.p4t.n5$n5;

public class l6 extends s3 {
   public l6(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   @Override
   protected n5$n5 t2() {
      return new k5(this);
   }

   @Override
   protected void n5(int var1, com.aspose.slides.internal.p4t.u3 var2) {
      byte var3 = (byte)(var1 >> 24 & 0xFF);
      byte var4 = (byte)(var1 >> 16 & 0xFF);
      byte var5 = (byte)(var1 >> 8 & 0xFF);
      byte var6 = (byte)(var1 & 0xFF);
      var2.n5(var6);
      var2.n5(var5);
      var2.n5(var4);
      var2.n5(var3);
   }

   @Override
   protected int k5(int var1) {
      return var1;
   }
}
