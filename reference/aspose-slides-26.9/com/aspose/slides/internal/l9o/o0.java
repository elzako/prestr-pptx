package com.aspose.slides.internal.l9o;

public abstract class o0 extends s3 {
   protected o0(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.g3x.k5 var2) {
      super(var1, var2);
   }

   protected byte[] n5(byte var1) {
      byte[] var2 = new byte[2];
      int var3 = com.aspose.slides.internal.t5g.u3.n5(var1);
      if (var3 > 255) {
         var2[0] = (byte)(var3 & 0xFF);
         var2[1] = (byte)(var3 >> 8 & 0xFF);
      } else {
         var2[0] = (byte)(var3 & 0xFF);
         var2[1] = 0;
      }

      return var2;
   }

   @Override
   protected int k5(int var1) {
      return var1;
   }
}
