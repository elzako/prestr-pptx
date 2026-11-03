package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h6q extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private a6w a6;
   private b9y u9;
   private j3z h0;
   private l8r c8;
   public static final int n5 = b2s.n5("node");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9("modelId", "type", "cxnId", "prSet", "spPr", "t", "extLst");

   public h6q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      h6q$1 var2 = new h6q$1(this);
      n5(var1, var2);
      n5(var1, new h6q$2(this, var1));
   }

   public h6q() {
      this.n3();
   }

   private void n3() {
      this.k5 = n5;
      this.u3 = "0";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("modelId", this.l6);
      if (this.k5 != n5) {
         var2.l6("type", b2s.n5(this.k5));
      }

      if (!"0".equals(this.u3)) {
         var2.l6("cxnId", this.u3);
      }

      if (this.a6 != null) {
         this.a6.n5("dgm", var2, "prSet");
      }

      if (this.u9 != null) {
         this.u9.n5("dgm", var2, "spPr");
      }

      if (this.h0 != null) {
         this.h0.n5("dgm", var2, "t");
      }

      if (this.c8 != null) {
         this.c8.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final a6w n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <prSet> element can be added.");
      }

      this.a6 = new a6w();
      return this.a6;
   }

   public final b9y l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u9 = new b9y();
      return this.u9;
   }

   public final j3z k5() {
      if (this.h0 != null) {
         throw new Exception("Only one <t> element can be added.");
      }

      this.h0 = new j3z();
      return this.h0;
   }

   public final void n5(j3z var1) {
      this.h0 = var1;
   }

   public final x8 u3() {
      if (this.c8 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.c8 = new l8r();
      return this.c8;
   }

   public final void n5(x8 var1) {
      this.c8 = (l8r)var1;
   }

   public final String a6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final int u9() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final void l6(String var1) {
      this.u3 = var1;
   }

   public final a6w h0() {
      return this.a6;
   }

   public final b9y c8() {
      return this.u9;
   }

   public final j3z t2() {
      return this.h0;
   }

   public final x8 s7() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(h6q var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(h6q var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(h6q var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static a6w n5(h6q var0, a6w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(h6q var0, b9y var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static j3z n5(h6q var0, j3z var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l8r n5(h6q var0, l8r var1) {
      return var0.c8 = var1;
   }
}
