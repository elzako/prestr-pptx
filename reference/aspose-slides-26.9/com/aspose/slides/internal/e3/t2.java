package com.aspose.slides.internal.e3;

import com.aspose.slides.internal.o9b.y1;

public class t2 extends com.aspose.slides.internal.k6.s7 {
   private final com.aspose.slides.internal.k6.n5 n5 = new n5(this);

   @Override
   public com.aspose.slides.internal.k6.n5 n5() {
      return this.n5;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a4.y4 var1, com.aspose.slides.internal.x3.a6 var2) {
      com.aspose.slides.internal.l5.c8 var3 = var2.e2();
      y1 var4 = var1.t2().n5().y4();
      com.aspose.slides.internal.e1.t2 var5 = new com.aspose.slides.internal.e1.t2();
      byte[] var7;
      if (com.aspose.slides.internal.v6g.k5.l6(var3, com.aspose.slides.internal.l5.u3.class)) {
         com.aspose.slides.internal.z0k.e2 var6 = new com.aspose.slides.internal.z0k.e2();

         try {
            ((com.aspose.slides.internal.l5.u3)var3).n5().n5(var6, com.aspose.slides.internal.j9e.x8.s7());
            var7 = var6.toArray();
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      } else {
         com.aspose.slides.internal.o9b.l6 var33 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(var4.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13)
         );

         try {
            com.aspose.slides.internal.o9b.z1 var8 = com.aspose.slides.internal.o9b.z1.n5(var33);

            try {
               com.aspose.slides.internal.o1.k5 var9 = com.aspose.slides.internal.o1.k5.n5((com.aspose.slides.internal.y6.l6)var3);
               var9.n5(var2.m1());
               var9.n5(var8);
            } finally {
               if (var8 != null) {
                  var8.dispose();
               }
            }

            com.aspose.slides.internal.z0k.e2 var35 = new com.aspose.slides.internal.z0k.e2();

            try {
               var33.n5(var35, com.aspose.slides.internal.j9e.x8.s7());
               var7 = var35.toArray();
            } finally {
               if (var35 != null) {
                  var35.dispose();
               }
            }
         } finally {
            if (var33 != null) {
               var33.dispose();
            }
         }
      }

      com.aspose.slides.internal.e1.k7 var34 = new com.aspose.slides.internal.e1.k7(var4.u9().u3(), var4.c8().a6(), var7);
      var5.n5(var34);
      var5.n5(com.aspose.slides.internal.p1.n5.n5(var2.z1()));
      var2.<com.aspose.slides.internal.e1.n3>n5().n5(var5);
   }
}
