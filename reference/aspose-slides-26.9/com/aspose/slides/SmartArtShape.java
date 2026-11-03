package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.IDisposable;

public class SmartArtShape extends GeometryShape implements ISmartArtShape {
   private final k6a n5;
   private TextFrame l6;

   @Override
   public int getShapeType() {
      return super.getShapeType();
   }

   @Override
   public void setShapeType(int value) {
      if (value == -1) {
         throw new ArgumentException("Can't set a NotDefined type for SmartArtShape");
      }

      if (value == 0) {
         throw new ArgumentException("Can't set a Custom type for SmartArtShape");
      }

      super.setShapeType(value);
      this.n5.y4().l6(value);
   }

   @Override
   public final ITextFrame getTextFrame() {
      this.n5.h0().z1().l6().n5().u3();
      return this.l6;
   }

   SmartArtShape(r0g parentImmediate, k7t container) {
      super(parentImmediate, new s9(), null);
      if (container == null) {
         throw new ArgumentNullException();
      }

      this.n5 = container.n5();
      this.n5(new h1u(this));
   }

   final void n5(AutoShape var1) {
      if (var1.getTextFrame() != null) {
         if (this.k5() == null) {
            this.n5(new TextFrame(this));
         }

         this.k5().n5((ITextFrame)var1.l6());
      }

      if (this.getFillFormat().getFillType() == -1 && var1.getFillFormat().getFillType() != -1) {
         ((FillFormat)this.getFillFormat()).n5(var1.getFillFormat());
      }

      if (this.getLineFormat().isFormatNotDefined() && !var1.getLineFormat().isFormatNotDefined()) {
         ((LineFormat)this.getLineFormat()).n5(var1.getLineFormat());
      }

      if (!((ThreeDFormat)this.getThreeDFormat()).n5(true) && ((ThreeDFormat)var1.getThreeDFormat()).n5(true)) {
         ((ThreeDFormat)this.getThreeDFormat()).n5(var1.getThreeDFormat());
      }

      com.aspose.slides.internal.k4y.b9y var2 = new com.aspose.slides.internal.k4y.b9y();
      u7a.l6(var1, var2);
      u7a.n5(this, var2);
      this.x8().n5(var1.n5().h0());
      this.n5(var1.R_());
   }

   final void n5() {
      List var1 = this.z8();
      List$Enumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            p6x var3 = (p6x)var2.next();
            w4c var4 = var3.y4();
            var4.l6(this);
            if (this.m3().a6() != 1 && this.k5() != null && !var4.h0()) {
               var4.k5(this);
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   @Override
   long t2() {
      return ((this.s7 & 4294967295L) + (((Presentation)this.getPresentation()).s7() & 4294967295L) & 4294967295L)
            + ((this.k5() != null ? this.k5().n5.s3() : 0L) & 4294967295L)
         & 4294967295L;
   }

   @Override
   o4f R_() {
      this.n5.h0().z1().l6().n5().u3();
      return super.R_();
   }

   @Override
   void n5(e4c var1, e4c var2, x4t var3) {
      o4f var4 = this.R_();
      if (this.n5.a6(61) == 0.0 || this.n5.a6(15) == 0.0) {
         this.n5.h0().z1().a6();
      }

      double var5 = this.n5.a6(61);
      double var7 = this.n5.a6(15);
      double var9 = 1.0;
      double var11 = 1.0;
      e4c var13 = var2.u9();
      double var14 = var4.k5() - this.n5.y4().k5().s7() / 60000.0;
      if (var14 > 45.0 && var14 < 135.0 || var14 > 225.0 && var14 < 315.0) {
         double var16 = var13.n5;
         var13.n5 = var13.l6;
         var13.l6 = var16;
      }

      if (com.aspose.slides.ms.System.q1.n5(var13.n5 / var5, 3) != var9) {
         var9 = var13.n5 / var5;
         this.n5.y4().k5().u3(com.aspose.slides.internal.v6g.k5.u3(var9 * 100000.0, 14));
      }

      if (com.aspose.slides.ms.System.q1.n5(var13.l6 / var7, 3) != var11) {
         var11 = var13.l6 / var7;
         this.n5.y4().k5().a6(com.aspose.slides.internal.v6g.k5.u3(var11 * 100000.0, 14));
      }

      this.n5.n5(new e4c(var9, var11));
      e4c var18 = e4c.l6(var1, var4.n5()).u9();
      if (com.aspose.slides.ms.System.q1.n5(var18.n5) > 0.05 || com.aspose.slides.ms.System.q1.n5(var18.l6) > 0.05) {
         if (!com.aspose.slides.internal.v6g.k5.l6(this.n5.s7(), o7p.class) && com.aspose.slides.internal.v6g.k5.l6(this.n5.n5().s7(), b5x.class)) {
            e4c var45 = this.n5.n5().s7().k5(this.n5).u9();
            u6x var20 = this.n5.c8().e5().z1();
            u6x var21 = var20.k5(var18.n5, var18.l6).z1();
            var20.k5(-var45.n5, -var45.l6).u3(var20);
            u6x var22 = this.n5.t2().c8().e5().z1();
            if (var22.k5(var21.z1())) {
               k7t var23 = this.n5.n5().c8();
               u6x var24 = var23.e5().z1();
               double var25 = var23.k5(6);
               double var27 = var23.k5(7);
               if (var25 == 0.0) {
                  var25 = var24.x8().n5;
               }

               if (var27 == 0.0) {
                  var27 = var24.x8().l6;
               }

               e4c var29 = new e4c(var25, var27);
               double var30 = ((b5x)this.n5.n5().s7()).c8();
               double var32 = new u6x(var29.u9(), var20.x8().u9()).y4();
               double var34 = new u6x(var29.u9(), var21.x8().u9()).y4();
               double var36 = var34 - var32;
               if (com.aspose.slides.ms.System.q1.n5(var36) > 0.05) {
                  double var38 = 1.0;
                  float var40 = this.n5.n5().r4().size();
                  if (this.n5.n5().l6().size() > 1 && var40 > 0.0F) {
                     var38 = this.n5.n5().l6().size() / var40;
                  }

                  this.n5.y4().k5().x8(com.aspose.slides.internal.v6g.k5.u3(var36 / var30 * var38 * 100000.0, 14));
               }

               double var46 = q3g.n5(var29.u9(), var20.x8().u9());
               double var41 = q3g.n5(var29.u9(), var21.x8().u9());
               if (com.aspose.slides.ms.System.q1.n5(var41 / var46) > 0.001) {
                  this.n5.y4().k5().s7(com.aspose.slides.internal.v6g.k5.u3(var41 / var46 * 100000.0, 14));
               }

               this.n5.y4().k5().u9(0);
               this.n5.y4().k5().h0(0);
               this.n5.y4().k5().c8(0);
               this.n5.y4().k5().t2(0);
            }
         } else {
            e4c var19 = this.n5.s7().k5(this.n5).u9();
            var18.n5 = var18.n5 + var19.n5;
            var18.l6 = var18.l6 + var19.l6;
            if (com.aspose.slides.ms.System.q1.n5(var18.n5) > 0.05) {
               this.n5.y4().k5().c8(0);
               this.n5.y4().k5().u9(com.aspose.slides.internal.v6g.k5.u3(var18.n5 / var5 * 100000.0, 14));
            }

            if (com.aspose.slides.ms.System.q1.n5(var18.l6) > 0.05) {
               this.n5.y4().k5().t2(0);
               this.n5.y4().k5().h0(com.aspose.slides.internal.v6g.k5.u3(var18.l6 / var7 * 100000.0, 14));
            }
         }
      }

      if (var3.l6 != var4.k5()) {
         double var43 = var3.l6;
         if (this.n5.y4().k5().s7() != 0 || var4.k5() != 0.0F) {
            var43 -= var14;
         }

         this.n5.y4().k5().k5(com.aspose.slides.internal.v6g.k5.u3(var43 * 60000.0, 14));
      }

      if (var4.u3() == 1 != var3.u3) {
         this.n5.y4().k5().k5((byte)(var3.u3 ? 1 : 0));
      }

      if (var4.a6() == 1 != var3.k5) {
         this.n5.y4().k5().l6((byte)(var3.k5 ? 1 : 0));
      }

      super.n5(var1.u9(), var2.u9(), var3.n5());
      this.n5.h0().z1().l6().x8();
   }

   final void n5(double var1) {
      super.R_().n5((float)var1);
   }

   final void n5(int var1) {
      super.setShapeType(var1);
   }

   final TextFrame k5() {
      return this.l6;
   }

   final void n5(TextFrame var1) {
      if (!com.aspose.slides.ms.System.j8.l6(this.l6, var1)) {
         this.l6 = var1;
      }
   }

   final s9 x8() {
      return (s9)super.u9();
   }

   @Override
   com.aspose.slides.internal.o9b.w1[] P_() {
      return null;
   }

   @Override
   float[] Q_() {
      return null;
   }

   final k6a y4() {
      return this.n5;
   }

   private List<p6x> z8() {
      List var1 = new List();
      if (this.n5.u9().size() == 0) {
         var1.addItem(this.n5);
      } else {
         List$Enumerator var2 = this.n5.u9().iterator();

         try {
            while (var2.hasNext()) {
               l6s var3 = (l6s)var2.next();
               var1.addItem(var3);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
               var2.dispose();
            }
         }
      }

      return var1;
   }

   final w4c m3() {
      return this.n5.u9().size() > 0 ? this.n5.u9().get_Item(0).y4() : this.n5.y4();
   }

   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   s9 u9() {
      return this.x8();
   }


   // $VF: synthetic method
   @Override

   // Restored from the original synthetic/bridge forwarding bytecode.
   s9 h0() {
      return this.x8();
   }

}
