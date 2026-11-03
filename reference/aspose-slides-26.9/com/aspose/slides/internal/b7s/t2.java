package com.aspose.slides.internal.b7s;

import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public final class t2 {
   static final byte[] n5 = new byte[]{74, 70, 73, 70, 0};
   private byte l6;
   private com.aspose.slides.internal.r1x.f0 k5;
   private short u3 = 258;
   private short a6;
   private short u9;

   public t2() {
      this.k5 = null;
   }

   public final byte n5() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.internal.r1x.f0 l6() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.r1x.f0 var1) {
      IDisposable var2 = com.aspose.slides.internal.v6g.k5.n5(this.k5, IDisposable.class);
      if (var2 != null) {
         var2.dispose();
      }

      if (var1 != null) {
         if (var1.y4() > 255 || var1.z1() > 255) {
            throw new com.aspose.slides.internal.h6t.n5("Thumbnail width or height cannot be over 255 pixels.");
         }

         if (var1.z1() * var1.y4() * 3 + 16 > 65535) {
            throw new com.aspose.slides.internal.h6t.n5("Thumbnail data cannot be over 21839 pixels. Please, consider smaller thumbnail image.");
         }
      }

      this.k5 = var1;
   }

   public final void n5(short var1) {
      this.u3 = var1;
   }

   public final short k5() {
      return this.a6;
   }

   public final void l6(short var1) {
      this.a6 = var1;
   }

   public final short u3() {
      return this.u9;
   }

   public final void k5(short var1) {
      this.u9 = var1;
   }

   public static t2 n5(h2 var0) {
      t2 var1 = null;
      int var2 = 0;
      int[] var3 = new int[]{0};
      var0.n5(var3);
      var2 = var3[0];
      byte[] var4 = new byte[5];
      var0.n5(var4, 0, 5);
      String var5 = com.aspose.slides.internal.l7h.j5.z3().l6(var4, 0, var4.length);
      if (d1.l6(var5, "JFIF")) {
         var1 = new t2();
         int var6 = 0;
         int var7 = 0;
         int var8 = 0;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int[] var12 = new int[]{0};
         var0.n5(var12);
         var6 = var12[0];
         int[] var13 = new int[]{0};
         var0.l6(var13);
         var7 = var13[0];
         var1.l6 = (byte)var7;
         int[] var14 = new int[]{0};
         var0.n5(var14);
         var8 = var14[0];
         int[] var15 = new int[]{0};
         var0.n5(var15);
         var9 = var15[0];
         var1.a6 = (short)var8;
         var1.u9 = (short)var9;
         int[] var16 = new int[]{0};
         var0.l6(var16);
         var10 = var16[0];
         int[] var17 = new int[]{0};
         var0.l6(var17);
         var11 = var17[0];
         if (var11 != 0 && var10 != 0) {
            int var18 = var11 * var10;
            int[] var19 = new int[var18];

            for (int var20 = 0; var20 < var18; var20++) {
               int var21 = 0;
               int var22 = 0;
               int var23 = 0;
               int[] var24 = new int[]{0};
               var0.l6(var24);
               var21 = var24[0];
               int[] var25 = new int[]{0};
               var0.l6(var25);
               var22 = var25[0];
               int[] var26 = new int[]{0};
               var0.l6(var26);
               var23 = var26[0];
               int var27 = (var21 << 16) + (var22 << 8) + var23;
               var19[var20] = var27;
            }

            var1.k5 = new q0(var10, var11);
            var1.k5.l6(new com.aspose.slides.internal.o9b.y2(0, 0, var10, var11), var19);
         }

         var1.u3 = (short)var6;
      } else if (d1.l6(var5, "JFXX")) {
         var0.l6(var2 + 1);
      }

      return var1;
   }

   public static void n5(t2 var0, y0 var1) {
      if (var0.k5 != null) {
         if (var0.k5.y4() > 255 || var0.k5.z1() > 255) {
            throw new com.aspose.slides.internal.h6t.n5("Thumbnail width or height cannot be over 255 pixels.");
         }

         if (var0.k5.z1() * var0.k5.y4() * 3 + 16 > 65535) {
            throw new com.aspose.slides.internal.h6t.n5("Thumbnail data cannot be over 21839 bytes long. Please, consider smaller thumbnail image.");
         }
      }

      var1.n5((byte)-1);
      var1.n5((byte)-32);
      var1.n5(16 + (var0.k5 != null ? var0.k5.z1() * var0.k5.y4() * 3 : 0) & 65535);
      var1.n5((byte)74);
      var1.n5((byte)70);
      var1.n5((byte)73);
      var1.n5((byte)70);
      var1.n5((byte)0);
      var1.n5((byte)1);
      var1.n5((byte)1);
      var1.n5(var0.l6);
      var1.n5(var0.a6 & 65535);
      var1.n5(var0.u9 & 65535);
      if (var0.k5 != null) {
         var1.n5((byte)var0.k5.z1());
         var1.n5((byte)var0.k5.y4());
         int[] var2 = var0.l6().k5(new com.aspose.slides.internal.o9b.y2(0, 0, var0.k5.z1(), var0.k5.y4()));

         for (int var3 = 0; var3 < var2.length; var3++) {
            int var4 = var2[var3];
            var1.n5((byte)(var4 >> 16 & 0xFF));
            var1.n5((byte)(var4 >> 8 & 0xFF));
            var1.n5((byte)(var4 & 0xFF));
         }
      } else {
         var1.n5((byte)0);
         var1.n5((byte)0);
      }
   }
}
