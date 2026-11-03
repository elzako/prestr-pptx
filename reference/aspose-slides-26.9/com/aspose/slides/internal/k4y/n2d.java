package com.aspose.slides.internal.k4y;

public class n2d extends b3 {
   private String n5;
   private h0 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("uri");

   public n2d(com.aspose.slides.ms.System.Xml.c7 var1) {
      n2d$1 var2 = new n2d$1(this);
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
                     this.l6 = new h0(var1);
                     var4 = true;
               }
            }
         }
      }
   }

   public n2d() {
      this.l6 = new h0();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      com.aspose.slides.internal.f8y.n5.n5(this.n5 != null, "Required property \"Uri\" is uninitialized.");
      var2.l6("uri", this.n5);
      this.l6.n5("", var2, "");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(n2d var0, String var1) {
      return var0.n5 = var1;
   }
}
