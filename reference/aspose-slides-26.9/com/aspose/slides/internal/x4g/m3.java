package com.aspose.slides.internal.x4g;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.InvalidEnumArgumentException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.d5;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public final class m3 extends com.aspose.slides.internal.o9b.u3 {
   private u3 l6;
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.w1 u3 = new com.aspose.slides.internal.o9b.w1();
   private com.aspose.slides.internal.o9b.w1 a6 = new com.aspose.slides.internal.o9b.w1();
   private y1 u9 = new y1();
   private com.aspose.slides.internal.o9b.c8[] h0;
   private a6 c8;
   private int t2 = 4;
   private s7 s7;
   private boolean x8 = false;
   private boolean n3 = false;
   private float y4 = 1.0F;
   private float e2 = 1.0F;
   private boolean t9 = false;
   private boolean z1 = false;

   public m3(s7 var1) {
      this.n5(var1 != null ? (s7)var1.deepClone() : null, 4, true, true, true, true, false);
   }

   public m3(com.aspose.slides.internal.o9b.w1[] var1) {
      this(var1, 4);
   }

   public m3(com.aspose.slides.internal.o9b.w1[] var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Argument 'points' cannot be null");
      }

      if (var1.length < 2) {
         throw new OutOfMemoryException("Gradient points count must be 2 or more");
      }

      s7 var3 = new s7();
      var3.l6(var1);
      this.n5(var3, var2, true, true, true, true);
   }

   private void n5(s7 var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      this.n5(var1, var2, var3, var4, var5, var6, true);
   }

   private void n5(s7 var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7) {
      if (var1 == null) {
         throw new ArgumentNullException("Argument path cannot be null");
      }

      if (var1.getBounds().isEmpty()) {
         throw new OutOfMemoryException("Argument path cannot be empty");
      }

      if (!d5.isDefined(c4.class, var2)) {
         throw new InvalidEnumArgumentException("Argument value [" + var2 + "] is invalid for Enum type 'wrapMode'");
      }

      this.s7 = var1;
      this.t2 = var2;
      this.u9 = var1.s7();
      if (var6) {
         this.c8 = new a6(1);
         this.c8.n5()[0] = com.aspose.slides.internal.o9b.c8.n5(0);
         this.c8.l6()[0] = 0.0F;
      }

      if (var5) {
         this.l6 = new u3(1);
         this.l6.k5(new float[]{1.0F});
         this.l6.u3(new float[]{0.0F});
         this.l6.n5();
      }

      if (var3) {
         if (var7) {
            com.aspose.slides.internal.o9b.c8.m3().n5(this.k5);
         } else {
            com.aspose.slides.internal.o9b.c8.w4().n5(this.k5);
         }

         this.h0 = new com.aspose.slides.internal.o9b.c8[]{com.aspose.slides.internal.o9b.c8.w4()};
      }

      s7 var8 = (s7)var1.deepClone();
      var8.y4();
      com.aspose.slides.internal.o9b.w1[] var9 = var8.a6();
      if (var4) {
         for (int var10 = 0; var10 < var9.length; var10++) {
            this.u3.n5(this.u3.l6() + var9[var10].l6());
            this.u3.l6(this.u3.k5() + var9[var10].k5());
         }

         this.u3.n5(this.u3.l6() / var9.length);
         this.u3.l6(this.u3.k5() / var9.length);
      }
   }

   @Override
   public Paint n5() {
      return this;
   }

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      return new com.aspose.slides.internal.y8b.n5(this).n5(cm, deviceBounds, userBounds, xform, hints);
   }

   @Override
   public int getTransparency() {
      return this.a6() ? 1 : 3;
   }

   public s7 h0() {
      return (s7)this.s7.deepClone();
   }

   public u3 c8() {
      if (this.t9) {
         return null;
      }

      if (this.l6 == null) {
         float[] var1 = new float[]{1.0F};
         float[] var2 = new float[]{0.0F};
         u3 var3 = new u3();
         var3.k5(var1);
         var3.u3(var2);
         this.l6 = var3;
      }

      return this.l6;
   }

   public void n5(u3 var1) {
      if (var1 == null) {
         throw new NullReferenceException("The blend value cannot be null");
      }

      if (var1.k5().length != var1.l6().length) {
         throw new ArgumentOutOfRangeException("Requested diapason exceeds array size");
      }

      if (var1.k5().length <= 1 || var1.k5()[0] == 0.0F && var1.k5()[var1.k5().length - 1] == 1.0F) {
         this.l6 = var1;
         this.l6.n5();
         this.z1 = true;
      } else {
         throw new ArgumentException("Parameter's value is invalid");
      }
   }

   public com.aspose.slides.internal.o9b.c8 t2() {
      return this.k5;
   }

   public void n5(com.aspose.slides.internal.o9b.c8 var1) {
      var1.n5(this.k5);
      this.n5(this.s7, this.t2, false, false, false, true);
   }

   public com.aspose.slides.internal.o9b.w1 s7() {
      return this.u3;
   }

   public void n5(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.u3);
      this.n5(this.s7, this.t2, false, false, false, false);
   }

   public com.aspose.slides.internal.o9b.w1 x8() {
      return this.a6;
   }

   public void l6(com.aspose.slides.internal.o9b.w1 var1) {
      var1.n5(this.a6);
   }

   public a6 n3() {
      if (!this.t9) {
         float[] var1 = new float[]{0.0F};
         a6 var2 = new a6();
         com.aspose.slides.internal.o9b.c8[] var3 = new com.aspose.slides.internal.o9b.c8[]{com.aspose.slides.internal.o9b.c8.u3.o8()};
         var2.n5(var3);
         var2.n5(var1);
         this.c8 = var2;
      }

      return this.c8;
   }

   public void n5(a6 var1) {
      this.t9 = true;
      this.z1 = false;
      if (var1 == null) {
         throw new NullPointerException("The InterpolationColors value cannot be null");
      }

      this.c8 = var1;
      this.n5(this.s7, this.t2, false, false, true, false);
   }

   public com.aspose.slides.internal.o9b.c8[] y4() {
      if (this.h0 == null) {
         return new com.aspose.slides.internal.o9b.c8[]{com.aspose.slides.internal.o9b.c8.w4()};
      }

      com.aspose.slides.internal.o9b.c8[] var1 = new com.aspose.slides.internal.o9b.c8[this.h0.length];

      for (int var2 = 0; var2 < this.h0.length; var2++) {
         var1[var2] = this.h0[var2].o8();
      }

      return var1;
   }

   public void n5(com.aspose.slides.internal.o9b.c8[] var1) {
      if (var1 == null) {
         throw new NullReferenceException("Argument value cannot be null");
      }

      if (var1.length == 0) {
         throw new ArgumentException("Argument value cannot be empty");
      }

      if (var1.length > this.s7.h0()) {
         throw new ArgumentException("Parameter is not valid");
      }

      List var2 = new List(var1.length);
      int var3 = var1.length;

      for (int var4 = 0; var4 < var1.length; var4++) {
         if (var1[var4].t2()) {
            if (var3 == var1.length) {
               var3 = var4;
            }
         } else {
            var3 = var1.length;
         }

         var2.addItem(var1[var4].o8());
      }

      for (int var5 = var1.length - 1; var5 >= var3 + 1; var5--) {
         var2.remove(var5);
      }

      this.h0 = (com.aspose.slides.internal.o9b.c8[])var2.toArray(new com.aspose.slides.internal.o9b.c8[var2.size()]);
      this.n5(this.s7, this.t2, false, false, false, true);
   }

   public m1 e2() {
      return this.k5();
   }

   public void k5(m1 var1) {
      this.n5(var1);
   }

   public int t9() {
      return this.t2;
   }

   public void n5(int var1) {
      if (!d5.isDefined(c4.class, var1)) {
         throw new InvalidEnumArgumentException("The value of argument 'value' is invalid for Enum type 'WrapMode'");
      }

      this.t2 = var1;
   }

   public void u3(m1 var1) {
      super.l6(var1);
   }

   public void l6(m1 var1, int var2) {
      super.n5(var1, var2);
   }

   public void l6(float var1, int var2) {
      super.n5(var1, var2);
   }

   private void l6(boolean var1) {
      this.x8 = var1;
      this.n3 = true;
   }

   public void k5(float var1, float var2) {
      if (var1 > 1.0F || var1 < 0.0F) {
         throw new ArgumentException("Parameter 'focus' is not valid");
      }

      if (!(var2 > 1.0F) && !(var2 < 0.0F)) {
         this.l6(false);
         this.y4 = var1;
         this.e2 = var2;
         this.n5(this.s7, this.t2, false, false, true, true);
         this.u3(var1, var2);
      } else {
         throw new ArgumentException("Parameter 'scale' is not valid");
      }
   }

   private void u3(float var1, float var2) {
      this.y4 = var1;
      this.e2 = var2;
      int var3 = var1 != 0.0F && var1 != 1.0F ? 511 : 256;
      float[] var4 = new float[var3];
      float[] var5 = new float[var3];
      float var6 = 2.0F;
      if (var1 == 0.0F) {
         var5[0] = var1;
         var4[0] = var2;
         this.n5(var5, var4, 0, var1, var2, 2.0F);
         var5[var3 - 1] = 1.0F;
         var4[var3 - 1] = 0.0F;
      } else if (var1 == 1.0F) {
         var5[0] = 0.0F;
         var4[0] = 0.0F;
         this.n5(var5, var4, var1, var2, 2.0F);
         var5[var3 - 1] = var1;
         var4[var3 - 1] = var2;
      } else {
         var5[0] = 0.0F;
         var4[0] = 0.0F;
         this.n5(var5, var4, var1, var2, 2.0F);
         var5[255] = var1;
         var4[255] = var2;
         this.n5(var5, var4, 255, var1, var2, 2.0F);
         var5[var3 - 1] = 1.0F;
         var4[var3 - 1] = 0.0F;
      }

      u3 var7 = new u3();
      var7.n5(var4);
      var7.l6(var5);
      this.n5(var7);
   }

   private void n5(float[] var1, float[] var2, float var3, float var4, float var5) {
      float var6 = var3 / (2.0F * var5);
      float var7 = var3 / 2.0F;
      float var8 = var3 / 255.0F;
      float var9 = 0.5F * (1.0F + this.n5(0.0F, var6, var7));
      float var10 = 0.5F * (1.0F + this.n5(var3, var6, var7));
      float var11 = var10 - var9;
      int var12 = 1;

      for (float var13 = var8; var12 < 255; var13 += var8) {
         var1[var12] = var13;
         var2[var12] = var4 / var11 * (0.5F * (1.0F + this.n5(var13, var6, var7)) - var9);
         var12++;
      }
   }

   private void n5(float[] var1, float[] var2, int var3, float var4, float var5, float var6) {
      float var7 = (1.0F - var4) / (2.0F * var6);
      float var8 = (1.0F + var4) / 2.0F;
      float var9 = (1.0F - var4) / 255.0F;
      float var10 = 0.5F * (1.0F - this.n5(1.0F, var7, var8));
      float var11 = 0.5F * (1.0F - this.n5(var4, var7, var8));
      float var12 = var11 - var10;
      float var13 = var4 + var9;

      for (int var14 = 1; var14 < 255; var13 += var9) {
         var1[var14 + var3] = var13;
         var2[var14 + var3] = var5 / var12 * (0.5F * (1.0F - this.n5(var13, var7, var8)) - var10);
         var14++;
      }
   }

   float n5(float var1, float var2, float var3) {
      float var4 = (float)(2.0 / Math.sqrt(Math.PI));
      float var5 = (var1 - var3) / var2;
      var5 = (float)(var5 / Math.sqrt(2.0));
      float var6 = (float)(
         var5
            - Math.pow(var5, 3.0) / 3.0
            + Math.pow(var5, 5.0) / 10.0
            - Math.pow(var5, 7.0) / 42.0
            + Math.pow(var5, 9.0) / 216.0
            - Math.pow(var5, 11.0) / 1420.0
      );
      return var4 * var6;
   }

   public void k5(float var1, float var2, int var3) {
      super.n5(var1, var2, var3);
   }

   @Override
   public Object deepClone() {
      m3 var1 = (m3)this.l6();
      if (var1.h0 != null) {
         com.aspose.slides.ms.System.u3.n5(var1.h0, 0, var1.h0, 0, var1.h0.length);
      }

      if (var1.s7 != null) {
         var1.s7 = (s7)var1.s7.deepClone();
      }

      if (this.c8 != null) {
         var1.c8 = new a6();
         if (this.c8.n5() != null) {
            var1.c8.n5((com.aspose.slides.internal.o9b.c8[])this.c8.n5().clone());
         }

         if (this.c8.l6() != null) {
            var1.c8.n5((float[])this.c8.l6().clone());
         }
      }

      if (this.l6 != null) {
         var1.l6 = new u3();
         if (this.l6.l6() != null) {
            var1.l6.k5((float[])this.l6.l6().clone());
         }

         if (this.l6.k5() != null) {
            var1.l6.u3((float[])this.l6.k5().clone());
         }

         var1.l6.n5 = this.l6.n5;
      }

      var1.u3 = this.u3.u3();
      var1.k5 = this.k5.o8();
      var1.u9 = this.u9.y4();
      var1.x8 = this.x8;
      var1.n3 = this.n3;
      var1.e2 = this.e2;
      var1.y4 = this.y4;
      var1.t9 = this.t9;
      var1.z1 = this.z1;
      var1.a6 = this.a6;
      var1.t2 = this.t2;
      return var1;
   }
}
