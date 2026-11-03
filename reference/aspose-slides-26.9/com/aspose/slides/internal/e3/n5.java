package com.aspose.slides.internal.e3;

import com.aspose.slides.internal.a4.b3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;

public class n5 extends com.aspose.slides.internal.k6.n5 {
   public n5(com.aspose.slides.internal.k6.l6 var1) {
      super(var1);
   }

   @Override
   public void n5(b3 var1, com.aspose.slides.internal.x3.a6 var2) {
      this.n5.n5(var1, var2);
   }

   @Override
   public void n5(
      com.aspose.slides.internal.o9b.t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5, com.aspose.slides.internal.x3.a6 var6
   ) {
      y2 var7 = com.aspose.slides.internal.p1.n5.n5(var3.y4()).n3();
      com.aspose.slides.internal.z0k.e2 var8 = new com.aspose.slides.internal.z0k.e2();

      byte[] var11;
      try {
         com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var1);

         try {
            com.aspose.slides.internal.o9b.l6 var10 = var9.n5(var7.n3(), var9.s7());

            try {
               var10.n5(var8, com.aspose.slides.internal.j9e.x8.s7());
               var11 = var8.toArray();
            } finally {
               if (var10 != null) {
                  var10.dispose();
               }
            }
         } finally {
            if (var9 != null) {
               var9.dispose();
            }
         }
      } finally {
         if (var8 != null) {
            var8.dispose();
         }
      }

      com.aspose.slides.internal.e1.t2 var27 = new com.aspose.slides.internal.e1.t2();
      var27.n5(com.aspose.slides.internal.p1.n5.n5(var6.z1()));
      com.aspose.slides.internal.e1.t2 var28 = new com.aspose.slides.internal.e1.t2();
      var28.n5(com.aspose.slides.internal.p1.n5.n5(var6.z1()));
      w1 var12 = var2[0].u3();
      f2 var13 = new f2(var2[1].l6() - var12.l6(), var2[2].k5() - var12.k5());
      com.aspose.slides.internal.e1.k7 var14 = new com.aspose.slides.internal.e1.k7(var12.u3(), var13.a6(), var11);
      var28.n5(var14);
      var27.n5(var28);
      var6.<com.aspose.slides.internal.e1.n3>n5().n5(var28);
   }

   @Override
   public void n5(com.aspose.slides.internal.y6.l6 var1, w1[] var2, com.aspose.slides.internal.x4g.m1 var3, y1 var4, com.aspose.slides.internal.x3.a6 var5) {
      com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

      try {
         var1.a_(var6);
         var6.seek(0L, 0);
         com.aspose.slides.internal.y3.u3 var7 = new com.aspose.slides.internal.y3.u3(var6);
         y1 var8 = com.aspose.slides.internal.p1.n5.n5(var1.k5().n3()).y4();
         com.aspose.slides.internal.e1.t2 var9 = com.aspose.slides.internal.g0.n5.n5(
            var7, var8.c8().a6(), var4.y4(), new com.aspose.slides.internal.g0.k5(), new y1(w1.n5.u3(), var7.q0().a6())
         );
         var9.n5(com.aspose.slides.internal.p1.n5.n5(var3));
         com.aspose.slides.internal.e1.t2 var10 = var5.n5();
         var10.n5(var9);
         var5.n5(var10.y2());
      } finally {
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   @Override
   public void n5(y1 var1, com.aspose.slides.internal.x4g.m1 var2, int var3, com.aspose.slides.internal.x3.a6 var4) {
      com.aspose.slides.internal.e1.t2 var5 = new com.aspose.slides.internal.e1.t2();
      var5.n5(r4.n5(var1.y4()));
      var5.n5(com.aspose.slides.internal.p1.n5.n5(var4.z1()));
      var4.<com.aspose.slides.internal.e1.n3>n5().n5(var5);
      var4.n5(var5);
   }
}
