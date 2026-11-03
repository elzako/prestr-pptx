package com.aspose.slides.internal.x4g;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.ms.System.IDisposable;
import java.awt.geom.AffineTransform;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Point2D.Float;

public final class m1 implements IDisposable {
   public static final m1 n5 = new m1();
   final AffineTransform l6;

   m1(AffineTransform var1) {
      this.l6 = var1;
   }

   public m1() {
      this(new AffineTransform());
   }

   public m1(y1 var1, com.aspose.slides.internal.o9b.w1[] var2) {
      if (var2 == null) {
         throw new ArgumentNullException("Value of 'plgpts' cannot be null");
      }

      if (var2.length != 3) {
         throw new ArgumentException("Value of 'plgpts' is invalid");
      }

      double var3 = var2[1].l6() - var2[0].l6();
      double var5 = var2[1].k5() - var2[0].k5();
      double var7 = var2[2].l6() - var2[0].l6();
      double var9 = var2[2].k5() - var2[0].k5();
      this.l6 = new AffineTransform(var3 / var1.s7(), var5 / var1.s7(), var7 / var1.k5(), var9 / var1.k5(), var2[0].l6(), var2[0].k5());
      this.l6.translate(-var1.x8(), -var1.n3());
   }

   public m1(float var1, float var2, float var3, float var4, float var5, float var6) {
      this(new AffineTransform(var1, var2, var3, var4, var5, var6));
   }

   public float[] n5() {
      return new float[]{
         (float)this.t2().getScaleX(),
         (float)this.t2().getShearY(),
         (float)this.t2().getShearX(),
         (float)this.t2().getScaleY(),
         (float)this.t2().getTranslateX(),
         (float)this.t2().getTranslateY()
      };
   }

   public boolean l6() {
      return com.aspose.slides.internal.c9b.u3.a6(this);
   }

   public boolean k5() {
      return Math.abs(this.t2().getDeterminant()) > Double.MIN_VALUE;
   }

   public float u3() {
      return (float)this.t2().getTranslateX();
   }

   public float a6() {
      return (float)this.t2().getTranslateY();
   }

   public m1 u9() {
      return new m1((AffineTransform)this.t2().clone());
   }

   @Override
   public void dispose() {
   }

   public void n5(m1 var1) {
      var1.t2().setTransform(this.t2());
   }

   @Override
   public boolean equals(Object obj) {
      m1 var2 = com.aspose.slides.internal.v6g.k5.n5(obj, m1.class);
      if (var2 == null) {
         return false;
      }

      float[] var3 = var2.n5();
      float[] var4 = this.n5();
      boolean var5 = true;

      for (int var6 = 0; var6 < var3.length; var6++) {
         var5 &= var3[var6] == var4[var6];
      }

      return var5;
   }

   @Override
   public int hashCode() {
      return this.t2().hashCode();
   }

   public void h0() {
      try {
         this.l6.setTransform(this.l6.createInverse());
      } catch (NoninvertibleTransformException var2) {
         throw new ArgumentException(var2.getMessage(), var2);
      }
   }

   public void l6(m1 var1) {
      this.n5(var1, 0);
   }

   public void n5(m1 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'matrix' cannot be null");
      }

      this.n5(var1.t2(), var2);
   }

   public void c8() {
      this.t2().setToIdentity();
   }

   public void n5(float var1) {
      this.t2().rotate(Math.toRadians(var1));
   }

   public void n5(float var1, int var2) {
      this.n5(AffineTransform.getRotateInstance(Math.toRadians(var1)), var2);
   }

   public void n5(float var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.t2().rotate(Math.toRadians(var1), var2.l6(), var2.k5());
   }

   public void n5(float var1, com.aspose.slides.internal.o9b.w1 var2, int var3) {
      this.n5(AffineTransform.getRotateInstance(Math.toRadians(var1), var2.l6(), var2.k5()), var3);
   }

   public void n5(float var1, float var2) {
      this.n5(var1, var2, 0);
   }

   public void n5(float var1, float var2, int var3) {
      this.n5(AffineTransform.getScaleInstance(var1, var2), var3);
   }

   public void l6(float var1, float var2) {
      this.t2().shear(var1, var2);
   }

   public void n5(com.aspose.slides.internal.o9b.j5[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'pts' cannot be null");
      }

      if (var1.length < 1) {
         throw new ArgumentException("Argument 'pts' is invalid");
      }

      Float var2 = new Float();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2.setLocation(var1[var3].n5(), var1[var3].l6());
         this.t2().transform(var2, var2);
         var1[var3].n5((int)Math.round(var2.getX()));
         var1[var3].l6((int)Math.round(var2.getY()));
      }
   }

   public void n5(com.aspose.slides.internal.o9b.w1[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'pts' cannot be null");
      }

      if (var1.length < 1) {
         throw new ArgumentException("Argument 'pts' is invalid");
      }

      Float var2 = new Float();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2.setLocation(var1[var3].l6(), var1[var3].k5());
         this.t2().transform(var2, var2);
         var1[var3].n5((float)var2.getX());
         var1[var3].l6((float)var2.getY());
      }
   }

   public void l6(com.aspose.slides.internal.o9b.w1[] var1) {
      if (var1 == null) {
         throw new ArgumentNullException("Value of 'pts' cannot be null");
      }

      if (var1.length < 1) {
         throw new ArgumentException("Argument 'pts' is invalid");
      }

      Float var2 = new Float();

      for (int var3 = 0; var3 < var1.length; var3++) {
         var2.setLocation(var1[var3].l6(), var1[var3].k5());
         this.t2().deltaTransform(var2, var2);
         var1[var3].n5((float)var2.getX());
         var1[var3].l6((float)var2.getY());
      }
   }

   public void k5(float var1, float var2) {
      this.t2().translate(var1, var2);
   }

   public void l6(float var1, float var2, int var3) {
      this.n5(AffineTransform.getTranslateInstance(var1, var2), var3);
   }

   public AffineTransform t2() {
      return this.l6;
   }

   private void n5(AffineTransform var1, int var2) {
      n5(this.t2(), var1, var2);
   }

   public static void n5(AffineTransform var0, AffineTransform var1, int var2) {
      switch (var2) {
         case 0:
            var0.concatenate(var1);
            break;
         case 1:
            var0.preConcatenate(var1);
            break;
         default:
            throw new ArgumentException("Value of 'order' is invalid");
      }
   }

   public static AffineTransform k5(m1 var0) {
      return var0 == null ? null : var0.t2();
   }

   public static m1 n5(AffineTransform var0) {
      return var0 == null ? null : new m1(var0);
   }
}
