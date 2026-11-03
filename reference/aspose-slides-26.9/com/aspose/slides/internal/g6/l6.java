package com.aspose.slides.internal.g6;

import com.aspose.slides.internal.z0k.e2;
import com.aspose.slides.internal.z0k.j5;
import com.aspose.slides.ms.System.q1;

public class l6 {
   private final j5 n5 = new j5(new e2());

   public l6() {
      this.n5.n5(true);
   }

   public final void n5(com.aspose.slides.internal.e4.k5 var1) {
      int var2 = var1.a6();
      this.n5.n5().writeByte((byte)(var2 >> 8));
      this.n5.n5().writeByte((byte)(var2 & 0xFF));
      int var3 = 0;

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = var1.n5(var4 * 2);
         short var6 = (short)(var5 - var3);
         int var7 = q1.n5(var6);
         int var8 = var7 / 238;
         if (var8 <= 8) {
            if (var6 < 0) {
               this.n5.n5().writeByte((byte)(239 + var8));
               this.n5.n5().writeByte((byte)(var7 - var8 * 238));
            } else {
               if (var8 > 0) {
                  this.n5.n5().writeByte((byte)(248 + var8 - 1));
               }

               this.n5.n5().writeByte((byte)(var7 - var8 * 238));
            }
         } else {
            this.n5.n5().writeByte((byte)-18);
            this.n5.n5().writeByte((byte)(var6 >> 8));
            this.n5.n5().writeByte((byte)(var6 & 0xFF));
         }

         var3 = var5;
      }
   }

   public final byte[] n5() {
      return ((e2)this.n5.n5()).toArray();
   }
}
