package com.aspose.slides.internal.h9;

import com.aspose.slides.internal.b9.s9;

public abstract class l6 extends com.aspose.slides.internal.r5.n5 {
   protected l6(n5 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      com.aspose.slides.internal.b9.n5 var3 = (com.aspose.slides.internal.b9.n5)var1;
      this.n5(var3, var2);
   }

   protected abstract void n5(com.aspose.slides.internal.b9.n5 var1, com.aspose.slides.internal.r6.u9 var2);

   protected final long n5(long var1, long var3, com.aspose.slides.internal.b9.h0 var5, boolean var6) {
      byte var7 = (byte)((var1 & 4294967295L) >> 24 & 4294967295L);
      byte var8 = (byte)((var3 & 4294967295L) >> 24 & 4294967295L);
      byte var9 = (byte)((var1 & 4294967295L) >> 16 & 4294967295L);
      byte var10 = (byte)((var3 & 4294967295L) >> 16 & 4294967295L);
      byte var11 = (byte)((var1 & 4294967295L) >> 8 & 4294967295L);
      byte var12 = (byte)((var3 & 4294967295L) >> 8 & 4294967295L);
      byte var13 = (byte)((var1 & 4294967295L) >> 0 & 4294967295L);
      byte var14 = (byte)((var3 & 4294967295L) >> 0 & 4294967295L);
      float var15 = (var5.u3() & 0xFF) / 255.0F;
      if (var5.a6() == 0) {
         int var24 = com.aspose.slides.internal.v6g.k5.u3((var9 & 0xFF) * var15 + (var10 & 0xFF) * (1.0F - var15), 13);
         int var25 = com.aspose.slides.internal.v6g.k5.u3((var11 & 0xFF) * var15 + (var12 & 0xFF) * (1.0F - var15), 13);
         int var26 = com.aspose.slides.internal.v6g.k5.u3((var13 & 0xFF) * var15 + (var14 & 0xFF) * (1.0F - var15), 13);
         if (var6) {
            byte var27 = com.aspose.slides.internal.v6g.k5.n5((Object)((var7 & 0xFF) * var15 + (var8 & 0xFF) * (1.0F - var15)), 13);
            return ((var27 & 255) << 24 | var24 << 16 | var25 << 8 | var26) & 4294967295L;
         } else {
            return (4278190080L | var24 << 16 | var25 << 8 | var26) & 4294967295L;
         }
      } else {
         float var16 = (var9 & 0xFF) * var15;
         float var17 = (var11 & 0xFF) * var15;
         float var18 = (var13 & 0xFF) * var15;
         int var19 = com.aspose.slides.internal.v6g.k5.u3(var16 + (1.0F - (var7 & 0xFF) / 255.0F) * (var10 & 0xFF), 13);
         int var20 = com.aspose.slides.internal.v6g.k5.u3(var17 + (1.0F - (var7 & 0xFF) / 255.0F) * (var12 & 0xFF), 13);
         int var21 = com.aspose.slides.internal.v6g.k5.u3(var18 + (1.0F - (var7 & 0xFF) / 255.0F) * (var14 & 0xFF), 13);
         if (var6) {
            float var22 = com.aspose.slides.internal.v6g.k5.u3((var7 & 0xFF) * var15, 13);
            byte var23 = com.aspose.slides.internal.v6g.k5.n5((Object)(var22 + (1.0F - var22 / 255.0F) * (var8 & 0xFF)), 13);
            return ((var23 & 255) << 24 | var19 << 16 | var20 << 8 | var21) & 4294967295L;
         } else {
            return (4278190080L | var19 << 16 | var20 << 8 | var21) & 4294967295L;
         }
      }
   }
}
