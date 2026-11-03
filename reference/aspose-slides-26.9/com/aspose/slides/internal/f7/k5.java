package com.aspose.slides.internal.f7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.w0.z1;

public class k5 implements l6 {
   private z1[] n5;

   public k5(int var1) {
      this.n5 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), var1));
   }

   @Override
   public final IGenericList<z1> n5(IGenericList<com.aspose.slides.internal.w0.n5> var1, byte[] var2) {
      int var3 = var1.size();
      if (this.n5.length < var3) {
         this.n5 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), var3));
      }

      z1[] var4 = this.n5;

      for (int var5 = 0; var5 < var3; var5++) {
         ((com.aspose.slides.internal.w0.n5)var1.get_Item(var5)).n5().n5(var4[var5]);
      }

      u3 var8 = new u3(var3);
      z1[] var6 = var8.l6(com.aspose.slides.ms.System.u3.n5(var4));

      for (int var7 = 0; var7 < var3; var7++) {
         var2[var7] = (byte)var8.n5(var4[var7].n5());
      }

      return com.aspose.slides.ms.System.u3.n5(var6);
   }
}
