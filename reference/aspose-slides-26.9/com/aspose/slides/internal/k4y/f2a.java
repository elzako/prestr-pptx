package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class f2a extends b3 {
   private String n5;
   private v4c l6;
   private t4z k5;
   private r9o u3;
   private f3b a6;
   private y1g u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "name", "bg", "spTree", "custDataLst", "controls", "extLst"
   );

   public f2a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.x8();
      f2a$1 var2 = new f2a$1(this);
      n5(var1, var2);
      n5(var1, new f2a$2(this, var1));
   }

   public f2a() {
      this.x8();
      this.k5 = new t4z();
   }

   private void x8() {
      this.n5 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      if (this.l6 != null) {
         this.l6.n5("p", var2, "bg");
      }

      this.k5.n5("p", var2, "spTree");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "custDataLst");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "controls");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final v4c n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <bg> element can be added.");
      }

      this.l6 = new v4c();
      return this.l6;
   }

   public final r9o l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <custDataLst> element can be added.");
      }

      this.u3 = new r9o();
      return this.u3;
   }

   public final f3b k5() {
      if (this.a6 != null) {
         throw new Exception("Only one <controls> element can be added.");
      }

      this.a6 = new f3b();
      return this.a6;
   }

   public final void n5(x8 var1) {
      this.u9 = (y1g)var1;
   }

   public final String u3() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final v4c a6() {
      return this.l6;
   }

   public final e2 u9() {
      return this.k5;
   }

   public final r9o h0() {
      return this.u3;
   }

   public final f3b c8() {
      return this.a6;
   }

   public final x8 t2() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(f2a var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v4c n5(f2a var0, v4c var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static t4z n5(f2a var0, t4z var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static r9o n5(f2a var0, r9o var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static f3b n5(f2a var0, f3b var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(f2a var0, y1g var1) {
      return var0.u9 = var1;
   }
}
