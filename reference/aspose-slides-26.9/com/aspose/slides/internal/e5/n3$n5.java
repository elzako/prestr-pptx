package com.aspose.slides.internal.e5;

import com.aspose.slides.internal.o0.k5$n5;
import com.aspose.slides.ms.System.d1;

public class n3$n5 extends com.aspose.slides.internal.w2.l6 {
   protected t2 n5 = null;
   protected w1 l6;
   private int k5 = 0;
   private n3 u3;

   public n3$n5(n3 var1) {
      this.u3 = var1;
   }

   @Override
   public void n5(String var1, String var2, String var3, com.aspose.slides.internal.w2.k5 var4) {
      w1 var5 = null;
      if (this.u3.l6 == null) {
         n3.n5(this.u3, false);
         if (!d1.a6(var1, "http://www.w3.org/1999/XSL/Format") || !d1.a6(var2, "root")) {
            q0 var6 = e2.n5(n3.n5(this.u3).m1());
            var6.k5(this, t2.n5(var1, var2), this.u3.n5());
         }
      } else if (d1.a6(this.n5.q0(), "http://www.w3.org/1999/XSL/Format") || d1.a6(this.n5.q0(), "http://xmlgraphics.apache.org/fop/extensions")) {
         this.n5.n5(n3.l6(this.u3), var1, var2);
      }

      a6$n5 var11 = this.k5(var1, var2);
      t2 var7 = var11.n5(this.n5);
      if (this.u3.l6 == null) {
         this.u3.l6 = (com.aspose.slides.internal.t1.k7)var7;
         this.u3.l6.n5(n3.k5(this.u3));
         this.u3.l6.n5(n3.u3(this.u3));
      }

      var5 = var7.n5(this.l6, n3.u3(this.u3));
      var7.n5(var2, this.u3.n5(), var4, var5);
      if (var7.z3() == 44) {
         if (n3.k5(this.u3).u3()) {
            this.k5++;
         } else {
            n3.k5(this.u3).n5(true);
         }
      }

      if (var7.z3() == 53) {
         n3.k5(this.u3).k5().n5();
      }

      com.aspose.slides.internal.v3.u9 var8 = var7.k7();
      if (var8 != null) {
         com.aspose.slides.internal.w2.u3 var9 = var8.n5();
         if (com.aspose.slides.internal.v6g.k5.l6(var9, com.aspose.slides.internal.v3.c8.class)
            && com.aspose.slides.internal.v6g.k5.l6(var7, com.aspose.slides.internal.v3.h0.class)) {
            ((com.aspose.slides.internal.v3.c8)var9).n5((com.aspose.slides.internal.v3.h0)var7);
         }

         var9.l6();
         var9.n5(var1, var2, var3, var4);
         n3.n5(this.u3, 1);
         this.u3.u3 = var9;
      }

      if (this.n5 != null) {
         this.n5.n5(var7);
      }

      this.n5 = var7;
      if (var5 != null && !n3.k5(this.u3).u3()) {
         this.l6 = var5;
      }

      if (this.n5.z3() != 10) {
         this.n5.u9();
      }
   }

   @Override
   public void n5(String var1, String var2, String var3) {
      if (this.n5 == null) {
         throw new com.aspose.slides.internal.w2.c8(d1.n5(new String[]{"endElement() called for ", var3, " where there is no current element."}));
      }

      if (d1.a6(this.n5.z1(), var2) && d1.a6(this.n5.q0(), var1)) {
         if (this.n5.z3() != 10) {
            this.n5.c8();
         }

         if (this.l6 != null && this.l6.n5() == this.n5 && !n3.k5(this.u3).u3()) {
            this.l6 = this.l6.k5();
         }

         if (this.n5.z3() == 44) {
            if (this.k5 == 0) {
               n3.k5(this.u3).n5(false);
            } else {
               this.k5--;
            }
         }

         if (this.n5.s_() == null) {
         }

         this.n5 = this.n5.s_();
      } else {
         throw new com.aspose.slides.internal.w2.c8(d1.n5(new String[]{"Mismatch: ", this.n5.z1(), " (", this.n5.q0(), ") vs. ", var2, " (", var1, ")"}));
      }
   }

   @Override
   public void l6(char[] var1, int var2, int var3) {
      if (this.n5 != null && this.l6.u3(260).a6() == 179) {
         this.n5.l6(var1, var2, var3, this.l6, this.u3.n5());
      }
   }

   @Override
   public void n5(char[] var1, int var2, int var3) {
      if (this.n5 != null) {
         this.n5.l6(var1, var2, var3, this.l6, this.u3.n5());
      }
   }

   @Override
   public void k5() {
      this.n5 = null;
   }

   private a6$n5 k5(String var1, String var2) {
      a6$n5 var3 = this.u3.n5.n5(var1, var2, n3.l6(this.u3));
      if (com.aspose.slides.internal.v6g.k5.l6(var3, k5$n5.class)) {
         q0 var4 = e2.n5(n3.n5(this.u3).m1());
         String var5 = this.n5 != null ? this.n5.t9() : d1.n5(new String[]{"{", var1, "}", var2});
         var4.l6(this, var5, new com.aspose.slides.internal.o0.l6(var1, var2), this.u3.n5());
      }

      return var3;
   }
}
