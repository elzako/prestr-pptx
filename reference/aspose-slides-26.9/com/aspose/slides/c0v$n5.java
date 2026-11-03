package com.aspose.slides;

abstract class c0v$n5 {
   private c0v$n5() {
   }

   static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, int var1) {
      if (var0.s7() == var1) {
         return var0;
      }

      com.aspose.slides.internal.o9b.l6 var2 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0(), var1);
      var2.n5(com.aspose.slides.internal.n2d.m1.n5(var0), com.aspose.slides.internal.n2d.m1.l6(var0));
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(var2);
      var3.n5(com.aspose.slides.internal.o9b.c8.z0().o8());
      var3.n5(1);
      var3.l6(var0, 0, 0);
      var3.dispose();
      return var2;
   }

   abstract c0v n5(com.aspose.slides.internal.o9b.l6 var1);

   abstract com.aspose.slides.internal.o9b.l6 n5(c0v var1);

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/c0v$1;)V -> ()V
   c0v$n5(com.aspose.slides.c0v$1 recoveredArg0) {
      this();
   }
}
