package com.aspose.slides.internal.p9w;

import com.aspose.slides.internal.o6x.u3;
import com.aspose.slides.internal.o9b.n3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.n1;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.GeneralPath;
import java.util.ArrayList;
import java.util.List;

public class l6 extends n5 {
   private List<k5> l6 = new ArrayList<>();
   private float k5 = 0.0F;
   private final int u3;
   private final int a6;
   private String u9;

   public l6(u3 var1, int var2, int var3, String var4) {
      super(var1);
      this.u3 = var2;
      this.a6 = var3;
      this.u9 = var4;
   }

   public void n5(k5 var1, float var2) {
      this.l6.add(var1);
      this.k5 = Math.max(this.k5, var2 + var1.k5());
   }

   @Override
   public int n5() {
      return this.u3;
   }

   @Override
   public int l6() {
      return this.a6;
   }

   @Override
   public float n5(int var1, int var2) {
      float var3 = 0.0F;
      k5 var4 = null;

      for (k5 var6 : this.l6) {
         if (var2 <= var6.n5()) {
            break;
         }

         if (var1 < var6.l6()) {
            int var7 = Math.max(var6.n5(), var1);
            int var8 = Math.min(var6.l6(), var2);
            var3 += this.n5.n5(var7, var8);
            var4 = var6;
         }
      }

      if (var4 != null) {
         var3 += var4.e2();
      }

      return var3;
   }

   @Override
   public float k5() {
      return this.k5;
   }

   @Override
   public float u3() {
      return this.l6.get(0).u3();
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
            return this.n5.k5().q0() ? this.u3() + this.u9() + this.t2() : this.u3() + this.u9() + this.y4();
         }
      } else {
         float var2;
         switch (this.n5.k5().n5()) {
            case 1:
               var2 = (var1 - this.e2()) / 2.0F;
               break;
            case 2:
               if (this.n5.k5().t9()) {
                  var2 = this.n3();
               } else {
                  var2 = var1 - this.e2() - this.x8();
               }
               break;
            default:
               if (this.n5.k5().t9()) {
                  var2 = var1 - this.e2() - this.x8();
               } else {
                  var2 = this.x8();
               }
         }

         return var2;
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
               var2 = (var1 - this.e2()) / 2.0F;
               break;
            case 2:
               var2 = var1 - this.e2();
               break;
            default:
               var2 = this.x8();
         }

         return var2;
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

   private void l6(z1 var1, float var2, float var3) {
      for (k5 var5 : this.l6) {
         var5.l6(var1, var2 + var5.e2(), var3);
      }
   }

   @Override
   public Shape n5(float var1, float var2, n3 var3) {
      GeneralPath var4 = new GeneralPath();

      for (k5 var6 : this.l6) {
         AffineTransform var7 = (AffineTransform)this.n5.e2().clone();
         if (this.n5.k5().x8()) {
            var7.translate(var2 + this.c8(), -(var1 + this.h0()) + var6.e2());
         } else {
            var7.translate(var1 + this.h0() + var6.e2(), var2 + this.c8());
         }

         var7.shear(-0.17, 0.0);
         var4.append(var6.n5(m1.n5(var7)), false);
      }

      return var4;
   }

   @Override
   public Shape n5(float var1, float var2) {
      GeneralPath var3 = new GeneralPath();

      for (k5 var5 : this.l6) {
         AffineTransform var6 = (AffineTransform)this.n5.e2().clone();
         if (this.n5.k5().x8()) {
            var6.translate(var2 + this.c8(), -(var1 + this.h0()) + var5.e2());
         } else {
            var6.translate(var1 + this.h0() + var5.e2(), var2 + this.c8());
         }

         var3.append(var5.n5(m1.n5(var6)), false);
      }

      return var3;
   }

   private float e2() {
      return this.k5();
   }
}
