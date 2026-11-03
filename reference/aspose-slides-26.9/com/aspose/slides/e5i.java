package com.aspose.slides;

class e5i {
   private final String n5;
   private final com.aspose.slides.internal.c8m.i4 l6;
   private final String k5;
   private final String u3;

   public e5i(String var1, com.aspose.slides.internal.c8m.i4 var2, String var3, String var4) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
   }

   public final String n5() {
      return this.n5;
   }

   public final com.aspose.slides.internal.c8m.i4 l6() {
      return this.l6;
   }

   public final String k5() {
      return this.k5;
   }

   public final boolean u3() {
      return !"application/vnd.openxmlformats-officedocument.oleObject".equals(this.l6.n5())
         && com.aspose.slides.ms.System.d1.t2(this.l6.n5(), "openxmlformats");
   }

   public final String a6() {
      return this.u3;
   }
}
