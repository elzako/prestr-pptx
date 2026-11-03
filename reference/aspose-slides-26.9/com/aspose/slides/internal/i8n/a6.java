package com.aspose.slides.internal.i8n;

import com.aspose.slides.internal.f4l.c4;
import com.aspose.slides.internal.f4l.e9;
import com.aspose.slides.internal.f4l.o5;
import com.aspose.slides.internal.f4l.r4;
import com.aspose.slides.internal.f4l.w1;
import com.aspose.slides.internal.f4l.z6;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.x4g.s7;

public class a6 {
   public static m3 n5(z6 var0) {
      m3 var1 = new m3(n5.n5(var0.l6()));
      e9 var2 = var0.n5();
      float var3 = var2.k5();
      var3 = (float)com.aspose.slides.internal.r5w.n5.n5(var2.l6(), 2, (double)var3);
      var1.k5(var3);
      o5 var4 = var2.u3();
      if (var4 != null) {
         int var5 = var2.n5();
         if ((var5 & 1) > 0) {
            var1.n5(k5.n5(var4.n5()));
         }

         if ((var5 & 2) > 0) {
            var1.u3(var4.l6());
         }

         if ((var5 & 4) > 0) {
            var1.a6(var4.k5());
         }

         if ((var5 & 8) > 0) {
            var1.u9(var4.u3());
         }

         if ((var5 & 16) > 0) {
            var1.l6(var4.a6());
         }

         if ((var5 & 32) > 0) {
            var1.k5(var4.u9());
         }

         if ((var5 & 64) > 0) {
            var1.l6(var4.h0());
         }

         if ((var5 & 128) > 0) {
            var1.n5(var4.c8());
         }

         if ((var5 & 256) > 0) {
            var1.l6(var4.t2().n5());
         }

         if ((var5 & 512) > 0) {
            var1.n5(var4.s7());
         }

         if ((var5 & 1024) > 0) {
            var1.n5(var4.x8().n5());
         }

         if ((var5 & 2048) > 0) {
            var1.l6(n5(var4.n3().n5()));
         }

         if ((var5 & 4096) > 0) {
            var1.n5(n5(var4.y4().n5()));
         }
      }

      return var1;
   }

   private static com.aspose.slides.internal.x4g.u9 n5(w1 var0) {
      switch (var0.n5()) {
         case 0:
            c4 var1 = (c4)var0.l6();
            return n5(var1);
         case 1:
            r4 var2 = (r4)var0.l6();
            n5(var2);
         default:
            throw new IllegalArgumentException("Unexpected type of CustomLineCap: " + var0.n5());
      }
   }

   private static com.aspose.slides.internal.x4g.u9 n5(c4 var0) {
      s7 var1 = var0.c8() != null && var0.c8().n5() != null ? u3.n5(var0.c8().n5().n5()) : null;
      s7 var2 = var0.c8() != null && var0.c8().l6() != null ? u3.n5(var0.c8().l6().n5()) : null;
      com.aspose.slides.internal.x4g.u9 var3 = new com.aspose.slides.internal.x4g.u9(var1, var2);
      var3.n5(var0.l6());
      var3.u3(var0.k5());
      var3.n5(var0.u3(), var0.a6());
      var3.l6(var0.u9());
      var3.a6(var0.h0());
      return var3;
   }

   private static com.aspose.slides.internal.x4g.l6 n5(r4 var0) {
      com.aspose.slides.internal.x4g.l6 var1 = new com.aspose.slides.internal.x4g.l6(var0.n5(), var0.l6(), var0.u3());
      var1.l6(var0.k5());
      var1.n5(var0.a6(), var0.u9());
      var1.l6(var0.h0());
      var1.a6(var0.c8());
      var1.a6(var0.c8());
      return var1;
   }
}
