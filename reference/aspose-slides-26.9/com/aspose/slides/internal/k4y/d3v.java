package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d3v extends b3 {
   private int n5;
   private int l6;
   private y7w k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("cp", "len", "context");

   public d3v(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      d3v$1 var2 = new d3v$1(this);
      n5(var1, var2);
      n5(var1, new d3v$2(this, var1));
   }

   public d3v() {
      this.u9();
   }

   private void u9() {
      this.l6 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("cp", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      if (this.l6 != 0) {
         var2.l6("len", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != null) {
         this.k5.n5("ac", var2, "context");
      }

      var2.s7();
   }

   public final y7w n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <context> element can be added.");
      }

      this.k5 = new y7w();
      return this.k5;
   }

   public final int l6() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int k5() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final y7w u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(d3v var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(d3v var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y7w n5(d3v var0, y7w var1) {
      return var0.k5 = var1;
   }
}
