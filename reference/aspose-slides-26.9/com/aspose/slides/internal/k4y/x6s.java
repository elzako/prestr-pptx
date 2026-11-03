package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x6s extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private x7n t2;
   private l8r s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "r:id", "invalidUrl", "action", "tgtFrame", "tooltip", "history", "highlightClick", "endSnd", "snd", "extLst"
   );

   public x6s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      x6s$1 var2 = new x6s$1(this);
      n5(var1, var2);
      n5(var1, new x6s$2(this, var1));
   }

   public x6s() {
      this.y4();
   }

   private void y4() {
      this.l6 = "";
      this.k5 = "";
      this.u3 = "";
      this.a6 = "";
      this.u9 = true;
      this.h0 = false;
      this.c8 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.n5);
      }

      if (!"".equals(this.l6)) {
         var2.l6("invalidUrl", this.l6);
      }

      if (!"".equals(this.k5)) {
         var2.l6("action", this.k5);
      }

      if (!"".equals(this.u3)) {
         var2.l6("tgtFrame", this.u3);
      }

      if (!"".equals(this.a6)) {
         var2.l6("tooltip", this.a6);
      }

      if (!this.u9) {
         var2.l6("history", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("highlightClick", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("endSnd", this.c8 ? "1" : "0");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "snd");
      }

      if (this.s7 != null) {
         this.s7.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final x7n n5() {
      if (this.t2 != null) {
         throw new Exception("Only one <snd> element can be added.");
      }

      this.t2 = new x7n();
      return this.t2;
   }

   public final void n5(x8 var1) {
      this.s7 = (l8r)var1;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String u3() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final String a6() {
      return this.u3;
   }

   public final void u3(String var1) {
      this.u3 = var1;
   }

   public final String u9() {
      return this.a6;
   }

   public final void a6(String var1) {
      this.a6 = var1;
   }

   public final boolean h0() {
      return this.u9;
   }

   public final void n5(boolean var1) {
      this.u9 = var1;
   }

   public final boolean c8() {
      return this.h0;
   }

   public final void l6(boolean var1) {
      this.h0 = var1;
   }

   public final boolean t2() {
      return this.c8;
   }

   public final void k5(boolean var1) {
      this.c8 = var1;
   }

   public final x7n s7() {
      return this.t2;
   }

   public final x8 x8() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(x6s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x6s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(x6s var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(x6s var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String a6(x6s var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(x6s var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(x6s var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean k5(x6s var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static x7n n5(x6s var0, x7n var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l8r n5(x6s var0, l8r var1) {
      return var0.s7 = var1;
   }
}
