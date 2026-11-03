package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;

class m1j {
   private static final List<String> n5 = new List<>();

   public static boolean n5(com.aspose.slides.internal.h6.n5 var0) {
      return com.aspose.slides.ms.System.d1.u3(var0.t2(), "img", (short)3)
         || com.aspose.slides.ms.System.d1.u3(var0.t2(), "svg", (short)3)
         || com.aspose.slides.ms.System.d1.u3(var0.t2(), "canvas", (short)3);
   }

   public static boolean l6(com.aspose.slides.internal.h6.n5 var0) {
      com.aspose.slides.internal.t9.u3 var1 = ((com.aspose.slides.internal.w5.k5)var0).a3();
      return var1.k7().h0() == 6;
   }

   public static boolean k5(com.aspose.slides.internal.h6.n5 var0) {
      com.aspose.slides.internal.t9.u3 var1 = ((com.aspose.slides.internal.w5.k5)var0).a3();
      return var1.k7().h0() == 14;
   }

   public static boolean u3(com.aspose.slides.internal.h6.n5 var0) {
      com.aspose.slides.internal.t9.u3 var1 = ((com.aspose.slides.internal.w5.k5)var0).a3();
      return var1.k7().h0() == 0;
   }

   public static boolean a6(com.aspose.slides.internal.h6.n5 var0) {
      com.aspose.slides.internal.t9.u3 var1 = ((com.aspose.slides.internal.w5.k5)var0).a3();
      int var2 = var1.k7().h0();
      return var2 == 1 || var2 == 14 || var2 == 2;
   }

   public static boolean u9(com.aspose.slides.internal.h6.n5 var0) {
      return com.aspose.slides.ms.System.d1.u3(var0.t2(), "body", (short)3);
   }

   public static boolean h0(com.aspose.slides.internal.h6.n5 var0) {
      return com.aspose.slides.ms.System.d1.u3(var0.t2(), "center", (short)3);
   }

   public static boolean c8(com.aspose.slides.internal.h6.n5 var0) {
      String var1 = com.aspose.slides.ms.System.d1.a6(var0.t2());
      return n5.containsItem(var1);
   }

   public static boolean t2(com.aspose.slides.internal.h6.n5 var0) {
      com.aspose.slides.internal.t9.u3 var1 = ((com.aspose.slides.internal.w5.k5)var0).a3();
      int var2 = var1.k7().h0();
      return var2 == 1 || var2 == 2;
   }

   static {
      n5.addItem("h1");
      n5.addItem("h2");
      n5.addItem("h3");
      n5.addItem("h4");
      n5.addItem("h5");
      n5.addItem("h6");
   }
}
