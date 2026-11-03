package com.aspose.slides.internal.v4;

public class s3 extends u3 {
   private int c8;
   private int t2;

   public s3(com.aspose.slides.internal.e5.t2 var1) {
      super(var1);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.w2.u9 var2, com.aspose.slides.internal.w2.k5 var3, com.aspose.slides.internal.e5.w1 var4) {
      if (this.k5(70) < 0) {
         this.n5(this.k5, this.s_().t9(), "http://www.w3.org/1999/XSL/Format", this.z1(), "rule.retrieveMarkerDescendantOfStaticContent");
      } else {
         super.n5(var1, var2, var3, var4);
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e5.w1 var1) {
      super.n5(var1);
      this.c8 = var1.u3(208).a6();
      this.t2 = var1.u3(205).a6();
   }

   public final int e5() {
      return this.c8;
   }

   public final int b3() {
      return this.t2;
   }

   @Override
   public String z1() {
      return "retrieve-marker";
   }

   @Override
   public int z3() {
      return 64;
   }
}
