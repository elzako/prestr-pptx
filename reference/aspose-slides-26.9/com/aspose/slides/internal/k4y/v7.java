package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v7 extends b3 {
   private f6 n5;
   private e3m l6;
   private u7c k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("clrScheme", "fontScheme", "fmtScheme");

   public v7(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v7$1(this, var1));
   }

   public v7() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("a", var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      if (this.n5 != null) {
         this.n5.n5("a", var2, "clrScheme");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "fontScheme");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "fmtScheme");
      }

      var2.s7();
   }

   public final f6 n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <clrScheme> element can be added.");
      }

      this.n5 = new f6();
      return this.n5;
   }

   public final e3m l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <fontScheme> element can be added.");
      }

      this.l6 = new e3m();
      return this.l6;
   }

   public final u7c k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <fmtScheme> element can be added.");
      }

      this.k5 = new u7c();
      return this.k5;
   }

   public final f6 u3() {
      return this.n5;
   }

   public final e3m a6() {
      return this.l6;
   }

   public final u7c u9() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u3;
   }

   // $VF: synthetic method
   static f6 n5(v7 var0, f6 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e3m n5(v7 var0, e3m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u7c n5(v7 var0, u7c var1) {
      return var0.k5 = var1;
   }
}
