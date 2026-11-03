package com.aspose.slides.internal.z6z;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.e1.a0;
import com.aspose.slides.internal.e1.j5;
import com.aspose.slides.internal.e1.k7;
import com.aspose.slides.internal.e1.m3;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.s3;
import com.aspose.slides.internal.e1.w1;

public class q0 extends com.aspose.slides.internal.e1.y4 {
   private final com.aspose.slides.internal.g0.l6 n5 = new com.aspose.slides.internal.g0.l6();
   private final com.aspose.slides.internal.l2.u3 l6 = new com.aspose.slides.internal.l2.u3();
   private final u9 k5 = new u9(this.l6);
   private n5 u3;

   public q0(com.aspose.slides.internal.b8.u9 var1, n3 var2) {
      this.k5.n5(var1);
      this.k5.n5(var2);
      this.u3 = new n5(var2);
   }

   public final void n5(m3 var1) {
      this.l6(var1);
   }

   public final void n5() {
      this.k5.n5();
   }

   @Override
   public void n5(w1 var1) {
      this.k5.n5(var1.l6(), var1.k5());
      this.k5.n5(var1.n5().a6());
   }

   @Override
   public void l6(w1 var1) {
      this.k5.l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.t2 var1) {
      this.k5.k5().n5(var1);
   }

   @Override
   public void l6(com.aspose.slides.internal.e1.t2 var1) {
      this.k5.k5().l6();
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.z1 var1) {
      if (var1.c8() != null && var1.c8().u9() != null && var1.c8().u9().n5() != 0
         || var1.u9() != null && var1.u9().n5() != 0
         || (var1.u9() == null || com.aspose.slides.internal.p1s.n5.k5(var1.k5(), com.aspose.slides.internal.p1s.n5.b2))
            && var1.c8() != null
            && var1.c8().u9() != null
            && com.aspose.slides.internal.p1s.n5.u3(var1.h0(), com.aspose.slides.internal.p1s.n5.b2)) {
         com.aspose.slides.internal.e1.t2 var2 = new com.aspose.slides.internal.e1.t2();
         r4 var3 = r4.n5(var1);
         var2.n5(var1.a6());
         if (var1.u3() == null) {
            var2.n5(new com.aspose.slides.internal.w0.c8());
         } else {
            var2.n5(var1.u3().k5());
         }

         var2.u3().l6(var1.n3().l6(), var1.s7().k5() - var1.l6().c8(), 1);
         var2.n5(var1.z1());
         var2.k5(var1.j5());

         for (int var4 = 0; var4 < var3.t2(); var4++) {
            var2.n5(var3.n5(var4));
         }

         this.l6(var2);
      } else {
         this.k5.k5().n5(var1);
      }
   }

   @Override
   public void l6(r4 var1) {
      this.k5.k5().n5(var1);
   }

   @Override
   public void n5(r4 var1) {
      this.k5.k5().k5();
   }

   @Override
   public void n5(k7 var1) {
      var1 = var1.n5(this, this.n5, false, this.k5.u3().k5());
      if (var1 != null) {
         this.k5.k5().n5(var1);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.u9 var1) {
      this.k5.n5(var1);
   }

   @Override
   public void n5(j5 var1) {
      this.k5.n5(var1);
   }

   @Override
   public void n5(s3 var1) {
      if (this.k5.u3().u3().n5()) {
         this.l6(this.u3.n5(var1));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.s7 var1) {
      if (this.k5.u3().u3().n5()) {
         this.l6(this.u3.n5(var1));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.x8 var1) {
      if (this.k5.u3().u3().n5()) {
         this.l6(this.u3.n5(var1));
      }
   }

   @Override
   public void n5(a0 var1) {
      if (this.k5.u3().u3().n5()) {
         this.l6(this.u3.n5(var1));
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.c8 var1) {
      if (this.k5.u3().u3().n5()) {
         this.l6(this.u3.n5(var1));
      }
   }

   public final com.aspose.slides.internal.l2.u3 l6() {
      return this.l6;
   }

   public final IGenericList<com.aspose.slides.internal.b8.n3> k5() {
      return this.k5.a6();
   }
}
