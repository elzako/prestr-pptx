package com.aspose.slides.internal.f1s;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.z3;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.internal.z4.y1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.q1;

public abstract class s7 extends a0 {
   protected y1 n5;
   protected h0 k5;
   private final com.aspose.slides.internal.w0.c8 u3;

   public s7(com.aspose.slides.internal.z4.c8 var1) {
      super(var1);
      this.n5 = new y1(var1);
      this.k5 = new h0(this.l6, this.n5, this);
      this.u3 = this.l6.x8().l6().l6().k5();
   }

   @Override
   public void l6(t4 var1) {
      var1.k5("/Type", "/Pattern");
      var1.n5("/PatternType", this.n5());
   }

   public static s7 n5(com.aspose.slides.internal.w0.l6 var0, com.aspose.slides.internal.z4.c8 var1) {
      switch (var0.n5()) {
         case 1:
            return new t9(var1, (com.aspose.slides.internal.w0.a6)var0);
         case 2:
            return new t9(var1, (com.aspose.slides.internal.w0.y4)var0);
         case 3:
            int var143 = 262144;
            com.aspose.slides.internal.w0.h0 var144 = (com.aspose.slides.internal.w0.h0)var0;
            if (!var1.q0() && var144.y4() == 0 && !n5(var144)) {
               if (l6(var144)) {
                  return new y4(var1, var144);
               }

               return new c8(var1, var144);
            } else {
               com.aspose.slides.internal.o9b.y1 var145 = var144.a6().y4();
               new com.aspose.slides.internal.o9b.y1();
               com.aspose.slides.internal.w0.c8 var147 = var144.n3();
               com.aspose.slides.internal.o9b.y1 var146;
               float var149;
               float var151;
               if (var145.s7() * var145.k5() > 262144.0F) {
                  var151 = var149 = (float)q1.z3(262144.0F / var145.s7() / var145.k5());
                  com.aspose.slides.internal.o9b.y1 var153 = var145.y4();
                  var153.n5(1.0F, 1.0F);
                  var146 = new com.aspose.slides.internal.o9b.y1(
                     var153.x8() * var151, var153.n3() * var149, (float)q1.l6((double)(var153.s7() * var151)), (float)q1.l6((double)(var153.k5() * var149))
                  );
               } else {
                  var146 = new com.aspose.slides.internal.o9b.y1(
                     (float)q1.k5(var145.x8()), (float)q1.k5(var145.n3()), (float)q1.l6((double)var145.s7()), (float)q1.l6((double)var145.k5())
                  );
                  var149 = 1.0F;
                  var151 = 1.0F;
                  double var10 = var144.t2();
                  if (var144.t2() % 90.0 != 0.0) {
                     var144.n5(0.0);
                  }

                  z3 var156 = (z3)com.aspose.slides.internal.j7.k5.n5(var144);

                  try {
                     w1[] var159 = new w1[]{new w1(var146.a6(), var146.t2()), new w1(var146.h0(), var146.t2())};
                     double var14 = n5(var159[0].u3(), var159[1].u3());
                     var156.n3().n5(var159);
                     double var16 = n5(var159[0].u3(), var159[1].u3());
                     if (var14 < var16) {
                        var146 = new com.aspose.slides.internal.o9b.y1(
                           (float)q1.k5(var145.x8()), (float)q1.k5(var145.n3()), (float)q1.l6(var16), (float)q1.l6((double)var145.k5())
                        );
                        var151 = var145.s7() / var146.s7();
                     }
                  } finally {
                     if (var156 != null) {
                        var156.dispose();
                     }
                  }

                  var144.n5(var10);
               }

               var144.n5(var146.y4());
               com.aspose.slides.internal.j7.n5 var154 = new com.aspose.slides.internal.j7.n5(
                  com.aspose.slides.internal.v6g.k5.u3(var146.s7(), 13), com.aspose.slides.internal.v6g.k5.u3(var146.k5(), 13)
               );

               try {
                  com.aspose.slides.internal.j7.h0 var162 = new com.aspose.slides.internal.j7.h0(var154);

                  try {
                     z3 var157 = (z3)com.aspose.slides.internal.j7.k5.n5(var144);

                     try {
                        com.aspose.slides.internal.z0k.e2 var160 = new com.aspose.slides.internal.z0k.e2();

                        try {
                           com.aspose.slides.internal.w0.c8 var163 = com.aspose.slides.internal.j7.c8.n5(var157.n3());
                           var157.k5(new m1());
                           var157.a6(-var144.a6().x8(), -var144.a6().n3());
                           if (var154.l6() != 1 || var154.k5() != 1) {
                              var162.l6().n5(var157, 0, 0, var154.l6(), var154.k5());
                           }

                           var154.n5(var160, 5);
                           byte[] var21 = var160.toArray();
                           com.aspose.slides.internal.w0.y4 var22 = new com.aspose.slides.internal.w0.y4(var21);
                           var163.l6(var146.x8(), var146.n3(), 1);
                           var163.n5(1.0F / var151, 1.0F / var149, 1);
                           var163.l6(-var145.x8(), -var145.n3(), 1);
                           var163.l6(var144.a6().x8(), var144.a6().n3(), 0);
                           var22.n5(var163);
                           var144.n5(var147);
                           var144.n5(var145.y4());
                           return var1.k5().n5(var22, var163.k5());
                        } finally {
                           if (var160 != null) {
                              var160.dispose();
                           }
                        }
                     } finally {
                        if (var157 != null) {
                           var157.dispose();
                        }
                     }
                  } finally {
                     if (var162 != null) {
                        var162.dispose();
                     }
                  }
               } finally {
                  if (var154 != null) {
                     var154.dispose();
                  }
               }
            }
         case 4:
            com.aspose.slides.internal.w0.t2 var2 = (com.aspose.slides.internal.w0.t2)var0;
            float var3 = var2.a6().x8();
            float var4 = var2.a6().n3();
            float var5 = var2.a6().h0();
            float var6 = var2.a6().l6();
            if (var2.a6().u3()) {
               var3 = Float.MAX_VALUE;
               var4 = Float.MAX_VALUE;
               var5 = 0.0F;
               var6 = 0.0F;

               for (int var8 = 0; var8 < var2.u9().t2(); var8++) {
                  c4 var7 = com.aspose.slides.internal.v6g.k5.n5(var2.u9().n5(var8), c4.class);
                  if (null != var7) {
                     for (int var9 = 0; var9 < var7.t2(); var9++) {
                        y2 var19 = com.aspose.slides.internal.v6g.k5.n5(var7.n5(var9), y2.class);
                        if (null != var19) {
                           List$Enumerator var12 = var19.n5().iterator();

                           try {
                              while (var12.hasNext()) {
                                 w1 var13 = (w1)var12.next();
                                 if (var13.l6() < var3) {
                                    var3 = var13.l6();
                                 }

                                 if (var13.l6() > var5) {
                                    var5 = var13.l6();
                                 }

                                 if (var13.k5() < var4) {
                                    var4 = var13.k5();
                                 }

                                 if (var13.k5() > var6) {
                                    var6 = var13.k5();
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
               }
            }

            if (var5 != var3 && var6 != var4) {
               com.aspose.slides.internal.j7.n5 var150 = new com.aspose.slides.internal.j7.n5(
                  com.aspose.slides.internal.v6g.k5.u3(var5 - var3, 13), com.aspose.slides.internal.v6g.k5.u3(var6 - var4, 13)
               );

               try {
                  com.aspose.slides.internal.j7.h0 var148 = new com.aspose.slides.internal.j7.h0(var150);

                  try {
                     m3 var152 = (m3)com.aspose.slides.internal.j7.k5.n5(var2);

                     try {
                        com.aspose.slides.internal.z0k.e2 var161 = new com.aspose.slides.internal.z0k.e2();

                        try {
                           com.aspose.slides.internal.w0.c8 var155 = com.aspose.slides.internal.j7.c8.n5(var152.e2());
                           var152.k5(new m1());
                           var148.n5(-var3, -var4);
                           var148.l6().l6(var152, new com.aspose.slides.internal.o9b.y1(var3, var4, var150.l6(), var150.k5()));
                           var150.n5(var161, 5);
                           byte[] var158 = var161.toArray();
                           com.aspose.slides.internal.w0.y4 var20 = new com.aspose.slides.internal.w0.y4(var158);
                           var155.l6(var3, var4);
                           var20.n5(var155);
                           return var1.k5().n5(var20, var155);
                        } finally {
                           if (var161 != null) {
                              var161.dispose();
                           }
                        }
                     } finally {
                        if (var152 != null) {
                           var152.dispose();
                        }
                     }
                  } finally {
                     if (var148 != null) {
                        var148.dispose();
                     }
                  }
               } finally {
                  if (var150 != null) {
                     var150.dispose();
                  }
               }
            }

            throw new com.aspose.slides.internal.g3.k5(var0);
         default:
            throw new NotSupportedException("Unsupported brush type.");
      }
   }

   private static boolean n5(com.aspose.slides.internal.w0.h0 var0) {
      if (var0.l6() == null) {
         if (var0.u9().l6() < 255 || var0.h0().l6() < 255) {
            return true;
         }
      } else {
         int var1 = var0.l6().length;

         for (int var2 = 0; var2 < var1; var2++) {
            com.aspose.slides.internal.w0.u9 var3 = var0.l6()[var2];
            if (var3.n5().l6() < 255) {
               return true;
            }
         }
      }

      return false;
   }

   private static boolean l6(com.aspose.slides.internal.w0.h0 var0) {
      if (var0.l6() == null) {
         return true;
      }

      float var1 = 0.0F;

      for (com.aspose.slides.internal.w0.u9 var5 : var0.l6()) {
         float var6 = var5.l6() - var1;
         var1 = var5.l6();
         if (var5.l6() > 0.0F && var6 < 0.1F) {
            return true;
         }
      }

      return false;
   }

   protected final void k5(t4 var1) {
      com.aspose.slides.internal.w0.c8 var3;
      if (this.l6() == null) {
         float var2 = (float)com.aspose.slides.internal.n2d.t2.a6(1.0);
         var3 = new com.aspose.slides.internal.w0.c8(var2, 0.0F, 0.0F, var2, 0.0F, 0.0F);
      } else {
         var3 = this.l6().k5();
         var3.n5(this.u3, 1);
      }

      var1.n5("/Matrix", var3);
   }

   protected abstract int n5();

   protected abstract com.aspose.slides.internal.w0.c8 l6();

   @Override
   public int n3() {
      return 2;
   }

   private static double n5(w1 var0, w1 var1) {
      double var2 = var0.l6() - var1.l6();
      double var4 = var0.k5() - var1.k5();
      return q1.z3(var2 * var2 + var4 * var4);
   }
}
