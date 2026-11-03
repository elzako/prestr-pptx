package com.aspose.slides.internal.l1f;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.internal.b8u.h0;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.m3;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.t6q.s7;
import com.aspose.slides.internal.u2w.u9;
import com.aspose.slides.ms.System.d1;

public class u3 implements h0 {
   @Override
   public final m3 n5(v3 var1, d2 var2) {
      com.aspose.slides.internal.v6s.u3 var3 = a6.n5(var1, true);
      u9[] var4 = n5(var1, var3, var2);
      return new com.aspose.slides.internal.u2w.h0(var4);
   }

   private static void n5(com.aspose.slides.internal.f2i.n5 var0, com.aspose.slides.internal.v6s.u3 var1, long var2, long var4) {
      com.aspose.slides.internal.u2w.a6[] var6 = var0.u6();
      long var7 = var6.length & 4294967295L;
      long[] var9 = var0.x8(279);
      long[] var10 = var0.x8(273);
      if (var10 != null && var10.length > 0 && (var10[0] & 4294967295L) != 0L && (var9 == null || var9.length > 0 && (var9[0] & 4294967295L) == 0L)) {
         if (var9 == null) {
            var9 = new long[var10.length];
         }

         long var11 = var1.n5(var4);
         if ((var11 & 4294967295L) == 0L || (var11 & 4294967295L) > var1.n5()) {
            var11 = var1.n5() & 4294967295L;
         }

         if (var0.m3() == 1) {
            long var22 = n5(var0);
            long var19 = com.aspose.slides.internal.u2w.n5.n5(var0) & 4294967295L;

            for (int var25 = 0; var25 < var9.length; var25++) {
               var9[var25] = (var22 & 4294967295L) * (var19 & 4294967295L) & 4294967295L;
            }
         } else {
            long var13 = (((var2 & 4294967295L) + 2L & 4294967295L) + ((var7 & 4294967295L) * 12L & 4294967295L) & 4294967295L) + 4L & 4294967295L;

            for (com.aspose.slides.internal.u2w.a6 var18 : var6) {
               var13 = (var13 & 4294967295L) + (var18.a6() & 4294967295L) & 4294967295L;
            }

            var13 = (var11 & 4294967295L) - (var13 & 4294967295L) & 4294967295L;
            if (var0.y1() == 2) {
               var13 = (var13 & 4294967295L) / (var0.s3() & 65535) & 4294967295L;
            }

            int var23;
            for (var23 = 0; var23 < var9.length; var23++) {
               var9[var23] = var13;
            }

            var23--;
            if (((var10[var23] & 4294967295L) + (var9[var23] & 4294967295L) & 4294967295L) > (var11 & 4294967295L)) {
               var9[var23] = (var11 & 4294967295L) - (var10[var23] & 4294967295L) & 4294967295L;
            }
         }

         var0.n5(var9);
      }
   }

   private static long n5(com.aspose.slides.internal.f2i.n5 var0) {
      int[] var1 = var0.k7();
      if (var1 != null && var1.length != 0) {
         long var7;
         if (var0.y1() == 1) {
            if (var0.y2() == 6) {
               com.aspose.slides.internal.u2w.a6 var2 = var0.s7(530);
               if (var2 == null) {
                  var2 = new y4(530);
                  var2.n5(new int[]{2});
               }

               if (!com.aspose.slides.internal.v6g.k5.l6(var2.h0(), int[].class)) {
                  throw new com.aspose.slides.internal.h6t.u3("Cannot estimate scan line size for YcBcR since YcbcrSubSampling tag is not short type.");
               }

               int[] var3 = com.aspose.slides.internal.v6g.k5.k5(var2.h0(), int[].class);
               if (var3.length == 0) {
                  throw new com.aspose.slides.internal.h6t.u3("Cannot estimate scan line size for YcBcR since YcbcrSubSampling tag contains empty array.");
               }

               int var4 = var3[0];
               if ((var4 & 65535) == 0) {
                  throw new com.aspose.slides.internal.h6t.u3("Cannot estimate scan line size for YcBcR since YcbcrSubSampling tag contains invalid value.");
               }

               long var5 = ((var0.v4() & 4294967295L) + ((var4 & 65535) - 1)) / (var4 & 65535);
               if (var5 > 2147483647L) {
                  var5 = 0L;
               }

               var7 = (var5 & 4294967295L) * (var4 & 65535) & 4294967295L;
               var7 = (((var7 & 4294967295L) * (var1[0] & 65535) & 4294967295L) + 7L & 4294967295L) / 8L & 4294967295L;
               return (var7 & 4294967295L) + (2L * ((var7 & 4294967295L) / (var4 & 65535) & 4294967295L) & 4294967295L) & 4294967295L;
            }

            var7 = (var0.v4() & 4294967295L) * (var0.s3() & 65535) & 4294967295L;
         } else {
            var7 = var0.v4();
         }

         return (((var7 & 4294967295L) * (var1[0] & 65535) & 4294967295L) + 7L & 4294967295L) / 8L & 4294967295L;
      } else {
         throw new com.aspose.slides.internal.h6t.u3("Cannot estimate scan line size for YcBcR since bits per sample is not specified.");
      }
   }

   private static u9[] n5(v3 var0, com.aspose.slides.internal.v6s.u3 var1, d2 var2) {
      List var3 = new List();
      byte[] var4 = null;

      try {
         byte[] var5 = new byte[2];
         var1.n5(var5, 0, 0L, var5.length);
         short var6;
         if ((var5[0] & 255) == 73 && (var5[1] & 255) == 73) {
            var6 = 18761;
         } else {
            if ((var5[0] & 255) != 77 || (var5[1] & 255) != 77) {
               throw new com.aspose.slides.internal.h6t.u3("Tiff file header is corrupted.");
            }

            var6 = 19789;
         }

         long var7 = 4L;

         do {
            var7 = var1.n5(var7) & 4294967295L;
            if (var7 >= var1.n5()) {
               break;
            }

            if (var7 > 0L) {
               var1.n5(false);
               a6$l6 var9 = new a6$l6();

               try {
                  a6.n5(var1, var2, var7).n5(var9);
               } finally {
                  var1.n5(true);
               }

               com.aspose.slides.internal.f2i.n5 var10 = new com.aspose.slides.internal.f2i.n5(var9.n5);
               var10.l6(var6);
               a6$n5 var11 = a6.n5(var9.n5, var1, var7, var2);
               s7 var12 = a6.n5(var9.n5);
               long var13 = var7;
               var7 += 12L * var9.l6 + 2L;
               n5(var10, var1, var13, var7);
               if (var9.n5.length <= 0) {
                  break;
               }

               int var15 = (int)var10.z7();
               int var16 = (int)var10.v4();
               byte[][] var17 = new byte[][]{var4};
               a6.n5(var9.n5, var17);
               var4 = var17[0];
               com.aspose.slides.internal.f2i.n5 var18 = new com.aspose.slides.internal.f2i.n5(var10);
               com.aspose.slides.internal.u2w.u3 var19 = new com.aspose.slides.internal.u2w.u3(var18, var16, var15, var0.k5(), var2);
               com.aspose.slides.internal.q0g.n5.n5(var19.l6(), null, var4, var9.n5);
               u9 var20 = u9.n5(var10, var16, var15, var19);
               var19.n5(var20);
               if (var11.u3()) {
                  com.aspose.slides.internal.d0c.n5 var21 = new com.aspose.slides.internal.d0c.n5();
                  var21.n5(var11.n5());
                  var21.l6(var11.l6());
                  var21.k5(var11.k5());
                  var21.n5(com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.v6s.n5.class));
                  var20.n5(var21);
               }

               var20.n5(var12);
               var3.addItem(var20);
            }
         } while (var7 > 0L);

         u9[] var22 = new u9[var3.size()];
         var3.copyToTArray(var22, 0);
         return var22;
      } catch (RuntimeException var26) {
         throw new com.aspose.slides.internal.z3b.a6(d1.n5(new String[]{"Unable to read file. Exception: ", var26.getMessage()}));
      }
   }
}
