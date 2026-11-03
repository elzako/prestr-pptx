package com.aspose.slides.internal.k4y;

public class r9m extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private String u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "presentation:name", "presentation:source", "style:data-style-name"
   );

   public r9m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      r9m$1 var2 = new r9m$1(this);
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

   public r9m() {
      this.k5();
   }

   private void k5() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("presentation:name", this.n5);
      var2.l6("presentation:source", o7q.n5(this.l6));
      if (this.k5 != null) {
         var2.l6("style:data-style-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6(this.u3);
      }

      var2.s7();
   }

   public final String n5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(r9m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(r9m var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(r9m var0, String var1) {
      return var0.k5 = var1;
   }
}
