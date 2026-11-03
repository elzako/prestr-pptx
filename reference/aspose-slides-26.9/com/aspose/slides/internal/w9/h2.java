package com.aspose.slides.internal.w9;

import com.aspose.slides.exceptions.Exception;

public class h2 {
   public static boolean n5(com.aspose.slides.internal.b9.s9[] var0, com.aspose.slides.internal.z0k.t4 var1) {
      try {
         long var2 = 0L;
         if (var0[0].y2() >= 88) {
            var2 = var0[0].y2() & 4294967295L;
            long var4 = var1.getPosition() - 8L;
            com.aspose.slides.internal.b9.o5 var6 = new com.aspose.slides.internal.b9.o5(var0[0]);
            com.aspose.slides.internal.z0k.n5 var7 = new com.aspose.slides.internal.z0k.n5(var1);
            var6.n5().u3().n5(var7.m3());
            var6.n5().u3().l6(var7.m3());
            var6.n5().u3().k5(var7.m3());
            var6.n5().u3().u3(var7.m3());
            var6.n5().u9().n5(var7.m3());
            var6.n5().u9().l6(var7.m3());
            var6.n5().u9().k5(var7.m3());
            var6.n5().u9().u3(var7.m3());
            var6.n5().n5(var7.m3());
            var6.n5().u3(var7.c4());
            var6.n5().a6(var7.c4());
            var6.n5().u9(var7.c4());
            var6.n5().l6(var7.r4());
            var6.n5().k5(var7.r4());
            var6.n5().h0(var7.c4());
            var6.n5().c8(var7.c4());
            var6.n5().t2(var7.c4());
            var6.n5().z1().n5(var7.c4());
            var6.n5().z1().l6(var7.c4());
            var6.n5().t4().n5(var7.c4());
            var6.n5().t4().l6(var7.c4());
            if ((var6.n5().e2() & 4294967295L) >= 88L
               && ((var6.n5().e2() & 4294967295L) + ((var6.n5().y4() & 4294967295L) * 2L & 4294967295L) & 4294967295L) <= var0[0].y2()) {
               var2 = var6.n5().e2();
            }

            if ((var2 & 4294967295L) >= 100L) {
               var6 = new com.aspose.slides.internal.b9.j8(var6);
               com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.b9.j8.class).u9().n5(var7.c4());
               com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.b9.j8.class).u9().l6(var7.c4());
               com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.b9.j8.class).u9().k5(var7.c4());
               if ((var2 & 4294967295L) >= 108L) {
                  var6 = new com.aspose.slides.internal.b9.w2((com.aspose.slides.internal.b9.j8)var6);
                  com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.b9.w2.class).c8().n5(var7.c4());
                  com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.b9.w2.class).c8().l6(var7.c4());
               }
            }

            if ((var6.n5().e2() & 4294967295L) > 0L) {
               var1.seek(var4 + (var6.n5().e2() & 4294967295L), 0);
               byte[] var8 = var7.c8((int)((var6.n5().y4() & 4294967295L) * 2L));
               var6.n5(com.aspose.slides.internal.l7h.j5.e2().l6(var8));
            } else {
               var6.n5("");
            }

            int var12 = (int)(var4 + var0[0].y2() - var1.getPosition());
            if (var12 > 0) {
               var1.seek(var12, 1);
            } else if (var12 < 0) {
               throw new com.aspose.slides.internal.p5.n5("Readed more bytes than the record size.");
            }

            var0[0] = var6;
         }

         return false;
      } catch (RuntimeException var10) {
         com.aspose.slides.internal.f8y.x8.n5(com.aspose.slides.ms.System.d1.n5(new String[]{"Exception at EmfHeaderReader ", var10.getMessage()}));
         throw new Exception("EmfHeaderReaderException");
      }
   }
}
