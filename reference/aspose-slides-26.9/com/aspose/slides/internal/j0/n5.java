package com.aspose.slides.internal.j0;

import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.t2;
import com.aspose.slides.ms.System.q1;

public class n5 extends l6 {
   private com.aspose.slides.internal.v2.n5 n5;
   private com.aspose.slides.internal.v2.n5 l6;
   private float k5;

   public final com.aspose.slides.internal.v2.n5 n5() {
      return this.n5;
   }

   private void l6(com.aspose.slides.internal.v2.n5 var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.v2.n5 l6() {
      return this.l6;
   }

   private void k5(com.aspose.slides.internal.v2.n5 var1) {
      this.l6 = var1;
   }

   public final float k5() {
      return this.k5;
   }

   private void n5(float var1) {
      this.k5 = var1;
   }

   public n5(s7 var1) {
      super(var1);
      com.aspose.slides.internal.v2.k5 var2 = (com.aspose.slides.internal.v2.k5)this.t2();
      this.n5(var2);
      this.l6(var2);
      this.n5(var2.x8(c8.v1));
   }

   private void n5(com.aspose.slides.internal.v2.k5 var1) {
      s7 var2 = var1.u9(c8.a5);
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.n5.class)) {
         this.l6((com.aspose.slides.internal.v2.n5)var2);
      } else {
         this.l6(new com.aspose.slides.internal.v2.n5());
      }

      if (this.n5().n5() == 0) {
         com.aspose.slides.internal.v2.a6 var3 = new com.aspose.slides.internal.v2.a6(0.0F);
         this.n5().n5(var3);
      }
   }

   private void l6(com.aspose.slides.internal.v2.k5 var1) {
      s7 var2 = var1.u9(c8.h2);
      if (com.aspose.slides.internal.v6g.k5.l6(var2, com.aspose.slides.internal.v2.n5.class)) {
         this.k5((com.aspose.slides.internal.v2.n5)var2);
      } else {
         this.k5(new com.aspose.slides.internal.v2.n5());
      }

      if (this.l6().n5() == 0) {
         com.aspose.slides.internal.v2.a6 var3 = new com.aspose.slides.internal.v2.a6(1.0F);
         this.l6().n5(var3);
      }
   }

   @Override
   public float[] n5(float[] var1) {
      double var2 = var1[0];
      double var4 = this.u9();
      com.aspose.slides.internal.v2.n5 var6 = this.u3();
      com.aspose.slides.internal.v2.n5 var7 = this.a6();
      int var8 = var6.n5();
      float[] var9 = new float[var8];

      for (int var10 = 0; var10 < var8; var10++) {
         var9[var10] = ((t2)var6.k5(var10)).u3() + (float)q1.a6(var2, var4) * (((t2)var7.k5(var10)).u3() - ((t2)var6.k5(var10)).u3());
      }

      return this.l6(var9);
   }

   public final com.aspose.slides.internal.v2.n5 u3() {
      if (this.n5() == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.l6((com.aspose.slides.internal.v2.n5)var1.u9(c8.a5));
         if (this.n5() == null) {
            this.l6(new com.aspose.slides.internal.v2.n5());
            this.n5().n5(new com.aspose.slides.internal.v2.a6(0.0F));
         }
      }

      return this.n5();
   }

   public final com.aspose.slides.internal.v2.n5 a6() {
      if (this.l6() == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.k5((com.aspose.slides.internal.v2.n5)var1.u9(c8.h2));
         if (this.l6() == null) {
            this.k5(new com.aspose.slides.internal.v2.n5());
            this.l6().n5(new com.aspose.slides.internal.v2.a6(1.0F));
         }
      }

      return this.l6();
   }

   public final float u9() {
      if (this.k5() == Float.NaN) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.n5(var1.x8(c8.v1));
      }

      return this.k5();
   }
}
