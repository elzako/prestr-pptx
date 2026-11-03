package com.aspose.slides.internal.m9;

import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.ms.System.q1;

public class a6 extends n5 {
   private byte[] n5 = new byte[256];

   public a6() {
      super(0, Integer.MAX_VALUE, true);
   }

   @Override
   protected void l6(int var1, byte var2) {
      this.u3(var1 + 1);
      this.n5[var1] = var2;
   }

   @Override
   protected int k5(int var1, byte[] var2, int var3, int var4) {
      this.u3(var1 + var4);
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

   private void u3(int var1) {
      if (var1 > this.n5.length) {
         var1 = q1.n5(var1, this.n5.length * 2);
         byte[] var2 = new byte[var1];
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(this.n5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var2)), 0, this.n5.length);
         this.n5 = var2;
      }
   }
}
