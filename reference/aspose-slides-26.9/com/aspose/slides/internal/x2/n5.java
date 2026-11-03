package com.aspose.slides.internal.x2;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.internal.v2.y4;

public abstract class n5 {
   private String n5;
   private String l6;
   private String k5;
   private int u3;

   public void n5(int var1) {
      this.u3 = var1;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public void l6(String var1) {
      this.k5 = var1;
   }

   public void k5(String var1) {
      this.l6 = var1;
   }

   public abstract void n5(y4 var1, s7 var2);

   public final void n5(y4 var1, y4 var2, s7 var3) {
      byte[] var4 = n5(var1);
      byte[] var5 = n5(var2);
      if (var4.length == var5.length && var4.length != 0) {
         byte[] var6 = null;
         if (com.aspose.slides.internal.v6g.k5.l6(var3, y4.class)) {
            var6 = n5((y4)var3);
         }

         int var7 = n5(var4);
         int var8 = n5(var5);

         for (int var9 = var7; var9 <= var8; var9++) {
            n5(var9, var4);
            y4 var10 = new y4(var4);
            if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.v2.n5.class)) {
               s7 var11 = ((com.aspose.slides.internal.v2.n5)var3).k5(var9 - var7);
               this.n5(var10, var11);
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, t2.class)) {
               int var12 = ((t2)var3).k5() + var9 - var7;
               this.n5(var10, new t2(var12));
            } else if (com.aspose.slides.internal.v6g.k5.l6(var3, y4.class)) {
               y4 var13 = new y4(var6);
               var6[var6.length - 1]++;
               this.n5(var10, var13);
            }
         }
      } else {
         throw new ArgumentException("Invalid map");
      }
   }

   private static void n5(int var0, byte[] var1) {
      for (int var2 = var1.length - 1; var2 >= 0; var2--) {
         var1[var2] = (byte)var0;
         var0 >>= 8;
      }
   }

   private static int n5(byte[] var0) {
      int var1 = 0;

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1 <<= 8;
         var1 |= var0[var2] & 255 & 0xFF;
      }

      return var1;
   }

   public static byte[] n5(y4 var0) {
      byte[] var1 = var0.n5();
      byte[] var2 = new byte[var1.length];
      System.arraycopy(var1, 0, var2, 0, var1.length);
      return var2;
   }
}
