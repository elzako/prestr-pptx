package com.aspose.slides.internal.z4;

import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.ms.System.q1;

public class n5 extends com.aspose.slides.internal.m2.k5 {
   private com.aspose.slides.internal.e1.k7 l6;
   private com.aspose.slides.internal.e1.r4 k5;
   private boolean u3;
   private final c8 a6;
   public boolean n5;

   public n5(c8 var1) {
      this.a6 = var1;
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.t2 var1) {
      if (!this.u3) {
         super.l6(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.t2 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.x8 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.s7 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.s3 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.z1 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.j5 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.w1 var1) {
      if (!this.u3) {
         super.l6(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.w1 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.r4 var1) {
      if (!this.u3 || this.n5) {
         this.n5 = false;
         super.n5(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.c4 var1) {
      if (!this.u3) {
         super.l6(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c4 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.r4 var1) {
      if (!this.u3) {
         if (var1 == this.k5) {
            this.u3 = true;
         }

         this.n5 = true;
         super.l6(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.y2 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      if (!this.u3) {
         super.n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.k7 var1) {
      if (!this.u3) {
         super.n5(var1);
         if (var1 == this.l6) {
            this.u3 = true;
         }
      }
   }

   public final void k5(com.aspose.slides.internal.e1.r4 var1) {
      if (var1 != null) {
         if (var1.k5() != null) {
            if (n5(var1.k5())) {
               if (var1.k5().n5() == 0) {
                  this.a6(var1);
               } else if (var1.k5().n5() == 2) {
                  this.u3(var1);
               }
            }
         }
      }
   }

   private static boolean n5(com.aspose.slides.internal.w0.l6 var0) {
      switch (var0.n5()) {
         case 0:
            if (((com.aspose.slides.internal.w0.n3)var0).l6().l6() == 255) {
               return false;
            }

            return true;
         case 2:
            com.aspose.slides.internal.j7.n5 var1 = new com.aspose.slides.internal.j7.n5(((com.aspose.slides.internal.w0.y4)var0).l6());

            try {
               if (!com.aspose.slides.internal.o9b.t4.k5(var1.c8().s7())) {
                  return false;
               }

               return com.aspose.slides.internal.j7.n5.n5(var1.c8(), false, false).k5();
            } finally {
               if (var1 != null) {
                  var1.dispose();
               }
            }
         default:
            return false;
      }
   }

   private void u3(com.aspose.slides.internal.e1.r4 var1) {
      com.aspose.slides.internal.w0.y4 var2 = (com.aspose.slides.internal.w0.y4)var1.k5();
      com.aspose.slides.internal.o9b.l6 var3 = null;
      com.aspose.slides.internal.o9b.l6[] var4 = new com.aspose.slides.internal.o9b.l6[]{var3};
      boolean var5 = this.a6.n5(var2.l6(), var4);
      var3 = var4[0];
      com.aspose.slides.internal.j7.n5 var6 = var5 ? new com.aspose.slides.internal.j7.a6(var2) : new com.aspose.slides.internal.j7.n5(var2);

      try {
         if (!com.aspose.slides.internal.o9b.t4.k5(var6.c8().s7())) {
            return;
         }

         if (!com.aspose.slides.internal.j7.n5.n5(var6.c8(), false, false).k5()) {
            return;
         }

         this.k5 = var1;
         com.aspose.slides.internal.e1.m3 var7 = var1;

         while (var7.y2() != null) {
            var7 = var7.y2();
         }

         com.aspose.slides.internal.e1.w1 var8 = com.aspose.slides.internal.v6g.k5.n5(var7, com.aspose.slides.internal.e1.w1.class);
         com.aspose.slides.internal.o9b.l6 var9 = new com.aspose.slides.internal.o9b.l6(var8.u3(), var8.a6());

         try {
            com.aspose.slides.internal.o9b.z1 var10 = com.aspose.slides.internal.o9b.z1.n5(var9);

            try {
               this.n5(var8, var10);
               float var11 = 0.75F;
               var10.a6();
               var10.u3(3);
               var10.n5(1.0F);
               com.aspose.slides.internal.m2.l6 var12 = new com.aspose.slides.internal.m2.l6();
               var12.l6(var1);
               com.aspose.slides.internal.x4g.s7 var13 = var12.l6();
               float var14 = var13.a6()[0].l6();
               float var15 = var13.a6()[0].l6();
               float var16 = var13.a6()[0].k5();
               float var17 = var13.a6()[0].k5();

               for (com.aspose.slides.internal.o9b.w1 var21 : var13.a6()) {
                  var14 = q1.l6(var14, var21.l6());
                  var15 = q1.n5(var15, var21.l6());
                  var16 = q1.l6(var16, var21.k5());
                  var17 = q1.n5(var17, var21.k5());
               }

               int var74 = com.aspose.slides.internal.v6g.k5.u3((var15 - var14) / var11, 13);
               int var75 = com.aspose.slides.internal.v6g.k5.u3((var17 - var16) / var11, 13);
               com.aspose.slides.internal.j7.n5 var76 = new com.aspose.slides.internal.j7.n5(var74, var75);

               try {
                  com.aspose.slides.internal.o9b.z1 var77 = com.aspose.slides.internal.o9b.z1.n5(var76.c8());

                  try {
                     var77.u3(3);
                     var77.n5(1.0F);
                     var77.n5(var11, var11);
                     var77.l6(-var14, -var16);
                     var77.n5(var9, 0, 0);
                     u6 var22 = (u6)com.aspose.slides.internal.j7.k5.n5(var1.k5());
                     var77.n5(var22, var13);
                     com.aspose.slides.internal.z0k.e2 var23 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        var76.n5(var23, var6.u9());
                        com.aspose.slides.internal.w0.y4 var24 = new com.aspose.slides.internal.w0.y4(com.aspose.slides.internal.n2d.t4.l6(var23));
                        var24.n5(var2.k5());
                        var24.n3().l6(var14, var16);
                        var24.n5(4);
                        var1.n5(var24);
                     } finally {
                        if (var23 != null) {
                           var23.dispose();
                        }
                     }
                  } finally {
                     if (var77 != null) {
                        var77.dispose();
                     }
                  }
               } finally {
                  if (var76 != null) {
                     var76.dispose();
                  }
               }
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
         if (var6 != null) {
            var6.dispose();
         }
      }
   }

   private void a6(com.aspose.slides.internal.e1.r4 var1) {
      if (var1.u3() != null) {
         var1.l6(var1.u3());
         var1.n5((com.aspose.slides.internal.w0.c8)null);
      }

      com.aspose.slides.internal.e1.h0 var2 = new com.aspose.slides.internal.e1.h0();
      com.aspose.slides.internal.o9b.y1 var3 = var2.n5((com.aspose.slides.internal.e1.m3)var1).y4();
      if (var3.c8().l6() != 0.0F && var3.c8().k5() != 0.0F) {
         com.aspose.slides.internal.e1.m3 var4 = var1;

         while (var4.y2() != null) {
            var4 = var4.y2();
         }

         com.aspose.slides.internal.e1.w1 var5 = com.aspose.slides.internal.v6g.k5.n5(var4, com.aspose.slides.internal.e1.w1.class);
         com.aspose.slides.internal.o9b.l6 var6 = new com.aspose.slides.internal.o9b.l6(var5.u3(), var5.a6());

         try {
            com.aspose.slides.internal.o9b.z1 var7 = com.aspose.slides.internal.o9b.z1.n5(var6);

            try {
               var7.k5(7);
               var7.a6(2);
               var7.c8(3);
               var7.l6(com.aspose.slides.internal.o9b.a6.u3(), new com.aspose.slides.internal.o9b.y2(com.aspose.slides.internal.o9b.j5.n5.k5(), var6.n3().u3()));
               this.k5 = var1;
               this.n5(var5, var7);
               this.u3 = false;
               this.k5 = null;
               this.n5(var1, var7);
               float var8 = 1.3333334F;
               float var9 = 0.75F;
               com.aspose.slides.internal.m2.l6 var10 = new com.aspose.slides.internal.m2.l6();
               var10.l6(var1);
               com.aspose.slides.internal.x4g.s7 var11 = var10.l6();
               var11.l6(var7.m1());
               float var12 = 0.0F;
               float var13 = 0.0F;
               float var14 = 0.0F;
               float var15 = 0.0F;
               if (var11.h0() > 0) {
                  var12 = var11.a6()[0].l6();
                  var13 = var11.a6()[0].k5();
                  var14 = var12;
                  var15 = var13;

                  for (int var16 = 0; var16 < var11.h0(); var16++) {
                     com.aspose.slides.internal.o9b.w1 var17 = var11.a6()[var16].u3();
                     if (var12 > var17.l6()) {
                        var12 = var17.l6();
                     }

                     if (var13 > var17.k5()) {
                        var13 = var17.k5();
                     }

                     if (var14 < var17.l6()) {
                        var14 = var17.l6();
                     }

                     if (var15 < var17.k5()) {
                        var15 = var17.k5();
                     }
                  }
               }

               if (var14 - var12 == 0.0F) {
                  var14++;
               }

               if (var15 - var13 == 0.0F) {
                  var15++;
               }

               com.aspose.slides.internal.o9b.w1[] var71 = new com.aspose.slides.internal.o9b.w1[]{
                  new com.aspose.slides.internal.o9b.w1(var14 - var12, var15 - var13)
               };
               com.aspose.slides.internal.x4g.m1 var73 = new com.aspose.slides.internal.x4g.m1();
               var73.n5(var8, var8);
               var73.n5(var71);
               float var18 = 0.95F;
               float var19 = 12.0F;
               double var20 = q1.l6((double)var71[0].l6());
               double var22 = q1.l6((double)var71[0].k5());
               int var24 = com.aspose.slides.internal.v6g.k5.u3(q1.n5(var20 * 0.95F, (short)1), 14);
               int var25 = com.aspose.slides.internal.v6g.k5.u3(q1.n5(var22 * 0.95F, (short)1), 14);
               if (var20 - var24 > 12.0 || var22 - var25 > 12.0) {
                  var24 = com.aspose.slides.internal.v6g.k5.u3(var20, 14);
                  var25 = com.aspose.slides.internal.v6g.k5.u3(var22, 14);
               }

               float var26 = (com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var71[0].l6()), 14) - var24) / 2;
               float var27 = (com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var71[0].k5()), 14) - var25) / 2;
               float var28 = (var71[0].l6() - var24) / var71[0].l6();
               float var29 = (var71[0].k5() - var25) / var71[0].k5();
               float var30 = var3.s7() / var71[0].l6();
               com.aspose.slides.internal.o9b.l6 var31 = new com.aspose.slides.internal.o9b.l6(var24, var25);

               try {
                  com.aspose.slides.internal.o9b.z1 var32 = com.aspose.slides.internal.o9b.z1.n5(var31);

                  try {
                     com.aspose.slides.internal.z0k.e2 var33 = new com.aspose.slides.internal.z0k.e2();

                     try {
                        var32.k5(5);
                        var32.a6(3);
                        com.aspose.slides.internal.x4g.m1 var34 = var32.m1();
                        var71 = new com.aspose.slides.internal.o9b.w1[]{var3.u9()};
                        var7.m1().n5(var71);
                        var73.n5(var71);
                        var34.k5(-var71[0].l6() - var26, -var71[0].k5() - var27);
                        var32.l6(var34);
                        var32.n5(var6, 0, 0);
                        com.aspose.slides.internal.s5.t2.n5(var31, var33, 100);
                        com.aspose.slides.internal.w0.y4 var35 = new com.aspose.slides.internal.w0.y4(var33.toArray());
                        var35.n3().l6(var3.x8(), var3.n3());
                        var73 = new com.aspose.slides.internal.x4g.m1();
                        var73.n5(var30 * (1.0F + var28), var30 * (1.0F + var29));
                        var35.n3().n5(com.aspose.slides.internal.j7.c8.n5(var73));
                        var1.n5(var35);
                     } finally {
                        if (var33 != null) {
                           var33.dispose();
                        }
                     }
                  } finally {
                     if (var32 != null) {
                        var32.dispose();
                     }
                  }
               } finally {
                  if (var31 != null) {
                     var31.dispose();
                  }
               }
            } finally {
               if (var7 != null) {
                  var7.dispose();
               }
            }
         } finally {
            if (var6 != null) {
               var6.dispose();
            }
         }
      }
   }

   public final com.aspose.slides.internal.e1.k7 l6(com.aspose.slides.internal.e1.k7 var1) {
      float var2 = 5.0F;
      this.l6 = var1;
      com.aspose.slides.internal.e1.m3 var3 = var1;

      while (var3.y2() != null) {
         var3 = var3.y2();
      }

      com.aspose.slides.internal.e1.w1 var4 = com.aspose.slides.internal.v6g.k5.n5(var3, com.aspose.slides.internal.e1.w1.class);
      com.aspose.slides.internal.w0.c8 var5 = new com.aspose.slides.internal.w0.c8();
      com.aspose.slides.internal.e1.t2 var6 = com.aspose.slides.internal.v6g.k5.n5(var1.y2(), com.aspose.slides.internal.e1.t2.class);
      if (var6 != null && var6.u3() != null) {
         var5 = var6.u3();
      }

      com.aspose.slides.internal.x4g.m1 var7 = new com.aspose.slides.internal.x4g.m1(var5.u3(), var5.a6(), var5.u9(), var5.h0(), 0.0F, 0.0F);
      com.aspose.slides.internal.o9b.y1 var8 = var1.k5().y4();
      if (var7.l6()) {
         (var5.n5() ? var1.k5() : var5.n5(var1.k5().y4())).a6(var8);
      }

      com.aspose.slides.internal.o9b.y1 var9 = new com.aspose.slides.internal.o9b.y1(
         0.0F, 0.0F, com.aspose.slides.internal.v6g.k5.u3(var4.l6(), 13), com.aspose.slides.internal.v6g.k5.u3(var4.k5(), 13)
      );
      var8.n5(var9.y4());
      if (!(var8.s7() < 0.5F) && !(var8.k5() < 0.5F)) {
         com.aspose.slides.internal.o9b.l6 var10 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(var4.l6() * var2, 13), com.aspose.slides.internal.v6g.k5.u3(var4.k5() * var2, 13)
         );

         com.aspose.slides.internal.o9b.l6 var18;
         try {
            com.aspose.slides.internal.o9b.z1 var11 = com.aspose.slides.internal.o9b.z1.n5(var10);

            try {
               var11.c8(3);
               var11.a6(2);
               var11.n5(com.aspose.slides.internal.o9b.c8.w4().o8());
               var11.l6(new com.aspose.slides.internal.x4g.m1(var9.s7() / var4.u3() * var2, 0.0F, 0.0F, var9.k5() / var4.a6() * var2, 0.0F, 0.0F));
               this.n5(var4, var11);
               com.aspose.slides.internal.o9b.y1 var12 = new com.aspose.slides.internal.o9b.y1(
                  var8.x8() * var2, var8.n3() * var2, var8.s7() * var2, var8.k5() * var2
               );
               if (!var7.l6()) {
                  com.aspose.slides.internal.o9b.l6 var13 = new com.aspose.slides.internal.o9b.l6(
                     com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var12.s7()), 14), com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var12.k5()), 14)
                  );
                  com.aspose.slides.internal.o9b.z1 var14 = com.aspose.slides.internal.o9b.z1.n5(var13);

                  try {
                     var14.a6(2);
                     var14.u9(4);
                     com.aspose.slides.internal.x4g.m1 var15 = new com.aspose.slides.internal.x4g.m1();
                     float var16 = var12.x8() + var12.s7() / 2.0F;
                     float var17 = var12.n3() + var12.k5() / 2.0F;
                     var15.l6(var16, var17, 0);
                     var15.n5(var7, 0);
                     var15.l6(-var16, -var17, 0);
                     var15.h0();
                     var15.l6(-var12.x8(), -var12.n3(), 1);
                     var14.l6(var15);
                     var14.n5(var10, new com.aspose.slides.internal.o9b.w1(0.0F, 0.0F));
                     var18 = var13;
                  } finally {
                     if (var14 != null) {
                        var14.dispose();
                     }
                  }
               } else {
                  com.aspose.slides.internal.o9b.y2 var45 = com.aspose.slides.internal.o9b.y2.l6(var12.y4()).n3();
                  if (var45.u9() > var10.e2()) {
                     var45.l6(var10.e2() - var45.s7());
                  }

                  if (var45.n5() > var10.h0()) {
                     var45.n5(var10.h0() - var45.x8());
                  }

                  var18 = var10.n5(var45.n3(), var10.s7());
               }
            } finally {
               if (var11 != null) {
                  var11.dispose();
               }
            }
         } finally {
            if (var10 != null) {
               var10.dispose();
            }
         }

         com.aspose.slides.internal.z0k.e2 var43 = new com.aspose.slides.internal.z0k.e2();

         try {
            com.aspose.slides.internal.s5.t2.n5(var18, var43, 100);
            var18.dispose();
            var43.seek(0L, 0);
            com.aspose.slides.internal.o9b.w1 var44 = var1.n5().u3();
            com.aspose.slides.internal.o9b.f2 var46 = var8.c8().a6();
            if (var44.l6() < 0.0F) {
               var44.n5(0.0F);
            }

            if (var44.k5() < 0.0F) {
               var44.l6(0.0F);
            }

            com.aspose.slides.internal.e1.k7 var47 = new com.aspose.slides.internal.e1.k7(var44.u3(), var46.a6(), var43.toArray(), null, var1.t2());
            var47.n5(var1.c8());
            return var47;
         } finally {
            if (var43 != null) {
               var43.dispose();
            }
         }
      } else {
         return var1;
      }
   }
}
