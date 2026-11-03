package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u9 extends b3 {
   private v0l n5;
   private v0l l6;
   private v0l k5;
   private v0l u3;

   u9(com.aspose.slides.ms.System.Xml.c7 var1) {
      if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2015/09/main") && "p159".equals(var1.e2())) {
         this.l6 = new v0l(var1);
      } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2012/main") && "p15".equals(var1.e2())) {
         this.k5 = new v0l(var1);
      } else if (com.aspose.slides.internal.n8e.f0.n5.n5("http://schemas.microsoft.com/office/powerpoint/2010/main") && "p14".equals(var1.e2())) {
         this.u3 = new v0l(var1);
      } else {
         this.n5 = new v0l(var1);
      }
   }

   u9() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (this.l6 != null || this.k5 != null || this.u3 != null) {
         var2.n5("mc", "AlternateContent", "http://schemas.openxmlformats.org/markup-compatibility/2006");
         if (this.l6 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "p159", null, "http://schemas.microsoft.com/office/powerpoint/2015/09/main");
            var2.l6("Requires", "p159");
            this.l6.n5("p", var2, "transition");
            var2.s7();
         }

         if (this.k5 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "p15", null, "http://schemas.microsoft.com/office/powerpoint/2012/main");
            var2.l6("Requires", "p15");
            this.k5.n5("p", var2, "transition");
            var2.s7();
         }

         if (this.u3 != null) {
            var2.n5("mc", "Choice", null);
            var2.u3("xmlns", "p14", null, "http://schemas.microsoft.com/office/powerpoint/2010/main");
            var2.l6("Requires", "p14");
            this.u3.n5("p", var2, "transition");
            var2.s7();
         }

         if (this.n5 != null) {
            var2.n5("mc", "Fallback", null);
            this.n5.n5(var1, var2, "transition");
            var2.s7();
         }

         var2.s7();
      } else if (this.n5 != null) {
         this.n5.n5(var1, var2, "transition");
      }
   }

   public final v0l n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <transition> element can be added.");
      }

      this.n5 = new v0l();
      return this.n5;
   }

   public final v0l l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <transition> element can be added.");
      }

      this.l6 = new v0l();
      return this.l6;
   }

   public final v0l k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <transition> element can be added.");
      }

      this.k5 = new v0l();
      return this.k5;
   }

   public final v0l u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <transition> element can be added.");
      }

      this.u3 = new v0l();
      return this.u3;
   }

   public final v0l a6() {
      return this.n5;
   }

   public final v0l u9() {
      return this.l6;
   }

   public final v0l h0() {
      return this.k5;
   }

   public final v0l c8() {
      return this.u3;
   }
}
