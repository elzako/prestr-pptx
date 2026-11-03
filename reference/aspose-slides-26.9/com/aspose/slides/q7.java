package com.aspose.slides;

class q7 {
   private IBlurEffectiveData n5;

   public q7(IBlurEffectiveData var1) {
      this.n5 = var1;
   }

   final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, ShapeFrame var5) {
      if (this.n5.getRadius() != 0.0) {
         if (var3 != null && var3.u3() != 0 || var4 != null && var4.u9()) {
            var2 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
            float var6 = var4 != null && var4.u9() ? (float)var4.n5() : 0.0F;
            boolean var7 = this.n5.getGrow();
            double var8 = this.n5.getRadius();
            com.aspose.slides.internal.o9b.y1 var10 = var2.s7().y4();
            com.aspose.slides.internal.o9b.w1 var11 = com.aspose.slides.internal.o9b.w1.n5.u3();
            if (var7) {
               var11 = new com.aspose.slides.internal.o9b.w1(var10.x8() - (var6 / 2.0F + (float)var8), var10.n3() - (var6 / 2.0F + (float)var8));
            } else {
               var11 = new com.aspose.slides.internal.o9b.w1(var10.x8() - (var6 / 2.0F + 1.0F), var10.n3() - (var6 / 2.0F + 1.0F));
            }

            com.aspose.slides.internal.x4g.m1 var12 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var11.l6(), -var11.k5());
            var2.l6(var12);
            com.aspose.slides.internal.o9b.l6 var13 = null;

            try {
               if (var7) {
                  var13 = new com.aspose.slides.internal.o9b.l6(
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var10.s7() + var6 + 2.0 * var8), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6(var10.k5() + var6 + 2.0 * var8), 14),
                     2498570
                  );
               } else {
                  var13 = new com.aspose.slides.internal.o9b.l6(
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var10.s7() + var6 + 1.0F)), 14),
                     com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)(var10.k5() + var6 + 1.0F)), 14),
                     2498570
                  );
               }

               if (var1.y1() != null) {
                  var13.n5(var1.y1().y4(), var1.y1().c8());
               }

               com.aspose.slides.internal.o9b.z1 var14 = com.aspose.slides.internal.o9b.z1.n5(var13);

               try {
                  if (var1.a0() != null) {
                     var14.u9(1);
                     var14.n5(var1.a0().y4());
                     var14.u3(var1.a0().e2());
                  }

                  var14.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
                  com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1();
                  var15.n5(var12, 1);
                  if (var3 != null && var3.u3() != 0) {
                     com.aspose.slides.internal.o9b.u3 var16 = d4.k5(var3);

                     try {
                        com.aspose.slides.internal.x4g.m1 var17 = n2d.n5(var16);
                        var17.n5(var15, 1);
                        n2d.n5(var16, var17);
                        var14.n5(var16, var2);
                     } finally {
                        if (var16 != null) {
                           var16.dispose();
                        }
                     }
                  }

                  if (var4 != null && var4.u9()) {
                     com.aspose.slides.internal.o9b.m3 var46 = var4.q0();

                     try {
                        com.aspose.slides.internal.x4g.m1 var47 = var46.t4();
                        var47.n5(var15, 1);
                        var46.n5(var47);
                        var14.n5(var46, var2);
                     } finally {
                        if (var46 != null) {
                           var46.dispose();
                        }
                     }
                  }
               } finally {
                  if (var14 != null) {
                     var14.dispose();
                  }
               }

               n2d.n5(var13, com.aspose.slides.internal.o9b.c8.n5(0, 128, 128, 128).o8());
               if (!var7 && var8 > 4.0 && var13.h0() > 2 && var13.e2() > 2) {
                  n2d.n5(var13, (byte)0, 1);
               }

               double var21 = 0.3333333333333333;
               if (var8 <= 8.0) {
                  x9p.n5(var13, var8 * var21, 4);
               } else {
                  x9p.n5(var13, var8 * var21, 3);
               }

               var1.n5(
                  var13,
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var11.l6()), 14),
                  com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.l6((double)var11.k5()), 14)
               );
            } finally {
               var2.dispose();
               if (var13 != null) {
                  var13.dispose();
               }
            }
         }
      }
   }
}
