package com.aspose.slides.internal.e1x;

import com.aspose.slides.ms.System.d1;

public class a3 {
   public String n5;
   public int l6;
   public int k5;
   public int u3;

   public a3(com.aspose.slides.internal.n2d.k5 var1) {
      this.n5 = d1.n5(var1.l6(4));
      this.l6 = var1.l6();
      this.k5 = var1.l6();
      this.u3 = var1.l6();
   }

   public final void n5(com.aspose.slides.internal.n2d.u3 var1) {
      for (int var2 = 0; var2 < this.n5.length(); var2++) {
         var1.n5((byte)this.n5.charAt(var2));
      }

      var1.n5(this.l6);
      var1.n5(this.k5);
      var1.n5(this.u3);
   }

   public static int n5(byte[] var0, int var1, int var2) {
      int var3 = 0;
      int var4 = var1;
      int var5 = var2 / 4;

      for (int var6 = 0; var6 < var5; var6++) {
         int var7 = var0[var4++] & 255;
         int var8 = var0[var4++] & 255;
         int var9 = var0[var4++] & 255;
         int var10 = var0[var4++] & 255;
         int var11 = var10 | var9 << 8 | var8 << 16 | var7 << 24;
         var3 += var11;
      }

      int var17 = var4 < var2 ? var0[var4++] & 0xFF : 0;
      int var18 = var4 < var2 ? var0[var4++] & 0xFF : 0;
      int var19 = var4 < var2 ? var0[var4++] & 0xFF : 0;
      byte var20 = 0;
      int var16 = var20 | var19 << 8 | var18 << 16 | var17 << 24;
      return var3 + var16;
   }
}
