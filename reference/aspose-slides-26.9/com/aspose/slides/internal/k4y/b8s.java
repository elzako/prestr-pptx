package com.aspose.slides.internal.k4y;

public class b8s extends b3 {
   private String n5;
   private f5w l6;
   private f5w k5;
   private f5w u3;
   private f5w a6;
   private f5w u9;
   private f5w h0;
   private l8r c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "name", "fillClrLst", "linClrLst", "effectClrLst", "txLinClrLst", "txFillClrLst", "txEffectClrLst", "extLst"
   );

   public b8s(com.aspose.slides.ms.System.Xml.c7 var1) {
      b8s$1 var2 = new b8s$1(this);
      n5(var1, var2);
      n5(var1, new b8s$2(this, var1));
   }

   public b8s() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      if (this.l6 != null) {
         this.l6.n5("dgm", var2, "fillClrLst");
      }

      if (this.k5 != null) {
         this.k5.n5("dgm", var2, "linClrLst");
      }

      if (this.u3 != null) {
         this.u3.n5("dgm", var2, "effectClrLst");
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "txLinClrLst");
      }

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "txFillClrLst");
      }

      if (this.h0 != null) {
         this.h0.n5("dgm", var2, "txEffectClrLst");
      }

      if (this.c8 != null) {
         this.c8.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final f5w l6() {
      return this.l6;
   }

   public final f5w k5() {
      return this.k5;
   }

   public final f5w u3() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(b8s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f5w n5(b8s var0, f5w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f5w l6(b8s var0, f5w var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static f5w k5(b8s var0, f5w var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static f5w u3(b8s var0, f5w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static f5w a6(b8s var0, f5w var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static f5w u9(b8s var0, f5w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l8r n5(b8s var0, l8r var1) {
      return var0.c8 = var1;
   }
}
