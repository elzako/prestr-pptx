package com.aspose.slides.internal.e2l;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.y5s.a0;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.x8;

public class u3 {
   private final byte[] n5;
   private final byte[] l6;
   private int k5;
   private int u3;
   private byte a6;
   private byte u9;
   private byte h0;
   private boolean c8;

   public u3(int var1, int var2, byte var3, byte var4, byte var5) {
      this(new byte[]{71, 73, 70, 56, 57, 97}, var1, var2, var3, var4, var5);
   }

   public u3(byte[] var1, int var2, int var3, byte var4, byte var5, byte var6) {
      if (var1 == null) {
         throw new ArgumentNullException("formatVersion");
      }

      if (var1.length != 6) {
         throw new ArgumentOutOfRangeException("formatVersion", "Expected exactly 6 bytes.");
      }

      this.n5 = new byte[3];
      this.l6 = new byte[3];
      com.aspose.slides.ms.System.u3.n5(var1, this.n5, 3);
      com.aspose.slides.ms.System.u3.n5(var1, 3, this.l6, 0, 3);
      this.k5 = var2;
      this.u3 = var3;
      this.a6 = var4;
      this.u9 = var5;
      this.h0 = var6;
   }

   public byte n5() {
      return this.u9;
   }

   public int l6() {
      return this.k5;
   }

   public int k5() {
      return this.u3;
   }

   public boolean u3() {
      return (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) & 128) != 0;
   }

   public void n5(boolean var1) {
      if (var1 != this.u3()) {
         if (var1) {
            this.a6 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) | 128);
         } else {
            this.a6 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) & 127);
         }

         this.c8 = true;
      }
   }

   public int a6() {
      return 2 << (com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) & 7);
   }

   public void n5(int var1) {
      if (var1 != this.a6()) {
         byte var2;
         for (var2 = 0; var1 > 3; var2++) {
            var1 >>= 1;
         }

         this.a6 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) & 248);
         this.a6 = (byte)(com.aspose.slides.internal.v6g.k5.u3(this.a6, 6) | com.aspose.slides.internal.v6g.k5.u3(var2, 6));
         this.c8 = true;
      }
   }

   public static byte n5(int var0, boolean var1, boolean var2, byte var3) {
      byte var4;
      for (var4 = 0; var0 > 3; var4++) {
         var0 >>= 1;
      }

      byte var5 = var4;
      if (var2) {
         var5 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var5, 6) | 8);
      }

      if (com.aspose.slides.internal.v6g.k5.u3(var3, 6) > 7) {
         throw new ArgumentOutOfRangeException("colorResolution", "The color resolution must be in 0-7 range.");
      }

      var5 = (byte)(
         com.aspose.slides.internal.v6g.k5.u3(var5, 6)
            | com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.internal.v6g.k5.n5((Object)(com.aspose.slides.internal.v6g.k5.u3(var3, 6) << 4), 9), 6)
      );
      if (var1) {
         var5 = (byte)(com.aspose.slides.internal.v6g.k5.u3(var5, 6) | 128);
      }

      return var5;
   }

   public void n5(a0 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stream");
      }

      var1.n5(0L);
      var1.n5(this.n5);
      var1.n5(this.l6);
      var1.n5(x8.n5(this.k5));
      var1.n5(x8.n5(this.u3));
      var1.n5(this.a6);
      var1.n5(this.u9);
      var1.n5(this.h0);
      this.c8 = false;
   }

   public static u3 n5(a0 var0, boolean var1) {
      var0.a6();
      u3 var2 = null;
      byte[] var3 = new byte[6];
      int var4 = var0.l6(var3);
      if (var4 == var3.length) {
         if (com.aspose.slides.internal.v6g.k5.u3(var3[0], 6) == 71
            && com.aspose.slides.internal.v6g.k5.u3(var3[1], 6) == 73
            && com.aspose.slides.internal.v6g.k5.u3(var3[2], 6) == 70
            && com.aspose.slides.internal.v6g.k5.u3(var3[3], 6) == 56
            && (com.aspose.slides.internal.v6g.k5.u3(var3[4], 6) == 57 || com.aspose.slides.internal.v6g.k5.u3(var3[4], 6) == 55)
            && com.aspose.slides.internal.v6g.k5.u3(var3[5], 6) == 97) {
            byte[] var5 = new byte[7];
            var4 = var0.l6(var5);
            if (var4 == var5.length) {
               int var6 = x8.n5(var5, 0);
               int var7 = x8.n5(var5, 2);
               byte var8 = var5[4];
               byte var9 = var5[5];
               byte var10 = var5[6];
               var2 = new u3(var3, var6, var7, var8, var9, var10);
            } else if (!var1) {
               String var13 = d1.n5(
                  "Cannot deserialize dat from stream. There is not enough bytes to read from. Expected: {0} bytes but loaded: {1} bytes",new Object[]{
                  com.aspose.slides.internal.v6g.k5.l6(var5.length),
                  com.aspose.slides.internal.v6g.k5.l6(var4)
               });
               throw new com.aspose.slides.internal.d9m.l6(var13);
            }
         } else if (!var1) {
            throw new com.aspose.slides.internal.d9m.l6("The GIF version is not supported.");
         }
      } else if (!var1) {
         String var12 = d1.n5(
            "Cannot deserialize data from stream. There is not enough bytes to read from. Expected: {0} bytes but loaded: {1} bytes",new Object[]{
            com.aspose.slides.internal.v6g.k5.l6(var3.length),
            com.aspose.slides.internal.v6g.k5.l6(var4)
         });
         throw new com.aspose.slides.internal.d9m.l6(var12);
      }

      return var2;
   }
}
