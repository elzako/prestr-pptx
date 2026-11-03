package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class i8n extends b3 {
   private y4u n5;
   private y4u l6;
   private y4u k5;
   private y4u u3;
   private y4u a6;
   private y4u u9;
   private y4u h0;
   private y4u c8;
   private y4u t2;
   private y4u s7;
   private l8r x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "defPPr", "lvl1pPr", "lvl2pPr", "lvl3pPr", "lvl4pPr", "lvl5pPr", "lvl6pPr", "lvl7pPr", "lvl8pPr", "lvl9pPr", "extLst"
   );

   public i8n(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i8n$1(this, var1));
   }

   public i8n() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         this.n5.n5("a", var2, "defPPr");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "lvl1pPr");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "lvl2pPr");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "lvl3pPr");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "lvl4pPr");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "lvl5pPr");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "lvl6pPr");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "lvl7pPr");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "lvl8pPr");
      }

      if (this.s7 != null) {
         this.s7.n5("a", var2, "lvl9pPr");
      }

      if (this.x8 != null) {
         this.x8.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final y4u n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <defPPr> element can be added.");
      }

      this.n5 = new y4u();
      return this.n5;
   }

   public final y4u l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <lvl1pPr> element can be added.");
      }

      this.l6 = new y4u();
      return this.l6;
   }

   public final y4u k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <lvl2pPr> element can be added.");
      }

      this.k5 = new y4u();
      return this.k5;
   }

   public final y4u u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <lvl3pPr> element can be added.");
      }

      this.u3 = new y4u();
      return this.u3;
   }

   public final y4u a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <lvl4pPr> element can be added.");
      }

      this.a6 = new y4u();
      return this.a6;
   }

   public final y4u u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <lvl5pPr> element can be added.");
      }

      this.u9 = new y4u();
      return this.u9;
   }

   public final y4u h0() {
      if (this.h0 != null) {
         throw new Exception("Only one <lvl6pPr> element can be added.");
      }

      this.h0 = new y4u();
      return this.h0;
   }

   public final y4u c8() {
      if (this.c8 != null) {
         throw new Exception("Only one <lvl7pPr> element can be added.");
      }

      this.c8 = new y4u();
      return this.c8;
   }

   public final y4u t2() {
      if (this.t2 != null) {
         throw new Exception("Only one <lvl8pPr> element can be added.");
      }

      this.t2 = new y4u();
      return this.t2;
   }

   public final y4u s7() {
      if (this.s7 != null) {
         throw new Exception("Only one <lvl9pPr> element can be added.");
      }

      this.s7 = new y4u();
      return this.s7;
   }

   public final y4u x8() {
      return this.n5;
   }

   public final y4u n3() {
      return this.l6;
   }

   public final y4u y4() {
      return this.k5;
   }

   public final y4u e2() {
      return this.u3;
   }

   public final y4u t9() {
      return this.a6;
   }

   public final y4u z1() {
      return this.u9;
   }

   public final y4u t4() {
      return this.h0;
   }

   public final y4u q0() {
      return this.c8;
   }

   public final y4u z3() {
      return this.t2;
   }

   public final y4u m1() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k7() {
      return n3;
   }

   // $VF: synthetic method
   static y4u n5(i8n var0, y4u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y4u l6(i8n var0, y4u var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y4u k5(i8n var0, y4u var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y4u u3(i8n var0, y4u var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static y4u a6(i8n var0, y4u var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y4u u9(i8n var0, y4u var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static y4u h0(i8n var0, y4u var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static y4u c8(i8n var0, y4u var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static y4u t2(i8n var0, y4u var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static y4u s7(i8n var0, y4u var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l8r n5(i8n var0, l8r var1) {
      return var0.x8 = var1;
   }
}
