package com.aspose.slides.internal.d0;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.h3k.c8;
import com.aspose.slides.internal.h3k.h0;
import com.aspose.slides.internal.l7h.j5;
import com.aspose.slides.internal.n2d.t4;
import com.aspose.slides.internal.z4.z1;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class l6 extends z1 {
   private final byte[] n5 = new byte[5];
   private final c8 k5 = new c8();
   private int u3;
   private int a6;
   private int u9;
   private byte[] h0;
   private byte[] c8;
   private byte[] t2;
   private static final byte[] s7 = new byte[]{
      40, -65, 78, 94, 78, 117, -118, 65, 100, 0, 78, 86, -1, -6, 1, 8, 46, 46, 0, -74, -48, 104, 62, -128, 47, 12, -87, -2, 100, 83, 105, 122
   };
   private static final byte[] x8 = new byte[]{115, 65, 108, 84};

   public l6(com.aspose.slides.internal.z4.c8 var1, byte[] var2) {
      super(var1);
      n5 var3 = var1.l6().t9();
      this.n5(var3.u3());
      this.u9 = var3.k5();
      this.u9 = this.u9 | (this.a6 != 3 && this.a6 != 4 ? -64 : -3904);
      this.u9 &= -4;
      byte[] var4 = t4.l6(var3.n5()) ? j5.z3().u3(var3.n5()) : com.aspose.slides.internal.n2d.n5.n5;
      byte[] var5 = t4.l6(var3.l6()) ? j5.z3().u3(var3.l6()) : var2;
      this.n5(var4, var5);
      this.l6(var2, var4);
      this.n5(var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.z4.t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.n5("/Filter /Standard");
      var1.k5("/O", d1.n5("<{0}>", new Object[]{t4.n5(this.h0)}));
      var1.k5("/U", d1.n5("<{0}>", new Object[]{t4.n5(this.t2)}));
      var1.n5("/P", this.u9);
      var1.n5("/R", this.a6);
      switch (this.a6) {
         case 2:
            var1.n5("/V", 1);
            break;
         case 3:
            var1.n5("/V", 2);
            var1.n5("/Length", 128);
            break;
         default:
            throw new InvalidOperationException("Unexpected encryption method.");
      }

      var1.t2();
      var1.l6();
   }

   public final k5 n5(int var1, int var2) {
      this.n5[0] = (byte)var1;
      this.n5[1] = (byte)(var1 >> 8);
      this.n5[2] = (byte)(var1 >> 16);
      this.n5[3] = (byte)var2;
      this.n5[4] = (byte)(var2 >> 8);
      h0 var3 = new h0();
      var3.n5(this.c8, this.c8.length);
      var3.n5(this.n5, this.n5.length);
      if (this.a6 == 4) {
         var3.n5(x8, this.n5.length);
      }

      var3.a6();
      byte[] var4 = var3.u9();
      int var5 = this.c8.length + 5;
      if (var5 > 16) {
         var5 = 16;
      }

      return new k5(var4, var5);
   }

   private void n5(int var1) {
      switch (var1) {
         case 0:
            this.u3 = 40;
            this.a6 = 2;
            break;
         case 1:
            this.u3 = 128;
            this.a6 = 3;
            break;
         default:
            throw new ArgumentException("Invalid encryption mode.");
      }
   }

   private void n5(byte[] var1, byte[] var2) {
      this.h0 = new byte[32];
      byte[] var3 = l6(var2);
      if (var2 == null || var2.length == 0) {
         var3 = l6(var1);
      }

      byte[] var4 = new h0().l6(var3);
      byte[] var5 = l6(var1);
      if (this.a6 != 3 && this.a6 != 4) {
         this.k5.l6(var4, 0, 5);
         this.k5.n5(var5, this.h0);
      } else {
         byte[] var6 = new byte[this.u3 / 8];
         h0 var7 = new h0();

         try {
            for (int var8 = 0; var8 < 50; var8++) {
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5((Object)(var7.k5(var4, 0, var6.length))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var4)), 0, var6.length
               );
            }
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }

         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var5)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.h0)), 0, 32);

         for (int var12 = 0; var12 < 20; var12++) {
            for (int var9 = 0; var9 < var6.length; var9++) {
               var6[var9] = (byte)(var4[var9] & 0xFF ^ var12);
            }

            this.k5.l6(var6);
            this.k5.n5(this.h0);
         }
      }
   }

   private void l6(byte[] var1, byte[] var2) {
      this.c8 = new byte[this.u3 / 8];
      h0 var3 = new h0();
      byte[] var4 = l6(var2);
      var3.n5(var4, var4.length);
      var3.n5(this.h0, this.h0.length);
      byte[] var5 = new byte[]{(byte)this.u9, (byte)(this.u9 >> 8), (byte)(this.u9 >> 16), (byte)(this.u9 >> 24)};
      var3.n5(var5, 4);
      if (var1 != null) {
         var3.n5(var1, var1.length);
      }

      var3.a6();
      byte[] var6 = var3.u9();
      byte[] var7 = new byte[this.c8.length];
      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var6)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0, this.c8.length);
      if (this.a6 == 3 || this.a6 == 4) {
         h0 var8 = new h0();

         try {
            for (int var9 = 0; var9 < 50; var9++) {
               com.aspose.slides.ms.System.u3.n5(
                  com.aspose.slides.ms.System.u3.n5((Object)(var8.l6(var7))), 0, com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0, this.c8.length
               );
            }
         } finally {
            if (var8 != null) {
               var8.dispose();
            }
         }
      }

      com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var7)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.c8)), 0, this.c8.length);
   }

   private void n5(byte[] var1) {
      this.t2 = new byte[32];
      if (this.a6 != 3 && this.a6 != 4) {
         this.k5.l6(this.c8);
         this.k5.n5(s7, this.t2);
      } else {
         h0 var2 = new h0();
         var2.n5(s7, s7.length);
         var2.n5(var1, var1.length);
         var2.a6();
         byte[] var3 = var2.u9();
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var3)), 0, com.aspose.slides.ms.System.u3.n5((Object)(this.t2)), 0, 16);

         for (int var4 = 16; var4 < 32; var4++) {
            this.t2[var4] = 0;
         }

         for (int var6 = 0; var6 < 20; var6++) {
            for (int var5 = 0; var5 < this.c8.length; var5++) {
               var3[var5] = (byte)(this.c8[var5] & 0xFF ^ var6);
            }

            this.k5.l6(var3, 0, this.c8.length);
            this.k5.n5(this.t2, 0, 16);
         }
      }
   }

   private static byte[] l6(byte[] var0) {
      byte[] var1 = new byte[32];
      if (var0 != null && var0.length != 0) {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(var0)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, q1.l6(var0.length, 32));
         if (var0.length < 32) {
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(s7)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), var0.length, 32 - var0.length);
         }

         return var1;
      } else {
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5((Object)(s7)), 0, com.aspose.slides.ms.System.u3.n5((Object)(var1)), 0, 32);
         return var1;
      }
   }
}
