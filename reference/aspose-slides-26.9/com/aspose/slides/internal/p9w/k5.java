package com.aspose.slides.internal.p9w;

import com.aspose.slides.internal.o6x.u3;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.n1;
import java.awt.Shape;
import java.awt.geom.AffineTransform;

public class k5 extends n5 {
   private final com.aspose.slides.internal.a9y.l6 l6;
   private final com.aspose.slides.internal.p5x.n5 k5;
   private final float u3;
   private final float a6;
   private final int u9;
   private final int h0;
   private final String c8;
   private float t2 = -1.0F;
   private float s7 = -1.0F;

   public k5(u3 var1, com.aspose.slides.internal.a9y.l6 var2, com.aspose.slides.internal.p5x.n5 var3, float var4, float var5, int var6, int var7, String var8) {
      super(var1);
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      if (var1.k5().n3()) {
         this.c8 = var8;
         this.u9 = var6;
         this.h0 = var7;
      } else {
         this.c8 = com.aspose.slides.internal.r5w.k5.n5(var8);
         this.u9 = var6;
         this.h0 = var7 - (var8.length() - this.c8.length());
      }
   }

   protected float e2() {
      return this.u3;
   }

   @Override
   public int n5() {
      return this.u9;
   }

   @Override
   public int l6() {
      return this.h0;
   }

   @Override
   public float n5(int var1, int var2) {
      return this.k5.n5(var1, var2);
   }

   @Override
   public float k5() {
      if (this.t2 < 0.0F) {
         this.t2 = this.k5.n5(this.u9, this.h0);
      }

      return this.t2;
   }

   private float t9() {
      if (this.s7 < 0.0F) {
         this.s7 = this.l6.n5();
      }

      return this.s7;
   }

   @Override
   public float u3() {
      return this.a6;
   }

   @Override
   public float h0() {
      float var1 = this.n5.n5();
      if (n1.a6(var1)) {
         var1 = 0.0F;
      }

      if (this.n5.k5().x8()) {
         if (this.n5.k5().t9()) {
            return var1 - this.u3() - this.a6();
         } else {
            return this.n5.k5().q0() ? this.u3() + this.u9() : this.u3() + this.u9() + this.y4();
         }
      } else {
         float var2;
         switch (this.n5.k5().n5()) {
            case 1:
               var2 = (var1 - this.t9()) / 2.0F;
               break;
            case 2:
               if (this.n5.k5().t9()) {
                  var2 = this.n3();
               } else {
                  var2 = var1 - this.t9() - this.x8();
               }
               break;
            default:
               if (this.n5.k5().t9()) {
                  var2 = var1 - this.t9() - this.x8();
               } else {
                  var2 = this.x8();
               }
         }

         return var2 + this.u3;
      }
   }

   @Override
   public float c8() {
      if (this.n5.k5().x8()) {
         float var1 = this.n5.l6();
         if (n1.a6(var1)) {
            var1 = 0.0F;
         }

         float var2;
         switch (this.n5.k5().n5()) {
            case 1:
               var2 = (var1 - this.t9()) / 2.0F;
               break;
            case 2:
               var2 = var1 - this.t9() - this.n3();
               break;
            default:
               var2 = this.x8();
         }

         return var2 + this.u3;
      } else {
         return this.u3() + this.a6();
      }
   }

   @Override
   public void n5(z1 var1, float var2, float var3) {
      if (this.n5.k5().x8()) {
         this.l6(var1, var3 + this.c8(), -(var2 + this.h0()));
      } else {
         this.l6(var1, var2 + this.h0(), var3 + this.c8());
      }
   }

   @Override
   public Shape n5(float var1, float var2, n3 var3) {
      AffineTransform var4 = (AffineTransform)this.n5.e2().clone();
      if (this.n5.k5().x8()) {
         var4.translate(var2 + this.c8(), -(var1 + this.h0()));
      } else {
         var4.translate(var1 + this.h0(), var2 + this.c8());
      }

      var4.shear(-0.17, 0.0);
      return this.n5(m1.n5(var4));
   }

   @Override
   public Shape n5(float var1, float var2) {
      AffineTransform var3 = (AffineTransform)this.n5.e2().clone();
      if (this.n5.k5().x8()) {
         var3.translate(var2 + this.c8(), -(var1 + this.h0()));
      } else {
         var3.translate(var1 + this.h0(), var2 + this.c8());
      }

      return this.n5(m1.n5(var3));
   }

   void l6(z1 var1, float var2, float var3) {
      this.l6.n5(var1, var2, var3);
   }

   Shape n5(m1 var1) {
      return this.l6.n5(var1);
   }
}
