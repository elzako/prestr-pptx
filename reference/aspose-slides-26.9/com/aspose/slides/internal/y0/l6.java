package com.aspose.slides.internal.y0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.a0.t2;
import com.aspose.slides.internal.h2.f2;
import com.aspose.slides.internal.p3.f0;
import com.aspose.slides.internal.p3.j4$n5;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.p6;
import com.aspose.slides.internal.p3.s3;
import com.aspose.slides.internal.p3.t1;
import com.aspose.slides.internal.p3.w2;
import com.aspose.slides.internal.p3.y2;
import com.aspose.slides.internal.p3.y4;
import com.aspose.slides.internal.r4.u3;
import com.aspose.slides.internal.v4.m3;
import com.aspose.slides.internal.v4.z8;

public class l6 extends y4 {
   private t2 t2;
   private int k7;
   private int m3;

   public l6(z8 var1) {
      super(var1);
   }

   public l6(m3 var1) {
      super(var1);
   }

   public final com.aspose.slides.internal.v4.l6 y1() {
      return (com.aspose.slides.internal.v4.l6)this.k5;
   }

   @Override
   public void n5(com.aspose.slides.internal.r4.y4<j8> var1, t1 var2) {
      this.n5((com.aspose.slides.internal.a0.l6)null);
      this.c4();
      t1 var3 = new t1(0);
      y2 var4 = null;
      y2 var5 = null;
      j8 var6 = null;
      j8 var7 = null;
      List var8 = new List();

      while (var1.l6()) {
         j8 var9 = (j8)var1.k5();
         if (var9 != null) {
            if (var9.a6() >= 0) {
               if (var6 == null) {
                  var6 = var9;
               }

               var7 = var9;
            }

            if (com.aspose.slides.internal.v6g.k5.l6(var9, f0.class)) {
               var8.addItem(var9.k5());
               var5 = var9.k5().u3();
               if (var4 == null) {
                  var4 = var5;
               }
            } else if (com.aspose.slides.internal.v6g.k5.l6(var9, j4$n5.class)) {
               var8.addItem(var9);
            }
         }
      }

      this.n5(true, this.l6(var6), this.k5(var7));
      w2 var10 = new w2(new u3(var8));

      y2 var11;
      while ((var11 = var10.u9()) != null) {
         var3.n5(32, var11 == var4);
         var3.n5(128, var11 == var5);
         var3.n5(var2.m3());
         var3.n5(var2.q0());
         var11.n5(var10, var3);
      }

      this.n5(false, this.l6(var6), this.k5(var7));
      this.d5();
      this.t2 = null;
      this.u3(var7);
   }

   @Override
   public com.aspose.slides.internal.a0.l6 n5(com.aspose.slides.internal.a0.l6 var1) {
      if (this.t2 == null) {
         this.t2 = new t2();
         this.t2.t2(2);
         this.t2.n5(this.k7, false, false);
         this.t2.l6(this.m3);
         p6.n5(this.t2, this.y1().y1());
         com.aspose.slides.internal.a0.l6 var2 = this.u3.n5(this.t2);
         int var3 = var2.l6();
         this.t2.l6(var3);
         this.n5(this.t2);
      }

      return this.t2;
   }

   @Override
   public void l6(com.aspose.slides.internal.a0.l6 var1) {
      if (this.t2 != null) {
         this.t2.l6((t2)var1);
      }
   }

   @Override
   public f2 s3() {
      return this.y1().e5();
   }

   @Override
   public s3 v0() {
      return s3.n5;
   }

   @Override
   public s3 h2() {
      return s3.n5;
   }
}
