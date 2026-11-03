package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class c4t extends b3 {
   private long n5;
   private String l6;
   private String k5;
   private String u3;
   private boolean a6;
   private x6s u9;
   private x6s h0;
   private l8r c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "id", "name", "descr", "title", "hidden", "hlinkClick", "hlinkHover", "extLst"
   );

   public c4t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      c4t$1 var2 = new c4t$1(this);
      n5(var1, var2);
      n5(var1, new c4t$2(this, var1));
   }

   public c4t() {
      this.n3();
   }

   private void n3() {
      this.k5 = "";
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("name", this.l6);
      if (!"".equals(this.k5)) {
         var2.l6("descr", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("title", this.u3);
      }

      if (this.a6) {
         var2.l6("hidden", this.a6 ? "1" : "0");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "hlinkClick");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "hlinkHover");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final x6s n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <hlinkClick> element can be added.");
      }

      this.u9 = new x6s();
      return this.u9;
   }

   public final x6s l6() {
      if (this.h0 != null) {
         throw new Exception("Only one <hlinkHover> element can be added.");
      }

      this.h0 = new x6s();
      return this.h0;
   }

   public final void n5(x8 var1) {
      this.c8 = (l8r)var1;
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String u3() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String a6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String u9() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final boolean h0() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final x6s c8() {
      return this.u9;
   }

   public final x6s t2() {
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
   static long n5(c4t var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(c4t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(c4t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(c4t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(c4t var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static x6s n5(c4t var0, x6s var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static x6s l6(c4t var0, x6s var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l8r n5(c4t var0, l8r var1) {
      return var0.c8 = var1;
   }
}
