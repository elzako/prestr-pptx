package com.aspose.slides.internal.o9b;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.Paint;
import java.awt.PaintContext;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.ColorModel;

public abstract class u3 implements IDisposable, com.aspose.slides.ms.System.v4, Paint, Cloneable {
   private com.aspose.slides.internal.x4g.m1 l6 = new com.aspose.slides.internal.x4g.m1();
   protected boolean n5 = false;

   public abstract Paint n5();

   @Override
   public PaintContext createContext(ColorModel cm, Rectangle deviceBounds, Rectangle2D userBounds, AffineTransform xform, RenderingHints hints) {
      if (this.k5().k5()) {
         com.aspose.slides.internal.x4g.m1.n5(xform, this.l6.t2(), 1);
      }

      return this.n5().createContext(cm, deviceBounds, userBounds, xform, hints);
   }

   @Override
   public abstract Object deepClone();

   @Override
   public void dispose() {
      this.n5(true);
   }

   protected void n5(boolean var1) {
   }

   protected u3 l6() {
      u3 var1 = (u3)this.u3();
      var1.l6 = this.l6.u9();
      return var1;
   }

   public com.aspose.slides.internal.x4g.m1 k5() {
      return this.l6.u9();
   }

   public void n5(com.aspose.slides.internal.x4g.m1 var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value cannot be null");
      }

      if (!var1.k5()) {
         throw new ArgumentException("Value is not valid");
      }

      var1.n5(this.l6);
   }

   protected void n5(float var1, float var2) {
      this.n5(var1, var2, 0);
   }

   protected void n5(float var1, float var2, int var3) {
      this.l6.l6(var1, var2, var3);
   }

   protected void n5(float var1, int var2) {
      this.l6.n5(var1, var2);
   }

   protected void l6(float var1, float var2) {
      this.l6(var1, var2, 0);
   }

   protected void l6(float var1, float var2, int var3) {
      this.l6.n5(var1, var2, var3);
   }

   public void l6(com.aspose.slides.internal.x4g.m1 var1) {
      this.n5(var1, 0);
   }

   protected void n5(com.aspose.slides.internal.x4g.m1 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'matrix' cannot be null");
      }

      if (!var1.k5()) {
         throw new ArgumentException("Value of 'matrix' is invalid");
      }

      com.aspose.slides.internal.x4g.m1 var3 = var1.u9();
      if (var2 == 0) {
         var3.t2().concatenate(this.l6.t2());
         this.l6.t2().setTransform(var3.t2());
      } else {
         this.l6.t2().concatenate(var3.t2());
      }
   }

   protected Object u3() {
      try {
         return this.clone();
      } catch (CloneNotSupportedException var2) {
         throw new IllegalStateException(var2);
      }
   }

   protected boolean a6() {
      return this.n5;
   }

   protected void u9() {
      this.n5 = true;
   }
}
