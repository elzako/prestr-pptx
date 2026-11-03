package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class p4e extends b3 {
   private String n5;
   private long l6;
   private String k5;
   private String u3;
   private n5h a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "manifest:full-path", "manifest:size", "manifest:media-type", "manifest:preferred-view-mode", "encryption-data"
   );

   public p4e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      p4e$1 var2 = new p4e$1(this);
      n5(var1, var2);
      n5(var1, new p4e$2(this, var1));
   }

   public p4e() {
      this.u9();
   }

   private void u9() {
      this.l6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("manifest:full-path", this.n5);
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("manifest:size", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      var2.l6("manifest:media-type", this.k5);
      if (this.u3 != null) {
         var2.l6("manifest:preferred-view-mode", this.u3);
      }

      if (this.a6 != null) {
         this.a6.n5("manifest", var2, "encryption-data");
      }

      var2.s7();
   }

   public final n5h n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <encryption_data> element can be added.");
      }

      this.a6 = new n5h();
      return this.a6;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final long k5() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final n5h u3() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(p4e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(p4e var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(p4e var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(p4e var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static n5h n5(p4e var0, n5h var1) {
      return var0.a6 = var1;
   }
}
