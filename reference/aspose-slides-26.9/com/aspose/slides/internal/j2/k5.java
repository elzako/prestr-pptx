package com.aspose.slides.internal.j2;

import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.j9e.x8;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.z0k.e2;

public class k5 extends com.aspose.slides.internal.h9.k5 {
   public k5(com.aspose.slides.internal.h9.n5 var1) {
      super(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.b9.a6 var1, com.aspose.slides.internal.r6.u9 var2) {
      y2 var3 = new y2(var1.c8(), var1.t2(), var1.u3(), var1.u9());
      y2 var4 = new y2(var1.l6(), var1.k5(), var1.u3(), var1.u9());
      com.aspose.slides.internal.o9b.l6 var5 = var1.t4() != null ? var1.t4().l6(var2.x8()) : null;
      if (var5 != null) {
         e2 var6 = new e2();

         byte[] var7;
         try {
            var5.n5(var6, x8.s7());
            var7 = var6.toArray();
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }

         com.aspose.slides.internal.e1.t2 var8 = new com.aspose.slides.internal.e1.t2();
         k7 var9 = new k7(j5.n5(var4.a6()).u3(), p8.n5(var4.h0()).a6(), var7);
         var8.n5(var9);
         var8.n5(com.aspose.slides.internal.p1.n5.n5(var2.x9()));
         var2.<n3>n5().n5(var8);
      }

      long var10 = var1.h0();
      if (!n5(var10, var4.n3(), var2)) {
         if (!l6(var10, var4.n3(), var2)) {
            this.n5(var10, var5, var3.n3(), var4.n3(), com.aspose.slides.internal.o9b.c8.u3.o8(), var1.s7().c8(), var2);
         }
      }
   }

   private static boolean n5(long var0, y2 var2, com.aspose.slides.internal.r6.u9 var3) {
      if (var0 != 90L) {
         return false;
      }

      i1 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.t2(), i1.class);
      if (var4 == null) {
         return false;
      }

      y2 var5 = n5(var2.n3(), var3).n3();
      if (var5.k5()) {
         return true;
      }

      var3.o5().n5(var5.n3(), var4.h0().h0() & 4294967295L);
      return true;
   }

   private static boolean l6(long var0, y2 var2, com.aspose.slides.internal.r6.u9 var3) {
      if (var0 != 160L) {
         return false;
      }

      u6 var4 = com.aspose.slides.internal.v6g.k5.n5(var3.t2(), u6.class);
      if (var4 == null) {
         return false;
      }

      y2 var5 = n5(var2.n3(), var3).n3();
      if (var5.k5()) {
         return true;
      }

      com.aspose.slides.internal.o9b.l6 var6 = com.aspose.slides.internal.v6g.k5.n5(var4.h0(), com.aspose.slides.internal.o9b.l6.class);
      if (var6 == null) {
         return false;
      }

      var3.o5().n5(var5.n3(), var6);
      return true;
   }

   private static y2 n5(y2 var0, com.aspose.slides.internal.r6.u9 var1) {
      m1 var2 = var1.x9();
      y1 var3 = n5(y1.n5(var0).y4(), var2).y4();
      a0 var4 = var1.v0();
      if (var4 == null) {
         return y2.l6(var3.y4());
      }

      y1 var5 = n5(var4).y4();
      if (var5.u3()) {
         return y2.n5;
      }

      y1 var6 = y1.n5(var3.y4(), var5.y4()).y4();
      return var6.u3() ? y2.n5 : y2.l6(var6.y4());
   }

   private static y1 n5(a0 var0) {
      com.aspose.slides.internal.o9b.l6 var1 = new com.aspose.slides.internal.o9b.l6(1, 1);

      try {
         z1 var2 = z1.n5(var1);

         try {
            return var0.n5(var2);
         } finally {
            if (var2 != null) {
               var2.dispose();
            }
         }
      } finally {
         if (var1 != null) {
            var1.dispose();
         }
      }
   }

   private static y1 n5(y1 var0, m1 var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 4));
      var2[0] = new w1(var0.a6(), var0.t2());
      var2[1] = new w1(var0.h0(), var0.t2());
      var2[2] = new w1(var0.h0(), var0.l6());
      var2[3] = new w1(var0.a6(), var0.l6());
      var1.n5(var2);
      float var3 = var2[0].l6();
      float var4 = var2[0].k5();
      float var5 = var2[0].l6();
      float var6 = var2[0].k5();

      for (int var7 = 1; var7 < 4; var7++) {
         float var8 = var2[var7].l6();
         float var9 = var2[var7].k5();
         if (var8 < var3) {
            var3 = var8;
         }

         if (var9 < var4) {
            var4 = var9;
         }

         if (var8 > var5) {
            var5 = var8;
         }

         if (var9 > var6) {
            var6 = var9;
         }
      }

      return y1.n5(var3, var4, var5, var6);
   }
}
