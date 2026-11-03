package com.aspose.slides.internal.f1s;

import com.aspose.slides.Collections.Generic.Stack;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.z4.a0;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.ms.System.q1;

public class u9 {
   private boolean n5;
   private final com.aspose.slides.internal.z4.c8 l6;
   private a6 k5;
   private final Stack<a6> u3 = new Stack<>();

   public u9(com.aspose.slides.internal.z4.c8 var1) {
      this.l6 = var1;
   }

   public final void n5() {
      this.k5 = new a6();
   }

   public final void n5(a0 var1) {
      var1.k5("q");
      this.u3.push(this.k5.n5());
   }

   public final void l6(a0 var1) {
      var1.k5("Q");
      this.k5 = this.u3.pop();
   }

   public final void n5(com.aspose.slides.internal.w0.c8 var1, a0 var2) {
      int var3 = var1 != null ? s3.n5(var1.c8(), var1.t2()) : 0;
      if (var3 > 1) {
         com.aspose.slides.internal.w0.c8 var4 = new com.aspose.slides.internal.w0.c8();
         var4.l6(var1.c8() / var3, var1.t2() / var3);

         for (int var5 = 0; var5 < var3; var5++) {
            this.l6(var4, var2);
         }

         com.aspose.slides.internal.w0.c8 var6 = new com.aspose.slides.internal.w0.c8(var1.u3(), var1.a6(), var1.u9(), var1.h0(), 0.0F, 0.0F);
         this.l6(var6, var2);
      } else {
         this.l6(var1, var2);
      }
   }

   private void l6(com.aspose.slides.internal.w0.c8 var1, a0 var2) {
      var2.n5(var1, "cm");
      this.k5.l6().n5(var1, 0);
   }

   public final void n5(l6 var1, boolean var2, a0 var3) {
      if (var2) {
         if (var1 == this.k5.k5()) {
            return;
         }

         this.k5.n5(var1);
      } else {
         if (var1 == this.k5.u3()) {
            return;
         }

         this.k5.l6(var1);
      }

      var3.k5("/{0} {1}", var1.a6(), var2 ? "CS" : "cs");
   }

   public final void n5(com.aspose.slides.internal.p1s.n5 var1, boolean var2, a0 var3) {
      if (var2) {
         if (this.k5.k5() == com.aspose.slides.internal.f1s.l6.l6() && com.aspose.slides.internal.p1s.n5.k5(var1, this.k5.a6())) {
            return;
         }

         this.k5.n5(com.aspose.slides.internal.f1s.l6.l6());
         this.k5.n5(var1);
      } else {
         if (this.k5.u3() == com.aspose.slides.internal.f1s.l6.l6() && com.aspose.slides.internal.p1s.n5.k5(var1, this.k5.c8())) {
            return;
         }

         this.k5.l6(com.aspose.slides.internal.f1s.l6.l6());
         this.k5.l6(var1);
      }

      if (var1.l6() < 255) {
         float var4 = var1.l6() / 255.0F;
         if (var2) {
            this.k5.n5(var4);
         } else {
            this.k5.l6(var4);
         }

         k5 var5 = this.l6.k5().n5(this.k5.u9(), this.k5.h0(), false);
         n5(var5, var3);
         this.n5 = true;
      } else if (this.k5()) {
         float var6 = 1.0F;
         if (var2) {
            this.k5.n5(1.0F);
         } else {
            this.k5.l6(1.0F);
         }

         k5 var7 = this.l6.k5().n5(this.k5.u9(), this.k5.h0(), false);
         n5(var7, var3);
      }

      var3.k5("{0} {1}", s3.n5(var1), var2 ? "RG" : "rg");
   }

   public final void n5(float var1, a0 var2) {
      if (var1 != this.k5.t2()) {
         this.k5.k5(var1);
         var2.k5("{0} TL", s3.l6(var1));
      }
   }

   public final void n5(com.aspose.slides.internal.c0.l6 var1, float var2, a0 var3) {
      if (var1 != this.k5.s7() || var2 != this.k5.x8()) {
         this.k5.n5(var1);
         this.k5.u3(var2);
         var3.k5("/{0} {1} Tf", var1.x8(), s3.l6(var2));
      }
   }

   public final void n5(int var1, a0 var2) {
      if (var1 != this.k5.n3()) {
         this.k5.n5(var1);
         var2.k5("{0} Tr", com.aspose.slides.internal.t6j.u3.n5(var1));
      }
   }

   public final void l6(float var1, a0 var2) {
      if (var1 != this.k5.y4()) {
         this.k5.a6(var1);
         var2.k5("{0} Tc", s3.l6(var1));
      }
   }

   public final void k5(float var1, a0 var2) {
      if (var1 != this.k5.e2()) {
         this.k5.u9(var1);
         var2.k5("{0} w", s3.l6(var1));
      }
   }

   public final void l6(int var1, a0 var2) {
      if (var1 != this.k5.t9()) {
         this.k5.l6(var1);
         var2.k5("{0} J", com.aspose.slides.internal.t6j.u3.n5(var1));
      }
   }

   public final void k5(int var1, a0 var2) {
      if (var1 != this.k5.z1()) {
         this.k5.k5(var1);
         var2.k5("{0} j", com.aspose.slides.internal.t6j.u3.n5(var1));
      }
   }

   public final void u3(float var1, a0 var2) {
      if (var1 != this.k5.t4()) {
         this.k5.h0(var1);
         var2.k5("{0} M", s3.l6(var1));
      }
   }

   private static void n5(k5 var0, a0 var1) {
      var1.k5("/{0} gs", var0.x8());
   }

   public final y1 n5(y1 var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 2));
      var2[0] = new w1(var1.a6(), var1.t2());
      var2[1] = new w1(var1.h0(), var1.l6());
      this.k5.l6().n5(var2);
      return new y1(
         q1.l6(var2[0].l6(), var2[1].l6()), q1.l6(var2[0].k5(), var2[1].k5()), q1.n5(var2[0].l6() - var2[1].l6()), q1.n5(var2[0].k5() - var2[1].k5())
      );
   }

   public final w1 n5(w1 var1) {
      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 1));
      var1.n5(var2[0]);
      this.k5.l6().n5(var2);
      return var2[0];
   }

   public final a6 l6() {
      return this.k5;
   }

   public final boolean k5() {
      return this.k5.u9() < 1.0F || this.k5.h0() < 1.0F;
   }
}
