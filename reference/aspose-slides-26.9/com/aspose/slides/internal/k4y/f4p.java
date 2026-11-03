package com.aspose.slides.internal.k4y;

public class f4p extends b3 {
   private String n5;
   private String l6;
   private e8v k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("draw:shape-id", "draw:color", "sound");

   public f4p(com.aspose.slides.ms.System.Xml.c7 var1) {
      f4p$1 var2 = new f4p$1(this);
      n5(var1, var2);
      n5(var1, new f4p$2(this, var1));
   }

   public f4p() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:shape-id", this.n5);
      var2.l6("draw:color", this.l6);
      if (this.k5 != null) {
         this.k5.n5("presentation", var2, "sound");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(f4p var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(f4p var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static e8v n5(f4p var0, e8v var1) {
      return var0.k5 = var1;
   }
}
