package com.aspose.slides.internal.k4y;

public class n9g extends b3 {
   private String n5;
   private int l6;
   private int k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "text:ref-name", "text:note-class", "text:reference-format"
   );

   public n9g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n9g$1 var2 = new n9g$1(this);
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
               switch (a6.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.u3 = com.aspose.slides.ms.System.d1.n5(this.u3, var1.z1());
            }
         }
      }
   }

   public n9g() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:ref-name", this.n5);
      }

      var2.l6("text:note-class", u6f.n5(this.l6));
      if (this.k5 != 0) {
         var2.l6("text:reference-format", o3t.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6(this.u3);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(n9g var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(n9g var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int l6(n9g var0, int var1) {
      return var0.k5 = var1;
   }
}
