package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b6 extends b3 {
   private String n5;
   private g5 l6;
   private n2z k5;
   private f1s u3;
   private f6z a6;
   private l8r u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "name", "themeElements", "objectDefaults", "extraClrSchemeLst", "custClrLst", "extLst"
   );

   public b6(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      b6$1 var2 = new b6$1(this);
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
               switch (h0.n5(var1.n3())) {
                  case 1:
                     this.l6 = new g5(var1);
                     break;
                  case 2:
                     this.k5 = new n2z(var1);
                     var4 = true;
                     break;
                  case 3:
                     this.u3 = new f1s(var1);
                     break;
                  case 4:
                     this.a6 = new f6z(var1);
                     break;
                  case 5:
                     this.u9 = new l8r(var1);
                     break;
                  default:
                     var1.r4();
                     var4 = true;
               }
            }
         }
      }
   }

   public b6() {
      this.t2();
      this.l6 = new g5();
   }

   private void t2() {
      this.n5 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("a", var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      this.l6.n5("a", var2, "themeElements");
      if (this.k5 != null) {
         this.k5.n5("a", var2, "objectDefaults");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "extraClrSchemeLst");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "custClrLst");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(c9 var1) {
      this.k5 = (n2z)var1;
   }

   public final f1s n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <extraClrSchemeLst> element can be added.");
      }

      this.u3 = new f1s();
      return this.u3;
   }

   public final void n5(f6z var1) {
      this.a6 = var1;
   }

   public final void n5(x8 var1) {
      this.u9 = (l8r)var1;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final g5 k5() {
      return this.l6;
   }

   public final n2z u3() {
      return this.k5;
   }

   public final f1s a6() {
      return this.u3;
   }

   public final f6z u9() {
      return this.a6;
   }

   public final x8 h0() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(b6 var0, String var1) {
      return var0.n5 = var1;
   }
}
