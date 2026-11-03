package com.aspose.slides.internal.i4;

public class s3 extends j4 {
   private j9 n5;

   private String s7() {
      return this.n5("message").toString();
   }

   private void u9(String var1) {
      this.n5("message", this.n5.c4().u9(var1));
   }

   @Override
   public Object C_() {
      return this.s7();
   }

   @Override
   public String u3() {
      return "Error";
   }

   @Override
   public String toString() {
      return this.C_().toString();
   }

   public s3(j9 var1) {
      this(var1, com.aspose.slides.ms.System.d1.n5);
   }

   public s3(j9 var1, String var2) {
      super(var1.t4().z1());
      this.n5 = var1;
      this.u9(var2);
   }
}
