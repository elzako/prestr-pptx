package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k5 extends b3 {
   private z9c n5;
   private z9c l6;

   k5(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (com.aspose.slides.internal.n8e.f0.n5.n5("urn:schemas-microsoft-com:vml") && "v".equals(var1.e2())) {
         this.l6 = new z9c(var1);
      } else {
         this.n5 = new z9c(var1);
      }
   }

   k5() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (this.l6 != null) {
         var2.n5("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
         if (this.l6 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
            var2.l6("Requires", "v");
            this.l6.n5("p", var2, "control");
            var2.s7();
         }

         if (this.n5 != null) {
            var2.n5("mc", "Fallback", null);
            this.n5.n5(var1, var2, "control");
            var2.s7();
         }

         var2.s7();
      } else if (this.n5 != null) {
         this.n5.n5(var1, var2, "control");
      }
   }

   public final z9c n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <control> element can be added.");
      }

      this.n5 = new z9c();
      return this.n5;
   }

   public final z9c l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <control> element can be added.");
      }

      this.l6 = new z9c();
      return this.l6;
   }

   public final z9c k5() {
      return this.n5;
   }

   public final z9c u3() {
      return this.l6;
   }
}
