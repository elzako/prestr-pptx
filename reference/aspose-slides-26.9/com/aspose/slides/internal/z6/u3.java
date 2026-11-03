package com.aspose.slides.internal.z6;

import com.aspose.slides.Collections.Generic.IGenericDictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.a0.s3$n5;
import com.aspose.slides.internal.a0.y1;
import com.aspose.slides.internal.a0.y2;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.Xml.XmlDocument;

public abstract class u3 extends q0 {
   protected static final com.aspose.slides.internal.o0.l6 n5 = new com.aspose.slides.internal.o0.l6(
      "http://xmlgraphics.apache.org/fop/extensions", "fox:transform"
   );

   public u3(com.aspose.slides.internal.y1.u3 var1) {
      super(var1);
   }

   @Override
   protected void n5(com.aspose.slides.internal.a0.t2 var1) {
      float var2 = var1.n3() / 1000.0F;
      float var3 = var1.y4() / 1000.0F;
      float var4 = var1.c8() / 1000.0F;
      float var5 = var1.x8() / 1000.0F;
      float var6 = this.u3 / 1000.0F;
      float var7 = this.k5.n5() / 1000.0F;
      float var8 = var1.l6() / 1000.0F;
      float var9 = var1.e_() / 1000.0F;
      var6 += var1.m3() / 1000.0F;
      var6 -= var2;
      com.aspose.slides.internal.a0.x8 var10 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.a0.x8.class);
      if (var10 != null && var10.c4().size() > 0) {
         com.aspose.slides.internal.a0.t2 var11 = com.aspose.slides.internal.v6g.k5.n5(var10.c4().get_Item(0), com.aspose.slides.internal.a0.t2.class);
         if (var11.z8()) {
            var6 = var11.y1() / 1000.0F;
            var8 = var11.j5() / 1000.0F;
            var2 = 0.0F;
            var3 = 0.0F;
         }
      }

      var8 += var2;
      var8 += var3;
      var9 += var4;
      var9 += var5;
      this.n5(var1, var6, var7, var8, var9);
      this.l6(var1, var6, var7, var8, var9);
   }

   @Override
   protected void n5(y1 var1) {
      com.aspose.slides.internal.o9b.y1 var2 = var1.m3().y4();
      y2 var3 = var1.m1();
      float var4 = var2.x8() / 1000.0F;
      float var5 = var2.n3() / 1000.0F;
      float var6 = var2.s7() / 1000.0F;
      float var7 = var2.k5() / 1000.0F;
      this.k5.n5(var3.c8());
      int var8 = var1.h0();
      if (var8 != -1 && (var8 & 1) != 0) {
         this.u3 = var3.y4();
      } else {
         this.u3 = var3.n3();
      }

      this.n5(var1, var3, var4, var5, var6, var7);
   }

   protected final void n5(com.aspose.slides.internal.a0.l6 var1, float var2, float var3, float var4, float var5) {
      this.n5(var1, var1, var2, var3, var4, var5);
   }

   protected final void l6(com.aspose.slides.internal.a0.l6 var1, float var2, float var3, float var4, float var5) {
      com.aspose.slides.internal.v8.h0 var6 = (com.aspose.slides.internal.v8.h0)var1.a6(44);
      if (var6 != null) {
         float var7 = var6.k5 / 1000.0F;
         com.aspose.slides.internal.o9b.y1 var8 = new com.aspose.slides.internal.o9b.y1(var2 - var7, var3 - var7, var4 + 2.0F * var7, var5 + 2.0F * var7);
         this.l6();
         this.n5(var8.a6(), var8.t2());
         this.l6(var8.h0(), var8.t2());
         this.l6(var8.h0(), var8.l6());
         this.l6(var8.a6(), var8.l6());
         this.u9();
         this.a6();
         this.n5(var8.a6(), var8.t2(), var8.h0(), var8.t2() + var7, true, true, var6.n5, var6.l6.o8(), 0);
         this.n5(var8.h0() - var7, var8.t2(), var8.h0(), var8.l6(), false, false, var6.n5, var6.l6.o8(), 1);
         this.n5(var8.a6(), var8.l6() - var7, var8.h0(), var8.l6(), true, true, var6.n5, var6.l6.o8(), 2);
         this.n5(var8.a6(), var8.t2(), var8.a6() + var7, var8.l6(), false, false, var6.n5, var6.l6.o8(), 3);
         this.k5();
      }
   }

   protected final void n5(com.aspose.slides.internal.a0.l6 var1, com.aspose.slides.internal.a0.l6 var2, float var3, float var4, float var5, float var6) {
      com.aspose.slides.internal.v8.n5 var7 = (com.aspose.slides.internal.v8.n5)var2.a6(17);
      com.aspose.slides.internal.v8.n5 var8 = (com.aspose.slides.internal.v8.n5)var2.a6(18);
      com.aspose.slides.internal.v8.n5 var9 = (com.aspose.slides.internal.v8.n5)var2.a6(15);
      com.aspose.slides.internal.v8.n5 var10 = (com.aspose.slides.internal.v8.n5)var2.a6(16);
      this.n5(var3, var4, var5, var6, (s3$n5)var1.a6(9), var7, var8, var9, var10, var1.h0());
      this.n5(var3, var4, var5, var6, var7, var8, var9, var10, var2.h0());
   }

   protected final void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      s3$n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8,
      com.aspose.slides.internal.v8.n5 var9,
      int var10
   ) {
      com.aspose.slides.internal.v8.n5 var11 = var8;
      com.aspose.slides.internal.v8.n5 var12 = var9;
      this.n5(var1, var2, var3, var4, var5, var6, var7, var11, var12);
   }

   protected final void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      s3$n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8,
      com.aspose.slides.internal.v8.n5 var9
   ) {
      if (var5 != null) {
         this.u3();
         float var10 = var1;
         float var11 = var2;
         float var12 = var3;
         float var13 = var4;
         if (var8 != null) {
            var10 += var8.k5 / 1000.0F;
            var12 -= var8.k5 / 1000.0F;
         }

         if (var6 != null) {
            var11 += var6.k5 / 1000.0F;
            var13 -= var6.k5 / 1000.0F;
         }

         if (var9 != null) {
            var12 -= var9.k5 / 1000.0F;
         }

         if (var7 != null) {
            var13 -= var7.k5 / 1000.0F;
         }

         if (!var5.n5().t2()) {
            this.n5(var5.n5().o8(), true);
            this.n5(var10, var11, var12, var13, var6, var7, var8, var9);
         }

         if (var5.u9() != null) {
            com.aspose.slides.internal.w0.l6 var14 = var5.u9().n5(new com.aspose.slides.internal.o9b.y1(var10, var11, var12, var13));
            this.n5(var10, var11, var12, var13, var6, var7, var8, var9, var14);
         }

         if (var5.a6() != null) {
            com.aspose.slides.internal.r4.n3 var22 = var5.a6().k5();
            this.l6();
            if (!var5.n5) {
               this.n5(var10, var11, var12, var13);
            } else {
               var10 = 0.0F;
               var11 = 0.0F;
            }

            int var15 = com.aspose.slides.internal.v6g.k5.u3(var12 * 1000.0F / var22.u3() + 1.0F, 13);
            int var16 = com.aspose.slides.internal.v6g.k5.u3((var5.n5 && this.t2 != null ? this.t2.e_() : var13 * 1000.0F) / var22.a6() + 1.0F, 13);
            if (var5.k5() == 96) {
               var15 = 1;
               var16 = 1;
            } else if (var5.k5() == 113) {
               var16 = 1;
            } else if (var5.k5() == 114) {
               var15 = 1;
            }

            var10 *= 1000.0F;
            var11 *= 1000.0F;
            if (var15 == 1) {
               var10 += var5.l6();
            }

            if (var16 == 1) {
               var11 += var5.h0();
            }

            for (int var17 = 0; var17 < var15; var17++) {
               for (int var18 = 0; var18 < var16; var18++) {
                  new com.aspose.slides.internal.o9b.y1();
                  com.aspose.slides.internal.o9b.y1 var19 = new com.aspose.slides.internal.o9b.y1(
                     var10 - this.u3 + var17 * var22.u3(), var11 - this.k5.n5() + var18 * var22.a6(), var22.u3(), var22.a6()
                  );
                  this.n5(var5.u3(), var19.y4(), true);
               }
            }

            this.k5();
         }
      }
   }

   protected final void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      com.aspose.slides.internal.v8.n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8,
      int var9
   ) {
      com.aspose.slides.internal.o9b.y1 var10 = new com.aspose.slides.internal.o9b.y1(var1, var2, var3, var4);
      com.aspose.slides.internal.v8.n5 var11 = var7;
      com.aspose.slides.internal.v8.n5 var12 = var8;
      this.n5(var10.y4(), var5, var6, var11, var12);
   }

   protected void n5(
      com.aspose.slides.internal.v8.n5 var1,
      com.aspose.slides.internal.v8.n5 var2,
      com.aspose.slides.internal.v8.n5 var3,
      com.aspose.slides.internal.v8.n5 var4
   ) {
   }

   protected void n5(com.aspose.slides.internal.o9b.y1 var1) {
   }

   protected final void n5(
      com.aspose.slides.internal.o9b.y1 var1,
      com.aspose.slides.internal.v8.n5 var2,
      com.aspose.slides.internal.v8.n5 var3,
      com.aspose.slides.internal.v8.n5 var4,
      com.aspose.slides.internal.v8.n5 var5
   ) {
      com.aspose.slides.internal.o9b.y1 var6 = com.aspose.slides.internal.o9b.y1.n5.y4();

      try {
         boolean[] var7 = new boolean[]{var2 != null, var5 != null, var3 != null, var4 != null};
         float var8 = var1.x8();
         float var9 = var1.n3();
         float var10 = var1.s7();
         float var11 = var1.k5();
         this.n5(var2, var3, var4, var5);
         var6 = new com.aspose.slides.internal.o9b.y1(var8, var9, var10, var11);
         float[] var12 = new float[]{
            var7[0] ? var2.k5 / 1000.0F : 0.0F, var7[1] ? var5.k5 / 1000.0F : 0.0F, var7[2] ? var3.k5 / 1000.0F : 0.0F, var7[3] ? var4.k5 / 1000.0F : 0.0F
         };
         float[] var13 = new float[]{
            com.aspose.slides.internal.v8.n5.n5(var2) / 1000.0F,
            com.aspose.slides.internal.v8.n5.n5(var5) / 1000.0F,
            com.aspose.slides.internal.v8.n5.n5(var3) / 1000.0F,
            com.aspose.slides.internal.v8.n5.n5(var4) / 1000.0F
         };
         var9 += var13[0];
         var11 -= var13[0];
         var11 -= var13[2];
         var8 += var13[3];
         var10 -= var13[3];
         var10 -= var13[1];
         boolean[] var14 = new boolean[]{var7[3] && var7[0], var7[0] && var7[1], var7[1] && var7[2], var7[2] && var7[3]};
         if (var2 != null) {
            this.u3();
            float var15 = var14[0] ? var8 + var12[3] - var13[3] : var8;
            float var16 = var8 + var10;
            float var17 = var14[1] ? var16 - var12[1] + var13[1] : var16;
            float var18 = var9 - var13[0];
            float var19 = var18 + var13[0];
            float var20 = var18 + var12[0];
            this.l6();
            this.n5(var8, var19);
            float var21 = var8;
            float var22 = var16;
            if (var2.u3 == 2) {
               if (var4 != null && var4.u3 == 2) {
                  var21 -= var13[3];
               }

               if (var5 != null && var5.u3 == 2) {
                  var22 += var13[1];
               }

               this.l6(var21, var18);
               this.l6(var22, var18);
            }

            this.l6(var16, var19);
            this.l6(var17, var20);
            this.l6(var15, var20);
            this.u9();
            this.a6();
            this.n5(var21, var18, var22, var20, true, true, var2.n5, var2.l6.o8(), 0);
            this.k5();
         }

         if (var5 != null) {
            this.u3();
            float var32 = var14[1] ? var9 + var12[0] - var13[0] : var9;
            float var35 = var9 + var11;
            float var38 = var14[2] ? var35 - var12[2] + var13[2] : var35;
            float var41 = var8 + var10 + var13[1];
            float var44 = var41 - var13[1];
            float var47 = var41 - var12[1];
            this.l6();
            this.n5(var44, var9);
            float var50 = var9;
            float var53 = var35;
            if (var5.u3 == 2) {
               if (var2 != null && var2.u3 == 2) {
                  var50 -= var13[0];
               }

               if (var3 != null && var3.u3 == 2) {
                  var53 += var13[2];
               }

               this.l6(var41, var50);
               this.l6(var41, var53);
            }

            this.l6(var44, var35);
            this.l6(var47, var38);
            this.l6(var47, var32);
            this.u9();
            this.a6();
            this.n5(var47, var50, var41, var53, false, false, var5.n5, var5.l6.o8(), 1);
            this.k5();
         }

         if (var3 != null) {
            this.u3();
            float var33 = var14[3] ? var8 + var12[3] - var13[3] : var8;
            float var36 = var8 + var10;
            float var39 = var14[2] ? var36 - var12[1] + var13[1] : var36;
            float var42 = var9 + var11 + var13[2];
            float var45 = var42 - var13[2];
            float var48 = var42 - var12[2];
            this.l6();
            this.n5(var36, var45);
            float var51 = var8;
            float var54 = var36;
            if (var3.u3 == 2) {
               if (var4 != null && var4.u3 == 2) {
                  var51 -= var13[3];
               }

               if (var5 != null && var5.u3 == 2) {
                  var54 += var13[1];
               }

               this.l6(var54, var42);
               this.l6(var51, var42);
            }

            this.l6(var8, var45);
            this.l6(var33, var48);
            this.l6(var39, var48);
            this.u9();
            this.a6();
            this.n5(var51, var48, var54, var42, true, false, var3.n5, var3.l6.o8(), 2);
            this.k5();
         }

         if (var4 != null) {
            this.u3();
            float var34 = var14[0] ? var9 + var12[0] - var13[0] : var9;
            float var37 = var9 + var11;
            float var40 = var14[3] ? var37 - var12[2] + var13[2] : var37;
            float var43 = var8 - var13[3];
            float var46 = var43 + var13[3];
            float var49 = var43 + var12[3];
            this.l6();
            this.n5(var46, var37);
            float var52 = var9;
            float var55 = var37;
            if (var4.u3 == 2) {
               if (var2 != null && var2.u3 == 2) {
                  var52 -= var13[0];
               }

               if (var3 != null && var3.u3 == 2) {
                  var55 += var13[2];
               }

               this.l6(var43, var55);
               this.l6(var43, var52);
            }

            this.l6(var46, var9);
            this.l6(var49, var34);
            this.l6(var49, var40);
            this.u9();
            this.a6();
            this.n5(var43, var52, var49, var55, false, true, var4.n5, var4.l6.o8(), 3);
            this.k5();
         }
      } finally {
         this.n5(var6.y4());
      }
   }

   @Override
   protected void n5(com.aspose.slides.internal.d2.c8 var1) {
      float var2 = var1.n3() / 1000.0F;
      float var3 = var1.y4() / 1000.0F;
      float var4 = var1.c8() / 1000.0F;
      float var5 = var1.x8() / 1000.0F;
      float var6 = var2 + var3;
      float var7 = var4 + var5;
      float var8 = var1.e_() / 1000.0F;
      if (var8 != 0.0F || var7 != 0.0F && var6 != 0.0F) {
         float var9 = this.u3 / 1000.0F + var1.t2() / 1000.0F;
         float var10 = (this.k5.n5() + var1.w1()) / 1000.0F;
         float var11 = var1.l6() / 1000.0F;
         this.n5(var1, var9, var10 - var4, var11 + var6, var8 + var7);
      }
   }

   protected final int n5(com.aspose.slides.internal.a0.x8 var1) {
      int var2 = 0;
      int var3 = 0;
      boolean var4 = true;
      int[] var5 = this.k5.u3();
      com.aspose.slides.internal.a0.l6 var6 = var1.t4();

      while (var6 != null) {
         com.aspose.slides.internal.a0.x8 var7 = com.aspose.slides.internal.v6g.k5.n5(var6, com.aspose.slides.internal.a0.x8.class);
         if (var7 != null) {
            int var8 = var7.m1();
            if (var8 == 2 || var8 == 4 || var8 == 5 || var8 == 3) {
               break;
            }

            if (var8 == 1) {
               return 0;
            }

            if (var4) {
               var4 = false;
            }
         } else if (com.aspose.slides.internal.v6g.k5.l6(var6, com.aspose.slides.internal.a0.j5.class)) {
            break;
         }

         var6 = var6.t4();
         var2++;
         if (!var4) {
            var3 += var5[var2];
         }
      }

      return var3;
   }

   @Override
   protected void n5(com.aspose.slides.internal.a0.x8 var1, List<com.aspose.slides.internal.a0.l6> var2) {
      int var3 = this.u3;
      this.k5.l6();
      com.aspose.slides.internal.a0.e2 var4 = var1.i1();
      int var5 = var1.c8();
      int var6 = var1.m1();
      if (var6 != 2 && var6 != 4 && var6 != 5 && var6 != 3) {
         boolean var22 = false;
         if (var6 == 1) {
            int var28 = 0;
            int var25 = 0;
            if (var1.b3()) {
               com.aspose.slides.internal.a0.t2 var24 = com.aspose.slides.internal.v6g.k5.n5(var1.c4().get_Item(0), com.aspose.slides.internal.a0.t2.class);
               com.aspose.slides.internal.a0.k7 var30 = this.n5((Object)var24);
               if (var30 != null) {
                  short var31 = 6000;
                  com.aspose.slides.internal.v4.h0 var32 = com.aspose.slides.internal.v6g.k5.n5(
                     com.aspose.slides.internal.v6g.k5.n5(var1.n3.y4(), com.aspose.slides.internal.v4.c8.class).u3, com.aspose.slides.internal.v4.h0.class
                  );
                  switch (var32.z6()) {
                     case 23:
                        int var33 = (var1.l6() - var30.k7()) / 2;
                        var1.y4 = var1.l6() / 2 - var33;
                        var24.n5(-var1.y4, false, true);
                        break;
                     case 39:
                        var1.y4 = var1.l6() - (var1.l6() - var30.k7() + 6000);
                        var24.n5(-var1.y4 - 6000, false, true);
                        break;
                     default:
                        var1.y4 = 6000;
                  }

                  var1.l6(var1.l6() - var30.k7());
                  var1.t9 = -(var1.e_() / 2);
               }
            }

            if (var1.y4 != 0) {
               var28 = var1.y4;
            } else if (var1.e2 != 0) {
               var28 = -var1.e2;
            }

            if (var1.t9 != 0) {
               var25 = var1.t9;
            } else if (var1.z1 != 0) {
               var25 = -var1.z1;
            }

            this.l6(new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, var28, var25));
            var22 = true;
         }

         this.k5.n5(this.k5.n5() + var1.e2());
         if (var1.z1() != 57) {
            this.n5((com.aspose.slides.internal.a0.t2)var1);
         }

         this.u3 = this.u3 + var1.m3();
         if (this.s7 != 0) {
            var4.n5(0.0);
         }

         com.aspose.slides.internal.a0.e2 var29 = new com.aspose.slides.internal.a0.e2(this.a6, this.k5.n5());
         var4 = var29.n5(var4);
         this.k5.n5(this.k5.n5() + var5);
         com.aspose.slides.internal.o9b.y2 var26 = com.aspose.slides.internal.o9b.y2.n5.n3();
         if (var1.e5()) {
            var26 = new com.aspose.slides.internal.o9b.y2(this.u3, 0, var1.l6(), var1.e_());
         }

         this.n5(var4, com.aspose.slides.internal.o9b.y1.n5(var26).y4());
         this.u3 = 0;
         this.k5.n5(0);
         this.n5((com.aspose.slides.internal.a0.t2)var1, var2);
         this.n3();
         this.u3 = var3;
         this.k5.k5();
         this.k5.n5(this.k5.n5() + var1.a6());
         if (var22) {
            this.k5();
         }
      } else {
         List var7 = null;
         if (var6 == 3) {
            var7 = this.n5();
         }

         int var9;
         int var10;
         if (var6 != 2) {
            var10 = var1.y1();
            var9 = var1.d5();
         } else {
            if (var1.a0() && var1.d2()) {
               var9 = this.k5.n5();
            } else {
               int var8 = -this.n5(var1);
               var9 = var8 + var1.d5();
            }

            if (var1.s3() && var1.p8()) {
               var10 = this.u3;
            } else {
               var10 = var1.y1();
            }
         }

         var10 += var1.m3();
         com.aspose.slides.internal.x4g.m1 var23 = new com.aspose.slides.internal.x4g.m1();
         var23.k5(var10, var9);
         int var11 = var1.h0();
         int var12 = var1.n3();
         int var13 = var1.y4();
         var23.k5(-var12, 0.0F);
         String var14 = var1.n5(n5);
         if (var14 != null) {
            throw new NotImplementedException();
         }

         this.l6(var23);
         float var15 = var1.n5(true).l6() / 1000.0F;
         float var16 = var1.e_() / 1000.0F;
         float var17 = (var12 + var13) / 1000.0F;
         float var18 = (var5 + var1.x8()) / 1000.0F;
         this.n5(var1, 0.0F, 0.0F, var15 + var17, var16 + var18);
         if (var1.e5()) {
            com.aspose.slides.internal.o9b.y1 var19 = var1.o0().y4();
            this.n5(var19.x8() / 1000.0F, var19.n3() / 1000.0F, var19.s7() / 1000.0F, var19.k5() / 1000.0F);
         }

         com.aspose.slides.internal.x4g.m1 var34 = new com.aspose.slides.internal.x4g.m1();
         if (var11 != -1 && (var11 & 1) != 0) {
            var34.k5(var13, var5);
         } else {
            var34.k5(var12, var5);
         }

         this.l6(var34);
         com.aspose.slides.internal.x4g.m1 var20 = var4.l6();
         this.l6(var20);
         this.u3 = 0;
         this.k5.n5(0);
         this.n5((com.aspose.slides.internal.a0.t2)var1, var2);
         this.k5();
         this.k5();
         this.k5();
         if (var6 == 3 && var7 != null) {
            this.n5(var7);
         }

         this.u3 = var3;
         this.k5.k5();
      }
   }

   private com.aspose.slides.internal.a0.k7 n5(Object var1) {
      if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.a0.t2.class)) {
         List var2 = com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.a0.t2.class).c4();
         if (var2.size() > 0) {
            return this.n5(var2.get_Item(0));
         }
      }

      return com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.a0.k7.class)
         ? com.aspose.slides.internal.v6g.k5.n5(var1, com.aspose.slides.internal.a0.k7.class)
         : null;
   }

   @Override
   protected void l6(com.aspose.slides.internal.a0.t2 var1) {
      int var2 = this.u3;
      this.k5.l6();
      com.aspose.slides.internal.x4g.m1 var3 = new com.aspose.slides.internal.x4g.m1();
      var3.k5(this.u3, this.k5.n5());
      var3.k5(var1.y1(), var1.d5());
      var3.k5(0.0F, var1.e2());
      this.l6(var3);
      this.u3 = 0;
      this.k5.n5(0);
      if (var1.z1() != 57) {
         this.n5(var1);
      }

      List var4 = var1.c4();
      if (var4 != null) {
         this.n5(var1, var4);
      }

      this.k5();
      this.u3 = var2;
      this.k5.k5();
   }

   @Override
   protected void n5(com.aspose.slides.internal.a0.j5 var1) {
      int var2 = this.u3;
      this.k5.l6();
      com.aspose.slides.internal.x4g.m1 var3 = new com.aspose.slides.internal.x4g.m1();
      var3.k5(this.u3, this.k5.n5());
      if (!var3.l6()) {
         this.l6(var3);
      }

      this.u3 = 0;
      this.k5.n5(0);
      super.n5(var1);
      if (!var3.l6()) {
         this.k5();
      }

      this.u3 = var2;
      this.k5.k5();
   }

   protected abstract void n5(com.aspose.slides.internal.x4g.m1 var1);

   @Override
   protected void n5(com.aspose.slides.internal.d2.x8 var1) {
      int var2 = var1.h0();
      float var3 = this.u3 / 1000.0F;
      float var4 = (this.k5.n5() + var1.w1()) / 1000.0F;
      float var5 = var1.l6() / 1000.0F;
      float var6 = var1.e_() / 1000.0F;
      float var7 = var1.n3() / 1000.0F;
      float var8 = var1.y4() / 1000.0F;
      float var9 = var1.c8() / 1000.0F;
      float var10 = var1.x8() / 1000.0F;
      float var11 = var7 + var8;
      float var12 = var9 + var10;
      this.n5(var1, var3, var4, var5 + var11, var6 + var12);
      if (var1.m1()) {
         this.l6();
         this.n5(var3 + var7, var4 + var9, var5, var6);
      }

      super.n5(var1);
      if (var1.m1()) {
         this.k5();
      }
   }

   protected abstract void n5(List<Object> var1);

   protected abstract List<Object> n5();

   protected abstract void l6();

   protected abstract void k5();

   protected abstract void u3();

   protected final void n5(com.aspose.slides.internal.v0.t9 var1, int var2, com.aspose.slides.internal.d2.c8 var3, int var4, int var5) {
      boolean var6 = var3.r4() || var3.c4() || var3.y2();
      if (var6) {
         this.u3();
         float var7 = var1.u3(var2) / 1000.0F;
         float var8 = var1.k5(var2) / 1000.0F;
         if (n1.n5(var8, 0.0F) == 0) {
            var8 = var1.l6(var2) / 1500.0F;
         }

         float var9 = var7 / -8.0F / 2.0F;
         float var10 = (var5 + var3.l6()) / 1000.0F;
         if (var3.r4()) {
            com.aspose.slides.internal.o9b.c8 var11 = com.aspose.slides.internal.v6g.k5.u3(var3.a6(34), com.aspose.slides.internal.o9b.c8.class).o8();
            float var12 = var4 - var7 / 2.0F;
            this.n5(var5 / 1000.0F, (var12 - var9) / 1000.0F, var10, (var12 + var9) / 1000.0F, true, true, 133, var11.o8(), 0);
         }

         if (var3.c4()) {
            com.aspose.slides.internal.o9b.c8 var13 = com.aspose.slides.internal.v6g.k5.u3(var3.a6(35), com.aspose.slides.internal.o9b.c8.class).o8();
            float var15 = var4 - 1.1F * var8;
            this.n5(var5 / 1000.0F, (var15 - var9) / 1000.0F, var10, (var15 + var9) / 1000.0F, true, true, 133, var13.o8(), 0);
         }

         if (var3.y2()) {
            com.aspose.slides.internal.o9b.c8 var14 = com.aspose.slides.internal.v6g.k5.u3(var3.a6(36), com.aspose.slides.internal.o9b.c8.class).o8();
            float var16 = var4 - 0.45F * var8;
            this.n5(var5 / 1000.0F, (var16 - var9) / 1000.0F, var10, (var16 + var9) / 1000.0F, true, true, 133, var14.o8(), 0);
         }
      }
   }

   protected abstract void a6();

   protected abstract void n5(float var1, float var2, float var3, float var4);

   protected abstract void n5(float var1, float var2);

   protected abstract void l6(float var1, float var2);

   protected abstract void u9();

   protected abstract void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      com.aspose.slides.internal.v8.n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8
   );

   protected abstract void n5(
      float var1,
      float var2,
      float var3,
      float var4,
      com.aspose.slides.internal.v8.n5 var5,
      com.aspose.slides.internal.v8.n5 var6,
      com.aspose.slides.internal.v8.n5 var7,
      com.aspose.slides.internal.v8.n5 var8,
      com.aspose.slides.internal.w0.l6 var9
   );

   protected abstract void n5(com.aspose.slides.internal.o9b.c8 var1, boolean var2);

   protected abstract void n5(
      String var1, com.aspose.slides.internal.o9b.y1 var2, IGenericDictionary<com.aspose.slides.internal.o0.l6, String> var3, boolean var4
   );

   protected final void n5(String var1, com.aspose.slides.internal.o9b.y1 var2, boolean var3) {
      this.n5(var1, var2.y4(), null, var3);
   }

   protected abstract void n5(
      float var1, float var2, float var3, float var4, boolean var5, boolean var6, int var7, com.aspose.slides.internal.o9b.c8 var8, int var9
   );

   @Override
   public void n5(com.aspose.slides.internal.d2.u9 var1, com.aspose.slides.internal.o9b.y1 var2) {
      this.u3();
      XmlDocument var3 = var1.m1();
      String var4 = var1.k7();
      this.n5(var3, var4, var2.y4(), var1.z3());
   }

   protected final void l6(com.aspose.slides.internal.x4g.m1 var1) {
      this.l6();
      this.n5(this.k5(var1));
   }
}
