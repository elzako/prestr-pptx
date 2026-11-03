package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l6 extends b3 {
   private t3o n5;
   private b8u l6;

   l6(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/drawing/2007/8/2/chart") && "c14".equals(var1.e2())) {
         this.l6 = new b8u(var1);
      } else {
         this.n5 = new t3o(var1);
      }
   }

   l6() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (this.l6 != null) {
         var2.n5("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
         if (this.l6 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "c14", null, "http://schemas.microsoft.com/office/drawing/2007/8/2/chart");
            var2.l6("Requires", "c14");
            this.l6.n5("cht14", var2, "style");
            var2.s7();
         }

         if (this.n5 != null) {
            var2.n5("mc", "Fallback", null);
            this.n5.n5(var1, var2, "style");
            var2.s7();
         }

         var2.s7();
      } else if (this.n5 != null) {
         this.n5.n5(var1, var2, "style");
      }
   }

   public final t3o n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.n5 = new t3o();
      return this.n5;
   }

   public final b8u l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <style> element can be added.");
      }

      this.l6 = new b8u();
      return this.l6;
   }

   public final t3o k5() {
      return this.n5;
   }

   public final b8u u3() {
      return this.l6;
   }
}
