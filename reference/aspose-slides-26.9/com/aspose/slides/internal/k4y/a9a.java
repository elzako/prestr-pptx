package com.aspose.slides.internal.k4y;

public class a9a extends b3 {
   private int n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("number:position");

   public a9a(com.aspose.slides.ms.System.Xml.c7 var1) {
      a9a$1 var2 = new a9a$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (k5.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.l6 = com.aspose.slides.ms.System.d1.n5(this.l6, var1.z1());
            }
         }
      }
   }

   public a9a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("urn:oasis:names:tc:opendocument:xmlns:text:1.0") == null) {
         var2.u3("xmlns", "odftext", null, "urn:oasis:names:tc:opendocument:xmlns:text:1.0");
      }

      var2.l6("number:position", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      if (this.l6 != null) {
         var2.l6(this.l6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(a9a var0, int var1) {
      return var0.n5 = var1;
   }
}
