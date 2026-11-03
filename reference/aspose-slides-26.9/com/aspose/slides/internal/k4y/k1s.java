package com.aspose.slides.internal.k4y;

public class k1s extends b3 {
   private String n5;
   private l3f l6;
   private u6x k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("text:style-name", "ruby-base", "ruby-text");

   public k1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      k1s$1 var2 = new k1s$1(this);
      n5(var1, var2);
      n5(var1, new k1s$2(this, var1));
   }

   public k1s() {
      this.l6 = new l3f();
      this.k5 = new u6x();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("text:style-name", this.n5);
      }

      this.l6.n5("text", var2, "ruby-base");
      this.k5.n5("text", var2, "ruby-text");
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(k1s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l3f n5(k1s var0, l3f var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u6x n5(k1s var0, u6x var1) {
      return var0.k5 = var1;
   }
}
