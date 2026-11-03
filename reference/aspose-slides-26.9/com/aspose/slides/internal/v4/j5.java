package com.aspose.slides.internal.v4;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class j5 extends com.aspose.slides.internal.e5.z1 {
   private String c8;
   private com.aspose.slides.internal.e5.m1 t2;
   private Dictionary<com.aspose.slides.internal.e5.t2, com.aspose.slides.internal.e5.w1> s7 = new Dictionary<>();

   public j5(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      if (this.k5(16) < 0) {
         this.n5(this.k5, this.s_().t9(), "http://www.w3.org/1999/XSL/Format", this.z1(), "rule.markerDescendantOfFlow");
      }

      this.c8 = var1.a6(152).j_();
      if (d1.n5(this.c8)) {
         this.k5("marker-class-name");
      }
   }

   public final j5$l6 u3(com.aspose.slides.internal.e5.t2 var1) {
      com.aspose.slides.internal.e5.w1 var2 = null;
      com.aspose.slides.internal.e5.w1[] var3 = new com.aspose.slides.internal.e5.w1[]{var2};
      this.s7.tryGetValue(var1, var3);
      var2 = var3[0];
      return (j5$l6)var2;
   }

   @Override
   public void u9() {
      com.aspose.slides.internal.e5.y4 var1 = this.o_();
      this.t2 = var1.l6();
      var1.n5(new j5$k5(this));
   }

   @Override
   public void c8() {
      super.c8();
      this.o_().n5(this.t2);
      this.t2 = null;
   }

   @Override
   public void n5(com.aspose.slides.internal.w2.u9 var1, String var2, String var3) {
      if (d1.a6("http://www.w3.org/1999/XSL/Format", var2) && !this.u3(var2, var3)) {
         this.k5(var1, var2, var3);
      }
   }

   @Override
   protected boolean p_() {
      return true;
   }

   public final String i1() {
      return this.c8;
   }

   @Override
   public String z1() {
      return "marker";
   }

   @Override
   public int z3() {
      return 44;
   }

   @Override
   public String toString() {
      a5 var1 = new a5(super.toString());
      var1.n5(" {").n5(this.i1()).n5("}");
      return var1.toString();
   }

   // $VF: synthetic method
   static Dictionary l6(j5 var0) {
      return var0.s7;
   }
}
