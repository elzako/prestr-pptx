package com.aspose.slides.internal.h2;

public class a6 extends a5 {
   protected com.aspose.slides.internal.f2.c8 n5;
   private final boolean l6;

   public static a6 n5(com.aspose.slides.internal.e5.w1 var0) {
      return com.aspose.slides.internal.v6g.k5.n5(var0.a6(71), a6.class);
   }

   public static a6 n5(
      com.aspose.slides.internal.f2.k5 var0,
      com.aspose.slides.internal.f2.k5 var1,
      com.aspose.slides.internal.f2.k5 var2,
      com.aspose.slides.internal.f2.k5 var3
   ) {
      return new a6(new com.aspose.slides.internal.f2.c8(var0, var1, var2, var3));
   }

   private a6(com.aspose.slides.internal.f2.c8 var1) {
      this.n5 = var1;
      this.l6 = false;
   }

   private a6() {
      this.l6 = true;
   }

   public final boolean t2() {
      return this.l6;
   }

   public final com.aspose.slides.internal.f2.c8 s7() {
      return this.n5;
   }

   @Override
   public String toString() {
      return this.t2() ? "auto" : this.n5.toString();
   }

   @Override
   public int hashCode() {
      return this.l6 ? com.aspose.slides.ms.System.n3.n5(this.l6) : this.n5.hashCode();
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/h2/a6$1;)V -> ()V
   a6(com.aspose.slides.internal.h2.a6$1 recoveredArg0) {
      this();
   }
}
