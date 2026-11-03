package com.aspose.slides.internal.y0;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.y2;

class k5$n5 extends j8 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;

   public k5$n5(y2 var1, int var2, int var3, int var4, int var5) {
      super(var1);
      this.n5 = var2;
      this.l6 = var3;
      this.k5 = var4;
      this.u3 = var5;
   }

   public final int n5() {
      return this.n5;
   }

   public final int h0() {
      return this.l6;
   }

   public final int c8() {
      return this.k5;
   }

   public final int t2() {
      return this.u3;
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("ListItemPosition:");
      var1.k5(this.a6()).n5("(");
      var1.n5("label:").k5(this.n5).n5("-").k5(this.l6);
      var1.n5(" body:").k5(this.k5).n5("-").k5(this.u3);
      var1.n5(")");
      return var1.toString();
   }
}
