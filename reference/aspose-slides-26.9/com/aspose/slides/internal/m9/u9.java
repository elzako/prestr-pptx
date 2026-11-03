package com.aspose.slides.internal.m9;

import com.aspose.slides.internal.z0k.j5;

public class u9 extends n5 {
   private byte[] n5;

   public u9(int var1) {
      this(new byte[var1], 0);
   }

   public u9(byte[] var1) {
      this(var1, var1.length);
   }

   public u9(byte[] var1, int var2) {
      super(var2, var1.length);
      this.n5 = var1;
   }

   @Override
   protected void l6(int var1, byte var2) {
      this.n5[var1] = var2;
   }

   @Override
   protected int k5(int var1, byte[] var2, int var3, int var4) {
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var2)), var3, com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), var1, var4);
      return var4;
   }

   @Override
   protected int k5(int var1) {
      return this.n5[var1] & 0xFF;
   }

   @Override
   protected int u3(int var1, byte[] var2, int var3, int var4) {
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), var1, com.aspose.slides.ms.System.u3.n5((Object)(var2)), var3, var4);
      return var4;
   }

   @Override
   public int n5(j5 var1, int var2, int var3) {
      var1.n5().write(this.n5, var2, var3);
      return var3;
   }
}
