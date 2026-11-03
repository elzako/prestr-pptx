package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.ms.System.IDisposable;

class v6s extends d5 {
   public final void c8(k6a var1) {
      e4c var2 = this.n3(var1).u9();
      this.n5(var1, true, null);
      List$Enumerator var3 = var1.l6().iterator();

      try {
         for (; var3.hasNext(); this.n5(var1, true, null)) {
            k6a var4 = (k6a)var3.next();
            e4c var5 = k5(var4, var2.u9()).u9();
            var4.c8().k5(var5.n5);
            var4.c8().u9(var5.l6);
            double var6 = var2.n5 / var5.n5;
            double var8 = var2.l6 / var5.l6;
            double var10 = com.aspose.slides.ms.System.q1.k5(var6, var8);
            if (!var4.l6(61) && com.aspose.slides.internal.v6g.k5.l6(var4.s7(), x3z.class)) {
               var4.k5(61, var5.n5);
            }

            if (!var4.l6(15) && com.aspose.slides.internal.v6g.k5.l6(var4.s7(), x3z.class)) {
               var4.k5(15, var5.l6);
            }

            if (n5(var10)) {
               if (var4.s7().a6()) {
                  if (var4.l6(61)) {
                     var4.n5(61, var4.n5(61) * var10);
                  }

                  if (var4.l6(15)) {
                     var4.n5(15, var4.n5(15) * var10);
                  }
               } else if (var1.n5() == null) {
                  if (var4.l6(61) && n5(var6)) {
                     var4.n5(61, var4.n5(61) * var6);
                  }

                  if (var4.l6(15) && n5(var8)) {
                     var4.n5(15, var4.n5(15) * var8);
                  }
               }

               k5(var4, var2.u9()).l6(var5);
               var4.c8().k5(var5.n5);
               var4.c8().u9(var5.l6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   public boolean u9(k6a var1) {
      return this.n5(var1, false, null);
   }

   @Override
   public boolean n5(k6a var1) {
      e4c var2 = this.n3(var1).u9();
      List var3 = new List();
      List$Enumerator var4 = var1.l6().iterator();

      try {
         while (var4.hasNext()) {
            k6a var5 = (k6a)var4.next();
            this.n5(var1, false, var3);
            this.l6(var5, var2.u9());
            var3.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      u6x var14 = n5(var1, (k6a)null).z1();
      var1.c8().a6(var14.t2());
      var1.c8().c8(var14.s7());
      var1.c8().k5(var14.t2());
      var1.c8().u9(var14.s7());
      this.t2(var1);
      this.s7(var1);
      this.x8(var1);
      var1.c8().z7();
      l6(var1, this.c8().n5(), this.c8().l6());
      e4c var6 = new e4c(var1.u3(61), var1.u3(15));
      if (this.n5(var1, var6.u9())) {
         var1.w1();
         return false;
      }

      if (var1.n5() != null && com.aspose.slides.internal.v6g.k5.l6(var1.n5().s7(), f6b.class) && this.n5(var1, var2.u9())) {
         var1.c8().n5(12, this.c8().k5());
         var1.w1();
         return false;
      }

      if (var1.n5() != null && com.aspose.slides.internal.v6g.k5.l6(var1.n5().s7(), l5w.class)) {
         e4c var7 = new e4c(var1.a6(61), var1.a6(15));
         if (this.n5(var1, var7.u9())) {
            double var8 = var7.n5 / var1.c8().s7();
            double var10 = var7.l6 / var1.c8().e2();
            if (n5(var8)) {
               var1.c8().n5(13, var8);
            }

            if (n5(var10)) {
               var1.c8().n5(14, var10);
            }

            var1.w1();
            return false;
         }
      }

      return true;
   }

   @Override
   public boolean n5(k6a var1, e4c var2) {
      double var3 = var2.n5 / var1.c8().s7();
      double var5 = var2.l6 / var1.c8().e2();
      if (this.c8().k5() != 0.0) {
         double var7 = com.aspose.slides.ms.System.q1.k5(var3, var5);
         if (n5(var7)) {
            List$Enumerator var9 = var1.l6().iterator();

            try {
               while (var9.hasNext()) {
                  k6a var10 = (k6a)var9.next();
                  var10.n5(var7, 61, 15, 18, 32);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var9, IDisposable.class)) {
                  var9.dispose();
               }
            }

            return true;
         }
      } else {
         if (n5(var3)) {
            List$Enumerator var28 = var1.l6().iterator();

            try {
               while (var28.hasNext()) {
                  k6a var29 = (k6a)var28.next();
                  var29.n5(var3, 61);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
                  var28.dispose();
               }
            }

            return true;
         }

         if (n5(var5)) {
            List$Enumerator var12 = var1.l6().iterator();

            try {
               while (var12.hasNext()) {
                  k6a var13 = (k6a)var12.next();
                  var13.n5(var5, 15);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }

            return true;
         }
      }

      return false;
   }

   private void l6(k6a var1, e4c var2) {
      e4c var3 = k5(var1, var2.u9()).u9();
      var1.c8().h0(var3.l6);
      var1.c8().u3(var3.n5);
      boolean var4 = false;
      if (var1.s7().u3()) {
         if (!var1.l6(61)) {
            var1.k5(61, var3.n5);
         }

         if (!var1.l6(15)) {
            var1.k5(15, var3.l6);
         }

         if (var1.c8().n3() != var3.l6 || var1.c8().c8() != var3.n5) {
            var4 = true;
         }
      } else {
         double var5 = com.aspose.slides.ms.System.q1.k5(var1.c8().s7(), var1.c8().h0());
         double var7 = com.aspose.slides.ms.System.q1.k5(var1.c8().e2(), var1.c8().y4());
         double var9 = var5 != 0.0 ? var3.n5 / var5 : 1.0;
         double var11 = var7 != 0.0 ? var3.l6 / var7 : 1.0;
         if (n5(var9)) {
            var1.n5(var9, 61);
            var4 = true;
         }

         if (n5(var11)) {
            var1.n5(var11, 15);
            var4 = true;
         }
      }

      if (var4) {
         var1.w1();
         var1.d5();
      }
   }

   private boolean n5(k6a var1, boolean var2, List<k6a> var3) {
      boolean var4 = true;
      if (var1.m1() != null) {
         p5w var5 = new p5w();

         for (l3d var9 : var1.m1().a6()) {
            k6a var10 = var9.l6(var1);
            if (var10 != null) {
               List var11 = var9.n5(var1);
               List$Enumerator var12 = var11.iterator();

               try {
                  while (var12.hasNext()) {
                     k6a var13 = (k6a)var12.next();
                     if (var3 == null || !var3.containsItem(var13) || !q3g.n5(var9.k5())) {
                        double var14 = var10.n5(var9);
                        double var16 = this.n5(var10, var13, var9) * var14;
                        if (var16 != 0.0) {
                           double var18 = var13.a6(var9.k5());
                           w2v var20 = var5.n5(var13, var9.k5());
                           if (n5(var18, var16)) {
                              switch (var9.y4()) {
                                 case 0:
                                 case 1:
                                    var20.k5(var16);
                                    break;
                                 case 2:
                                    var20.k5(var16);
                                    if (var13 == var10) {
                                       w2v var21 = var5.n5(var10, var9.c8());
                                       if (n5(var20.k5(), var21.k5() * var14) && var20.k5() < var21.k5() * var14) {
                                          var21.k5(var20.k5() / var14);
                                          if (var2) {
                                             var10.l6(var9.c8(), var21.k5());
                                          } else {
                                             var10.k5(var9.c8(), var21.k5());
                                          }
                                       }
                                    }
                                    break;
                                 case 3:
                                    var20.n5(var16);
                                    break;
                                 case 4:
                                    var20.l6(var16);
                              }
                           }

                           if (n5(var18, var20.k5())) {
                              if (var2) {
                                 var13.l6(var9.k5(), var20.k5());
                              } else {
                                 var13.k5(var9.k5(), var20.k5());
                                 if (var13.s7().n5(var9.k5()) || q3g.k5(var9.k5())) {
                                    var4 &= var13.a6(var9.k5()) != var16;
                                 }
                              }
                           }
                        }
                     }
                  }
               } finally {
                  if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                     var12.dispose();
                  }
               }
            }
         }
      }

      return var4;
   }

   private void t2(k6a var1) {
      List$Enumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            k7t var4 = this.n5(var3.c8());
            if (var4 != null) {
               double var5 = var4.k5(0);
               double var7 = var4.k5(1);
               k7t var9 = var3.c8();
               double var10 = var9.k5(0);
               double var12 = var9.k5(1);
               var9.n5(8, var10 - var5);
               var9.n5(9, var12 - var7);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void s7(k6a var1) {
      List$Enumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (!e2(var3)) {
               k7t var4 = var3.c8();
               var4.u3(com.aspose.slides.ms.System.q1.k5(var4.t2(), var1.c8().c8()));
               var4.h0(com.aspose.slides.ms.System.q1.k5(var4.y4(), var1.c8().n3()));
               int var5 = var3.s7().n5().l6();
               int var6 = var3.s7().n5().n5();
               e4c var7 = y4(var3).u9();
               double var8 = var7.n5;
               double var10 = var7.l6;
               if (var3.s7().a6()) {
                  if (var6 == 0 && !var3.l6(18) && !var3.l6(24)) {
                     var8 = var4.u3();
                  }

                  if (var5 == 0 && !var3.l6(32) && !var3.l6(1)) {
                     var10 = var4.a6();
                  }
               }

               var4.n5(new e4c(var8, var10));
               e4c var12 = n5(var3, var6, var5).u9();
               var4.n5(var12.n5, var12.l6);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private void x8(k6a var1) {
      List$Enumerator var2 = var1.l6().iterator();

      try {
         while (var2.hasNext()) {
            k6a var3 = (k6a)var2.next();
            if (e2(var3)) {
               k7t var4 = var3.c8();
               k7t var5 = this.n5(var4);
               if (var5 == null) {
                  throw new NullReferenceException("MasterShape couldn't be empty.");
               }

               e4c var6 = var5.n5().j5().u9();
               double var7 = var4.k5(8) * var6.n5;
               double var9 = var4.k5(9) * var6.l6;
               e4c var11 = var5.u9().u9();
               var4.n5(new e4c(var11.n5 + var7, var11.l6 + var9));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   private e4c n3(k6a var1) {
      double var2 = var1.a6(61);
      if (var2 == 0.0) {
         var2 = var1.t2().a6(61);
      }

      double var4 = var1.a6(15);
      if (var4 == 0.0) {
         var4 = var1.t2().a6(15);
      }

      return this.c8().k5() != 0.0 ? q3g.n5(this.c8().k5(), var2, var4) : new e4c(var2, var4);
   }

   private static e4c k5(k6a var0, e4c var1) {
      double var2 = 0.0;
      double[] var4 = new double[]{0.0};
      double var5 = n5(var0, var1.n5, 61, 63, 18, 20, 24, 26, 8, 9, var4);
      var2 = var4[0];
      var0.c8().n5(0, var2);
      var4[0] = var2;
      double var7 = n5(var0, var1.l6, 15, 17, 32, 34, 1, 6, 10, 11, var4);
      var2 = var4[0];
      var0.c8().n5(1, var2);
      return new e4c(var5, var7);
   }

   private static double n5(k6a var0, double var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, double[] var11) {
      var11[0] = 0.0;
      double var12 = 0.0;
      if (var0.l6(var3)) {
         var12 = com.aspose.slides.ms.System.q1.n5(var0.a6(var4) + var0.a6(var3));
         if ((!var0.l6(var5) || var0.a6(var5) == 0.0) && var0.a6(var6) == 0.0) {
            if (var0.l6(var7) && var0.a6(var7) != 0.0) {
               var11[0] += var0.a6(var8) + var0.a6(var7) - var12;
            } else if (var0.l6(var9) && var0.a6(var9) != 0.0) {
               var11[0] += var0.a6(var10) + var0.a6(var9) - var12 / 2.0;
            }
         } else {
            var11[0] += var0.a6(var6) + var0.a6(var5);
         }
      } else if ((!var0.l6(var5) || var0.a6(var5) == 0.0) && var0.a6(var6) == 0.0) {
         if (var0.l6(var7) && var0.a6(var7) != 0.0) {
            if (var0.l6(var9) && var0.a6(var9) != 0.0) {
               var12 = com.aspose.slides.ms.System.q1.n5((var0.a6(var9) + var0.a6(var10) - (var0.a6(var7) + var0.a6(var8))) * 2.0);
               var11[0] = com.aspose.slides.ms.System.q1.n5((var0.a6(var9) + var0.a6(var10)) * 2.0 - (var0.a6(var7) + var0.a6(var8)));
            } else {
               var12 = com.aspose.slides.ms.System.q1.n5(var0.a6(var7) + var0.a6(var8));
            }
         } else if (var0.l6(var9) && var0.a6(var9) != 0.0) {
            var12 = 0.0;
            var11[0] = var0.a6(var9);
         } else {
            var12 = var1;
            var0.l6(var3, var12);
         }
      } else {
         if (var0.l6(var7) && var0.a6(var7) != 0.0) {
            var12 = com.aspose.slides.ms.System.q1.n5(var0.a6(var7) + var0.a6(var8) - (var0.a6(var5) + var0.a6(var6)));
         } else if (var0.l6(var9) && var0.a6(var9) != 0.0) {
            var12 = com.aspose.slides.ms.System.q1.n5((var0.a6(var9) + var0.a6(var10) - (var0.a6(var5) + var0.a6(var6))) * 2.0);
         } else {
            var12 = com.aspose.slides.ms.System.q1.n5(var1 - (var0.a6(var5) + var0.a6(var6)) + var0.a6(var8));
         }

         var11[0] = var0.a6(var6) + var0.a6(var5);
      }

      return var12;
   }

   private static u6x n5(k6a var0, k6a var1) {
      if (var0.l6().size() == 0) {
         return new u6x();
      }

      double var2 = Double.MAX_VALUE;
      double var4 = Double.MAX_VALUE;
      List$Enumerator var6 = var0.l6().iterator();

      try {
         while (var6.hasNext()) {
            k6a var7 = (k6a)var6.next();
            if (var7 != var1) {
               var2 = com.aspose.slides.ms.System.q1.k5(var2, var7.c8().k5(0));
               var4 = com.aspose.slides.ms.System.q1.k5(var4, var7.c8().k5(1));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var6, IDisposable.class)) {
            var6.dispose();
         }
      }

      double var9 = 0.0;
      double var11 = 0.0;
      if (var2 != Double.MAX_VALUE && var4 != Double.MAX_VALUE) {
         List$Enumerator var13 = var0.l6().iterator();

         try {
            while (var13.hasNext()) {
               k6a var14 = (k6a)var13.next();
               if (var14 != var1) {
                  k7t var15 = var14.c8();
                  double var16 = com.aspose.slides.ms.System.q1.k5(var15.s7(), var15.c8());
                  double var18 = com.aspose.slides.ms.System.q1.k5(var15.e2(), var15.n3());
                  var9 = com.aspose.slides.ms.System.q1.l6(var9, var15.k5(0) - var2 + var16);
                  var11 = com.aspose.slides.ms.System.q1.l6(var11, var15.k5(1) - var4 + var18);
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var13, IDisposable.class)) {
               var13.dispose();
            }
         }

         return new u6x(var2, var4, var2 + var9, var4 + var11);
      } else {
         return new u6x();
      }
   }

   private double n5(k6a var1, k6a var2, l3d var3) {
      if (var3.h0() != 1) {
         return var1.a6(var3.c8());
      }

      k6a var4 = var1.n5();
      int var5 = var3.k5();
      if (q3g.n5(var3.c8()) && (var5 == 32 || var5 == 18) && var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4.s7(), f6b.class)) {
         int var12 = var3.c8() == 61 ? 10 : 11;
         double var13 = var1.c8().k5(var12);
         u6x var9 = n5(var1, var2).z1();
         u6x var10 = n5(var1, (k6a)null).z1();
         boolean var11 = false;
         if (var5 == 18) {
            var11 = var9.t2() < var10.t2();
         } else {
            var11 = var9.s7() < var10.s7();
         }

         if (var13 != 0.0 && var11) {
            return var13;
         }
      } else if (q3g.n5(var3.c8()) && var4 != null && com.aspose.slides.internal.v6g.k5.l6(var4.s7(), l5w.class)) {
         int var6 = var3.c8() == 61 ? 13 : 14;
         double var7 = var1.c8().k5(var6);
         if (var7 != 0.0) {
            return var1.a6(var3.c8()) * var7;
         }
      }

      return var1.u9(var3.c8());
   }

   private static e4c y4(k6a var0) {
      k7t var1 = var0.c8();
      double var2 = 0.0;
      double var4 = 0.0;
      if (var0.s7().u3()) {
         var2 = (var1.c8() - var1.h0()) / 2.0;
         var4 = (var1.n3() - var1.x8()) / 2.0;
      } else if (var0.s7().a6()) {
         var2 = com.aspose.slides.ms.System.q1.k5(0.0, (var1.s7() - var1.h0()) / 2.0);
         var4 = com.aspose.slides.ms.System.q1.k5(0.0, (var1.e2() - var1.x8()) / 2.0);
      }

      return new e4c(var2 + var1.k5(0), var4 + var1.k5(1));
   }

   private k7t n5(k7t var1) {
      k7t var2 = var1.s3();
      if (var2 != null) {
         for (k6a var3 = var2.n5().n5(); var2.n5().s7().u3() && var3 != null && var3.s7().u3(); var3 = var3.n5()) {
            var2 = var3.c8();
         }
      }

      return var2;
   }

   private static boolean e2(k6a var0) {
      return var0.c8().t4() && var0.c8().s3() != null;
   }

   private k7m c8() {
      return (k7m)this.n5();
   }
}
