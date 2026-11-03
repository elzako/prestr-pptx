package com.aspose.slides.internal.k4y;

public class p1n extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   public static final int n5 = f3a.n5("unknown");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("xml:id", "mappingType", "mappingRef");

   public p1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      p1n$1 var2 = new p1n$1(this);
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
               switch (u9.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.a6 = com.aspose.slides.ms.System.d1.n5(this.a6, var1.z1());
            }
         }
      }
   }

   public p1n() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("xml:id", this.l6);
      }

      if (this.k5 != n5) {
         var2.l6("mappingType", f3a.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("mappingRef", this.u3);
      }

      if (this.a6 != null) {
         var2.l6(this.a6);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(p1n var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(p1n var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(p1n var0, String var1) {
      return var0.u3 = var1;
   }
}
