package com.aspose.slides.internal.k4y;

public class k6a extends b3 {
   private byte n5;
   private String l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("text:fixed");

   public k6a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k6a$1 var2 = new k6a$1(this);
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

   public k6a() {
      this.l6();
   }

   private void l6() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("text:fixed", this.n5 == 1 ? "true" : "false");
      }

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
   static byte n5(k6a var0, byte var1) {
      return var0.n5 = var1;
   }
}
