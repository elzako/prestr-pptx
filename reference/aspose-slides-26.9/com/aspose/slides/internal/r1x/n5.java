package com.aspose.slides.internal.r1x;

public class n5 implements com.aspose.slides.internal.b8u.n3, com.aspose.slides.internal.b8u.x8 {
   private final byte n5;
   private final byte l6;
   private final byte k5;
   private final com.aspose.slides.internal.b8u.x8 u3;

   public n5(int var1, com.aspose.slides.internal.b8u.x8 var2) {
      this.k5 = (byte)(var1 >> 16 & 0xFF);
      this.l6 = (byte)(var1 >> 8 & 0xFF);
      this.n5 = (byte)(var1 & 0xFF);
      this.u3 = var2;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, int[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      for (int var5 = 0; var5 < var2.length; var5++) {
         int var6 = var2[var5];
         byte var7 = (byte)(var6 >> 24 & 0xFF);
         byte var8 = (byte)(var6 >> 16 & 0xFF);
         byte var9 = (byte)(var6 >> 8 & 0xFF);
         byte var10 = (byte)(var6 & 0xFF);
         if ((var7 & 255) < 255) {
            if ((var7 & 255) == 0) {
               var8 = this.k5;
               var9 = this.l6;
               var10 = this.n5;
            } else {
               var8 = (byte)((var8 & 255) * (var7 & 255) / 255 + (this.k5 & 255) * (255 - (var7 & 255)) / 255);
               var9 = (byte)((var9 & 255) * (var7 & 255) / 255 + (this.l6 & 255) * (255 - (var7 & 255)) / 255);
               var10 = (byte)((var10 & 255) * (var7 & 255) / 255 + (this.n5 & 255) * (255 - (var7 & 255)) / 255);
            }

            var2[var5] = 0xFF000000 | (var8 & 255) << 16 | (var9 & 255) << 8 | var10 & 255;
         }
      }

      this.u3.n5(var1.n3(), var2, var3.k5(), var4.k5());
   }

   @Override
   public final long n5(long var1) {
      long var3 = 0L;
      com.aspose.slides.internal.b8u.n3 var5 = com.aspose.slides.internal.v6g.k5.n5(this.u3, com.aspose.slides.internal.b8u.n3.class);
      if (var5 != null) {
         var3 += var5.n5(var1);
      }

      return var3;
   }
}
