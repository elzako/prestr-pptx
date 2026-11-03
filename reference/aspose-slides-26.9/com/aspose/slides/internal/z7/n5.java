package com.aspose.slides.internal.z7;

import com.aspose.slides.internal.e5.t2;
import com.aspose.slides.internal.e5.w1;
import com.aspose.slides.internal.t1.k7;
import com.aspose.slides.internal.w2.k5;
import com.aspose.slides.internal.w2.u9;

public class n5 extends t2 {
   private String u3;
   private k7 a6;

   @Override
   public void n5(String var1, u9 var2, k5 var3, w1 var4) {
      this.u3 = var3.u3("internal-destination");
      if (this.u3 == null || this.u3.length() == 0) {
         this.k5("internal-destination");
      }
   }

   @Override
   public void c8() {
      this.a6.n5(this);
   }

   @Override
   public void n5(u9 var1, String var2, String var3) {
      this.k5(var1, var2, var3);
   }

   public final String h0() {
      return this.u3;
   }

   @Override
   public String q0() {
      return "http://xmlgraphics.apache.org/fop/extensions";
   }

   @Override
   public String t4() {
      return "fox";
   }

   @Override
   public String z1() {
      return "destination";
   }

   // BUILD-ONLY: mandatory constructorless normalization removes this entire member.
   private n5(com.aspose.slides.internal.e5.t2 recoveryArg0) {
      super(recoveryArg0);
   }
}
