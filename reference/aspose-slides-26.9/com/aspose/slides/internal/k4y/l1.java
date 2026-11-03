package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l1 extends b3 {
   private int l6;
   private boolean k5;
   private i3l u3;
   private n1w a6;
   private n4a u9;
   private r8q h0;
   private w4i c8;
   private x3l t2;
   private q8g s7;
   private y1g x8;
   public static final int n5 = f8b.n5("sldView");
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "lastView", "showComments", "normalViewPr", "slideViewPr", "outlineViewPr", "notesTextViewPr", "sorterViewPr", "notesViewPr", "gridSpacing", "extLst"
   );

   public l1(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.y4();
      l1$1 var2 = new l1$1(this);
      n5(var1, var2);
      if (!var1.m1()) {
         String var3 = var1.n3();
         boolean var4 = false;

         while (var4 && !var1.j5() || var1.u9()) {
            if (var1.s7() == 15 && com.aspose.slides.ms.System.d1.a6(var1.n3(), var3)) {
               break;
            }

            var4 = false;
            if (var1.s7() == 1) {
               switch (n3.n5(var1.n3())) {
                  case 2:
                     this.u3 = new i3l(var1);
                     break;
                  case 3:
                     this.a6 = new n1w(var1);
                     break;
                  case 4:
                     this.u9 = new n4a(var1);
                     break;
                  case 5:
                     this.h0 = new r8q(var1);
                     var4 = true;
                     break;
                  case 6:
                     this.c8 = new w4i(var1);
                     var4 = true;
                     break;
                  case 7:
                     this.t2 = new x3l(var1);
                     break;
                  case 8:
                     this.s7 = new q8g(var1);
                     break;
                  case 9:
                     this.x8 = new y1g(var1);
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public l1() {
      this.y4();
   }

   private void y4() {
      this.l6 = n5;
      this.k5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p", var3, "http://schemas.openxmlformats.org/presentationml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main") == null) {
         var2.u3("xmlns", "a", null, "http://schemas.openxmlformats.org/drawingml/2006/main");
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (this.l6 != n5) {
         var2.l6("lastView", f8b.n5(this.l6));
      }

      if (!this.k5) {
         var2.l6("showComments", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "normalViewPr");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "slideViewPr");
      }

      if (this.u9 != null) {
         this.u9.n5("p", var2, "outlineViewPr");
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "notesTextViewPr");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "sorterViewPr");
      }

      if (this.t2 != null) {
         this.t2.n5("p", var2, "notesViewPr");
      }

      if (this.s7 != null) {
         this.s7.n5("p", var2, "gridSpacing");
      }

      if (this.x8 != null) {
         this.x8.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final i3l n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <normalViewPr> element can be added.");
      }

      this.u3 = new i3l();
      return this.u3;
   }

   public final n1w l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <slideViewPr> element can be added.");
      }

      this.a6 = new n1w();
      return this.a6;
   }

   public final x3l k5() {
      if (this.t2 != null) {
         throw new Exception("Only one <notesViewPr> element can be added.");
      }

      this.t2 = new x3l();
      return this.t2;
   }

   public final q8g u3() {
      if (this.s7 != null) {
         throw new Exception("Only one <gridSpacing> element can be added.");
      }

      this.s7 = new q8g();
      return this.s7;
   }

   public final int a6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public final boolean u9() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final i3l h0() {
      return this.u3;
   }

   public final n1w c8() {
      return this.a6;
   }

   public final n4a t2() {
      return this.u9;
   }

   public final x3l s7() {
      return this.t2;
   }

   public final q8g x8() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return n3;
   }

   // $VF: synthetic method
   static int n5(l1 var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l1 var0, boolean var1) {
      return var0.k5 = var1;
   }
}
