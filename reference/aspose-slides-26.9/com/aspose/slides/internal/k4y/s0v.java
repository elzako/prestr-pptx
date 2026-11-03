package com.aspose.slides.internal.k4y;

public class s0v extends b3 {
   private String n5;
   private int l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("config:name", "config:type");

   public s0v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      s0v$1 var2 = new s0v$1(this);
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
               switch (u3.n5(var1.n3())) {
                  default:
                     var1.r4();
                     var4 = true;
               }
            } else if (var1.s7() == 3 || var1.s7() == 13 || var1.s7() == 14) {
               this.k5 = com.aspose.slides.ms.System.d1.n5(this.k5, var1.z1());
            }
         }
      }
   }

   public s0v() {
      this.l6();
   }

   private void l6() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("config:name", this.n5);
      var2.l6("config:type", x4d.n5(this.l6));
      if (this.k5 != null) {
         var2.l6(this.k5);
      }

      var2.s7();
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(s0v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int n5(s0v var0, int var1) {
      return var0.l6 = var1;
   }
}
