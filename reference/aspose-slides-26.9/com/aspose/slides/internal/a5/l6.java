package com.aspose.slides.internal.a5;

import com.aspose.slides.internal.e5.t2;
import com.aspose.slides.internal.e5.t9;
import com.aspose.slides.internal.e5.w1;
import com.aspose.slides.internal.h2.c8;
import com.aspose.slides.internal.h2.d5;
import com.aspose.slides.internal.w2.u9;
import com.aspose.slides.ms.System.d1;

public class l6 extends t9 implements d5 {
   private c8 u9;
   private String h0 = d1.n5;

   public l6(t2 var1) {
      super(var1);
   }

   @Override
   public void n5(w1 var1) {
      super.n5(var1);
      this.u9 = com.aspose.slides.internal.h2.c8.n5(var1);
   }

   @Override
   public void l6(char[] var1, int var2, int var3, w1 var4, u9 var5) {
      this.h0 = d1.n5(this.h0, d1.n5(var1, var2, var3));
   }

   @Override
   public void n5(u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   public final c8 i1() {
      return this.u9;
   }

   public final String e5() {
      return this.h0;
   }

   @Override
   public String z1() {
      return "bookmark-title";
   }

   @Override
   public int z3() {
      return 7;
   }
}
