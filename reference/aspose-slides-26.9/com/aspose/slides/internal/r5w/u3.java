package com.aspose.slides.internal.r5w;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.j9e.t2$n5;
import com.aspose.slides.internal.j9e.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.t4;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r3x.a6$x8;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.z0k.n3;
import com.aspose.slides.ms.System.x9;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.File;

public class u3 {
   private final x8 n5;

   public u3(x8 var1) {
      this.n5 = var1;
   }

   public void n5(t4 var1, j5 var2) {
      this.n5(var1, var2.n5(), var2.l6());
   }

   public void n5(t4 var1, w1 var2) {
      this.n5(var1, var2.l6(), var2.k5());
   }

   public void n5(t4 var1, j5[] var2) {
      this.n5(var1, w1.n5(var2));
   }

   public void n5(t4 var1, w1[] var2) {
      this.l6(var1, var2);
   }

   public void l6(t4 var1, w1[] var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentNullException("Value of 'destPoints' cannot be null");
      }

      int var3 = var2.length;
      if (var3 != 3 && var3 != 4) {
         throw new ArgumentException("Value of 'destPoints' is invalid");
      }

      if (var3 > 3) {
         throw new NotImplementedException();
      }

      y1 var4 = var1.n5(new int[]{2});
      float var5 = var4.x8();
      float var6 = var4.n3();
      float var7 = var4.s7();
      float var8 = var4.k5();
      m1 var9 = this.n5(var2, var4, false);
      m1 var10 = this.n5(var2, var4, true);
      float[] var11 = this.n5(var2[0].l6(), var2[0].k5(), var9.u9());
      float var12 = var11[0];
      float var13 = var11[1];
      float[] var14 = this.n5(var5, var6, var10.u9());
      float var15 = var14[0];
      float var16 = var14[1];
      var11 = this.n5(var2[1].l6(), var2[1].k5(), var9.u9());
      float var17 = var11[0];
      float var18 = var11[1];
      var11 = this.n5(var2[2].l6(), var2[2].k5(), var9.u9());
      float var19 = var11[0];
      float var20 = var11[1];
      var14 = this.n5(var5 + var7, var6, var10.u9());
      float var21 = var14[0];
      float var22 = var14[1];
      var14 = this.n5(var5, var6 + var8, var10.u9());
      float var23 = var14[0];
      float var24 = var14[1];
      y1 var25 = new y1(var5 + var15, var6 + var16, var7 - var15 + var21, var8 - var16 + var24);
      var2 = new w1[]{
         new w1(var2[0].l6() + var12, var2[0].k5() + var13),
         new w1(var2[1].l6() + var17, var2[1].k5() + var18),
         new w1(var2[2].l6() + var19, var2[2].k5() + var20)
      };
      this.n5(var1, var2, var25, 2, true);
   }

   public void n5(t4 var1, y2 var2) {
      j5[] var3 = new j5[]{new j5(var2.s7(), var2.x8()), new j5(var2.s7() + var2.t2(), var2.x8()), new j5(var2.s7(), var2.x8() + var2.l6())};
      this.n5(var1, var3);
   }

   public void n5(t4 var1, y1 var2) {
      w1[] var3 = new w1[]{new w1(var2.x8(), var2.n3()), new w1(var2.x8() + var2.s7(), var2.n3()), new w1(var2.x8(), var2.n3() + var2.k5())};
      this.n5(var1, var3);
   }

   public void n5(t4 var1, int var2, int var3) {
      this.n5(var1, (float)var2, (float)var3);
   }

   public void n5(t4 var1, float var2, float var3) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      y1 var4 = var1.n5(new int[]{2});
      this.n5(var1, var2, var3, var4.y4(), 2);
   }

   public void n5(t4 var1, y2 var2, y2 var3, int var4) {
      this.n5(var1, y1.n5(var2), y1.n5(var3), var4);
   }

   public void n5(t4 var1, y1 var2, y1 var3, int var4) {
      w1[] var5 = new w1[]{new w1(var2.x8(), var2.n3()), new w1(var2.x8() + var2.s7(), var2.n3()), new w1(var2.x8(), var2.n3() + var2.k5())};
      this.n5(var1, var5, var3, var4, null, true);
   }

   public void n5(t4 var1, w1[] var2, y1 var3, int var4) {
      this.n5(var1, var2, var3, var4, null);
   }

   public void n5(t4 var1, int var2, int var3, int var4, int var5) {
      this.n5(var1, (float)var2, (float)var3, (float)var4, (float)var5);
   }

   public void n5(t4 var1, float var2, float var3, float var4, float var5) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      w1[] var6 = new w1[]{new w1(var2, var3), new w1(var2 + var4, var3), new w1(var2, var3 + var5)};
      this.l6(var1, var6);
   }

   public void n5(t4 var1, j5[] var2, y2 var3, int var4, com.aspose.slides.internal.j9e.t2 var5) {
      this.n5(var1, w1.n5(var2), y1.n5(var3), var4, var5);
   }

   public void n5(t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5) {
      this.l6(var1, var2, var3, var4, var5, true);
   }

   private void n5(t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5, boolean var6) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentNullException("Value of 'destPoints' cannot be null");
      }

      int var7 = var2.length;
      if (var7 != 3 && var7 != 4) {
         throw new ArgumentException("Value of 'destPoints' is invalid");
      }

      if (var7 > 3) {
         throw new NotImplementedException();
      }

      if (var4 == 1) {
         throw new ArgumentException("Invalid parameter", "srcUnit");
      }

      if (var1 instanceof y4) {
         this.n5.n5((y4)var1, var2, var3, var4, new a6(this));
      } else {
         var3 = com.aspose.slides.internal.r5w.n5.n5(var4, 2, var3);
         if (!com.aspose.slides.internal.r5w.n5.n5(var4)) {
            float var8 = var1.c8() / com.aspose.slides.internal.r5w.n5.u3();
            float var9 = var1.y4() / com.aspose.slides.internal.r5w.n5.a6();
            AffineTransform var10 = AffineTransform.getScaleInstance(var8, var9);
            Rectangle2D var11 = var10.createTransformedShape(y1.u9(var3)).getBounds2D();
            var3 = new y1(var11);
         }

         if (var5 != null) {
            if (!(var1 instanceof com.aspose.slides.internal.o9b.l6)) {
               var1 = new com.aspose.slides.internal.o9b.l6(var1);
            }

            if (var5.n5()) {
               y1[] var31 = new y1[]{var3};
               var1 = this.n5((com.aspose.slides.internal.o9b.l6)var1, var2, var31, var5);
               var3 = var31[0];
            }

            if (this.n5(var5)) {
               com.aspose.slides.internal.v6g.a6 var32 = new com.aspose.slides.internal.v6g.a6<>(new x9(0L));
               this.n5((com.aspose.slides.internal.o9b.l6)var1, var32, var5);
               if (var32.n5 != null && !((x9)var32.n5).n5()) {
                  com.aspose.slides.internal.o9b.l6 var34 = new com.aspose.slides.internal.o9b.l6(var1.e2(), var1.h0());
                  var34.n5(var1.c8(), var1.y4());
                  com.aspose.slides.internal.j9e.n5 var36 = var34.n5(new y2(0, 0, var34.e2(), var34.h0()), 3, 2498570, true);
                  var36.n5((x9)var32.n5);
                  var34.n5(var36);
                  var1 = var34;
               }
            }
         }

         float var33 = var3.x8();
         float var35 = var3.n3();
         float var37 = var3.s7();
         float var38 = var3.k5();
         m1 var12 = this.n5(var2, var3, false);
         m1 var13 = this.n5(var2, var3, true);
         float[] var14 = this.n5(var2[0].l6(), var2[0].k5(), var12.u9());
         float var15 = var14[0];
         float var16 = var14[1];
         float[] var17 = this.n5(var33, var35, var13.u9());
         float var18 = var17[0];
         float var19 = var17[1];
         var14 = this.n5(var2[1].l6(), var2[1].k5(), var12.u9());
         float var20 = var14[0];
         float var21 = var14[1];
         var17 = this.n5(var33 + var37, var35, var13.u9());
         float var22 = var17[0];
         float var23 = var17[1];
         var14 = this.n5(var2[2].l6(), var2[2].k5(), var12.u9());
         float var24 = var14[0];
         float var25 = var14[1];
         var17 = this.n5(var33, var35 + var38, var13.u9());
         float var26 = var17[0];
         float var27 = var17[1];
         y1 var28 = new y1(var33 + var18, var35 + var19, var37 - var18 + var22, var38 - var19 + var27);
         var2 = new w1[]{
            new w1(var2[0].l6() + var15, var2[0].k5() + var16),
            new w1(var2[1].l6() + var20, var2[1].k5() + var21),
            new w1(var2[2].l6() + var24, var2[2].k5() + var25)
         };
         this.n5(var1, var2, var28, 2, var6);
      }
   }

   private void l6(t4 var1, w1[] var2, y1 var3, int var4, com.aspose.slides.internal.j9e.t2 var5, boolean var6) {
      this.n5(var1, var2, var3, var4, var5, var6);
   }

   void n5(t4 var1, w1[] var2, y1 var3, int var4, boolean var5) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      if (var2 == null) {
         throw new ArgumentNullException("Value of 'destPoints' cannot be null");
      }

      int var6 = var2.length;
      if (var6 != 3 && var6 != 4) {
         throw new ArgumentException("Value of 'destPoints' is invalid");
      }

      if (var6 > 3) {
         throw new NotImplementedException();
      }

      if (var4 == 1) {
         throw new ArgumentException("Invalid parameter", "srcUnit");
      }

      if (var1 instanceof y4) {
         this.n5.n5((y4)var1, var2, var3, var4, new u9(this));
      } else {
         var1 = this.n5(var1);
         Area var7 = this.n5(var2);
         m1 var8 = new m1(var3, var2);
         this.n5(var1, var7, var8, var5);
      }
   }

   public void n5(t4 var1, m1 var2, boolean var3) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      this.n5(var1, null, var2, var3);
   }

   private void n5(t4 var1, Area var2, m1 var3, boolean var4) {
      AffineTransform var5 = this.n5.z8().getTransform();
      AffineTransform var6 = com.aspose.slides.internal.r5w.n5.n5(this.n5);
      Shape var7 = this.n5.z8().getClip();
      this.n5.z8().setTransform(var6);
      if (!var3.k5()) {
         var3 = m1.n5.u9();
      }

      try {
         var3.n5(this.n5.m1(), 1);
         AffineTransform var8 = com.aspose.slides.internal.r5w.n5.n5(this.n5);
         var8.concatenate(var3.t2());
         m1 var9 = m1.n5(var8);
         if (var4 && this.n5.r4()) {
            var9 = n5(var1, var9, true, true);
         }

         var1 = this.l6(var1, var9);
         if (var2 != null) {
            this.n5.z8().setClip(var2);
         }

         this.n5.z8().setTransform(var5);
         this.n5(var1, var9);
      } finally {
         this.n5.z8().setTransform(var5);
         this.n5.z8().setClip(var7);
      }
   }

   public Area n5(Area var1) {
      com.aspose.slides.internal.x4g.s7 var2 = com.aspose.slides.internal.x4g.s7.n5((Object)(var1));
      if (var1.isEmpty()) {
         return var1;
      }

      w1[] var3 = var2.a6();
      byte[] var4 = var2.u9();
      w1[] var5 = new w1[var3.length];

      for (int var6 = 0; var6 < var3.length; var6++) {
         float var7 = var3[var6].l6();
         float var8 = var3[var6].k5();
         var7 = Math.round(var7 * 1000.0F) / 1000.0F;
         var8 = Math.round(var8 * 1000.0F) / 1000.0F;
         var7 = (float)Math.ceil(var7);
         var8 = (float)Math.ceil(var8);
         var5[var6] = new w1(var7, var8);
      }

      com.aspose.slides.internal.c9b.n5 var9 = new com.aspose.slides.internal.x4g.s7(var5, var4).l6();
      return new Area(var9);
   }

   private m1 n5(w1[] var1, y1 var2) {
      return this.n5(var1, var2, true);
   }

   private m1 n5(w1[] var1, y1 var2, boolean var3) {
      m1 var4 = var3 ? new m1(var2, var1) : m1.n5.u9();
      if (!var4.k5()) {
         var4 = m1.n5.u9();
      }

      var4.n5(this.n5.m1(), 1);
      AffineTransform var5 = com.aspose.slides.internal.r5w.n5.n5(this.n5);
      var5.concatenate(var4.t2());
      return m1.n5(var5);
   }

   public void n5(t4 var1, int var2, int var3, y2 var4, int var5) {
      this.n5(var1, var2, var3, y1.n5(var4), var5);
   }

   public void n5(t4 var1, float var2, float var3, y1 var4, int var5) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'image' cannot be null");
      }

      if (var5 == 1) {
         throw new ArgumentException("Invalid parameter", "srcUnit");
      }

      var4 = com.aspose.slides.internal.r5w.n5.n5(var5, 2, var4);
      float var6 = var4.s7();
      float var7 = var4.k5();
      if (!com.aspose.slides.internal.r5w.n5.n5(var5)) {
         float var8 = var1.c8() / com.aspose.slides.internal.r5w.n5.u3();
         float var9 = var1.y4() / com.aspose.slides.internal.r5w.n5.a6();
         AffineTransform var10 = AffineTransform.getScaleInstance(var8, var9);
         Rectangle2D var11 = var10.createTransformedShape(y1.u9(var4)).getBounds2D();
         var4 = new y1(var11);
      }

      float var33 = var4.x8();
      float var34 = var4.n3();
      float var35 = var4.s7();
      float var36 = var4.k5();
      if (com.aspose.slides.internal.r5w.n5.n5(this.n5.e2()) && com.aspose.slides.internal.r5w.n5.n5(var5)) {
         var6 *= this.n5.s7() / var1.c8();
         var7 *= this.n5.x8() / var1.y4();
      } else if (com.aspose.slides.internal.r5w.n5.n5(var5)) {
         var6 = (float)com.aspose.slides.internal.r5w.n5.n5(2, this.n5.e2(), var6, var1.c8(), this.n5.s7());
         var7 = (float)com.aspose.slides.internal.r5w.n5.n5(2, this.n5.e2(), var7, var1.y4(), this.n5.x8());
      } else {
         var6 = (float)com.aspose.slides.internal.r5w.n5.n5(2, this.n5.e2(), var6, com.aspose.slides.internal.r5w.n5.u3(), this.n5.s7());
         var7 = (float)com.aspose.slides.internal.r5w.n5.n5(2, this.n5.e2(), var7, com.aspose.slides.internal.r5w.n5.a6(), this.n5.x8());
      }

      if (this.n5.e2() != 1) {
         var6 /= this.n5.y4();
         var7 /= this.n5.y4();
      }

      w1[] var12 = new w1[]{new w1(var2, var3), new w1(var2 + var6, var3), new w1(var2, var3 + var7)};
      m1 var13 = this.n5(var12, var4, false);
      m1 var14 = this.n5(var12, var4, true);
      boolean var15 = (var13.t2().getType() & 24) != 0;
      float[] var16 = this.n5(var12[0].l6(), var12[0].k5(), var13.u9());
      float var17 = var16[0];
      float var18 = var16[1];
      float[] var19 = this.n5(var17, var18, var1);
      float var20 = var19[0];
      float var21 = var19[1];
      var16 = this.n5(var12[1].l6(), var12[1].k5(), var13.u9());
      float var22 = var16[0] - var17;
      float var23 = var16[1] - var18;
      var16 = this.n5(var12[2].l6(), var12[2].k5(), var13.u9());
      float var24 = var16[0] - var17;
      float var25 = var16[1] - var18;
      var19 = this.n5(var22, var23, var1);
      float var26 = var19[0];
      float var27 = var19[1];
      var19 = this.n5(var24, var25, var1);
      float var28 = var19[0];
      float var29 = var19[1];
      if (!var15) {
         var4 = new y1(var33 + var20, var34 + var21, var35 + var26, var36 + var29);
         var12 = new w1[]{
            new w1(var2 + var17, var3 + var18), new w1(var2 + var17 + var6 + var22, var3 + var18), new w1(var2 + var17, var3 + var18 + var7 + var25)
         };
      }

      this.n5(var1, var12, var4, 2, true);
   }

   public void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7) {
      this.n5(var1, y1.n5(var2), new y1(var3, var4, var5, var6), var7);
   }

   public void n5(t4 var1, y2 var2, int var3, int var4, int var5, int var6, int var7, com.aspose.slides.internal.j9e.t2 var8) {
      j5[] var9 = new j5[]{new j5(var2.s7(), var2.x8()), new j5(var2.s7() + var2.t2(), var2.x8()), new j5(var2.s7(), var2.x8() + var2.l6())};
      this.l6(var1, w1.n5(var9), new y1(var3, var4, var5, var6), var7, var8, true);
   }

   public void n5(t4 var1, y2 var2, float var3, float var4, float var5, float var6, int var7, com.aspose.slides.internal.j9e.t2 var8) {
      w1[] var9 = new w1[]{new w1(var2.s7(), var2.x8()), new w1(var2.s7() + var2.t2(), var2.x8()), new w1(var2.s7(), var2.x8() + var2.l6())};
      this.n5(var1, var9, new y1(var3, var4, var5, var6), var7, var8);
   }

   private void n5(t4 var1, m1 var2) {
      Shape var3 = this.n5.z8().getClip();
      if (var3 != null) {
         var3 = this.n5(new Area(var3));
      }

      this.n5.z8().setClip(var3);
      if (Double.isNaN(var2.t2().getDeterminant())) {
         var2 = new m1();
      }

      if (var1 instanceof y4) {
         ((y4)var1).n5(this.n5, var2.t2());
      } else {
         this.n5.z8().drawImage(var1.a6().n5(), var2.t2(), null);
         this.n5(this.n5.l6);
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1) {
      if (var1.s7() == 139273) {
         BufferedImage var2 = com.aspose.slides.internal.o9b.l6.n5(var1);
         if (var2.getType() == 1 || var2.getType() == 4) {
            DataBufferInt var3 = (DataBufferInt)var2.getRaster().getDataBuffer();
            int[] var4 = var3.getData();

            for (int var5 = 0; var5 < var4.length; var5++) {
               var4[var5] |= -16777216;
            }
         }
      }
   }

   private boolean n5(com.aspose.slides.internal.j9e.t2 var1) {
      if (var1 == null) {
         return false;
      }

      t2$n5 var2 = var1.n5(0);
      if (var2 == null) {
         return false;
      }

      t2$n5 var3 = var1.n5(0);
      t2$n5 var4;
      if (var2.n3 != null && var2.n3.length > 0) {
         var4 = var2;
      } else {
         var4 = var3;
      }

      t2$n5 var5;
      if (var2.u9 != 0.0F) {
         var5 = var2;
      } else {
         var5 = var3;
      }

      t2$n5 var6;
      if (!var2.x8.t2() && !var2.s7.t2()) {
         var6 = var2;
      } else {
         var6 = var3;
      }

      t2$n5 var7;
      if (var2.n5 != null) {
         var7 = var2;
      } else {
         var7 = var3;
      }

      if ((var4.n3 == null || var4.n3.length <= 0) && var5.u9 == 0.0F && !var2.a6 && !var2.c8 && (var2.x8.t2() || var2.s7.t2()) && var7.n5 == null) {
         return !var6.s7.t2() && !var6.x8.t2() ? true : var7.n5 != null;
      } else {
         return true;
      }
   }

   private void n5(com.aspose.slides.internal.o9b.l6 var1, com.aspose.slides.internal.v6g.a6<x9> var2, com.aspose.slides.internal.j9e.t2 var3) {
      com.aspose.slides.internal.o9b.l6 var4 = null;
      com.aspose.slides.internal.j9e.n5 var5 = null;
      if (var1 != null && var2 != null && var3 != null) {
         t2$n5 var6 = var3.n5(0);
         if (var6 != null) {
            t2$n5 var7 = var3.n5(0);
            t2$n5 var8;
            if (var6.n3 != null && var6.n3.length > 0) {
               var8 = var6;
            } else {
               var8 = var7;
            }

            t2$n5 var9;
            if (var6.u9 != 0.0F) {
               var9 = var6;
            } else {
               var9 = var7;
            }

            t2$n5 var10;
            if (!var6.x8.t2() && !var6.s7.t2()) {
               var10 = var6;
            } else {
               var10 = var7;
            }

            t2$n5 var11;
            if (var6.n5 != null) {
               var11 = var6;
            } else {
               var11 = var7;
            }

            if (var8.n3 != null && var8.n3.length > 0 || var9.u9 != 0.0F || var6.a6 || var6.c8 || !var6.x8.t2() && !var6.s7.t2() || var11.n5 != null) {
               y2 var12 = new y2(0, 0, var1.e2(), var1.h0());
               com.aspose.slides.internal.j9e.n5 var13 = var1.n5(var12, 3, 2498570);
               var2.n5 = var13.u3();
               var4 = new com.aspose.slides.internal.o9b.l6(h0.n5(var1.a6().n5(), var1.x8(), var1.s7()));
               var5 = var4.n5(var12, 3, 2498570);
               var13.n5(var5);
               var4.n5(var5);
               var1.n5(var13);
            }

            boolean var34 = false;
            com.aspose.slides.internal.j9e.n5 var35 = var5;
            byte[] var14 = var35 != null ? (byte[])var35.u3().k5().n5() : null;
            if (var8.n3 != null) {
               int var15 = 0;
               int[] var16 = new int[4];

               for (int var17 = 0; var17 < var35.n5(); var17++) {
                  int var18 = var15;

                  for (int var19 = 0; var19 < var35.l6(); var19++) {
                     var16[0] = var14[var18];
                     var16[1] = var14[var18 + 1];
                     var16[2] = var14[var18 + 2];
                     var16[3] = var14[var18 + 3];

                     for (int var20 = 0; var20 < var8.n3.length; var20++) {
                        com.aspose.slides.internal.o9b.c8 var21 = var8.n3[var20].l6();
                        com.aspose.slides.internal.o9b.c8 var22 = var8.n3[var20].n5();
                        if ((var16[0] & 0xFF) == (var21.y4() & 255)
                           && (var16[1] & 0xFF) == (var21.n3() & 255)
                           && (var16[2] & 0xFF) == (var21.x8() & 255)
                           && (var16[3] & 0xFF) == (var21.s7() & 255)) {
                           var14[var18] = var22.y4();
                           var14[var18 + 1] = var22.n3();
                           var14[var18 + 2] = var22.x8();
                           var14[var18 + 3] = var22.s7();
                           var34 = true;
                        }
                     }

                     var18 += 4;
                  }

                  var15 += var35.a6();
               }
            }

            if (var9 != null && var9.u9 > 0.0F && var9.u9 != 1.0F) {
               double var23 = var9.u9;
               var34 = true;
               int var39 = 0;

               for (int var45 = 0; var45 < var35.n5(); var45++) {
                  int var60 = var39;

                  for (int var55 = 0; var55 < var35.l6(); var55++) {
                     var14[var60 + 0] = (byte)com.aspose.slides.internal.r5w.n5.n5(var14[var60 + 0], var23);
                     var14[var60 + 1] = (byte)com.aspose.slides.internal.r5w.n5.n5(var14[var60 + 1], var23);
                     var14[var60 + 2] = (byte)com.aspose.slides.internal.r5w.n5.n5(var14[var60 + 2], var23);
                     var14[var60 + 3] = (byte)com.aspose.slides.internal.r5w.n5.n5(var14[var60 + 3], var23);
                     var60 += 4;
                  }

                  var39 += var35.a6();
               }
            }

            if (var6.a6) {
               float var36 = var6.u3 - (int)var6.u3;
               float var50 = (var36 < 0.0F ? 1.0F + var36 : var36) * 255.0F;
               if (var36 == 0.0F && var6.u3 > 0.0F) {
                  var50 = 255.0F;
               }

               var34 = true;
               int var40 = 0;

               for (int var46 = 0; var46 < var35.n5(); var46++) {
                  int var61 = var40;

                  for (int var56 = 0; var56 < var35.l6(); var56++) {
                     var14[var61 + 0] = (byte)((var14[var61 + 0] & 0xFF) > var50 ? 255 : 0);
                     var14[var61 + 1] = (byte)((var14[var61 + 1] & 0xFF) > var50 ? 255 : 0);
                     var14[var61 + 2] = (byte)((var14[var61 + 2] & 0xFF) > var50 ? 255 : 0);
                     var61 += 4;
                  }

                  var40 += var35.a6();
               }
            }

            if (var6.c8) {
               var34 = true;
               com.aspose.slides.internal.z0k.t4 var37 = com.aspose.slides.internal.y5s.x8.l6().n5();
               com.aspose.slides.internal.z0k.t4 var51 = null;
               if (var6.t2 != null) {
                  File var41 = new File(var6.t2);
                  if (!var41.isFile() || !var41.isAbsolute() || !var41.exists()) {
                     throw new NotImplementedException("File path is not exist or is not absolute. Color-profile's filepath must be absolute.");
                  }

                  var51 = new n3(var6.t2, 3);
               } else {
                  var51 = com.aspose.slides.internal.y5s.x8.n5().n5();
               }

               com.aspose.slides.internal.s7k.t2 var42 = new com.aspose.slides.internal.s7k.t2(var37, var51);
               int var62 = 0;

               for (int var47 = 0; var47 < var35.n5(); var47++) {
                  int var65 = var62;

                  for (int var57 = 0; var57 < var35.l6(); var57++) {
                     com.aspose.slides.internal.y5s.k5 var25 = com.aspose.slides.internal.y5s.u3.n5(
                        var14[var65 + 3] & 255, var14[var65 + 2] & 255, var14[var65 + 1] & 255, var14[var65 + 0] & 255, var42
                     );
                     float var26 = 0.0F;
                     if (var6.h0 == 0) {
                        var26 = (var25.n5() & 0xFF) / 255.0F;
                     } else if (var6.h0 == 1) {
                        var26 = (var25.l6() & 0xFF) / 255.0F;
                     } else if (var6.h0 == 2) {
                        var26 = (var25.k5() & 0xFF) / 255.0F;
                     } else if (var6.h0 == 3) {
                        var26 = (var25.u3() & 0xFF) / 255.0F;
                     }

                     byte var27 = (byte)((1.0F - var26) * 255.0F);
                     var14[var65 + 0] = var27;
                     var14[var65 + 1] = var27;
                     var14[var65 + 2] = var27;
                     var65 += 4;
                  }

                  var62 += var35.a6();
               }
            }

            int[] var38 = new int[4];
            if (!var10.s7.t2() && !var10.x8.t2()) {
               int var53 = var10.s7.y4() & 255;
               int var43 = var10.x8.y4() & 255;
               int var63 = var10.s7.n3() & 255;
               int var66 = var10.x8.n3() & 255;
               int var68 = var10.s7.x8() & 255;
               int var72 = var10.x8.x8() & 255;
               int var76 = var5.n5();
               int var28 = var5.l6();

               for (int var48 = 0; var48 < var76; var48++) {
                  for (int var58 = 0; var58 < var28; var58++) {
                     var5.n5(var58, var48, var38);
                     int var29 = var38[0] & 0xFF;
                     int var30 = var38[1] & 0xFF;
                     int var31 = var38[2] & 0xFF;
                     if (var29 >= var53 && var29 <= var43 && var30 >= var63 && var30 <= var66 && var31 >= var68 && var31 <= var72) {
                        int var32 = (var48 * var28 + var58) * 4;
                        var14[var32] = 0;
                        var14[var32 + 1] = 0;
                        var14[var32 + 2] = 0;
                        var14[var32 + 3] = 0;
                     }
                  }
               }

               var34 = true;
            }

            if (var11.n5 != null) {
               int var54 = 0;
               int var64 = var11.l6;

               for (int var49 = 0; var49 < var35.n5(); var49++) {
                  int var44 = var54;

                  for (int var59 = 0; var59 < var35.l6(); var59++) {
                     int var77 = var14[var44] & 255;
                     int var73 = var14[var44 + 1] & 255;
                     int var69 = var14[var44 + 2] & 255;
                     int var80 = var14[var44 + 3] & 255;
                     if (var80 < 0 || var77 < 0 || var69 < 0 || var73 < 0) {
                        throw new ArgumentException("a=" + var80 + ", r=" + var69 + ", g=" + var73 + ", b=" + var77);
                     }

                     com.aspose.slides.internal.j9e.k5 var67;
                     if (var64 != 0 && var77 == var73 && var77 == var69) {
                        if (var64 == 1) {
                           var44 += 4;
                           continue;
                        }

                        var67 = var11.k5;
                     } else {
                        var67 = var11.n5;
                     }

                     int var86 = (int)(var69 * var67.u3() + var73 * var67.c8() + var77 * var67.n3() + var80 * var67.z1() + 255.0F * var67.m1());
                     if (var86 == 0) {
                        var14[var44] = 0;
                        var14[var44 + 1] = 0;
                        var14[var44 + 2] = 0;
                        var14[var44 + 3] = 0;
                        var44 += 4;
                     } else {
                        int var83 = (int)(var69 * var67.n5() + var73 * var67.a6() + var77 * var67.t2() + var80 * var67.y4() + 255.0F * var67.t4());
                        int var84 = (int)(var69 * var67.l6() + var73 * var67.u9() + var77 * var67.s7() + var80 * var67.e2() + 255.0F * var67.q0());
                        int var85 = (int)(var69 * var67.k5() + var73 * var67.h0() + var77 * var67.x8() + var80 * var67.t9() + 255.0F * var67.z3());
                        var69 = var83 > 255 ? 255 : var83;
                        var73 = var84 > 255 ? 255 : var84;
                        var77 = var85 > 255 ? 255 : var85;
                        var80 = var86 > 255 ? 255 : var86;
                        var69 = var83 < 0 ? 0 : var69;
                        var73 = var84 < 0 ? 0 : var73;
                        var77 = var85 < 0 ? 0 : var77;
                        var80 = var86 < 0 ? 0 : var80;
                        if (var80 < 255) {
                        }

                        var14[var44] = (byte)(var77 & 0xFF);
                        var14[var44 + 1] = (byte)(var73 & 0xFF);
                        var14[var44 + 2] = (byte)(var69 & 0xFF);
                        var14[var44 + 3] = (byte)(var80 & 0xFF);
                        var44 += 4;
                     }
                  }

                  var54 += var35.a6();
               }

               var34 = true;
            }

            if (var34) {
               var2.n5 = (new x9(com.aspose.slides.internal.l6j.n5.n5(var14)));
            }
         }
      }
   }

   private com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, w1[] var2, y1[] var3, com.aspose.slides.internal.j9e.t2 var4) {
      if (var4 == null) {
         return var1;
      }

      y1 var5 = var3[0];
      Rectangle2D var6 = y1.u9(var5).getBounds2D();
      if (var6.getX() + var6.getWidth() > var1.e2() || var6.getY() + var6.getHeight() > var1.h0()) {
         if (var4.n5 != 4) {
            float var7 = var5.x8() > var1.e2() ? var1.e2() % var5.x8() : var5.x8();
            float var8 = var5.n3() > var1.h0() ? var1.h0() % var5.n3() : var5.n3();
            float var9 = var1.e2() - var7;
            float var10 = var1.h0() - var8;
            y1 var11 = new y1(0.0F, var8, var1.e2(), var10);
            u6 var12 = new u6(var1, var4.n5, var11);
            float var13 = var3[0].s7() + var7;
            float var14 = var3[0].k5();
            com.aspose.slides.internal.o9b.l6 var15 = new com.aspose.slides.internal.o9b.l6(Math.round(var13), Math.round(var14));
            z1 var16 = z1.n5(var15);
            var16.n5(var12, 0.0F, 0.0F, var13, var14);
            y2 var17 = new y2(Math.round(var7), 0, Math.round(var3[0].s7()), Math.round(var3[0].k5()));
            var1 = var15.n5(var17);
            var3[0] = new y1(0.0F, 0.0F, var1.e2(), var1.h0());
         } else if (var4.l6 != null) {
            m1 var18 = this.n5(var2, var5);
            a0 var19 = new a0(var5.y4());
            var19.n5(new y2(0, 0, var1.e2(), var1.h0()));
            var19.l6(var18);
            this.n5.n5(new i1(var4.l6), var19);
         }
      }

      return var1;
   }

   private Area n5(w1[] var1) {
      AffineTransform var2 = this.n5.z8().getTransform();
      this.n5.z8().setTransform(com.aspose.slides.internal.r5w.n5.n5(this.n5));
      Shape var3 = this.n5.z8().getClip();
      Area var4 = new Area(this.l6(var1));
      Area var5 = var4.createTransformedArea(this.n5.m1().t2());
      if (var3 != null) {
         var5 = var5.createTransformedArea(var2);
         var5.intersect(new Area(var3));
      }

      this.n5.z8().setTransform(var2);
      return var5;
   }

   private GeneralPath l6(w1[] var1) {
      w1 var2 = new w1(var1[1].l6() + var1[2].l6() - var1[0].l6(), var1[1].k5() + var1[2].k5() - var1[0].k5());
      new Area();
      GeneralPath var4 = new GeneralPath();
      var4.moveTo(var1[0].l6(), var1[0].k5());
      var4.lineTo(var1[1].l6(), var1[1].k5());
      var4.lineTo(var2.l6(), var2.k5());
      var4.lineTo(var1[2].l6(), var1[2].k5());
      var4.closePath();
      return var4;
   }

   private static m1 n5(t4 var0, m1 var1, boolean var2, boolean var3) {
      if (var1.l6()) {
         return var1;
      }

      if (var2 || var3) {
         var1.l6(
            var2 ? -((float)(var1.t2().getScaleX() + var1.t2().getShearX())) / 2.0F : 0.0F,
            var3 ? -((float)(var1.t2().getScaleY() + var1.t2().getShearY())) / 2.0F : 0.0F,
            1
         );
      }

      w1[] var4 = new w1[]{new w1(0.0F, 0.0F), new w1(var0.e2(), 0.0F), new w1(0.0F, var0.h0())};
      var1.n5(var4);

      for (int var5 = 0; var5 < var4.length; var5++) {
         var4[var5].n5(var4[var5].l6() + 0.5F);
         var4[var5].l6(var4[var5].k5() + 0.5F);
      }

      return new m1(y1.n5(new y2(0, 0, var0.e2(), var0.h0())), var4);
   }

   private float[] n5(float var1, float var2, m1 var3) {
      m1 var4 = var3.u9();
      float var5 = 0.0F;
      float var6 = 0.0F;
      float var7 = var1;
      float var8 = var2;
      w1[] var9 = new w1[]{new w1(var7, var8)};
      var4.n5(var9);
      var7 = var9[0].l6();
      var8 = var9[0].k5();
      float var10 = (float)Math.ceil(var7);
      float var11 = (float)Math.ceil(var8);
      var9 = new w1[]{new w1(var10, var11)};
      var4.h0();
      var4.n5(var9);
      var10 = var9[0].l6();
      var11 = var9[0].k5();
      var5 = var10 - var1;
      var6 = var11 - var2;
      return new float[]{var5, var6};
   }

   private float[] n5(float var1, float var2, t4 var3) {
      float var4 = 0.0F;
      float var5 = 0.0F;
      var4 = (float)com.aspose.slides.internal.r5w.n5.n5(this.n5.e2(), 2, var1, this.n5.s7(), com.aspose.slides.internal.r5w.n5.u3());
      var5 = (float)com.aspose.slides.internal.r5w.n5.n5(this.n5.e2(), 2, var2, this.n5.x8(), com.aspose.slides.internal.r5w.n5.a6());
      if (this.n5.e2() != 1) {
         var4 *= this.n5.y4();
         var5 *= this.n5.y4();
      }

      if (var3.c8() < com.aspose.slides.internal.r5w.n5.u3()) {
         var4 *= var3.c8() / com.aspose.slides.internal.r5w.n5.u3();
      }

      if (var3.y4() < com.aspose.slides.internal.r5w.n5.u3()) {
         var5 *= var3.y4() / com.aspose.slides.internal.r5w.n5.u3();
      }

      return new float[]{var4, var5};
   }

   private t4 n5(t4 var1) {
      if (var1 instanceof y4) {
         return var1;
      } else if (!this.n5.r4()) {
         return var1;
      } else {
         int var2 = this.n5.n3();
         if (var2 != 2 && var2 != 7 && var2 != 6) {
            com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(var1.e2() + 1, var1.h0() + 1);
            z1 var4 = z1.n5(var3);
            var4.z8().drawImage(var1.a6().n5(), new AffineTransform(), null);
            var4.dispose();
            return var3;
         } else {
            return var1;
         }
      }
   }

   private t4 l6(t4 var1, m1 var2) {
      if (!(var1 instanceof com.aspose.slides.internal.o9b.l6)) {
         return var1;
      }

      int var3 = this.n5.n3();
      if (var3 != 2 && var3 != 7 && var3 != 6) {
         return var1;
      }

      float[] var4 = this.k5(var1, var2);
      return var4[0] < 1.0F && var4[1] < 1.0F ? this.n5((com.aspose.slides.internal.o9b.l6)var1, this.n5.n3(), var2) : var1;
   }

   private float[] k5(t4 var1, m1 var2) {
      com.aspose.slides.internal.x4g.s7 var3 = new com.aspose.slides.internal.x4g.s7();
      var3.l6(new y2(0, 0, var1.e2(), var1.h0()));
      var3.l6(var2);
      w1[] var4 = var3.a6();
      float var5 = (float)com.aspose.slides.internal.e3j.u9.n5(var4[0], var4[1]);
      float var6 = (float)com.aspose.slides.internal.e3j.u9.n5(var4[1], var4[2]);
      return new float[]{var5 / var1.e2(), var6 / var1.h0()};
   }

   private com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var1, int var2, m1 var3) {
      a6$x8 var4 = null;
      if (var2 != 2 && var2 != 7 && var2 != 6) {
         if (var2 != 0 && var2 != 1 && var2 != 3 && var2 == 4) {
         }
      } else {
         var4 = a6$x8.t2;
      }

      if (var4 == null) {
         return var1;
      }

      com.aspose.slides.internal.r3x.a6 var5 = new com.aspose.slides.internal.r3x.a6();
      return var5.n5(var1, var3, var4);
   }
}
