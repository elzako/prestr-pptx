package com.aspose.slides.internal.s8;

import com.aspose.slides.ms.System.q1;

public class u9 extends x8 {
   private final long n5;
   private final int l6;
   private long k5;
   private long u3;
   private long a6;
   private long u9;
   private int h0;

   public u9(long var1, int var3) {
      this.n5 = var1;
      this.l6 = var3;
   }

   public u9(long var1, int var3, long var4, long var6, long var8, long var10, int var12) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var6;
      this.a6 = var8;
      this.u9 = var10;
      this.h0 = var12;
   }

   public final com.aspose.slides.internal.k1.t2 n5(com.aspose.slides.internal.z0k.n5 var1) {
      int var2 = (int)(this.n5 + this.l6 - var1.x8().getPosition());
      if (var2 > 0) {
         if ((this.u3 & 4294967295L) > 0L) {
            return this.k5(var1);
         }

         var1.x8().seek(var2, 1);
      } else if (var2 < 0) {
         throw new com.aspose.slides.internal.p5.n5("Readed more bytes than the object size.");
      }

      return null;
   }

   public com.aspose.slides.internal.y6.u3 l6(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition();
      com.aspose.slides.internal.k1.t2 var4 = new com.aspose.slides.internal.k1.t2();
      long var5 = var1.c4();
      var1.x8().seek(var2, 0);
      if ((var5 & 4294967295L) == 12L) {
         var4.n5((com.aspose.slides.internal.k1.u3)new l6().n5(var1));
      } else {
         var4.n5((com.aspose.slides.internal.k1.a6)new k5().n5(var1));
      }

      long var7 = var1.x8().getPosition();
      int var9 = n5(var4);
      long var10 = this.n5 + this.l6 - (var7 + var9);
      com.aspose.slides.internal.k1.a6 var12 = com.aspose.slides.internal.v6g.k5.n5(var4.n5(), com.aspose.slides.internal.k1.a6.class);
      long var13 = 0L;
      if (var12 != null) {
         int var15 = 0;
         if (var12.k5() > 0) {
            var15 = 2;
         }

         if (var12.k5() > 1) {
            var15 <<= (var12.k5() & 65535) - 1;
         }

         long var16 = 0L;
         if ((var12.x8() & 4294967295L) != 0L) {
            if (var12.k5() < 16) {
               var16 = (var12.x8() & 4294967295L) << 2 & 4294967295L;
            } else {
               var16 = var12.x8() & 4294967295L;
            }
         } else if (var15 > 0) {
            var16 = var15 << 2;
         }

         if (var16 > 0L && var16 < var10) {
            var13 = var10 - var16;
            var10 = var16;
         }
      }

      if (var10 > 0L) {
         var4.n5(var1.c8((int)var10));
      }

      var4.l6(var1.c8(var9));
      if (var13 > 0L) {
         var1.c8((int)var13);
      }

      return var4;
   }

   private static int n5(com.aspose.slides.internal.k1.t2 var0) {
      int var2;
      if (com.aspose.slides.internal.v6g.k5.l6(var0.n5(), com.aspose.slides.internal.k1.a6.class)) {
         com.aspose.slides.internal.k1.a6 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(), com.aspose.slides.internal.k1.a6.class);
         switch ((int)var1.h0()) {
            case 0:
            case 3:
            case 11:
               var2 = (var1.u3() * (var1.l6() & 65535) * (var1.k5() & 65535) + 31 & -32) / 8 * q1.n5(var1.u9());
               break;
            default:
               var2 = (int)var1.c8();
         }
      } else {
         com.aspose.slides.internal.k1.u3 var3 = com.aspose.slides.internal.v6g.k5.n5(var0.n5(), com.aspose.slides.internal.k1.u3.class);
         var2 = ((var3.u3() & 65535) * (var3.l6() & 65535) * (var3.k5() & 65535) + 31 & -32) / 8 * q1.n5(var3.u9() & 65535);
      }

      return var2;
   }

   private com.aspose.slides.internal.k1.t2 k5(com.aspose.slides.internal.z0k.n5 var1) {
      var1.x8().seek(this.n5 + (this.k5 & 4294967295L), 0);
      com.aspose.slides.internal.k1.t2 var2 = new com.aspose.slides.internal.k1.t2();
      long var3 = var1.c4();
      var1.x8().seek(this.n5 + (this.k5 & 4294967295L) + 4L, 0);
      com.aspose.slides.internal.k1.k5 var7;
      if ((var3 & 4294967295L) == 12L) {
         com.aspose.slides.internal.k1.u3 var5 = new com.aspose.slides.internal.k1.u3();
         var5.n5(var3);
         var5.k5(var1.r4());
         var5.u3(var1.r4());
         var5.n5(var1.r4());
         var5.l6(var1.r4() & 65535);
         int var6 = (((var5.u3() & 65535) * (var5.l6() & 65535) * (var5.k5() & 65535) + 31 & -32) >> 3) * q1.n5(var5.u9() & 65535);
         var7 = var5;
      } else {
         com.aspose.slides.internal.k1.a6 var9 = new com.aspose.slides.internal.k1.a6();
         var9.n5(var3);
         var9.k5(var1.m3());
         var9.u3(var1.m3());
         var9.n5(var1.r4());
         var9.l6(var1.r4() & 65535);
         var9.l6(var1.c4() & 4294967295L);
         var9.k5(var1.c4());
         var9.a6(var1.m3());
         var9.u9(var1.m3());
         var9.u3(var1.c4());
         var9.a6(var1.c4());
         switch ((int)var9.h0()) {
            case 0:
            case 3:
            case 11:
               int var12 = ((var9.u3() * (var9.l6() & 65535) * (var9.k5() & 65535) + 31 & -32) >> 3) * q1.n5(var9.u9());
               break;
            default:
               int var11 = (int)var9.c8();
         }

         var7 = var9;
      }

      int var10 = (int)((this.u3 & 4294967295L) - (var1.x8().getPosition() - (this.n5 + (this.k5 & 4294967295L)) & 4294967295L));
      if (var10 > 3) {
         int var8;
         switch (this.h0) {
            case 0:
               var8 = var10 & -4;
               break;
            case 1:
               var8 = var10 & -2;
               break;
            default:
               var8 = 0;
         }

         var2.n5(var1.c8(var8));
      }

      var1.x8().seek(this.n5 + (this.a6 & 4294967295L), 0);
      var2.n5(var7);
      var2.l6(var1.c8((int)this.u9));
      return var2;
   }
}
