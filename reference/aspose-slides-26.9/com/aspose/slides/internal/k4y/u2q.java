package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u2q extends b3 {
   private byte n5;
   private byte l6;
   private byte k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private byte c8;
   private n0d t2;
   private s2a s7;
   private g1l x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "additive", "accumulate", "xfrmType", "from", "to", "by", "rctx", "override", "cTn", "tgtEl", "attrNameLst"
   );

   public u2q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      u2q$1 var2 = new u2q$1(this);
      n5(var1, var2);
      n5(var1, new u2q$2(this, var1));
   }

   public u2q() {
      this.s7();
      this.t2 = new n0d();
      this.s7 = new s2a();
   }

   private void s7() {
      this.n5 = -1;
      this.l6 = -1;
      this.k5 = -1;
      this.c8 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("additive", f8.n5(this.n5));
      }

      if (this.l6 != -1) {
         var2.l6("accumulate", z9.n5(this.l6));
      }

      if (this.k5 != -1) {
         var2.l6("xfrmType", n2.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("from", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("to", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("by", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("rctx", this.h0);
      }

      if (this.c8 != -1) {
         var2.l6("override", s2.n5(this.c8));
      }

      this.t2.n5("p", var2, "cTn");
      this.s7.n5("p", var2, "tgtEl");
      if (this.x8 != null) {
         this.x8.n5("p", var2, "attrNameLst");
      }

      var2.s7();
   }

   public final g1l n5() {
      if (this.x8 != null) {
         throw new Exception("Only one <attrNameLst> element can be added.");
      }

      this.x8 = new g1l();
      return this.x8;
   }

   public final byte l6() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final byte k5() {
      return this.l6;
   }

   public final void l6(byte var1) {
      this.l6 = var1;
   }

   public final void k5(byte var1) {
      this.k5 = var1;
   }

   public final String u3() {
      return this.h0;
   }

   public final void n5(String var1) {
      this.h0 = var1;
   }

   public final byte a6() {
      return this.c8;
   }

   public final void u3(byte var1) {
      this.c8 = var1;
   }

   public final n0d u9() {
      return this.t2;
   }

   public final s2a h0() {
      return this.s7;
   }

   public final g1l c8() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return n3;
   }

   // $VF: synthetic method
   static byte n5(u2q var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte l6(u2q var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte k5(u2q var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(u2q var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(u2q var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String k5(u2q var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(u2q var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static byte u3(u2q var0, byte var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static n0d n5(u2q var0, n0d var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static s2a n5(u2q var0, s2a var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static g1l n5(u2q var0, g1l var1) {
      return var0.x8 = var1;
   }
}
