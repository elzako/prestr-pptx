package com.aspose.slides.internal.n2;

public class h2 extends com.aspose.slides.internal.s2.n5 {
   @Override
   public boolean l6(com.aspose.slides.internal.b9.s9 var1, com.aspose.slides.internal.z0k.l6 var2) {
      long var3 = var2.n5().getPosition();
      n5(var1, var2);
      boolean var5 = true;

      try {
         long var6 = 0L;
         if (var1.y2() >= 88) {
            var6 = var1.y2() & 4294967295L;
            com.aspose.slides.internal.b9.o5 var8 = (com.aspose.slides.internal.b9.o5)var1;
            var2.l6(var8.n5().u3().n5());
            var2.l6(var8.n5().u3().l6());
            var2.l6(var8.n5().u3().k5());
            var2.l6(var8.n5().u3().u3());
            var2.l6(var8.n5().u9().n5());
            var2.l6(var8.n5().u9().l6());
            var2.l6(var8.n5().u9().k5());
            var2.l6(var8.n5().u9().u3());
            var2.l6(var8.n5().h0());
            var2.n5(var8.n5().c8() & 4294967295L);
            var2.n5(var8.n5().t2() & 4294967295L);
            var2.n5(var8.n5().s7() & 4294967295L);
            var2.n5(var8.n5().x8() & 65535);
            var2.n5(var8.n5().n3() & 65535);
            var2.n5(var8.n5().y4() & 4294967295L);
            var2.n5(var8.n5().e2() & 4294967295L);
            var2.n5(var8.n5().t9() & 4294967295L);
            var2.n5(var8.n5().z1().n5() & 4294967295L);
            var2.n5(var8.n5().z1().l6() & 4294967295L);
            var2.n5(var8.n5().t4().n5() & 4294967295L);
            var2.n5(var8.n5().t4().l6() & 4294967295L);
            if ((var8.n5().e2() & 4294967295L) >= 88L
               && ((var8.n5().e2() & 4294967295L) + ((var8.n5().y4() & 4294967295L) * 2L & 4294967295L) & 4294967295L) <= var1.y2()) {
               var6 = var8.n5().e2();
            }

            if ((var6 & 4294967295L) >= 100L) {
               com.aspose.slides.internal.b9.j8 var9 = (com.aspose.slides.internal.b9.j8)var8;
               var2.n5(var9.u9().n5() & 4294967295L);
               var2.n5(var9.u9().l6() & 4294967295L);
               var2.n5(var9.u9().k5() & 4294967295L);
               if ((var6 & 4294967295L) >= 108L) {
                  com.aspose.slides.internal.b9.w2 var10 = (com.aspose.slides.internal.b9.w2)var9;
                  var2.n5(var10.c8().n5() & 4294967295L);
                  var2.n5(var10.c8().l6() & 4294967295L);
               }
            }

            if ((var8.n5().e2() & 4294967295L) > 0L && !com.aspose.slides.ms.System.d1.n5(var8.u3())) {
               var2.n5((int)(var3 + (var8.n5().e2() & 4294967295L)), 0);
               byte[] var14 = com.aspose.slides.internal.l7h.j5.e2().u3(var8.u3());
               var2.n5(var14);
            }

            int var15 = (int)(var3 + var1.y2() - var2.n5().getPosition());
            if (var15 > 0) {
               var2.n5(var15, 1);
            } else if (var15 < 0) {
               throw new com.aspose.slides.internal.p5.n5("Writeed more bytes than the record size.");
            }
         }
      } catch (RuntimeException var12) {
         var5 = false;
      }

      return var5;
   }
}
