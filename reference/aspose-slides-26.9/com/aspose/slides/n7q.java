package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

class n7q {
   private boolean n5 = false;
   private double l6;
   private float k5;
   private double u3;
   private com.aspose.slides.internal.o9b.c8 a6 = new com.aspose.slides.internal.o9b.c8();
   private byte u9;
   private double h0;
   private double c8;
   private boolean t2;
   private double s7;
   private double x8;
   private final float n3 = 3.0F;
   private final int y4 = 4;

   n7q(IOuterShadow var1) {
      this.l6 = var1.getBlurRadius();
      this.k5 = var1.getDirection();
      this.u3 = var1.getDistance();
      ((ColorFormat)var1.getShadowColor()).u3().n5(this.a6);
      this.u9 = var1.getRectangleAlign();
      this.h0 = var1.getSkewHorizontal();
      this.c8 = var1.getSkewVertical();
      this.t2 = var1.getRotateShadowWithShape();
      this.s7 = var1.getScaleHorizontal();
      this.x8 = var1.getScaleVertical();
   }

   n7q(IOuterShadowEffectiveData var1) {
      this.l6 = var1.getBlurRadius();
      this.k5 = var1.getDirection();
      this.u3 = var1.getDistance();
      ((k0p)var1).l6().n5(this.a6);
      this.u9 = var1.getRectangleAlign();
      this.h0 = var1.getSkewHorizontal();
      this.c8 = var1.getSkewVertical();
      this.t2 = var1.getRotateShadowWithShape();
      this.s7 = var1.getScaleHorizontal();
      this.x8 = var1.getScaleVertical();
   }

   public final void n5(e3 var1, j0b$n5[] var2) {
      if (var2 != null) {
         float var3 = 0.0F;
         com.aspose.slides.internal.x4g.s7 var4 = new com.aspose.slides.internal.x4g.s7();

         for (j0b$n5 var8 : var2) {
            if (var8.n5() != null && var8.n5().h0() != 0) {
               var4.n5(var8.n5(), false);
               if (var8.k5() != null && var8.k5().u9()) {
                  var3 = com.aspose.slides.ms.System.q1.n5((float)(var3), (float)((float)var8.k5().n5()));
               }
            }
         }

         com.aspose.slides.internal.x4g.m1 var31 = this.l6(var4, var1);
         var4.l6(var31);
         double var9 = this.l6;
         byte var32 = 2;
         com.aspose.slides.internal.o9b.y1 var11 = var4.s7().y4();
         com.aspose.slides.internal.o9b.w1 var12 = new com.aspose.slides.internal.o9b.w1(
            var11.x8() - (var3 + var32 + (float)var9), var11.n3() - (var3 + var32 + (float)var9)
         );
         com.aspose.slides.internal.x4g.m1 var13 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var12.l6(), -var12.k5());
         com.aspose.slides.internal.o9b.l6 var14 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(var11.s7() + 2.0 * (var3 + var32 + var9), 14),
            com.aspose.slides.internal.v6g.k5.u3(var11.k5() + 2.0 * (var3 + var32 + var9), 14),
            2498570
         );

         try {
            com.aspose.slides.internal.o9b.z1 var15 = n2d.n5(var14, var1);

            try {
               var15.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());

               for (j0b$n5 var19 : var2) {
                  a1v var20 = var19.l6() != null ? var19.l6().s7() : null;
                  l6v var21 = var19.k5() != null ? var19.k5().w1() : null;
                  com.aspose.slides.internal.x4g.s7 var22 = (com.aspose.slides.internal.x4g.s7)var19.n5().deepClone();
                  var22.l6(var31);
                  var22.l6(var13);
                  this.n5(var15, var22, var20, var21, var31, true);
               }
            } finally {
               if (var15 != null) {
                  var15.dispose();
               }
            }

            this.n5(var14, var9, com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class));
            this.n5(var1, var14, var12.u3());
         } finally {
            if (var14 != null) {
               var14.dispose();
            }
         }
      }
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4) {
      this.n5(var1, var2, var3, var4, false);
   }

   public final void n5(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, boolean var5) {
      if (this.n5(var3, var4, var5)) {
         this.l6(var1, var2, var3, var4, var5);
      } else {
         this.l6(var1, var2, var3, var4);
      }
   }

   private void l6(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, boolean var5) {
      if (this.n5 || var3 != null && var3.u3() != 0 || var4 != null && var4.u9()) {
         if (var4 != null) {
            var4 = var4.w1();
         }

         com.aspose.slides.internal.x4g.s7 var6 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
         var2 = com.aspose.slides.internal.v6g.k5.n5(var2.deepClone(), com.aspose.slides.internal.x4g.s7.class);
         float var7 = var4 != null && var4.u9() ? (float)var4.n5() : 0.0F;
         com.aspose.slides.internal.x4g.m1 var8 = this.l6(var2, var1);
         var2.l6(var8);
         double var9 = this.l6;
         byte var11 = 2;
         com.aspose.slides.internal.o9b.y1 var12 = var2.s7().y4();
         com.aspose.slides.internal.o9b.w1 var13 = new com.aspose.slides.internal.o9b.w1(
            var12.x8() - (var7 + var11 + (float)var9), var12.n3() - (var7 + var11 + (float)var9)
         );
         com.aspose.slides.internal.x4g.m1 var14 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, -var13.l6(), -var13.k5());
         var2.l6(var14);
         var6.l6(var14);
         var8.n5(var14, 1);
         com.aspose.slides.internal.o9b.l6 var15 = new com.aspose.slides.internal.o9b.l6(
            com.aspose.slides.internal.v6g.k5.u3(var12.s7() + 2.0 * (var7 + var11 + var9), 14),
            com.aspose.slides.internal.v6g.k5.u3(var12.k5() + 2.0 * (var7 + var11 + var9), 14),
            2498570
         );

         try {
            if (var1.a0() != null) {
               var15.n5(var1.a0().s7(), var1.a0().x8());
            }

            com.aspose.slides.internal.o9b.z1 var16 = n2d.n5(var15, var1);

            try {
               if (var3 != null) {
                  if (this.n5 && var3.u3() == 0) {
                     var3 = var3.x8();
                     var3.n5(com.aspose.slides.internal.o9b.c8.n5(255, this.a6.o8()).o8());
                  } else {
                     var3 = var3.s7();
                  }
               }

               var16.n5(com.aspose.slides.internal.o9b.c8.n5(0).o8());
               this.n5(var16, var2, var3, var4, var8);
            } finally {
               if (var16 != null) {
                  var16.dispose();
               }
            }

            this.n5(var15, var9, com.aspose.slides.internal.v6g.k5.l6(var1, r1c.class));
            if (var5) {
               com.aspose.slides.internal.o9b.z1 var17 = n2d.n5(var15, var1);

               try {
                  var17.u9(3);
                  var17.n5(1);
                  var17.n5(com.aspose.slides.internal.o9b.a6.k5(), var6);
               } finally {
                  if (var17 != null) {
                     var17.dispose();
                  }
               }
            }

            this.n5(var1, var15, var13.u3());
         } finally {
            if (var15 != null) {
               var15.dispose();
            }
         }

         var2.dispose();
      }
   }

   private void l6(e3 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4) {
      if (var3 != null || var4 != null) {
         if (var2 != null && var2.h0() != 0) {
            a1v var5 = null;
            if (var3 != null && (var3.u3() != 0 && var3.u3() != -1 || this.n5 && var3.u3() == 0)) {
               var5 = var3.x8();
               var5.n5(n5(var3.n5().o8(), this.a6.o8()).o8());
            }

            l6v var6 = null;
            if (var4 != null && var4.u9()) {
               var6 = var4.w1();
               double var7 = this.s7 / 100.0;
               var6.n5(var6.n5() * var7);
               var6.n5(n5(var4.h0().o8(), this.a6.o8()).o8());
            }

            com.aspose.slides.internal.x4g.s7 var9 = (com.aspose.slides.internal.x4g.s7)var2.deepClone();

            try {
               com.aspose.slides.internal.x4g.m1 var10 = this.l6(var9, var1);
               var9.l6(var10);
               if (!this.t2) {
                  com.aspose.slides.internal.w0.c8 var11 = var1.q0();
                  var1.z3();
                  var1.n5(var9, var6, var5);
                  var1.n5(var11, false);
               } else {
                  var1.n5(var9, var6, var5);
               }
            } finally {
               if (var9 != null) {
                  var9.dispose();
               }
            }
         }
      }
   }

   private static com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var0, com.aspose.slides.internal.o9b.c8 var1) {
      int var2 = (var0.s7() & 255) * (var1.s7() & 255) / 255;
      return com.aspose.slides.internal.o9b.c8.n5(var2, var1.x8() & 255, var1.n3() & 255, var1.y4() & 255);
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, double var2, boolean var4) {
      com.aspose.slides.internal.o9b.c8 var5 = this.a6.o8();
      n2d.n5(var1, var5.o8());
      this.n5(var1, var5.o8());
      x9p.n5(var1, var2 / 3.0, 4);
      if (var4) {
         com.aspose.slides.internal.n2d.y4.n5(var1);
      }
   }

   public final com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.x4g.s7 var1, e3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("shapePath is null");
      }

      com.aspose.slides.internal.x4g.s7 var3 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);
      com.aspose.slides.internal.x4g.m1 var4 = this.l6(var3, var2);
      var3.l6(var4);
      return var3.s7().y4();
   }

   public final com.aspose.slides.internal.x4g.m1 l6(com.aspose.slides.internal.x4g.s7 var1, e3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("graphicsPath is null");
      }

      com.aspose.slides.internal.x4g.m1 var3 = new com.aspose.slides.internal.x4g.m1();
      com.aspose.slides.internal.x4g.s7 var4 = com.aspose.slides.internal.v6g.k5.n5(var1.deepClone(), com.aspose.slides.internal.x4g.s7.class);
      if (!this.t2 && var2 != null) {
         com.aspose.slides.internal.w0.c8 var5 = var2.q0();
         com.aspose.slides.internal.w0.c8 var6 = var2.z3();
         var2.n5(var5, false);
         com.aspose.slides.internal.x4g.m1 var7 = com.aspose.slides.internal.n8e.n1.l6(var5);
         com.aspose.slides.internal.x4g.m1 var8 = com.aspose.slides.internal.n8e.n1.l6(com.aspose.slides.internal.n8e.n1.n5(var6));
         var7.n5(var8, 1);
         var3.n5(var7, 1);
         var4.l6(var3);
      }

      com.aspose.slides.internal.o9b.y1 var21 = var4.s7().y4();
      com.aspose.slides.internal.o9b.w1 var22 = n5(var21.y4(), this.u9).u3();
      float var23 = var22.l6();
      float var24 = var22.k5();
      double var9 = this.h0;
      double var11 = this.c8;
      double var13 = this.s7;
      double var15 = this.x8;
      float var17 = this.k5;
      double var18 = this.u3;
      if (var9 != 0.0 || var11 != 0.0) {
         com.aspose.slides.internal.x4g.m1 var20 = new com.aspose.slides.internal.x4g.m1();
         var20.k5(var23, var24);
         var20.l6((float)(com.aspose.slides.ms.System.q1.t2(var9 / 180.0) * Math.PI), (float)(com.aspose.slides.ms.System.q1.t2(var11 / 180.0) * Math.PI));
         var20.k5(-var23, -var24);
         var3.n5(var20, 1);
      }

      if (var13 != 0.0 || var15 != 0.0) {
         com.aspose.slides.internal.x4g.m1 var25 = new com.aspose.slides.internal.x4g.m1();
         var25.k5(var23, var24);
         var25.n5((float)(var13 / 100.0), (float)(var15 / 100.0));
         var25.k5(-var23, -var24);
         var3.n5(var25, 1);
      }

      if (var17 != 0.0F || var18 != 0.0) {
         com.aspose.slides.internal.x4g.m1 var26 = new com.aspose.slides.internal.x4g.m1();
         var26.n5(var17, new com.aspose.slides.internal.o9b.w1(var23, var24));
         var26.k5((float)var18, 0.0F);
         var26.n5(-var17, new com.aspose.slides.internal.o9b.w1(var23, var24));
         var3.n5(var26, 1);
      }

      if (var4 != null) {
         var4.dispose();
      }

      return var3;
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.o9b.c8 var2) {
      byte[] var3 = n2d.n5(var1);
      byte var4 = var2.s7();
      byte var5 = var2.x8();
      byte var6 = var2.n3();
      byte var7 = var2.y4();
      float var8 = (255 - (var2.s7() & 255)) / 255.0F;
      int var9 = 0;

      while (var9 < var3.length) {
         if ((var3[var9 + 3] & 255) == 255) {
            var3[var9++] = var7;
            var3[var9++] = var6;
            var3[var9++] = var5;
            var3[var9++] = var4;
         } else if ((var3[var9 + 3] & 255) != 0) {
            var3[var9++] = var7;
            var3[var9++] = var6;
            var3[var9++] = var5;
            byte var10 = var3[var9];
            var10 = com.aspose.slides.internal.v6g.k5.n5((Object)((var10 & 0xFF) - (var10 & 0xFF) * var8), 13);
            var3[var9++] = var10;
         } else {
            var9 += 4;
         }
      }

      n2d.n5(var1, var3);
   }

   private void n5(com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, com.aspose.slides.internal.x4g.m1 var5) {
      this.n5(var1, var2, var3, var4, var5, false);
   }

   private void n5(
      com.aspose.slides.internal.o9b.z1 var1, com.aspose.slides.internal.x4g.s7 var2, a1v var3, l6v var4, com.aspose.slides.internal.x4g.m1 var5, boolean var6
   ) {
      if (var3 != null && var3.u3() != 0) {
         if (var3.u3() == 1) {
            var3.n5(com.aspose.slides.internal.o9b.c8.n5(var3.n5().s7() & 255, this.a6.o8()).o8());
         }

         com.aspose.slides.internal.o9b.u3 var7 = d4.k5(var3);

         try {
            com.aspose.slides.internal.x4g.m1 var8 = new com.aspose.slides.internal.x4g.m1(1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
            if (!var6) {
               var8 = n2d.n5(var7);
            }

            var8.n5(var5, 1);
            n2d.n5(var7, var8);
            var1.n5(var7, var2);
         } finally {
            if (var7 != null) {
               var7.dispose();
            }
         }
      }

      if (var4 != null && var4.u9()) {
         double var10 = this.s7 / 100.0;
         double var12 = var4.n5() * var10;
         if (var12 >= 0.1 || var10 >= 9.0) {
            var4.n5(com.aspose.slides.internal.o9b.c8.n5(var4.h0().s7() & 255, this.a6.o8()).o8());
            com.aspose.slides.internal.o9b.m3 var14 = var4.q0();

            try {
               var14.k5(var14.q0() * (float)var10);
               var1.n5(var14, var2);
            } finally {
               if (var14 != null) {
                  var14.dispose();
               }
            }
         }
      }
   }

   private void n5(e3 var1, com.aspose.slides.internal.o9b.l6 var2, com.aspose.slides.internal.o9b.w1 var3) {
      if (!this.t2) {
         com.aspose.slides.internal.w0.c8 var4 = var1.q0();
         var1.z3();
         var1.n5(
            var2,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.l6()), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.k5()), 14)
         );
         var1.n5(var4, false);
      } else {
         var1.n5(
            var2,
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.l6()), 14),
            com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.k5(var3.k5()), 14)
         );
      }
   }

   static com.aspose.slides.internal.o9b.w1 n5(com.aspose.slides.internal.o9b.y1 var0, byte var1) {
      float var2 = 0.0F;
      float var3 = 0.0F;
      switch (var1) {
         case 0:
            var2 = (float)com.aspose.slides.ms.System.q1.k5(var0.x8());
            var3 = (float)com.aspose.slides.ms.System.q1.k5(var0.n3());
            break;
         case 1:
            var2 = (float)com.aspose.slides.ms.System.q1.k5(var0.x8() + var0.s7() / 2.0F);
            var3 = (float)com.aspose.slides.ms.System.q1.k5(var0.n3());
            break;
         case 2:
            var2 = (float)com.aspose.slides.ms.System.q1.k5(var0.x8() + var0.s7());
            var3 = (float)com.aspose.slides.ms.System.q1.k5(var0.n3());
            break;
         case 3:
            var2 = var0.x8();
            var3 = var0.n3() + var0.k5() / 2.0F;
            break;
         case 4:
            var2 = var0.x8() + var0.s7() / 2.0F;
            var3 = var0.n3() + var0.k5() / 2.0F;
            break;
         case 5:
            var2 = (float)com.aspose.slides.ms.System.q1.l6((double)(var0.x8() + var0.s7()));
            var3 = var0.n3() + var0.k5() / 2.0F;
            break;
         case 6:
            var2 = (float)com.aspose.slides.ms.System.q1.k5(var0.x8());
            var3 = (float)com.aspose.slides.ms.System.q1.l6((double)(var0.n3() + var0.k5()));
            break;
         case 7:
            var2 = (float)com.aspose.slides.ms.System.q1.k5(var0.x8() + var0.s7() / 2.0F);
            var3 = (float)com.aspose.slides.ms.System.q1.l6((double)(var0.n3() + var0.k5()));
            break;
         case 8:
            var2 = (float)com.aspose.slides.ms.System.q1.l6((double)(var0.x8() + var0.s7()));
            var3 = (float)com.aspose.slides.ms.System.q1.l6((double)(var0.n3() + var0.k5()));
            break;
         default:
            var2 = (float)com.aspose.slides.ms.System.q1.k5(var0.x8() + var0.s7() / 2.0F);
            var3 = (float)com.aspose.slides.ms.System.q1.l6((double)(var0.n3() + var0.k5()));
      }

      return new com.aspose.slides.internal.o9b.w1(var2, var3);
   }

   private boolean n5(a1v var1, l6v var2, boolean var3) {
      if (this.l6 != 0.0 || var3) {
         return true;
      }

      if (var1 == null) {
         return false;
      }

      byte var4 = var1.u3();
      if (var4 == 4 || var4 == 3) {
         q3d var5 = com.aspose.slides.internal.v6g.k5.n5(var1, q3d.class);
         if (var5 == null || var5.a0()) {
            return true;
         }

         com.aspose.slides.internal.o9b.l6 var6 = com.aspose.slides.internal.v6g.k5.n5(var5.y1(), com.aspose.slides.internal.o9b.l6.class);
         if (var6 == null || com.aspose.slides.internal.n8e.k7.k5(var6)) {
            return true;
         }
      }

      if (var4 == 2) {
         u4z var13 = com.aspose.slides.internal.v6g.k5.n5(var1, u4z.class);
         if (var13 == null) {
            return true;
         }

         SortedList var15 = var13.l6(true);
         IGenericEnumerator var7 = var15.iterator();

         try {
            while (var7.hasNext()) {
               KeyValuePair var8 = (KeyValuePair)var7.next();
               if ((((com.aspose.slides.internal.o9b.c8)var8.getValue()).s7() & 255) != 255) {
                  return true;
               }
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var7, IDisposable.class)) {
               var7.dispose();
            }
         }
      }

      if (var4 == 5) {
         return true;
      }

      boolean var14 = var4 != -1 && var4 != 0;
      boolean var16 = var2 != null && var2.u9();
      return var14 && var16 && (this.a6.s7() & 255) != 255 ? true : var14 && var16 && ((var1.n5().s7() & 255) != 255 || (var2.h0().s7() & 255) != 255);
   }

   final void n5(boolean var1) {
      this.n5 = var1;
   }
}
