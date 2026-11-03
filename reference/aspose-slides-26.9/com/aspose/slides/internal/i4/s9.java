package com.aspose.slides.internal.i4;

public class s9 extends j4 {
   private String n5;
   private int u3;

   public final boolean s7() {
      return this.n5("global").n5();
   }

   public final boolean x8() {
      return (this.u3 & 66) == 66;
   }

   public final boolean n3() {
      return (this.u3 & 8) == 8;
   }

   public final String y4() {
      return this.n5;
   }

   public final com.aspose.slides.internal.r7c.c8 e2() {
      return new com.aspose.slides.internal.r7c.c8(this.n5, this.u3);
   }

   public final int t9() {
      return this.u3;
   }

   @Override
   public Object C_() {
      return null;
   }

   @Override
   public String d5() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{"/", this.n5.toString(), "/"});
   }

   @Override
   public String toString() {
      return com.aspose.slides.ms.System.d1.n5(new String[]{
         "/",
         this.n5.toString(),
         "/",
         this.s7() ? "g" : com.aspose.slides.ms.System.d1.n5,
         this.x8() ? "i" : com.aspose.slides.ms.System.d1.n5,
         this.n3() ? "m" : com.aspose.slides.ms.System.d1.n5
      });
   }

   @Override
   public String u3() {
      return "RegExp";
   }

   public s9(String var1, boolean var2, boolean var3, boolean var4, j4 var5) {
      super(var5);
      if (var4) {
         this.u3 |= 8;
      }

      if (var3) {
         this.u3 |= 66;
      }

      this.n5 = var1;
   }
}
