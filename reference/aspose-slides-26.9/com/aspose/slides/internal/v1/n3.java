package com.aspose.slides.internal.v1;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.j8;
import com.aspose.slides.ms.System.q1;

public class n3 implements t2 {
   private byte[] n5;
   private int l6 = 0;
   private int k5 = 0;
   private int u3;
   private int[] a6 = new int[]{511, 1023, 2047, 4095};

   @Override
   public final u9 n5(t4 var1, t4 var2, com.aspose.slides.internal.v2.k5 var3, int var4) {
      com.aspose.slides.internal.v2.s7 var5 = var3.n5(com.aspose.slides.internal.v2.c8.t3, com.aspose.slides.internal.v2.c8.b9);
      com.aspose.slides.internal.v2.k5 var6 = null;
      if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.k5.class)) {
         var6 = (com.aspose.slides.internal.v2.k5)var5;
      } else if (com.aspose.slides.internal.v6g.k5.l6(var5, com.aspose.slides.internal.v2.n5.class)) {
         com.aspose.slides.internal.v2.n5 var7 = (com.aspose.slides.internal.v2.n5)var5;
         if (var4 < var7.n5()) {
            var6 = (com.aspose.slides.internal.v2.k5)var7.l6(var4);
         }
      } else if (var5 != null) {
         String var16 = d1.n5(d1.n5(new String[]{"Error: Expected CosArray or CosDictionary and not ", j8.n5(var5).s7()}), new Object[]{});
         throw new IOException(var16);
      }

      int var15 = -1;
      int var8 = 1;
      if (var6 != null) {
         var15 = var6.t2(com.aspose.slides.internal.v2.c8.o9b);
         var8 = var6.n5(com.aspose.slides.internal.v2.c8.h1, 1);
         if (var8 != 0 && var8 != 1) {
            var8 = 1;
         }
      }

      if (var15 > 1) {
         int var9 = q1.l6(var6.n5(com.aspose.slides.internal.v2.c8.i9, 1), 32);
         int var10 = var6.n5(com.aspose.slides.internal.v2.c8.f2, 8);
         int var11 = var6.n5(com.aspose.slides.internal.v2.c8.j3, 1);
         com.aspose.slides.internal.z0k.e2 var12 = new com.aspose.slides.internal.z0k.e2();
         this.n5(var1, var12, var8);
         byte[] var13 = com.aspose.slides.internal.d4.l6.n5(var12);
         com.aspose.slides.internal.z0k.e2 var14 = new com.aspose.slides.internal.z0k.e2(var13);
         y4.n5(var15, var9, var10, var11, var14, var2, 4096);
         var2.flush();
         var12.dispose();
         var14.dispose();
      } else {
         this.n5(var1, var2, var8);
      }

      return new u9(var3);
   }

   private void n5(t4 var1, t4 var2, int var3) {
      List var4 = null;
      int var5 = 9;
      long var6 = 0L;
      long var8 = -1L;
      this.u3 = 0;
      this.l6 = 0;
      this.k5 = 0;

      try {
         com.aspose.slides.internal.z0k.e2 var10 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.internal.q7.n5.n5(var1, var10);
            this.n5 = var10.toArray();
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }

         while ((var6 = this.n5(var5)) != 257L) {
            if (var6 == 256L) {
               var5 = 9;
               var4 = this.n5();
               var8 = -1L;
            } else {
               if (var6 < var4.size()) {
                  byte[] var11 = (byte[])var4.get_Item((int)var6);
                  byte var12 = var11[0];
                  var2.write(var11, 0, var11.length);
                  if (var8 != -1L) {
                     var11 = (byte[])var4.get_Item((int)var8);
                     byte[] var13 = new byte[var11.length + 1];
                     System.arraycopy(var11, 0, var13, 0, var11.length);
                     var13[var11.length] = var12;
                     var4.addItem(var13);
                  }
               } else {
                  byte[] var20 = (byte[])var4.get_Item((int)var8);
                  byte[] var21 = new byte[var20.length + 1];
                  System.arraycopy(var20, 0, var21, 0, var20.length);
                  var21[var20.length] = var20[0];
                  var2.write(var21, 0, var21.length);
                  var4.addItem(var21);
               }

               var5 = this.n5(var4.size(), var3);
               var8 = var6;
            }
         }
      } catch (RuntimeException var17) {
      }

      var2.flush();
   }

   private int n5(int var1) {
      try {
         this.l6 = this.l6 << 8 | this.n5[this.u3++] & 255 & 0xFF;
         this.k5 += 8;
         if (this.k5 < var1) {
            this.l6 = this.l6 << 8 | this.n5[this.u3++] & 255 & 0xFF;
            this.k5 += 8;
         }

         int var2 = this.l6 >> this.k5 - var1 & this.a6[var1 - 9];
         this.k5 -= var1;
         return var2;
      } catch (RuntimeException var3) {
         return 257;
      }
   }

   private List<byte[]> n5() {
      List var1 = new List(4096);

      for (int var2 = 0; var2 < 256; var2++) {
         var1.addItem(new byte[]{(byte)(var2 & 0xFF)});
      }

      var1.addItem(null);
      var1.addItem(null);
      return var1;
   }

   private int n5(int var1, int var2) {
      if (var1 >= 2048 - var2) {
         return 12;
      } else if (var1 >= 1024 - var2) {
         return 11;
      } else {
         return var1 >= 512 - var2 ? 10 : 9;
      }
   }
}
