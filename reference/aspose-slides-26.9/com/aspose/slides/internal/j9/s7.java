package com.aspose.slides.internal.j9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.p3.j8;
import com.aspose.slides.internal.p3.y2;

public class s7 extends j8 {
   public List<l6> n5;
   private com.aspose.slides.internal.u6.a6 k5;
   protected int l6;
   private com.aspose.slides.internal.u6.a6 u3;

   public s7(y2 var1, List<l6> var2, com.aspose.slides.internal.u6.a6 var3) {
      super(var1);
      this.n5 = var2;
      this.k5 = var3;
      this.u3 = var3;
   }

   public final void n5(com.aspose.slides.internal.u6.a6 var1) {
      this.u3 = var1;
   }

   public final com.aspose.slides.internal.u6.a6 n5() {
      return this.u3;
   }

   public final com.aspose.slides.internal.u6.a6 h0() {
      return this.k5;
   }

   public final com.aspose.slides.internal.u6.y2 c8() {
      return this.n5.get_Item(0).n5.y4();
   }

   public final boolean u3(int var1) {
      return (this.l6 & 1 << var1) != 0;
   }

   public final void n5(int var1, boolean var2) {
      if (var2) {
         this.l6 |= 1 << var1;
      } else {
         this.l6 &= ~(1 << var1);
      }
   }

   @Override
   public boolean w_() {
      return true;
   }

   @Override
   public String toString() {
      a5 var1 = new a5("TableContentPosition:");
      var1.k5(this.a6());
      var1.n5("[");
      var1.k5(this.k5.n5()).n5("/");
      var1.n5(this.u3(1) ? "F" : "-");
      var1.n5(this.u3(2) ? "L" : "-").n5("]");
      var1.n5("(");
      var1.n5(this.n5);
      var1.n5(")");
      return var1.toString();
   }
}
