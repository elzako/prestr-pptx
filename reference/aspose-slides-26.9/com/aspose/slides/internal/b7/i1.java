package com.aspose.slides.internal.b7;

import com.aspose.slides.Collections.Generic.List;

class i1 {
   private double n5 = 0.08726646259971647;
   private double l6 = Math.PI * 11.0 / 12.0;
   private double k5 = 0.1;
   private double u3 = 1.0E-30;
   private boolean a6 = true;
   private long u9 = 32L;
   private double h0 = com.aspose.slides.ms.System.q1.a6(4762.5, 2.0);

   public void n5(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4,
      List<com.aspose.slides.internal.o9b.w1>[] var5
   ) {
      List var6 = new List();
      var6.addItem(new com.aspose.slides.internal.o9b.w1(var1.l6(), var1.k5()));
      List[] var7 = new List[]{var6};
      this.n5(var1.l6(), var1.k5(), var2.l6(), var2.k5(), var3.l6(), var3.k5(), var4.l6(), var4.k5(), 0L, var7);
      var6 = var7[0];
      var6.addItem(new com.aspose.slides.internal.o9b.w1(var4.l6(), var4.k5()));
      if (this.a6) {
         double var8 = com.aspose.slides.ms.System.q1.z3(
            com.aspose.slides.ms.System.q1.a6(var1.l6() - var2.l6(), 2.0) + com.aspose.slides.ms.System.q1.a6(var1.k5() - var2.k5(), 2.0)
         );
         double var10 = com.aspose.slides.ms.System.q1.z3(
            com.aspose.slides.ms.System.q1.a6(var4.l6() - var3.l6(), 2.0) + com.aspose.slides.ms.System.q1.a6(var4.k5() - var3.k5(), 2.0)
         );
         double var12 = var8 / var10;
         double var14 = var10 / var8;
         double var16 = 54400.0;
         var7[0] = var6;
         this.n5(var7, com.aspose.slides.internal.v6g.k5.c8(var16 * var12, 14), false);
         var6 = var7[0];
         var7[0] = var6;
         this.n5(var7, com.aspose.slides.internal.v6g.k5.c8(var16 * var14, 14), true);
         var6 = var7[0];
      }

      var5[0].addRange(var6);
   }

   public void n5(boolean var1) {
      this.a6 = var1;
   }

   private void n5(List<com.aspose.slides.internal.o9b.w1>[] var1, float var2, boolean var3) {
      int var4 = var1[0].size();
      if (var4 >= 2) {
         if (!(var2 <= 0.0F)) {
            double var5 = var2 * var2;
            com.aspose.slides.internal.o9b.w1 var7 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1 var8 = new com.aspose.slides.internal.o9b.w1();
            com.aspose.slides.internal.o9b.w1 var9 = new com.aspose.slides.internal.o9b.w1();
            if (var3) {
               int var10 = var4 - 1;
               ((com.aspose.slides.internal.o9b.w1)var1[0].get_Item(var10)).n5(var9);

               while (var10 > 0) {
                  ((com.aspose.slides.internal.o9b.w1)var1[0].get_Item(--var10)).n5(var8);
                  double var11 = com.aspose.slides.ms.System.q1.a6(var8.l6() - var9.l6(), 2.0) + com.aspose.slides.ms.System.q1.a6(var8.k5() - var9.k5(), 2.0);
                  if (var11 > var5) {
                     this.n5(var8.u3(), ((com.aspose.slides.internal.o9b.w1)var1[0].get_Item(var10 + 1)).u3(), var9.u3(), var2).n5(var7);
                     if (var10 + 2 < var1[0].size()) {
                        var1[0].removeRange(var10 + 1, var1[0].size() - 2 - var10);
                     }

                     var1[0].insertItem(var1[0].size() - 1, var7.u3());
                     return;
                  }

                  if (com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var11) - com.aspose.slides.ms.System.q1.n5(var5)) < 1.0E-10) {
                     if (var10 + 2 < var1[0].size()) {
                        var1[0].removeRange(var10 + 1, var1[0].size() - 2 - var10);
                     }

                     return;
                  }
               }
            } else {
               int var13 = 0;
               ((com.aspose.slides.internal.o9b.w1)var1[0].get_Item(var13)).n5(var9);

               while (var13 < var4 - 1) {
                  ((com.aspose.slides.internal.o9b.w1)var1[0].get_Item(++var13)).n5(var8);
                  double var14 = com.aspose.slides.ms.System.q1.a6(var8.l6() - var9.l6(), 2.0) + com.aspose.slides.ms.System.q1.a6(var8.k5() - var9.k5(), 2.0);
                  if (var14 > var5) {
                     this.n5(var8.u3(), ((com.aspose.slides.internal.o9b.w1)var1[0].get_Item(var13 - 1)).u3(), var9.u3(), var2).n5(var7);
                     if (var13 > 1) {
                        var1[0].removeRange(1, var13 - 1);
                     }

                     var1[0].insertItem(1, var7.u3());
                     return;
                  }

                  if (com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.n5(var14) - com.aspose.slides.ms.System.q1.n5(var5)) < 1.0E-10) {
                     if (var13 > 1) {
                        var1[0].removeRange(1, var13 - 1);
                     }

                     return;
                  }
               }
            }

            var1[0].removeRange(1, var1[0].size() - 2);
         }
      }
   }

   private com.aspose.slides.internal.o9b.w1 n5(
      com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3, float var4
   ) {
      com.aspose.slides.internal.o9b.w1[] var5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 2)
      );
      if (com.aspose.slides.ms.System.q1.n5(var1.l6() - var2.l6()) < 1.0E-10) {
         if (com.aspose.slides.ms.System.q1.n5(var1.l6() - var3.l6()) > var4) {
            return var3;
         }

         double var6 = com.aspose.slides.ms.System.q1.z3(var4 * var4 - (var1.l6() - var3.l6()) * (var1.l6() - var3.l6()));
         var5[0] = new com.aspose.slides.internal.o9b.w1(var1.l6(), com.aspose.slides.internal.v6g.k5.c8(var3.k5() - var6, 14));
         var5[1] = new com.aspose.slides.internal.o9b.w1(var1.l6(), com.aspose.slides.internal.v6g.k5.c8(var3.k5() + var6, 14));
      } else {
         double var8 = (var1.k5() - var2.k5()) / (var1.l6() - var2.l6());
         double var10 = var1.k5() - var8 * var1.l6();
         double var12 = com.aspose.slides.ms.System.q1.a6(2.0 * var8 * var10 - 2.0F * var3.l6() - 2.0F * var3.k5() * var8, 2.0)
            - (4.0 + 4.0 * var8 * var8) * (var10 * var10 - var4 * var4 + var3.l6() * var3.l6() + var3.k5() * var3.k5() - 2.0F * var3.k5() * var10);
         if (var12 < 0.0) {
            return var3;
         }

         var12 = com.aspose.slides.ms.System.q1.z3(var12);
         double var14 = (-(2.0 * var8 * var10 - 2.0F * var3.l6() - 2.0F * var3.k5() * var8) + var12) / (2.0 + 2.0 * var8 * var8);
         double var20 = var8 * var14 + var10;
         if (com.aspose.slides.ms.System.q1.n5(var12) < 1.0E-10) {
            return new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var14, 14), com.aspose.slides.internal.v6g.k5.c8(var20, 14));
         }

         var5[0] = new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var14, 14), com.aspose.slides.internal.v6g.k5.c8(var20, 14));
         var14 = (-(2.0 * var8 * var10 - 2.0F * var3.l6() - 2.0F * var3.k5() * var8) - var12) / (2.0 + 2.0 * var8 * var8);
         var20 = var8 * var14 + var10;
         var5[1] = new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var14, 14), com.aspose.slides.internal.v6g.k5.c8(var20, 14));
      }

      double var16 = com.aspose.slides.ms.System.q1.a6(var5[0].l6() - var1.l6(), 2.0)
         + com.aspose.slides.ms.System.q1.a6(var5[0].k5() - var1.k5(), 2.0)
         + com.aspose.slides.ms.System.q1.a6(var5[0].l6() - var2.l6(), 2.0)
         + com.aspose.slides.ms.System.q1.a6(var5[0].k5() - var2.k5(), 2.0);
      double var18 = com.aspose.slides.ms.System.q1.a6(var5[1].l6() - var1.l6(), 2.0)
         + com.aspose.slides.ms.System.q1.a6(var5[1].k5() - var1.k5(), 2.0)
         + com.aspose.slides.ms.System.q1.a6(var5[1].l6() - var2.l6(), 2.0)
         + com.aspose.slides.ms.System.q1.a6(var5[1].k5() - var2.k5(), 2.0);
      return var16 < var18 ? var5[0] : var5[1];
   }

   private void n5(
      double var1,
      double var3,
      double var5,
      double var7,
      double var9,
      double var11,
      double var13,
      double var15,
      long var17,
      List<com.aspose.slides.internal.o9b.w1>[] var19
   ) {
      if (var17 <= this.u9) {
         double var20 = (var1 + var5) / 2.0;
         double var22 = (var3 + var7) / 2.0;
         double var24 = (var5 + var9) / 2.0;
         double var26 = (var7 + var11) / 2.0;
         double var28 = (var9 + var13) / 2.0;
         double var30 = (var11 + var15) / 2.0;
         double var32 = (var20 + var24) / 2.0;
         double var34 = (var22 + var26) / 2.0;
         double var36 = (var24 + var28) / 2.0;
         double var38 = (var26 + var30) / 2.0;
         double var40 = (var32 + var36) / 2.0;
         double var42 = (var34 + var38) / 2.0;
         if (var17 > 0L) {
            double var44 = var13 - var1;
            double var46 = var15 - var3;
            double var48 = com.aspose.slides.ms.System.q1.n5((var5 - var13) * var46 - (var7 - var15) * var44);
            double var50 = com.aspose.slides.ms.System.q1.n5((var9 - var13) * var46 - (var11 - var15) * var44);
            if (var48 > this.u3 && var50 > this.u3) {
               if ((var48 + var50) * (var48 + var50) <= this.h0 * (var44 * var44 + var46 * var46)) {
                  if (this.n5 < this.k5) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var40, 14), com.aspose.slides.internal.v6g.k5.c8(var42, 14)
                           )
                        );
                     return;
                  }

                  double var52 = com.aspose.slides.ms.System.q1.u3(var11 - var7, var9 - var5);
                  double var61 = com.aspose.slides.ms.System.q1.n5(var52 - com.aspose.slides.ms.System.q1.u3(var7 - var3, var5 - var1));
                  double var56 = com.aspose.slides.ms.System.q1.n5(com.aspose.slides.ms.System.q1.u3(var15 - var11, var13 - var9) - var52);
                  if (var61 >= Math.PI) {
                     var61 = (Math.PI * 2) - var61;
                  }

                  if (var56 >= Math.PI) {
                     var56 = (Math.PI * 2) - var56;
                  }

                  if (var61 + var56 < this.n5) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var40, 14), com.aspose.slides.internal.v6g.k5.c8(var42, 14)
                           )
                        );
                     return;
                  }

                  if (com.aspose.slides.ms.System.q1.n5(this.l6) > 1.0E-10) {
                     if (var61 > this.l6) {
                        var19[0]
                           .addItem(
                              new com.aspose.slides.internal.o9b.w1(
                                 com.aspose.slides.internal.v6g.k5.c8(var5, 14), com.aspose.slides.internal.v6g.k5.c8(var7, 14)
                              )
                           );
                        return;
                     }

                     if (var56 > this.l6) {
                        var19[0]
                           .addItem(
                              new com.aspose.slides.internal.o9b.w1(
                                 com.aspose.slides.internal.v6g.k5.c8(var9, 14), com.aspose.slides.internal.v6g.k5.c8(var11, 14)
                              )
                           );
                        return;
                     }
                  }
               }
            } else if (var48 > this.u3) {
               if (var48 * var48 <= this.h0 * (var44 * var44 + var46 * var46)) {
                  if (this.n5 < this.k5) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var40, 14), com.aspose.slides.internal.v6g.k5.c8(var42, 14)
                           )
                        );
                     return;
                  }

                  double var54 = com.aspose.slides.ms.System.q1.n5(
                     com.aspose.slides.ms.System.q1.u3(var11 - var7, var9 - var5) - com.aspose.slides.ms.System.q1.u3(var7 - var3, var5 - var1)
                  );
                  if (var54 >= Math.PI) {
                     var54 = (Math.PI * 2) - var54;
                  }

                  if (var54 < this.n5) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var5, 14), com.aspose.slides.internal.v6g.k5.c8(var7, 14))
                        );
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var9, 14), com.aspose.slides.internal.v6g.k5.c8(var11, 14)
                           )
                        );
                     return;
                  }

                  if (com.aspose.slides.ms.System.q1.n5(this.l6) > 1.0E-10 && var54 > this.l6) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var5, 14), com.aspose.slides.internal.v6g.k5.c8(var7, 14))
                        );
                     return;
                  }
               }
            } else if (var50 > this.u3) {
               if (var50 * var50 <= this.h0 * (var44 * var44 + var46 * var46)) {
                  if (this.n5 < this.k5) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var40, 14), com.aspose.slides.internal.v6g.k5.c8(var42, 14)
                           )
                        );
                     return;
                  }

                  double var60 = com.aspose.slides.ms.System.q1.n5(
                     com.aspose.slides.ms.System.q1.u3(var15 - var11, var13 - var9) - com.aspose.slides.ms.System.q1.u3(var11 - var7, var9 - var5)
                  );
                  if (var60 >= Math.PI) {
                     var60 = (Math.PI * 2) - var60;
                  }

                  if (var60 < this.n5) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var5, 14), com.aspose.slides.internal.v6g.k5.c8(var7, 14))
                        );
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var9, 14), com.aspose.slides.internal.v6g.k5.c8(var11, 14)
                           )
                        );
                     return;
                  }

                  if (com.aspose.slides.ms.System.q1.n5(this.l6) > 1.0E-10 && var60 > this.l6) {
                     var19[0]
                        .addItem(
                           new com.aspose.slides.internal.o9b.w1(
                              com.aspose.slides.internal.v6g.k5.c8(var9, 14), com.aspose.slides.internal.v6g.k5.c8(var11, 14)
                           )
                        );
                     return;
                  }
               }
            } else {
               var44 = var40 - (var1 + var13) / 2.0;
               var46 = var42 - (var3 + var15) / 2.0;
               if (var44 * var44 + var46 * var46 <= this.h0) {
                  var19[0]
                     .addItem(
                        new com.aspose.slides.internal.o9b.w1(com.aspose.slides.internal.v6g.k5.c8(var40, 14), com.aspose.slides.internal.v6g.k5.c8(var42, 14))
                     );
                  return;
               }
            }
         }

         this.n5(var1, var3, var20, var22, var32, var34, var40, var42, var17 + 1L, var19);
         this.n5(var40, var42, var36, var38, var28, var30, var13, var15, var17 + 1L, var19);
      }
   }
}
