package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u3 extends b3 {
   private r0j n5;
   private r0j l6;

   u3(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (com.aspose.slides.internal.n8e.f0.n5.n5("urn:schemas-microsoft-com:vml") && "v".equals(var1.e2())) {
         this.l6 = new r0j(var1);
      } else {
         this.n5 = new r0j(var1);
      }
   }

   u3() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (this.l6 != null) {
         var2.n5("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
         if (this.l6 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "v", null, "urn:schemas-microsoft-com:vml");
            var2.l6("Requires", "v");
            this.l6.n5("p", var2, "oleObj");
            var2.s7();
         }

         if (this.n5 != null) {
            var2.n5("mc", "Fallback", null);
            this.n5.n5(var1, var2, "oleObj");
            var2.s7();
         }

         var2.s7();
      } else if (this.n5 != null) {
         this.n5.n5(var1, var2, "oleObj");
      }
   }

   public final r0j n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <oleObj> element can be added.");
      }

      this.n5 = new r0j();
      return this.n5;
   }

   public final r0j l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <oleObj> element can be added.");
      }

      this.l6 = new r0j();
      return this.l6;
   }

   public final r0j k5() {
      return this.n5;
   }

   public final r0j u3() {
      return this.l6;
   }
}
