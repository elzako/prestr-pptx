package com.aspose.slides.internal.j2;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.n3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.x8;
import com.aspose.slides.internal.z0k.e2;

public class n5 extends com.aspose.slides.internal.h9.n5 {
   @Override
   public void n5(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
   }

   @Override
   public void l6(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
   }

   @Override
   public void n5(s9 var1, com.aspose.slides.internal.r5.n5 var2, com.aspose.slides.internal.r6.u9 var3) {
      var2.u9(var1, var3);
   }

   @Override
   public y2 n5(a0 var1, com.aspose.slides.internal.r6.u9 var2) {
      y1[] var3 = var1.n5(new m1());
      y1 var4 = (var3.length == 0 ? y1.n5 : var3[0]).y4();
      return y1.k5(var4, y1.n5)
         ? y2.n5
         : new y2(
            com.aspose.slides.internal.v6g.k5.u3(var4.x8(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.n3(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.s7(), 13),
            com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13)
         );
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.u3 var1, y2 var2, com.aspose.slides.internal.r6.u9 var3) {
      r4 var4 = r4.n5(y1.n5(var2).y4());
      var4.n5(com.aspose.slides.internal.p1.n5.n5(var3.x9()));
      var4.n5(com.aspose.slides.internal.p1.n5.n5(var1));
      var3.<n3>n5().n5(var4);
   }

   @Override
   public x8 n5(com.aspose.slides.internal.r6.u9 var1) {
      return null;
   }

   @Override
   public void n5(com.aspose.slides.internal.o9b.l6 var1, y2 var2, y2 var3, com.aspose.slides.internal.j9e.t2 var4, com.aspose.slides.internal.r6.u9 var5) {
      e2 var6 = new e2();

      byte[] var7;
      try {
         var1.n5(var6, com.aspose.slides.internal.j9e.x8.s7());
         var7 = var6.toArray();
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }

      com.aspose.slides.internal.e1.t2 var8 = new com.aspose.slides.internal.e1.t2();
      k7 var9 = new k7(j5.n5(var2.a6()).u3(), p8.n5(var2.h0()).a6(), var7);
      var8.n5(var9);
      var8.n5(com.aspose.slides.internal.p1.n5.n5(var5.x9()));
      var5.<n3>n5().n5(var8);
   }

   @Override
   public void n5(x8 var1, com.aspose.slides.internal.r6.u9 var2) {
   }

   @Override
   public a0 l6(com.aspose.slides.internal.r6.u9 var1) {
      return null;
   }

   @Override
   public y1 n5(y2 var1, com.aspose.slides.internal.r6.u9 var2) {
      return y1.n5(var1);
   }
}
