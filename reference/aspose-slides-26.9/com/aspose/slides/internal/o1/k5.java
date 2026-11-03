package com.aspose.slides.internal.o1;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.q1;

public abstract class k5 {
   private com.aspose.slides.internal.y6.l6 u9;
   protected y2 n5 = new y2();
   protected int l6 = 96;
   protected int k5 = 96;
   protected p8 u3 = new p8();
   protected f2 a6 = new f2();
   private final u3 h0;

   protected k5(com.aspose.slides.internal.y6.l6 var1, u3 var2) {
      if (var1 == null) {
         throw new ArgumentNullException("metafile");
      }

      if (var2 == null) {
         throw new ArgumentNullException("settings");
      }

      this.u9 = var1;
      this.h0 = var2;
   }

   protected final y2 n5() {
      return new y2(this.u9.E_(), this.u9.F_(), this.u9.u9(), this.u9.h0());
   }

   public static k5 n5(com.aspose.slides.internal.y6.l6 var0) {
      return n5(var0, com.aspose.slides.internal.o1.u3.l6());
   }

   public static k5 n5(com.aspose.slides.internal.y6.l6 var0, u3 var1) {
      switch (var0.l6()) {
         case 1:
         case 2:
            return new a6((com.aspose.slides.internal.m0.n5)var0, var1);
         case 3:
         case 4:
         case 5:
            return new n5((com.aspose.slides.internal.d9.n5)var0, var1);
         default:
            throw new ArgumentException("Invalid metafile type");
      }
   }

   public final com.aspose.slides.internal.y6.l6 l6() {
      return this.u9;
   }

   protected u3 k5() {
      return this.h0;
   }

   public final void n5(z1 var1) {
      this.n5(var1, new m1());
   }

   public abstract void n5(Object var1, m1 var2);

   public void n5(com.aspose.slides.internal.o9b.l6 var1) {
   }

   public com.aspose.slides.internal.o9b.l6 u3() {
      return this.n5(this.l6().u9(), this.l6().h0());
   }

   public com.aspose.slides.internal.o9b.l6 n5(float var1, float var2) {
      com.aspose.slides.internal.o9b.l6 var3 = new com.aspose.slides.internal.o9b.l6(
         com.aspose.slides.internal.v6g.k5.u3(q1.u3(var1), 14), com.aspose.slides.internal.v6g.k5.u3(q1.u3(var2), 14)
      );
      this.n5(var3);
      m1 var4 = new m1();
      var4.n5(var1 / this.l6().u9(), var2 / this.l6().h0());
      var4.k5(-this.l6().E_(), -this.l6().F_());
      z1 var5 = z1.n5(var3);

      try {
         if (!this.k5().k5().t2()) {
            var5.n5(this.k5().k5().o8());
         }

         this.l6(var5);
         this.n5(var5, var4);
      } finally {
         if (var5 != null) {
            var5.dispose();
         }
      }

      return var3;
   }

   public void n5(z1 var1, com.aspose.slides.internal.o9b.l6 var2, y1 var3) {
      this.n5(var2);
      m1 var4 = new m1();
      var4.k5(var3.a6(), var3.t2());
      var4.n5(var3.s7() / this.l6().u9(), var3.k5() / this.l6().h0());
      var4.k5(-this.l6().E_(), -this.l6().F_());
      this.n5(var1, var4);
   }

   protected final m1 n5(y1 var1, y1 var2) {
      if (var2.equals(var1.y4())) {
         return new m1();
      } else if (var1.s7() != 0.0F && var1.k5() != 0.0F) {
         w1[] var3 = new w1[]{new w1(var2.x8(), var2.n3()), new w1(var2.s7(), var2.n3()), new w1(var2.x8(), var2.k5())};
         return new m1(var1.y4(), var3);
      } else {
         return new m1();
      }
   }

   private void l6(z1 var1) {
      if (o5.l6(this.k5().a6(), null)) {
         var1.n5(this.k5().a6().n5());
      }

      if (o5.l6(this.k5().u9(), null)) {
         var1.l6(this.k5().u9().n5());
      }

      if (o5.l6(this.k5().h0(), null)) {
         var1.k5(this.k5().h0().n5());
      }

      if (o5.l6(this.k5().c8(), null)) {
         var1.a6(this.k5().c8().n5());
      }

      if (o5.l6(this.k5().t2(), null)) {
         var1.u9(this.k5().t2().n5());
      }

      if (o5.l6(this.k5().s7(), null)) {
         var1.c8(this.k5().s7().n5());
      }

      if (o5.l6(this.k5().x8(), null)) {
         var1.h0(this.k5().x8().n5());
      }
   }
}
