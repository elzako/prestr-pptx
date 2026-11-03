package com.aspose.slides.internal.b4;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.z0k.t4;

public class u3 {
   private final com.aspose.slides.internal.p9.n5 n5;
   private final t4 l6;

   public u3(com.aspose.slides.internal.p9.n5 var1, t4 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final b3[] n5(long var1) {
      if ((var1 & 4294967295L) < 12L) {
         return new b3[0];
      }

      List var3 = new List();
      long var4 = var1;
      int var6 = 0;

      do {
         b3 var7 = new b3(this.n5);
         long var8 = this.l6.getPosition();
         var7.k5(this.l6.getPosition());
         com.aspose.slides.internal.b4.n5.n5(var7, this.l6);
         n5 var10 = com.aspose.slides.internal.b4.l6.n5(var7.t4());
         b3[] var11 = new b3[]{var7};
         boolean var12 = var10.n5(var11, this.l6);
         var7 = var11[0];
         if (var12) {
            this.n5.l6().addItem(var7);
            var3.addItem(var7);
         }

         int var13 = (int)(this.l6.getPosition() - var8);
         int var14 = var7.h0() - var13;
         if (var14 > 0) {
            this.l6.seek(var14, 1);
         } else if (var14 < 0) {
            throw new com.aspose.slides.internal.p5.n5("Readed more bytes than the record size.");
         }

         var6++;
         var4 = (var4 & 4294967295L) - (var7.h0() & 4294967295L) & 4294967295L;
      } while ((var4 & 4294967295L) >= 12L);

      return (b3[])var3.toArray(new b3[0]);
   }
}
