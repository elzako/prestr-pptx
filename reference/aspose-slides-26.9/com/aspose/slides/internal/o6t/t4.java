package com.aspose.slides.internal.o6t;

import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.v4;
import java.awt.Color;
import java.awt.Paint;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;

public final class t4 implements v4, Cloneable {
   public GeneralPath n5 = null;
   public com.aspose.slides.internal.c4t.t2 l6;
   public com.aspose.slides.internal.c4t.u3 k5;
   public com.aspose.slides.internal.d2n.l6 u3;
   public Paint a6;
   public int u9 = 1;
   public int h0 = 1;
   public int c8 = 1;
   public int t2 = 0;
   public int s7 = 0;
   public int x8 = 13;
   public int n3 = 0;
   public int y4 = 0;
   public Color e2 = Color.WHITE;
   public Color t9 = Color.BLACK;
   public AffineTransform z1;
   public AffineTransform t4;
   public AffineTransform q0;
   public Rectangle z3;
   public Rectangle m1;
   public boolean k7 = true;
   public Shape m3;
   public Shape z8;
   public Shape j5;
   public float w1 = 10.0F;

   @Override
   public Object clone() {
      t4 var1 = null;

      try {
         var1 = (t4)super.clone();
         var1.u3();
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }

   @Override
   public Object deepClone() {
      t4 var1 = null;

      try {
         var1 = (t4)super.clone();
         var1.n5 = this.n5;
         if (this.n5 != null) {
            com.aspose.slides.internal.x4g.s7 var2 = com.aspose.slides.internal.c9b.l6.l6(this.n5);
            var1.n5 = new GeneralPath(com.aspose.slides.internal.x4g.s7.n5(var2));
         }

         var1.l6 = this.l6;
         if (this.l6 != null) {
            var1.l6 = (com.aspose.slides.internal.c4t.t2)this.l6.deepClone();
         }

         var1.k5 = this.k5;
         if (this.k5 != null) {
            var1.k5 = (com.aspose.slides.internal.c4t.u3)this.k5.deepClone();
         }

         var1.u3 = this.u3;
         if (this.u3 != null) {
            var1.u3 = (com.aspose.slides.internal.d2n.l6)this.u3.deepClone();
         }

         var1.a6 = this.a6;
         if (this.a6 != null && this.a6 instanceof Color) {
            var1.a6 = new Color(((Color)this.a6).getRed(), ((Color)this.a6).getGreen(), ((Color)this.a6).getBlue(), ((Color)this.a6).getAlpha());
         }

         var1.u9 = this.u9;
         var1.h0 = this.h0;
         var1.c8 = this.c8;
         var1.t2 = this.t2;
         var1.s7 = 0;
         var1.x8 = this.x8;
         var1.n3 = this.n3;
         var1.y4 = this.y4;
         var1.e2 = this.e2;
         if (this.e2 != null) {
            var1.e2 = new Color(this.e2.getRed(), this.e2.getGreen(), this.e2.getBlue(), this.e2.getAlpha());
         }

         var1.t9 = this.t9;
         if (this.t9 != null) {
            var1.t9 = new Color(this.t9.getRed(), this.t9.getGreen(), this.t9.getBlue(), this.t9.getAlpha());
         }

         var1.z1 = com.aspose.slides.internal.x4g.m1.k5(com.aspose.slides.internal.x4g.m1.n5(this.z1).u9());
         var1.t4 = this.t4;
         var1.q0 = com.aspose.slides.internal.x4g.m1.k5(com.aspose.slides.internal.x4g.m1.n5(this.q0).u9());
         var1.z3 = this.z3;
         if (this.z3 != null) {
            var1.z3 = new Rectangle(this.z3.getLocation(), this.z3.getSize());
         }

         var1.m1 = this.m1;
         if (this.m1 != null) {
            var1.m1 = new Rectangle(this.m1.getLocation(), this.m1.getSize());
         }

         var1.k7 = this.k7;
         var1.m3 = this.m3;
         var1.z8 = this.z8;
         var1.j5 = this.j5;
      } catch (CloneNotSupportedException var3) {
      }

      return var1;
   }

   public int n5() {
      return this.h0 == 2 ? 1 : 0;
   }

   private void u3() {
      if (this.n5 != null) {
         this.n5 = (GeneralPath)this.n5.clone();
      }

      if (this.z1 != null) {
         this.z1 = (AffineTransform)this.z1.clone();
      }

      if (this.q0 != null) {
         this.q0 = (AffineTransform)this.q0.clone();
      }

      if (this.z3 != null) {
         this.z3 = (Rectangle)this.z3.clone();
      }

      if (this.m1 != null) {
         this.m1 = (Rectangle)this.m1.clone();
      }
   }

   public void n5(Rectangle var1) {
      this.m1 = var1;
   }

   public Rectangle l6() {
      return this.m1;
   }

   public void l6(Rectangle var1) {
      this.z3 = var1;
   }

   public int k5() {
      return this.c8;
   }
}
