package com.aspose.slides.internal.k4y;

public class r5v extends b3 {
   private String n5;
   private String l6;
   private s4q k5;
   private k8s u3;
   private u1b a6;
   private c8h u9;
   private m4a h0;
   private u5w c8;
   private t9a t2;
   private w3r s7;
   private g7 x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "table:name", "text:style-name", "first-row", "last-row", "first-column", "last-column", "body", "even-rows", "odd-rows", "even-columns", "odd-columns"
   );

   public r5v(com.aspose.slides.ms.System.Xml.c7 var1) {
      r5v$1 var2 = new r5v$1(this);
      n5(var1, var2);
      n5(var1, new r5v$2(this, var1));
   }

   public r5v() {
      this.h0 = new m4a();
      this.c8 = new u5w();
      this.t2 = new t9a();
      this.s7 = new w3r();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("table:name", this.n5);
      if (this.l6 != null) {
         var2.l6("text:style-name", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("table", var2, "first-row");
      }

      if (this.u3 != null) {
         this.u3.n5("table", var2, "last-row");
      }

      if (this.a6 != null) {
         this.a6.n5("table", var2, "first-column");
      }

      if (this.u9 != null) {
         this.u9.n5("table", var2, "last-column");
      }

      if (this.x8 != null) {
         switch (n3.n5(this.x8.n5())) {
            case 6:
               ((o1c)this.x8.k5()).n5("table", var2, this.x8.n5());
         }
      }

      this.h0.n5("table", var2, "even-rows");
      this.c8.n5("table", var2, "odd-rows");
      this.t2.n5("table", var2, "even-columns");
      this.s7.n5("table", var2, "odd-columns");
      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final String l6() {
      return this.l6;
   }

   public final s4q k5() {
      return this.k5;
   }

   public final k8s u3() {
      return this.u3;
   }

   public final u1b a6() {
      return this.a6;
   }

   public final c8h u9() {
      return this.u9;
   }

   public final m4a h0() {
      return this.h0;
   }

   public final u5w c8() {
      return this.c8;
   }

   public final t9a t2() {
      return this.t2;
   }

   public final w3r s7() {
      return this.s7;
   }

   public final g7 x8() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return n3;
   }

   // $VF: synthetic method
   static String n5(r5v var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r5v var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s4q n5(r5v var0, s4q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static k8s n5(r5v var0, k8s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u1b n5(r5v var0, u1b var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static c8h n5(r5v var0, c8h var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static g7 n5(r5v var0, g7 var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static m4a n5(r5v var0, m4a var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static u5w n5(r5v var0, u5w var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static t9a n5(r5v var0, t9a var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static w3r n5(r5v var0, w3r var1) {
      return var0.s7 = var1;
   }
}
