package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.ms.System.d1;

public class o0 {
   private d5 n5;
   private com.aspose.slides.internal.o9b.y2 l6 = new com.aspose.slides.internal.o9b.y2();

   public o0() {
      this.n5 = new d5();
   }

   public final d5 n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.o9b.y2 l6() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.o9b.y2 var1) {
      var1.u3(this.l6);
   }

   public final byte[][] n5(v3 var1) {
      this.l6(var1);
      if (this.l6.k5()) {
         this.l6 = new com.aspose.slides.internal.o9b.y2(0, 0, this.n5.n5(), this.n5.l6());
      }

      byte[][] var2 = new byte[this.n5.a6()][];
      this.n5(true, var1);
      if (this.n5.h0() == 0) {
         for (int var3 = 0; var3 < this.n5.a6(); var3++) {
            int var4 = com.aspose.slides.internal.n5p.h0.n5((this.n5.s7()[var3] & 255) * this.l6.t2(), this.n5.n3() & 255);
            int var5 = com.aspose.slides.internal.n5p.h0.n5((this.n5.x8()[var3] & 255) * this.l6.l6(), this.n5.y4() & 255);
            int var6 = var4 * var5 * ((this.n5.k5() + 7) / 8);
            var2[var3] = new byte[var6];
            r4 var7 = new r4(var1);
            j5 var8 = n5(this.n5, this.n5.c8(), var7);
            h0 var9 = x9.n5(var3, var2[var3], 0, this.n5, var4);
            var8.n5(var3, var9, this.l6.n3());
            var1.n5(var1.l6() - var7.l6());
            if (var3 < this.n5.a6() - 1) {
               this.n5(false, var1);
            }
         }
      } else {
         h0[] var10 = new h0[this.n5.a6()];

         for (int var11 = 0; var11 < this.n5.a6(); var11++) {
            int var13 = com.aspose.slides.internal.n5p.h0.n5((this.n5.s7()[var11] & 255) * this.l6.t2(), this.n5.n3() & 255);
            int var15 = com.aspose.slides.internal.n5p.h0.n5((this.n5.x8()[var11] & 255) * this.l6.l6(), this.n5.y4() & 255);
            int var16 = var13 * var15 * ((this.n5.k5() + 7) / 8);
            var2[var11] = new byte[var16];
            var10[var11] = x9.n5(var11, var2[var11], 0, this.n5, var13);
         }

         r4 var12 = new r4(var1);
         j5 var14 = n5(this.n5, this.n5.c8(), var12);
         switch (this.n5.h0()) {
            case 1:
               var14.n5(var10, this.l6.n3());
               break;
            case 2:
               var14.l6(var10, this.l6.n3());
               break;
            default:
               throw new ArgumentOutOfRangeException();
         }

         var1.n5(var1.l6() - var12.l6());
      }

      return var2;
   }

   public final void l6(v3 var1) {
      if (this.u3(var1) != -40) {
         throw new com.aspose.slides.internal.z3b.k5("Invalid compressed data");
      }

      while (true) {
         byte var2 = this.u3(var1);
         if (var2 == -38) {
            return;
         }

         int var3 = k5(var1);
         int var4 = this.n5(var2, var1) + 2;
         int var5 = var3 - var4;
         if (var5 < 0) {
            throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
         }

         var1.n5(var5, 1);
      }
   }

   public final void n5(boolean var1, v3 var2) {
      if (!var1) {
         if (var2.x8() != 255) {
            throw new com.aspose.slides.internal.z3b.k5("Missing JPEG SOS marker");
         }

         if (var2.x8() != 218) {
            throw new com.aspose.slides.internal.z3b.k5("Missing JPEG SOS marker");
         }
      }

      k5(var2);
      int var3 = var2.x8();
      if (var3 != 1 && var3 != this.n5.a6()) {
         throw new com.aspose.slides.internal.z3b.k5("Parameter value not supported");
      }

      for (int var4 = 0; var4 < var3; var4++) {
         var2.x8();
         var2.x8();
      }

      this.n5.u9(var2.x8());
      this.n5.h0(var2.x8());
      if (var2.x8() != 0) {
         throw new com.aspose.slides.internal.z3b.k5("InvalidCompressedData");
      }

      if (this.n5.u3() == 0) {
         int var6 = this.l6.t2();
         var3 = this.n5.h0() == 0 ? 1 : this.n5.a6();
         this.n5.u3(var3 * var6 * ((this.n5.k5() + 7) / 8));
      }
   }

   private static j5 n5(d5 var0, p8 var1, u9 var2) {
      v4 var3 = k7.n5(var0);
      j5 var4 = new j5(var3, var0, var2);
      var4.n5(var1);
      return var4;
   }

   private static int k5(v3 var0) {
      int var1 = var0.x8() << 8;
      return var1 | var0.x8();
   }

   private byte u3(v3 var1) {
      int var2 = var1.x8();
      if (var2 != 255) {
         throw new com.aspose.slides.internal.z3b.k5("Expected JPEG Marker start byte 0xFF ");
      }

      do {
         var2 = var1.x8();
      } while (var2 == 255);

      return com.aspose.slides.ms.System.d5.isDefined(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.n5p.u3.class), (byte)var2)
         ? (byte)var2
         : 1;
   }

   private int n5(byte var1, v3 var2) {
      switch (var1) {
         case -30:
         case -18:
            return 0;
         case -9:
            return this.u9(var2);
         case -8:
            return this.a6(var2);
         default:
            String var3 = d1.n5(new Object[]{"Unknown/unsupported JPEG marker ", var1 & 255, " encountered."});
            throw new com.aspose.slides.internal.z3b.k5(var3);
      }
   }

   private int a6(v3 var1) {
      int var2 = var1.x8();
      switch (var2) {
         case 1:
            this.n5.n5(new p8());
            this.n5.c8().n5(k5(var1));
            this.n5.c8().l6(k5(var1));
            this.n5.c8().k5(k5(var1));
            this.n5.c8().u3(k5(var1));
            this.n5.c8().a6(k5(var1));
            return 11;
         default:
            String var3 = d1.n5(new String[]{"Unknown/unsupported LSE type ", com.aspose.slides.ms.System.a3.l6(var2), " encountered. Only X'01' is supported."});
            throw new com.aspose.slides.internal.z3b.k5(var3);
      }
   }

   private int u9(v3 var1) {
      this.n5.k5(var1.x8());
      this.n5.l6(k5(var1));
      this.n5.n5(k5(var1));
      this.n5.a6(var1.x8());
      this.n5.n5(new byte[this.n5.a6()]);
      this.n5.l6(new byte[this.n5.a6()]);

      for (int var2 = 0; var2 < this.n5.a6(); var2++) {
         var1.x8();
         int var3 = var1.x8();
         var1.x8();
         this.n5.s7()[var2] = (byte)(var3 >> 4 & 15);
         this.n5.x8()[var2] = (byte)(var3 & 15);
      }

      this.n5.z1();
      return 6 + this.n5.a6() * 3;
   }
}
