package com.aspose.slides.internal.c0;

import com.aspose.slides.internal.e1x.i1;
import com.aspose.slides.internal.e1x.u6;
import com.aspose.slides.internal.e1x.v4;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.z4.s3;
import com.aspose.slides.internal.z4.t4;
import com.aspose.slides.ms.System.d1;

public abstract class h0 extends l6 {
   private boolean[] a6;
   private char u9;
   private char h0 = 0;
   private k5 c8;
   private t2 t2;
   protected v4 u3;

   protected h0(com.aspose.slides.internal.z4.c8 var1, int var2, i1 var3, int var4, int var5) {
      super(var1, var2, var3, var4);
      this.n5(com.aspose.slides.internal.b8.h0.n5(var5, 4));
      if (var1.e2() || !this.m1()) {
         this.u3 = new v4(var3, false, false);
      }
   }

   public void n5(String var1) {
      for (int var2 = 0; var2 < var1.length(); var2++) {
         char var3 = var1.charAt(var2);
         if (var3 <= 255) {
            this.w1()[var3] = true;
            if (var3 < this.r4()) {
               this.n5(var3);
            }

            if (var3 > this.c4()) {
               this.l6(var3);
            }
         }
      }
   }

   @Override
   public void n5(t4 var1) {
      this.l6(var1);
      this.t2.n5(var1);
      this.c8.n5(var1);
   }

   public final String z8() {
      a5 var1 = new a5();
      var1.n5("[");

      for (char var2 = this.u9; var2 <= this.h0; var2++) {
         if (this.a6[var2]) {
            u6 var3 = this.n5.h0().l6(var2);
            var1.k5(this.n5(var3.k5()));
         } else {
            var1.n5("0");
         }

         if (var2 < this.h0) {
            var1.n5(" ");
         }
      }

      var1.n5("]");
      return var1.toString();
   }

   public final void n5(String var1, s3 var2) {
      double var3 = 0.0;
      int var5 = Integer.MIN_VALUE;
      a5 var6 = new a5();

      for (int var7 = 0; var7 < var1.length(); var7++) {
         char var8 = var1.charAt(var7);
         int var9 = this.n5.h0().l6(var8).l6();
         int var10 = this.u3.n5(var8);
         if (var10 >= 0) {
            if (var5 != Integer.MIN_VALUE && this.n5.d5() != null) {
               var3 = this.n5.n5(var5 & 4294967295L, var9 & 4294967295L);
            }

            if (var3 != 0.0) {
               var2.a6(var6.toString());
               var2.n5(d1.n5(") {0} (", new Object[]{-com.aspose.slides.internal.v6g.k5.u3(var3 / this.n5.t2() * 1000.0, 14)}));
               var6.n5(0);
            }
         }

         var6.n5(var1.charAt(var7));
         var5 = var9;
      }

      if (var6.l6() > 0) {
         var2.a6(var6.toString());
      }
   }

   protected final void l6(t4 var1) {
      var1.n5(this);
      var1.c8();
      var1.k5("/Type", "/Font");
      var1.k5("/Subtype", this.j5());
      var1.k5("/BaseFont", d1.n5("/{0}", new Object[]{this.u3()}));
      var1.n5("/FirstChar", this.r4());
      var1.n5("/LastChar", this.c4());
      this.n5(new t2(this.l6, this.z8()));
      var1.k5("/Widths", this.y2().t2());
      var1.k5("/FontDescriptor", this.y1().t2());
      var1.k5("/Encoding", "/WinAnsiEncoding");
      var1.t2();
      var1.l6();
   }

   public abstract String j5();

   protected final boolean[] w1() {
      return this.a6;
   }

   protected final void n5(boolean[] var1) {
      this.a6 = var1;
   }

   protected final char r4() {
      return this.u9;
   }

   protected final void n5(char var1) {
      this.u9 = var1;
   }

   protected final char c4() {
      return this.h0;
   }

   protected final void l6(char var1) {
      this.h0 = var1;
   }

   protected final t2 y2() {
      return this.t2;
   }

   protected final void n5(t2 var1) {
      this.t2 = var1;
   }

   protected final k5 y1() {
      return this.c8;
   }

   protected final void n5(k5 var1) {
      this.c8 = var1;
   }
}
