package com.aspose.slides.internal.k4y;

public class r6v extends b3 {
   private double n5;
   private String l6;
   private String k5;
   private int u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private f8i c8;
   private l8r t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "rot", "type", "r:blip", "zOrderOff", "hideGeom", "lkTxEntry", "blipPhldr", "adjLst", "extLst"
   );

   public r6v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      r6v$1 var2 = new r6v$1(this);
      n5(var1, var2);
      n5(var1, new r6v$2(this, var1));
   }

   public r6v() {
      this.c8();
   }

   private void c8() {
      this.n5 = 0.0;
      this.l6 = "none";
      this.u3 = 0;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0.0) {
         var2.l6("rot", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (!"none".equals(this.l6)) {
         var2.l6("type", this.l6);
      }

      if (this.k5 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:blip", this.k5);
      }

      if (this.u3 != 0) {
         var2.l6("zOrderOff", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("hideGeom", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("lkTxEntry", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("blipPhldr", this.h0 ? "1" : "0");
      }

      if (this.c8 != null) {
         this.c8.n5("dgm", var2, "adjLst");
      }

      if (this.t2 != null) {
         this.t2.n5("dgm", var2, "extLst");
      }

      var2.s7();
   }

   public final double n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final int k5() {
      return this.u3;
   }

   public final boolean u3() {
      return this.a6;
   }

   public final boolean a6() {
      return this.h0;
   }

   public final f8i u9() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return s7;
   }

   // $VF: synthetic method
   static double n5(r6v var0, double var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(r6v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(r6v var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(r6v var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(r6v var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(r6v var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(r6v var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static f8i n5(r6v var0, f8i var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static l8r n5(r6v var0, l8r var1) {
      return var0.t2 = var1;
   }
}
