package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.l7h.a5;

public class y2 extends l6 {
   private int t2;
   private String s7;
   private e2 x8;
   private List<l6> n3 = new List<>();
   protected y1 c8;

   public y2(com.aspose.slides.internal.t1.x8 var1, y1 var2) {
      this(var1.z3(), var1.b3(), var2);
   }

   public y2(int var1, String var2, y1 var3) {
      this.t2 = var1;
      this.s7 = var2;
      this.n5(31, true);
      this.c8 = var3;
   }

   @Override
   public void n5(l6 var1) {
      this.n3.addItem(var1);
   }

   public final void n5(e2 var1) {
      this.x8 = var1;
   }

   public final y1 y2() {
      return this.c8;
   }

   public final e2 y1() {
      return this.x8;
   }

   public final List<l6> a0() {
      return this.n3;
   }

   public final int d2() {
      return this.t2;
   }

   public final void n5(t2 var1) {
      this.n5((l6)var1);
   }

   @Override
   public Object clone() {
      throw new NotImplementedException();
   }

   @Override
   public String toString() {
      a5 var1 = new a5(super.toString());
      var1.n5(" {regionName=").n5(this.s7);
      var1.n5(", regionClass=").k5(this.t2);
      var1.n5(", ctm=").n5(this.x8);
      var1.n5("}");
      return var1.toString();
   }
}
