package com.aspose.slides.internal.c3;

public class a6 extends y8 {
   private com.aspose.slides.internal.l7h.a5 n5;
   private boolean k5;

   public a6() {
      super(3);
      this.n5 = new com.aspose.slides.internal.l7h.a5();
   }

   public a6(String var1, boolean var2) {
      super(3);
      this.n5 = new com.aspose.slides.internal.l7h.a5(var1);
      this.k5 = var2;
   }

   public final void n5(char var1) {
      this.n5.n5(var1);
   }

   public final void n5(String var1) {
      this.n5.n5(var1);
   }

   public final String n5() {
      return this.n5.toString();
   }

   public final boolean l6() {
      return this.k5;
   }

   @Override
   public String toString() {
      return this.l6() ? com.aspose.slides.ms.System.d1.n5(new String[]{"<", this.n5(), ">"}) : com.aspose.slides.ms.System.d1.n5(new String[]{"<", this.n5(), ">"});
   }
}
