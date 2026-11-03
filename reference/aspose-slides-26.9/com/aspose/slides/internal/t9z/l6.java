package com.aspose.slides.internal.t9z;

import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.internal.o9b.m3;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.s7;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class l6 {
   private u9 n5;
   private final com.aspose.slides.internal.w1y.n5 l6;

   public l6(u9 var1) {
      this.n5 = var1;
      this.l6 = this.l6();
   }

   private com.aspose.slides.internal.w1y.n5 l6() {
      if (!this.n5(this.n5.n5())) {
         return new com.aspose.slides.internal.w1y.n5();
      }

      s7 var1 = s7.n5((Object)(this.n5.n5()));
      s7[] var2 = this.l6(var1);
      com.aspose.slides.internal.w1y.n5 var3 = new com.aspose.slides.internal.w1y.n5();

      for (s7 var7 : var2) {
         PathIterator var8 = var7.l6().getPathIterator(null);
         if (!var8.isDone()) {
            var3.n5(this.n5(var7));
         }
      }

      return var3;
   }

   private com.aspose.slides.internal.w1y.l6 n5(s7 var1) {
      m3 var2 = this.n5.l6().n5();
      a6 var3 = new a6(var2);
      boolean var4 = this.n5.l6().n5().x8() != 0;
      boolean var5 = var1.t4();
      boolean var6 = this.l6((Shape)var1);

      try {
         m1 var7 = m1.n5(this.n5.k5());
         if ((var7.l6() || !var7.k5() || !var4 || !var5) && !var6) {
            var1.y4();
         } else {
            var1.l6(var7);
            var1.y4();
            m1 var8 = var7.u9();
            var8.h0();
            var1.l6(var8);
         }

         com.aspose.slides.internal.v9l.a6 var24 = this.n5(var1, this.n5.u9());
         if (var2.n3() == 255 && var24.u9() != null) {
            var2.l6(var24.u9());
         }

         if (var2.y4() == 255 && var24.h0() != null) {
            var2.n5(var24.h0());
         }

         com.aspose.slides.internal.x7u.u9 var9 = com.aspose.slides.internal.x7u.h0.n5(this.n5.l6(), var1);
         n5 var10 = new n5();
         k5 var11 = this.n5(var10);
         n5 var12 = new n5();
         k5 var13 = this.n5(var12);
         n5 var14 = new n5();
         k5 var15 = this.n5(var14);
         k5 var16 = var11;
         com.aspose.slides.internal.t4p.n5 var17 = new com.aspose.slides.internal.t4p.n5(this.n5, var1, var5, var24, var13, var15, var16);
         k5 var18 = var11;
         var18 = this.n5(var9, var18, var17);
         var18 = this.n5(var1, var18);
         u3.n5(var24.n5(), var18);
         com.aspose.slides.internal.w1y.l6 var19 = new com.aspose.slides.internal.w1y.l6();
         var19.n5 = var10.k5();
         var19.l6 = var12.k5();
         var19.k5 = var14.k5();
         return var19;
      } finally {
         var3.n5(var2);
      }
   }

   public com.aspose.slides.internal.w1y.n5 n5() {
      return this.l6;
   }

   private k5 n5(n5 var1) {
      n5 var2 = var1;
      return com.aspose.slides.internal.i1t.n5.n5(this.n5.k5(), var2);
   }

   private com.aspose.slides.internal.k3w.a6 n5(com.aspose.slides.internal.x7u.u9 var1, k5 var2, com.aspose.slides.internal.t4p.n5 var3) {
      List var4 = var1.n5() ? var1.l6() : Collections.singletonList(var1);
      List var5 = this.k5();
      return new com.aspose.slides.internal.k3w.a6(this.n5.l6(), this.n5.u3(), var2, var3, var3, var4, var5);
   }

   private k5 n5(s7 var1, k5 var2) {
      com.aspose.slides.internal.m5k.n5 var3 = com.aspose.slides.internal.m5k.l6.n5(this.n5.l6().n5(), var1, var2);
      return var3 != null ? var3 : var2;
   }

   private com.aspose.slides.internal.v9l.a6 n5(s7 var1, boolean var2) {
      com.aspose.slides.internal.v9l.n5 var3 = new com.aspose.slides.internal.v9l.n5(this.n5.l6(), var2);
      return var3.n5(var1);
   }

   private List<com.aspose.slides.internal.w2k.a6> k5() {
      m3 var1 = this.n5.l6().n5();
      float var2 = var1.q0() / 2.0F;
      if (com.aspose.slides.internal.x7u.h0.n5(var1)) {
         ArrayList var3 = new ArrayList();
         float[] var4 = var1.a6();

         for (int var5 = 0; var5 < var4.length - 1; var5++) {
            if (var5 % 2 == 0) {
               float var6 = var4[var5];
               float var7 = var4[var5 + 1];
               float var8 = Math.abs(0.5F - var6) * 2.0F * var2;
               float var9 = Math.abs(0.5F - var7) * 2.0F * var2;
               var3.add(this.n5(var1, var8, var9));
            }
         }

         return var3;
      } else {
         return Arrays.asList(this.n5(var1, var2, var2));
      }
   }

   private com.aspose.slides.internal.w2k.a6 n5(m3 var1, float var2, float var3) {
      switch (var1.e2()) {
         case 0:
            return new com.aspose.slides.internal.w2k.h0(var1);
         case 1:
            return new com.aspose.slides.internal.w2k.l6();
         case 2:
            AffineTransform var4 = var1.t4().t2();
            return new com.aspose.slides.internal.w2k.k5(var2, var3, var4);
         case 3:
            return new com.aspose.slides.internal.w2k.u9(var1);
         default:
            throw new InvalidEnumArgumentException("LineJoin");
      }
   }

   private s7[] l6(s7 var1) {
      ArrayList var2 = new ArrayList();
      float[] var3 = new float[6];
      GeneralPath var4 = null;
      w1 var5 = null;
      w1 var6 = null;

      for (PathIterator var7 = var1.l6().getPathIterator(null); !var7.isDone(); var7.next()) {
         int var8 = var7.currentSegment(var3);
         if (var8 == 0) {
            if (var4 != null) {
               var2.add(s7.n5((Object)(var4)));
            }

            var4 = new GeneralPath();
            var4.moveTo(var3[0], var3[1]);
            var5 = new w1(var3[0], var3[1]);
            var6 = new w1(var3[0], var3[1]);
         } else if (var8 == 4) {
            if (var4 != null) {
               var4.closePath();
               var2.add(s7.n5((Object)(var4)));
               var6 = new w1(var5.l6(), var5.k5());
            }

            var4 = null;
         } else {
            if (var4 == null) {
               var4 = new GeneralPath();
               if (var6 == null) {
                  var5 = new w1(var3[0], var3[1]);
                  var4.moveTo(var3[0], var3[1]);
               } else {
                  var5 = new w1(var6.l6(), var6.k5());
                  var4.moveTo(var6.l6(), var6.k5());
               }
            }

            if (var8 == 1) {
               var4.lineTo(var3[0], var3[1]);
               var6 = new w1(var3[0], var3[1]);
            } else if (var8 == 2) {
               var4.quadTo(var3[0], var3[1], var3[2], var3[3]);
               var6 = new w1(var3[2], var3[3]);
            } else if (var8 == 3) {
               var4.curveTo(var3[0], var3[1], var3[2], var3[3], var3[4], var3[5]);
               var6 = new w1(var3[4], var3[5]);
            }
         }
      }

      if (var4 != null) {
         var2.add(s7.n5((Object)(var4)));
      }

      return (s7[])var2.toArray(new s7[var2.size()]);
   }

   private boolean n5(Shape var1) {
      float[] var2 = new float[6];
      PathIterator var3 = var1.getPathIterator(null);

      while (!var3.isDone()) {
         switch (var3.currentSegment(var2)) {
            case 3:
               if (!this.n5(var2[4]) || !this.n5(var2[5])) {
                  return false;
               }
            case 2:
               if (!this.n5(var2[2]) || !this.n5(var2[3])) {
                  return false;
               }
            case 0:
            case 1:
               if (!this.n5(var2[0]) || !this.n5(var2[1])) {
                  return false;
               }
            default:
               var3.next();
         }
      }

      return true;
   }

   private boolean l6(Shape var1) {
      float[] var2 = new float[6];
      boolean var3 = false;

      for (PathIterator var4 = var1.getPathIterator(null); !var4.isDone(); var4.next()) {
         switch (var4.currentSegment(var2)) {
            case 0:
            case 3:
            case 4:
            default:
               var3 = true;
               break;
            case 1:
            case 2:
               var3 = false;
         }
      }

      return var3;
   }

   private boolean n5(float var1) {
      return !Float.isNaN(var1) && !Float.isInfinite(var1);
   }
}
